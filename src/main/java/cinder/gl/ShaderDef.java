package cinder.gl;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/gl/Shader.h"}, useQuotes = false)
@CxxClass("cinder::gl::ShaderDef")
public interface ShaderDef extends CxxObject {

    @CxxConstructor
    public static ShaderDef newShaderDef() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    @CxxByReference
    public ShaderDef color();

    @CxxMethod
    @CxxByReference
    public ShaderDef texture(@CxxConst @CxxByReference SharedPtr<Texture2d> tex);

    @CxxMethod
    @CxxByReference
    public ShaderDef texture();

    /*@CxxMethod
    @CxxByReference
    public ShaderDef texture( GLenum target );*/

    @CxxMethod
    @CxxByReference
    public ShaderDef lambert();

    // Used by draw(TextureRef&) stock shader; scales ciPosition and ciTexCoord according to
    // uniform "uPositionScale", "uPositionOffset", "uTexCoord0Scale", "uTexCoord0Offset"
    @CxxMethod
    @CxxByReference
    public ShaderDef uniformBasedPosAndTexCoord();

    @CxxMethod(isConst = true)
    public boolean isTextureSwizzleDefault();

    @CxxMethod(isConst = true)
    @CxxByValue
    public std.String getTextureSwizzleString();
}
