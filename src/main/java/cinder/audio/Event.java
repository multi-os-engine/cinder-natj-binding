package cinder.audio;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxCopyConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxDefaultConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/audio/Param.h"}, useQuotes = false)
@CxxClass("cinder::audio::Event")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Event extends CxxObject {

}
