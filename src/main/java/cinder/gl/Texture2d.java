package cinder.gl;

import cinder.ImageSource;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/gl/Texture.h"}, useQuotes = false)
@CxxClass("cinder::gl::Texture2d")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Texture2d extends CxxObject {

    @CxxClass("cinder::gl::Texture2d::Format")
    public interface Format extends CxxObject {
        //! Default constructor, sets the target to \c GL_TEXTURE_2D, wrap to \c GL_CLAMP, disables mipmapping, the internal format to "automatic"
        @CxxConstructor
        public static Format newFormat() {
            throw new CxxExpectedGeneratedCodeException();
        }

        //! Chaining functions for Format class.
        @CxxMethod
        @CxxByReference
        public Format target(int target);

        @CxxMethod
        @CxxByReference
        public Format mipmap(boolean enableMipmapping);

        //! Sets the maximum amount of anisotropic filtering. A value greater than 1.0 "enables" anisotropic filtering. Maximum of getMaxAnisotropyMax();
        @CxxMethod
        @CxxByReference
        public Format maxAnisotropy(float maxAnisotropy);

        //! Specifies the internal format for the Texture, used by glTexImage2D or glTexStorage2D when available. Defaults to \c -1 which implies automatic determination.
        @CxxMethod
        @CxxByReference
        public Format internalFormat(int internalFormat);

        //! Specifies the data type parameter used by glTexImage2D when glTexStorage2D is unavailable. Defaults to \c -1 which implies automatic determination. Primary use is to pass \c GL_FLOAT or \c GL_HALF_FLOAT to create 32F or 16F textures on ES 2 when OES_texture_float is available.
        @CxxMethod
        @CxxByReference
        public Format dataType(int dataType);

        @CxxMethod
        @CxxByReference
        public Format wrap(int wrap);

        @CxxMethod
        @CxxByReference
        public Format wrapS(int wrapS);

        @CxxMethod
        @CxxByReference
        public Format wrapT(int wrapT);

        @CxxMethod
        @CxxByReference
        public Format minFilter(int minFilter);

        @CxxMethod
        @CxxByReference
        public Format magFilter(int magFilter);

        @CxxMethod
        @CxxByReference
        public Format compareMode(int compareMode);

        //! Specifies the comparison operator used when \c GL_TEXTURE_COMPARE_MODE is set to \c GL_COMPARE_R_TO_TEXTURE.
        @CxxMethod
        @CxxByReference
        public Format compareFunc(int compareFunc);

        //Format swizzleMask( const std::array<GLint,4> &swizzleMask );

        @CxxMethod
        @CxxByReference
        public Format swizzleMask(int r, int g, int b, int a);

        //! Specifies whether the Texture should store scanlines top-down in memory. Default is \c false. Also marks Texture as top-down when \c true.
        @CxxMethod
        @CxxByReference
        public Format loadTopDown(boolean loadTopDown);

        //! Sets whether the storage for the cannot be changed in the future (making glTexImage2D() calls illegal). More efficient when possible. Default is \c false.
        @CxxMethod
        @CxxByReference
        public Format immutableStorage(boolean immutable);

        //! Sets the debugging label associated with the Texture. Calls glObjectLabel() when available.
        @CxxMethod
        @CxxByReference
        public Format label(@CxxConst @CxxByReference std.String label);

        //! Sets the Texture's internal format to be automatically selected based on the context.
        @CxxMethod
        public void setAutoInternalFormat();

        //! Sets the wrapping behavior when a texture coordinate falls outside the range of [0,1]. Possible values are \c GL_REPEAT, \c GL_CLAMP_TO_EDGE, etc. Default is \c GL_CLAMP_TO_EDGE.
        @CxxMethod
        public void setWrap(int wrapS, int wrapT);
    }

    @CxxMethod
    public void bind();

    @CxxFunction("cinder::gl::Texture2d::create")
    @CxxByValue
    public static SharedPtr<Texture2d> create(@CxxConst @CxxByReference SharedPtr<ImageSource> imageSource, @CxxConst @CxxByReference Format format) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::gl::Texture2d::create")
    @CxxByValue
    public static SharedPtr<Texture2d> create(@CxxConst @CxxByReference SharedPtr<ImageSource> imageSource) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
