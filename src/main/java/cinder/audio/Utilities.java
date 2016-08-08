package cinder.audio;

import org.moe.natj.cxx.ann.CxxFunction;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/audio/Utilities.h"}, useQuotes = false)
public class Utilities {

    @CxxFunction("cinder::audio::midiToFreq")
    public static native float midiToFreq(float midi);
}
