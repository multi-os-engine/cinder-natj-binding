package cinder.audio;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/audio/Context.h"}, useQuotes = false)
@CxxClass("cinder::audio::Context")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Context extends CxxObject {

    @CxxMethod
    @CxxByValue
    public SharedPtr<GenOscNode> makeNode(GenOscNode node);

    @CxxMethod
    @CxxByValue
    public SharedPtr<GainNode> makeNode(GainNode node);

    @CxxMethod
    @CxxByValue
    public SharedPtr<DelayNode> makeNode(DelayNode node);

    @CxxMethod
    @CxxByValue
    public SharedPtr<GenSineNode> makeNode(GenSineNode node);

    @CxxMethod
    @CxxByValue
    public SharedPtr<AddNode> makeNode(AddNode node);

    @CxxMethod
    @CxxByValue
    std.String printGraphToString();

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    @CxxConst
    @CxxByReference
    public SharedPtr<OutputNode> getOutput();

    //! Enables audio processing. Effectively the same as calling getOutput()->enable()
    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void enable();

    @CxxFunction("cinder::audio::Context::master")
    public static Context master() {
        throw new CxxExpectedGeneratedCodeException();
    }

}
