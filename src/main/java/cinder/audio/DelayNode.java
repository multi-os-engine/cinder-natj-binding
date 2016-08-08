package cinder.audio;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/audio/DelayNode.h"}, useQuotes = false)
@CxxClass("cinder::audio::DelayNode")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface DelayNode extends Node {

    //! Sets the maximimum delay in seconds.
    @CxxMethod
    void setMaxDelaySeconds(float seconds);

    @CxxMethod
    Param getParamDelaySeconds();

    //! Connects this Node to \a output.
    @CxxMethod(value = "connect", virtuality = CxxMethodVirtuality.VIRTUAL)
    public void connectGainNode(@CxxConst @CxxByReference SharedPtr<GainNode> output);

    @CxxMethod(value = "connect", virtuality = CxxMethodVirtuality.VIRTUAL)
    public void connectOutputNode(@CxxConst @CxxByReference SharedPtr<OutputNode> output);

    @CxxConstructor()
    public static DelayNode newDelayNode() {
        throw new CxxExpectedGeneratedCodeException();
    }
}
