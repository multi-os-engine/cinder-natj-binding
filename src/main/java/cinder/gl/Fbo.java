package cinder.gl;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import glm.detail.IVec2;
import std.SharedPtr;

@CxxHeader(value = {"cinder/gl/Fbo.h"}, useQuotes = false)
@CxxClass("cinder::gl::Fbo")
@CxxDefaultConstructorUnavailable
public interface Fbo extends CxxObject {

    @CxxConstructor
    static SharedPtr<Fbo> createEmpty() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxClass("cinder::gl::Fbo::Format")
    public interface Format extends CxxObject {

        //! Default constructor, sets the target to \c GL_TEXTURE_2D with an 8-bit color+alpha, a 24-bit depth texture, and no multisampling or mipmapping
        @CxxConstructor
        public static Format newFormat() {
            throw new CxxExpectedGeneratedCodeException();
        }

        //! Enables a depth texture with a format of \a textureFormat, which defaults to \c GL_DEPTH_COMPONENT24. Disables a depth renderbuffer.
        @CxxMethod
        @CxxByReference
        public Format depthTexture();
    }

    //! Creates an FBO \a width pixels wide and \a height pixels high, using Fbo::Format \a format
    @CxxFunction("cinder::gl::Fbo::create")
    @CxxByValue
    public static SharedPtr<Fbo> create(int width, int height, @CxxConst @CxxByReference Format format) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::gl::Fbo::create")
    @CxxByValue
    public static SharedPtr<Fbo> create(int width, int height) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Returns the size of the FBO in pixels
    @CxxMethod(isConst = true)
    @CxxByValue
    public IVec2 getSize();

    //! Returns the aspect ratio of the FBO
    @CxxMethod(isConst = true)
    public float getAspectRatio();

    //! Binds the color texture associated with an Fbo to its target. Optionally binds to a multitexturing unit when \a textureUnit is non-zero. Optionally binds to a multitexturing unit when \a textureUnit is non-zero. \a attachment specifies which color buffer in the case of multiple attachments.
    @CxxMethod
    public void bindTexture(int textureUnit, int attachment);

    @CxxMethod
    public void bindTexture(int textureUnit);

    @CxxMethod
    public void bindTexture();

    //! Unbinds the texture associated with an Fbo attachment
    @CxxMethod
    public void unbindTexture(int textureUnit, int attachment);

    @CxxMethod
    public void unbindTexture(int textureUnit);

    @CxxMethod
    public void unbindTexture();
}
