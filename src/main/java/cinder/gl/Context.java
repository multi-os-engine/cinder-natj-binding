package cinder.gl;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/gl/Context.h"}, useQuotes = false)
@CxxClass("cinder::gl::Context")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Context extends CxxObject {

    //! Binds GLSL program \a prog. Analogous to glUseProgram()
    @CxxMethod
    public void bindGlslProg(@CxxConst GlslProg prog);

    //! Returns the currently bound GlslProg
    @CxxMethod
    @CxxConst
    public GlslProg getGlslProg();

    //! Returns the thread's currently active OpenGL Context
    @CxxFunction("cinder::gl::Context::getCurrent")
    public static Context getCurrent() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    @CxxByReference
    public SharedPtr<GlslProg> getStockShader(@CxxConst @CxxByReference ShaderDef shaderDef);

}
