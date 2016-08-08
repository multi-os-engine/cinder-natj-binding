package cinder.gl;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import glm.detail.IVec2;

@CxxHeader(value = {"cinder/gl/scoped.h"}, useQuotes = false)
@CxxClass("cinder::gl::ScopedViewport")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface ScopedViewport extends CxxObject {

    @CxxConstructor
    public static ScopedViewport newScopedViewport(@CxxConst @CxxByReference IVec2 lowerLeftPosition, @CxxConst @CxxByReference IVec2 dimension) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ScopedViewport newScopedViewport(@CxxConst @CxxByReference IVec2 size) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ScopedViewport newScopedViewport(int lowerLeftX, int lowerLeftY, int width, int height) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
