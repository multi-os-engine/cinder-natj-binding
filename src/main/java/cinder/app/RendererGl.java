package cinder.app;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/app/RendererGl.h"}, useQuotes = false)
@CxxClass("cinder::app::RendererGl")
@CxxCopyConstructorUnavailable
@CxxDefaultConstructorUnavailable
public interface RendererGl extends Renderer {

    @CxxConstructor()
    public static RendererGl newRendererGl() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::app::RendererGl::create")
    @CxxByValue
    public static SharedPtr<RendererGl> create(@CxxConst @CxxByReference Options options) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::app::RendererGl::create")
    @CxxByValue
    public static SharedPtr<RendererGl> create() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxHeader(value = {"cinder/app/RendererGl.h"}, useQuotes = false)
    @CxxClass("cinder::app::RendererGl::Options")
    interface Options {

        @CxxMethod
        @CxxByReference
        public Options msaa(int samples);

        @CxxConstructor()
        public static Options newOptions() {
            throw new CxxExpectedGeneratedCodeException();
        }
    }
}
