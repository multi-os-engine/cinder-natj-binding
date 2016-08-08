package cinder.gl;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxCopyConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxDefaultConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxHeader;

//! Controls the current blend mode for the current scope.
@CxxHeader(value = {"cinder/gl/scoped.h"}, useQuotes = false)
@CxxClass("cinder::gl::ScopedBlend")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface ScopedBlend extends CxxObject {

}
