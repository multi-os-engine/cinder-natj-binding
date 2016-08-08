package cinder.gl;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/gl/scoped.h"}, useQuotes = false)
@CxxClass("cinder::gl::ScopedFramebuffer")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface ScopedFramebuffer extends CxxObject {

    @CxxConstructor
    public static ScopedFramebuffer newScopedFramebuffer(@CxxConst @CxxByReference SharedPtr<Fbo> fbo) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Prefer the FboRef variant when possible. This does not allow gl::Fbo to mark itself as needing multisample resolution.
    //ScopedFramebuffer( GLenum target, GLuint framebufferId );
}
