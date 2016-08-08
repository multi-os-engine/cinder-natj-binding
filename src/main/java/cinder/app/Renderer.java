package cinder.app;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxCopyConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxDefaultConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/app/Renderer.h"}, useQuotes = false)
@CxxClass("cinder::app::Renderer")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Renderer extends CxxObject {

}
