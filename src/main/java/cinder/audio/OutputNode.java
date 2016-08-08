package cinder.audio;

import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxCopyConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxDefaultConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/audio/OutputNode.h"}, useQuotes = false)
@CxxClass("cinder::audio::OutputNode")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface OutputNode extends Node {

}
