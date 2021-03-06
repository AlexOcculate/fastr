/*
 * Copyright (c) 2015, 2019, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 3 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 3 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 3 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.truffle.r.nodes.attributes;

import com.oracle.truffle.api.dsl.Cached;
import java.util.List;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.object.DynamicObject;
import com.oracle.truffle.api.object.Property;
import com.oracle.truffle.api.object.Shape;
import com.oracle.truffle.api.profiles.ConditionProfile;
import com.oracle.truffle.r.nodes.function.opt.ShareObjectNode;
import com.oracle.truffle.r.nodes.function.opt.UpdateShareableChildValueNode;
import com.oracle.truffle.r.runtime.RRuntime;
import com.oracle.truffle.r.runtime.Utils;
import com.oracle.truffle.r.runtime.data.RAttributable;
import com.oracle.truffle.r.runtime.data.RAttributeStorage;
import com.oracle.truffle.r.runtime.data.RAttributesLayout;
import com.oracle.truffle.r.runtime.data.RVector;
import com.oracle.truffle.r.runtime.nodes.RBaseNode;

/**
 * Copies all attributes from source to target except for 'dim', 'names' and 'dimNames' attribute.
 * Typical usage is when copying attributes to a vector created by one of
 * {@link com.oracle.truffle.r.runtime.data.RDataFactory} factory methods, because one can specify
 * the 'names' and 'dims' as parameters of the factory method and copy the rest of the attributes
 * using this node.
 *
 * @see UnaryCopyAttributesNode
 */
public abstract class CopyOfRegAttributesNode extends RBaseNode {

    private final ConditionProfile sizeOneProfile = ConditionProfile.createBinaryProfile();

    @Child private GetFixedAttributeNode dimAttrGetter = GetFixedAttributeNode.createDim();
    @Child private GetFixedAttributeNode namesAttrGetter = GetFixedAttributeNode.createNames();
    @Child private GetFixedAttributeNode classAttrGetter = GetFixedAttributeNode.createClass();

    public abstract void execute(RAttributable source, RAttributable target);

    public static CopyOfRegAttributesNode create() {
        return CopyOfRegAttributesNodeGen.create();
    }

    @Specialization(guards = "source.getAttributes() == null")
    protected void copyNoAttributes(@SuppressWarnings("unused") RAttributeStorage source, @SuppressWarnings("unused") RAttributeStorage target) {
        // nothing to do
    }

    protected static boolean emptyAttributes(RAttributeStorage source) {
        DynamicObject attributes = source.getAttributes();
        return attributes == null || attributes.isEmpty();
    }

    @Specialization(guards = "emptyAttributes(source)", replaces = "copyNoAttributes")
    protected void copyEmptyAttributes(@SuppressWarnings("unused") RAttributeStorage source, @SuppressWarnings("unused") RAttributeStorage target) {
        // nothing to do
    }

    protected final boolean onlyDimAttribute(RAttributeStorage source) {
        DynamicObject attributes = source.getAttributes();
        return attributes != null && sizeOneProfile.profile(attributes.size() == 1) && dimAttrGetter.execute(attributes) != null;
    }

    @Specialization(guards = "onlyDimAttribute(source)")
    protected void copyDimOnly(@SuppressWarnings("unused") RAttributeStorage source, @SuppressWarnings("unused") RAttributeStorage target) {
        // nothing to do
    }

    protected final boolean onlyNamesAttribute(RAttributeStorage source) {
        DynamicObject attributes = source.getAttributes();
        return attributes != null && sizeOneProfile.profile(attributes.size() == 1) && namesAttrGetter.execute(attributes) != null;
    }

    @Specialization(guards = "onlyNamesAttribute(source)")
    protected void copyNamesOnly(@SuppressWarnings("unused") RAttributeStorage source, @SuppressWarnings("unused") RAttributeStorage target) {
        // nothing to do
    }

    protected final boolean onlyClassAttribute(RAttributeStorage source) {
        DynamicObject attributes = source.getAttributes();
        return attributes != null && sizeOneProfile.profile(attributes.size() == 1) && classAttrGetter.execute(attributes) != null;
    }

    @Specialization(guards = "onlyClassAttribute(source)")
    protected void copyClassOnly(RAttributeStorage source, RVector<?> target,
                    @Cached("create()") UpdateShareableChildValueNode updateChildRefCountNode,
                    @Cached("create()") ShareObjectNode updateRefCountNode) {
        Object classAttr = classAttrGetter.execute(source.getAttributes());
        updateRefCountNode.execute(updateChildRefCountNode.updateState(source, classAttr));
        target.initAttributes(RAttributesLayout.createClass(classAttr));
    }

    @Specialization
    protected void copyGeneric(RAttributeStorage source, RAttributeStorage target,
                    @Cached("create()") UpdateShareableChildValueNode updateChildRefCountNode,
                    @Cached("create()") ShareObjectNode updateRefCountNode) {
        DynamicObject orgAttributes = source.getAttributes();
        if (orgAttributes != null) {
            Shape shape = orgAttributes.getShape();
            List<Property> properties = shape.getPropertyList();
            for (int i = 0; i < properties.size(); i++) {
                Property p = properties.get(i);
                String name = (String) p.getKey();
                if (!Utils.identityEquals(name, RRuntime.DIM_ATTR_KEY) && !Utils.identityEquals(name, RRuntime.DIMNAMES_ATTR_KEY) && !Utils.identityEquals(name, RRuntime.NAMES_ATTR_KEY)) {
                    Object val = p.get(orgAttributes, shape);
                    updateRefCountNode.execute(updateChildRefCountNode.updateState(source, val));
                    target.initAttributes().define(name, val);
                }
            }
        }
    }

    @Specialization(guards = "!isAttributeStorage(source)")
    @SuppressWarnings("unused")
    protected void copyNothing(RAttributable source, RAttributable target) {
        // do nothing, just pass
    }

    protected static boolean isAttributeStorage(Object o) {
        return o instanceof RAttributeStorage;
    }
}
