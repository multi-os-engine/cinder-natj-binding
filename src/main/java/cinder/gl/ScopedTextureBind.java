package cinder.gl;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/gl/scoped.h"}, useQuotes = false)
@CxxClass("cinder::gl::ScopedTextureBind")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface ScopedTextureBind extends CxxObject {

    @CxxConstructor
    public static ScopedTextureBind newScopedTextureBind(int target, int textureId) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ScopedTextureBind newScopedTextureBind(int target, int textureId, int textureUnit) {
        throw new CxxExpectedGeneratedCodeException();
    }

    /*@CxxConstructor
    public static ScopedTextureBind newScopedTextureBind(@CxxConst @CxxByReference SharedPtr<TextureBase> texture ) {
        throw new CxxExpectedGeneratedCodeException();
    }*/

    @CxxConstructor
    public static ScopedTextureBind newScopedTextureBind(@CxxConst @CxxByReference SharedPtr<Texture2d> texture) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ScopedTextureBind newScopedTextureBindWithTexturaBase(@CxxConst @CxxByReference SharedPtr<TextureBase> texture, int textureUnit) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! \cond
    // These overloads are to alleviate a VS2013 bug where it cannot deduce
    // the correct constructor when a TextureBaseRef subclass is passed in
    @CxxConstructor
    public static ScopedTextureBind newScopedTextureBindWithTexture2d(@CxxConst @CxxByReference SharedPtr<Texture2d> texture, int textureUnit) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ScopedTextureBind newScopedTextureBindWithTextureCubeMap(@CxxConst @CxxByReference SharedPtr<TextureCubeMap> texture, int textureUnit) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
