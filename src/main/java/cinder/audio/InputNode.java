package cinder.audio;

import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxCopyConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxDefaultConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/audio/InputNode.h"}, useQuotes = false)
@CxxClass("cinder::audio::InputNode")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface InputNode extends Node {

}
