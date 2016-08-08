package cinder.gl;

import cinder.TriMesh;
import cinder.geom.Source;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/gl/Batch.h"}, useQuotes = false)
@CxxClass("cinder::gl::Batch")
@CxxDefaultConstructorUnavailable
public interface Batch extends CxxObject {

    @CxxConstructor
    static std.Vector<SharedPtr<Batch>> newBatchRefVector() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    static SharedPtr<Batch> createEmpty() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    public void draw();

    //! Returns the shader associated with the Batch
    @CxxMethod(isConst = true)
    @CxxConst
    @CxxByReference
    public SharedPtr<GlslProg> getGlslProg();

    @CxxFunction("cinder::gl::Batch::create")
    @CxxByValue
    public static SharedPtr<Batch> create(@CxxConst @CxxByReference Source source, @CxxConst @CxxByReference SharedPtr<GlslProg> glsl) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::gl::Batch::create")
    @CxxByValue
    public static SharedPtr<Batch> create(@CxxConst @CxxByReference TriMesh source, @CxxConst @CxxByReference SharedPtr<GlslProg> glsl) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
