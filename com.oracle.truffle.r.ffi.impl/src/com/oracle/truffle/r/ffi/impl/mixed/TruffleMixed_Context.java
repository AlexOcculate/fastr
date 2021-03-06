/*
 * Copyright (c) 2019, Oracle and/or its affiliates. All rights reserved.
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
package com.oracle.truffle.r.ffi.impl.mixed;

import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.r.ffi.impl.llvm.TruffleLLVM_Context;
import com.oracle.truffle.r.ffi.impl.llvm.TruffleLLVM_DownCallNodeFactory;
import com.oracle.truffle.r.ffi.impl.llvm.TruffleLLVM_UserRng;
import com.oracle.truffle.r.ffi.impl.nfi.TruffleNFI_Context;
import com.oracle.truffle.r.ffi.impl.nfi.TruffleNFI_DownCallNodeFactory;
import com.oracle.truffle.r.runtime.RInternalError;
import com.oracle.truffle.r.runtime.context.RContext;
import com.oracle.truffle.r.runtime.context.RContext.ContextState;
import com.oracle.truffle.r.runtime.ffi.BaseRFFI;
import com.oracle.truffle.r.runtime.ffi.LapackRFFI;
import com.oracle.truffle.r.runtime.ffi.MiscRFFI;
import com.oracle.truffle.r.runtime.ffi.NativeFunction;
import com.oracle.truffle.r.runtime.ffi.PCRERFFI;
import com.oracle.truffle.r.runtime.ffi.REmbedRFFI;
import com.oracle.truffle.r.runtime.ffi.RFFIContext;
import com.oracle.truffle.r.runtime.ffi.RFFIFactory.Type;
import com.oracle.truffle.r.runtime.ffi.StatsRFFI;
import com.oracle.truffle.r.runtime.ffi.ToolsRFFI;
import com.oracle.truffle.r.runtime.ffi.ZipRFFI;

public class TruffleMixed_Context extends RFFIContext {

    private final TruffleLLVM_Context llvmContext;
    private final TruffleNFI_Context nfiContext;

    TruffleMixed_Context(RFFIContextState rffiContextState) {
        super(rffiContextState, new TruffleMixed_C(), new BaseRFFI(TruffleLLVM_DownCallNodeFactory.INSTANCE, TruffleNFI_DownCallNodeFactory.INSTANCE), new TruffleMixed_Call(), new TruffleMixed_DLL(),
                        new TruffleLLVM_UserRng(),
                        new ZipRFFI(TruffleLLVM_DownCallNodeFactory.INSTANCE), new PCRERFFI(TruffleLLVM_DownCallNodeFactory.INSTANCE),
                        new LapackRFFI(TruffleLLVM_DownCallNodeFactory.INSTANCE), new StatsRFFI(TruffleLLVM_DownCallNodeFactory.INSTANCE),
                        new ToolsRFFI(), new REmbedRFFI(TruffleLLVM_DownCallNodeFactory.INSTANCE), new MiscRFFI(TruffleLLVM_DownCallNodeFactory.INSTANCE));
        llvmContext = new TruffleLLVM_Context(rffiContextState);
        nfiContext = new TruffleNFI_Context(rffiContextState) {

            @Override
            protected void loadLibR(RContext context, String librffiPath) {
                // Suppress loading libR, which is loaded by the LLVM context
            }

        };

    }

    @SuppressWarnings("unchecked")
    @Override
    public <C extends RFFIContext> C as(Class<C> rffiCtxClass) {
        if (rffiCtxClass == TruffleNFI_Context.class) {
            return (C) nfiContext;
        } else if (rffiCtxClass == TruffleLLVM_Context.class) {
            return (C) llvmContext;
        }
        throw RInternalError.shouldNotReachHere(String.format("Unsupported context class %s", rffiCtxClass));
    }

    @Override
    public ContextState initialize(RContext context) {
        llvmContext.initialize(context);
        nfiContext.initialize(context);
        return this;
    }

    @Override
    public void beforeDispose(RContext context) {
        nfiContext.beforeDispose(context);
        llvmContext.beforeDispose(context);
    }

    @Override
    public void beforeUpcall(boolean canRunGc, Type rffiType) {
        switch (rffiType) {
            case LLVM:
                llvmContext.beforeUpcall(canRunGc, rffiType);
                break;

            case NFI:
                nfiContext.beforeUpcall(canRunGc, rffiType);
                break;

            default:
                throw RInternalError.shouldNotReachHere();
        }
    }

    @Override
    public void afterUpcall(boolean canRunGc, Type rffiType) {
        switch (rffiType) {
            case LLVM:
                llvmContext.afterUpcall(canRunGc, rffiType);
                break;

            case NFI:
                nfiContext.afterUpcall(canRunGc, rffiType);
                break;

            default:
                throw RInternalError.shouldNotReachHere();
        }
    }

    @Override
    public long beforeDowncall(Type rffiType) {
        Type actualRffiType = rffiType == null ? Type.LLVM : rffiType;
        assert rffiType != null;
        switch (rffiType) {
            case LLVM:
                return llvmContext.beforeDowncall(actualRffiType);

            case NFI:
                return nfiContext.beforeDowncall(actualRffiType);

            default:
                throw RInternalError.shouldNotReachHere();
        }
    }

    @Override
    public void afterDowncall(long before, Type rffiType) {
        switch (rffiType) {
            case LLVM:
                llvmContext.afterDowncall(before, rffiType);
                break;

            case NFI:
                nfiContext.afterDowncall(before, rffiType);
                break;

            default:
                throw RInternalError.shouldNotReachHere();
        }
    }

    @Override
    public void initializeVariables(RContext context) {
        nfiContext.initializeVariables(context);
        llvmContext.initializeVariables(context);
    }

    @Override
    public void initializeEmbedded(RContext context) {
        nfiContext.initializeEmbedded(context);
        llvmContext.initializeEmbedded(context);
    }

    @Override
    public TruffleObject lookupNativeFunction(NativeFunction function) {
        TruffleObject result = null;
        try {
            result = llvmContext.lookupNativeFunction(function);
        } catch (Exception e) {
        }
        return result != null ? result : nfiContext.lookupNativeFunction(function);
    }

}
