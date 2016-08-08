package cinder.gl;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;

//! Enables blending state for the current scope and sets the blending function for standard alpha blending (`sfactor = GL_SRC_ALPHA, dfactor = GL_ONE_MINUS_SRC_ALPHA`).
@CxxHeader(value = {"cinder/gl/scoped.h"}, useQuotes = false)
@CxxClass("cinder::gl::ScopedBlendAlpha")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface ScopedBlendAlpha extends ScopedBlend {

    @CxxConstructor
    public static ScopedBlendAlpha newScopedBlendAlpha() {
        throw new CxxExpectedGeneratedCodeException();
    }
}
