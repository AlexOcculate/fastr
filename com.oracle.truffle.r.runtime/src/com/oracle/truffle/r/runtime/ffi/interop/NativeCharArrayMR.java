/*
 * Copyright (c) 2014, 2019, Oracle and/or its affiliates. All rights reserved.
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
package com.oracle.truffle.r.runtime.ffi.interop;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.interop.CanResolve;
import com.oracle.truffle.api.interop.MessageResolution;
import com.oracle.truffle.api.interop.Resolve;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.nodes.Node;

@MessageResolution(receiverType = NativeCharArray.class)
public class NativeCharArrayMR {
    @Resolve(message = "READ")
    public abstract static class NCAReadNode extends Node {
        protected byte access(NativeCharArray receiver, int index) {
            return receiver.read(index);
        }

        protected byte access(NativeCharArray receiver, long index) {
            return receiver.read((int) index);
        }
    }

    @Resolve(message = "WRITE")
    public abstract static class NCAWriteNode extends Node {
        protected Object access(NativeCharArray receiver, int index, byte value) {
            receiver.write(index, value);
            return value;
        }

        protected Object access(NativeCharArray receiver, long index, byte value) {
            receiver.write((int) index, value);
            return value;
        }
    }

    @Resolve(message = "HAS_SIZE")
    public abstract static class NCAHasSizeNode extends Node {
        protected boolean access(@SuppressWarnings("unused") NativeCharArray receiver) {
            return true;
        }
    }

    @Resolve(message = "GET_SIZE")
    public abstract static class NCAGetSizeNode extends Node {
        protected int access(NativeCharArray receiver) {
            return receiver.getSize();
        }
    }

    @Resolve(message = "TO_NATIVE")
    public abstract static class NCAToNativeNode extends Node {
        protected Object access(NativeCharArray receiver) {
            return new CharNativePointer(receiver);
        }
    }

    @Resolve(message = "IS_POINTER")
    public abstract static class IsPointerNode extends Node {
        protected boolean access(@SuppressWarnings("unused") NativeCharArray receiver) {
            return true;
        }
    }

    @Resolve(message = "AS_POINTER")
    public abstract static class AsPointerNode extends Node {
        protected Object access(NativeCharArray receiver) {
            return receiver.convertToNative();
        }
    }

    @Resolve(message = "EXECUTE")
    public abstract static class NCAToStringNode extends Node {

        @TruffleBoundary
        protected java.lang.Object access(NativeCharArray receiver, @SuppressWarnings("unused") Object[] arguments) {
            return new String(receiver.getValue());
        }
    }

    @Resolve(message = "IS_EXECUTABLE")
    public abstract static class NCAToStringIsExecutableNode extends Node {
        protected Object access(@SuppressWarnings("unused") NativeCharArray receiver) {
            return true;
        }
    }

    @CanResolve
    public abstract static class NCACheck extends Node {

        protected static boolean test(TruffleObject receiver) {
            return receiver instanceof NativeCharArray;
        }
    }

    private static final class CharNativePointer extends NativePointer {
        private final NativeCharArray nativeCharArray;

        private CharNativePointer(NativeCharArray object) {
            super(object);
            this.nativeCharArray = object;
        }

        @Override
        protected long asPointerImpl() {
            long result = nativeCharArray.convertToNative();
            return result;
        }
    }
}
