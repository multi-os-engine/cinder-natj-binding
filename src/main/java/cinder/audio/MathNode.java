package cinder.audio;

import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/audio/NodeMath.h"}, useQuotes = false)
@CxxClass("cinder::audio::MathNode")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface MathNode extends Node {

    //! Returns a pointer to the Param that can be used to animate the value.
    @CxxMethod
    public Param getParam();
}
