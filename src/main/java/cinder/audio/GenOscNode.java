package cinder.audio;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/audio/GenNode.h"}, useQuotes = false)
@CxxClass("cinder::audio::GenOscNode")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface GenOscNode extends GenNode {

    //! Sets the WaveformType of the internal wavetable. This can be a heavy operation and requires thread synchronization, so be careful not to block the audio thread for too long.
    @CxxMethod
    public void setWaveform(@CxxEnum("cinder::audio::WaveformType") int waveformType);

    //! Connects this Node to \a output.
    @CxxMethod(value = "connect", virtuality = CxxMethodVirtuality.VIRTUAL)
    public void connectGainNode(@CxxConst @CxxByReference SharedPtr<GainNode> output);

    //! Enables this Node for processing. Same as `setEnabled( true )`.
    @CxxMethod
    public void enable();

    @CxxConstructor()
    public static GenOscNode newGenOscNode() {
        throw new CxxExpectedGeneratedCodeException();
    }
}
