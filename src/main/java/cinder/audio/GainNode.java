package cinder.audio;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/audio/GainNode.h"}, useQuotes = false)
@CxxClass("cinder::audio::GainNode")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface GainNode extends MultiplyNode {

    //! Connects this Node to \a output.
    @CxxMethod(value = "connect", virtuality = CxxMethodVirtuality.VIRTUAL)
    public void connectOutputNode(@CxxConst @CxxByReference SharedPtr<OutputNode> output);


    @CxxMethod(value = "connect", virtuality = CxxMethodVirtuality.VIRTUAL)
    public void connectDelayNode(@CxxConst @CxxByReference SharedPtr<DelayNode> output);

    @CxxMethod(value = "connect", virtuality = CxxMethodVirtuality.VIRTUAL)
    public void connectAddNode(@CxxConst @CxxByReference SharedPtr<AddNode> output);

    //! Sets this Node's name to a user-specified string.
    @CxxMethod
    public void setName(@CxxConst @CxxByReference std.String name);

    //! Constructs a GainNode with an initial gain of 1 and optional \a format.
    @CxxConstructor()
    public static GainNode newGainNode() {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Constructs a GainNode with an initial gain of \a initialValue and optional \a format.
    @CxxConstructor()
    public static GainNode newGainNode(float initialValue) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
