package cinder.gl;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/gl/Texture.h"}, useQuotes = false)
@CxxClass("cinder::gl::Texture2d::Format")
public interface Format extends CxxObject {

    @CxxMethod
    @CxxByReference
    public Format mipmap();

    @CxxConstructor()
    public static Format newFormat() {
        throw new CxxExpectedGeneratedCodeException();
    }
}
