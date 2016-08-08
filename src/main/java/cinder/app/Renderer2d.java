package cinder.app;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/app/Renderer.h"}, useQuotes = false)
@CxxClass("cinder::app::Renderer2d")
@CxxCopyConstructorUnavailable
@CxxDefaultConstructorUnavailable
public interface Renderer2d extends Renderer {

    @CxxConstructor()
    public static Renderer2d newRenderer2d() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::app::Renderer2d::create")
    @CxxByValue
    public static SharedPtr<Renderer2d> create() {
        throw new CxxExpectedGeneratedCodeException();
    }

}
