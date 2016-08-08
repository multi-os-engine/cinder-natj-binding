package cinder.gl;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxConstructor;
import org.moe.natj.cxx.ann.CxxCopyConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/gl/scoped.h"}, useQuotes = false)
@CxxClass("cinder::gl::ScopedModelMatrix")
@CxxCopyConstructorUnavailable
public interface ScopedModelMatrix extends CxxObject {

    @CxxConstructor()
    public static ScopedModelMatrix newScopedModelMatrix() {
        throw new CxxExpectedGeneratedCodeException();
    }
}
