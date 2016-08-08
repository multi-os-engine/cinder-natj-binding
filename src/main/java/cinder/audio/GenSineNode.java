package cinder.audio;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/audio/GainNode.h"}, useQuotes = false)
@CxxClass("cinder::audio::GenSineNode")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface GenSineNode extends GenNode {

    //! Connects this Node to \a output.
    @CxxMethod(value = "connect", virtuality = CxxMethodVirtuality.VIRTUAL)
    public void connectGainNode(@CxxConst @CxxByReference SharedPtr<GainNode> output);

    @CxxConstructor()
    public static GenSineNode newGenSineNode(float freq, @CxxConst @CxxByReference Node.Format format) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
