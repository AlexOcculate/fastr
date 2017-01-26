/*
 * This material is distributed under the GNU General Public License
 * Version 2. You may review the terms of this license at
 * http://www.gnu.org/licenses/gpl-2.0.html
 *
 * Copyright (C) 1995, 1996  Robert Gentleman and Ross Ihaka
 * Copyright (C) 1998 Ross Ihaka
 * Copyright (c) 1998--2014, The R Core Team
 * Copyright (c) 2002--2010, The R Foundation
 * Copyright (C) 2005--2006, Morten Welinder
 * Copyright (c) 2014, 2017, Oracle and/or its affiliates
 *
 * All rights reserved.
 */
package com.oracle.truffle.r.library.grDevices;

import static com.oracle.truffle.r.nodes.builtin.CastBuilder.Predef.emptyStringVector;
import static com.oracle.truffle.r.nodes.builtin.CastBuilder.Predef.stringValue;
import static com.oracle.truffle.r.nodes.builtin.casts.fluent.CastNodeBuilder.newCastBuilder;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.r.library.grDevices.DevicesCCallsFactory.C_DevOffNodeGen;
import com.oracle.truffle.r.library.grDevices.pdf.PdfGraphicsDevice;
import com.oracle.truffle.r.library.graphics.core.GraphicsEngineImpl;
import com.oracle.truffle.r.nodes.builtin.CastBuilder;
import com.oracle.truffle.r.nodes.builtin.RExternalBuiltinNode;
import com.oracle.truffle.r.nodes.unary.CastNode;
import com.oracle.truffle.r.runtime.data.RArgsValuesAndNames;
import com.oracle.truffle.r.runtime.data.RNull;
import com.oracle.truffle.r.runtime.data.model.RAbstractStringVector;

public class DevicesCCalls {
    public abstract static class C_DevOff extends RExternalBuiltinNode.Arg1 {
        public static C_DevOff create() {
            return C_DevOffNodeGen.create();
        }

        @Override
        protected void createCasts(CastBuilder casts) {
            casts.arg(0).asIntegerVector().findFirst();
        }

        @Specialization
        public Object doCall(int deviceIndex) {
            GraphicsEngineImpl.getInstance().killGraphicsDeviceByIndex(deviceIndex);
            return RNull.instance;
        }
    }

    public static final class C_DevCur extends RExternalBuiltinNode.Arg0 {

        @Override
        @TruffleBoundary
        public Object execute() {
            return GraphicsEngineImpl.getInstance().getCurrentGraphicsDeviceIndex();
        }
    }

    public static final class C_PDF extends RExternalBuiltinNode {

        @Child private CastNode extractFontsNode;
        @Child private CastNode asStringNode;
        @Child private CastNode asDoubleNode;
        @Child private CastNode asLogicalNode;
        @Child private CastNode asIntNode;

        public C_PDF() {
            asStringNode = newCastBuilder().asStringVector().findFirst().buildCastNode();
            asDoubleNode = newCastBuilder().asDoubleVector().findFirst().buildCastNode();
            asLogicalNode = newCastBuilder().asLogicalVector().findFirst().buildCastNode();
            asIntNode = newCastBuilder().asIntegerVector().findFirst().buildCastNode();
            extractFontsNode = newCastBuilder().mapNull(emptyStringVector()).mustBe(stringValue()).asStringVector().buildCastNode();
        }

        @SuppressWarnings("unused")
        @Override
        @TruffleBoundary
        public Object call(RArgsValuesAndNames args) {
            new PdfGraphicsDevice(extractParametersFrom(args));
            // todo implement devices addition
            return RNull.instance;
        }

        private PdfGraphicsDevice.Parameters extractParametersFrom(RArgsValuesAndNames args) {
            PdfGraphicsDevice.Parameters result = new PdfGraphicsDevice.Parameters();
            result.filePath = asString(args.getArgument(0));
            result.paperSize = asString(args.getArgument(1));
            result.fontFamily = asString(args.getArgument(2));
            result.encoding = asString(args.getArgument(3));
            result.bg = asString(args.getArgument(4));
            result.fg = asString(args.getArgument(5));
            result.width = asDouble(castVector(args.getArgument(6)));
            result.height = asDouble(castVector(args.getArgument(7)));
            result.pointSize = asDouble(castVector(args.getArgument(8)));
            result.oneFile = asLogical(castVector(args.getArgument(9)));
            result.pageCenter = asLogical(castVector(args.getArgument(10)));
            result.title = asString(args.getArgument(11));
            result.fonts = extractFontsFrom(args.getArgument(12));

            result.majorVersion = asInt(castVector(args.getArgument(13)));
            result.minorVersion = asInt(castVector(args.getArgument(14)));
            result.colormodel = asString(args.getArgument(15));
            result.useDingbats = asLogical(castVector(args.getArgument(16)));
            result.useKerning = asLogical(castVector(args.getArgument(17)));
            result.fillOddEven = asLogical(castVector(args.getArgument(18)));
            result.compress = asLogical(castVector(args.getArgument(19)));
            return result;
        }

        private String asString(Object value) {
            return (String) asStringNode.execute(value);
        }

        private int asInt(Object value) {
            return (Integer) asIntNode.execute(value);
        }

        private double asDouble(Object value) {
            return (Double) asDoubleNode.execute(value);
        }

        private byte asLogical(Object value) {
            return (Byte) asLogicalNode.execute(value);
        }

        private String[] extractFontsFrom(Object inputArgument) {
            return ((RAbstractStringVector) extractFontsNode.execute(inputArgument)).materialize().getDataCopy();
        }
    }
}
