package cinder.gl;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxCopyConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxDefaultConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/gl/Texture.h"}, useQuotes = false)
@CxxClass("cinder::gl::TextureBase")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface TextureBase extends CxxObject {
}
