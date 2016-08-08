package cinder.gl;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/gl/scoped.h"}, useQuotes = false)
@CxxClass("cinder::gl::ScopedGlslProg")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface ScopedGlslProg extends CxxObject {

    @CxxConstructor()
    public static ScopedGlslProg newScopedGlslProg(@CxxConst @CxxByReference SharedPtr<GlslProg> prog) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
