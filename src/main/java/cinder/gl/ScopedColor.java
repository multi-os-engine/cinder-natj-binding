package cinder.gl;

import cinder.Color;
import cinder.ColorAf;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/gl/scoped.h"}, useQuotes = false)
@CxxClass("cinder::gl::ScopedColor")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface ScopedColor extends CxxObject {

    @CxxConstructor
    public static ScopedColor newScopedColor() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ScopedColor newScopedColor(@CxxConst @CxxByReference ColorAf color) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ScopedColor newScopedColor(@CxxConst @CxxByReference Color color) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ScopedColor newScopedColor(float red, float green, float blue, float alpha) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ScopedColor newScopedColor(float red, float green, float blue) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
