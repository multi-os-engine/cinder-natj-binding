package cinder.gl;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;

//! Scopes state of face culling.
@CxxHeader(value = {"cinder/gl/scoped.h"}, useQuotes = false)
@CxxClass("cinder::gl::ScopedFaceCulling")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface ScopedFaceCulling extends CxxObject {

    //! Enables or disables polygon culling based on \a cull
    @CxxConstructor
    public static ScopedFaceCulling newScopedFaceCulling(boolean cull) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Enables or disables polygon culling based on \a cull and specifies a mode, either \c GL_BACK or GL_FRONT
    @CxxConstructor
    public static ScopedFaceCulling newScopedFaceCulling(boolean cull, int cullFace) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
