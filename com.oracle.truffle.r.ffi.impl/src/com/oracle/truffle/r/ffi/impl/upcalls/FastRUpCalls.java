/*
 * Copyright (c) 2018, Oracle and/or its affiliates. All rights reserved.
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
package com.oracle.truffle.r.ffi.impl.upcalls;

import com.oracle.truffle.r.ffi.processor.RFFICpointer;

/**
 * Up-calls specific to FastR used in FastR native code and not exported as part of any API.
 */
public interface FastRUpCalls {
    // Checkstyle: stop method name check

    Object R_MethodsNamespace();

    int FASTR_getConnectionChar(Object obj);

    Object getSummaryDescription(Object x);

    Object getConnectionClassString(Object x);

    Object getOpenModeString(Object x);

    boolean isSeekable(Object x);

    void restoreHandlerStacks(Object savedHandlerStack);

    /**
     * Implements {@code DATAPTR} for types that do not have specialized API function for accessing
     * the underlying data such as {@link com.oracle.truffle.r.runtime.data.RStringVector}.
     */
    @RFFICpointer
    Object FASTR_DATAPTR(Object x);
}
