package cinder.gl;

import cinder.ImageSource;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/gl/Texture.h"}, useQuotes = false)
@CxxClass("cinder::gl::TextureCubeMap")
@CxxDefaultConstructorUnavailable
public interface TextureCubeMap extends CxxObject {

    @CxxConstructor
    static SharedPtr<TextureCubeMap> createEmpty() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxClass("cinder::gl::TextureCubeMap::Format")
    public interface Format extends CxxObject {

        //! Default constructor, sets the target to \c GL_TEXTURE_CUBE_MAP, wrap to \c GL_CLAMP_TO_EDGE, disables mipmapping, the internal format to "automatic"
        @CxxConstructor
        public static Format newFormat() {
            throw new CxxExpectedGeneratedCodeException();
        }

        //! Chaining functions for Format class.
        //Format& target( GLenum target );

        @CxxMethod
        @CxxByReference
        public Format mipmap(boolean enableMipmapping);

        //! Sets the maximum amount of anisotropic filtering. A value greater than 1.0 "enables" anisotropic filtering. Maximum of getMaxAnisotropyMax();
        /*Format& maxAnisotropy( float maxAnisotropy );

        Format& internalFormat( GLint internalFormat );

        Format& wrap( GLenum wrap );

        Format& wrapS( GLenum wrapS );

        Format& wrapT( GLenum wrapT );

        Format& minFilter( GLenum minFilter );

        Format& magFilter( GLenum magFilter );

        //! Sets whether the storage for the cannot be changed in the future (making glTexImage2D() calls illegal). More efficient when possible. Default is \c false.
        Format& immutableStorage( bool immutable = true );

        //! Sets the debugging label associated with the Texture. Calls glObjectLabel() when available.
        Format&	label( const std::string &label );*/

        //! Sets a custom deleter for destruction of the shared_ptr<TextureCubeMap>
        //Format&	deleter( const std::function<void(TextureCubeMap*)> &sharedPtrDeleter ) { mDeleter = sharedPtrDeleter; return *this; }
    }

    //! Automatically infers Horizontal Cross, Vertical Cross, Row, or Column based on image aspect ratio
    @CxxFunction("cinder::gl::TextureCubeMap::create")
    @CxxByValue
    public static SharedPtr<TextureCubeMap> create(@CxxConst @CxxByReference SharedPtr<ImageSource> imageSource, @CxxConst @CxxByReference Format format) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::gl::TextureCubeMap::create")
    @CxxByValue
    public static SharedPtr<TextureCubeMap> create(@CxxConst @CxxByReference SharedPtr<ImageSource> imageSource) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //!	Binds the Texture's texture to its target in the multitexturing unit \c GL_TEXTURE0 + \a textureUnit
    @CxxMethod(isConst = true)
    public void bind();
}
