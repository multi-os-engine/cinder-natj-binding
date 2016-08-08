package cinder.gl;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;

//! Scopes state of line width
@CxxHeader(value = {"cinder/gl/scoped.h"}, useQuotes = false)
@CxxClass("cinder::gl::ScopedLineWidth")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface ScopedLineWidth extends CxxObject {

    @CxxConstructor
    public static ScopedLineWidth newScopedLineWidth(float width) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
