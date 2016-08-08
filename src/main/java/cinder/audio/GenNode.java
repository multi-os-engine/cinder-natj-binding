package cinder.audio;

import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/audio/GenNode.h"}, useQuotes = false)
@CxxClass("cinder::audio::GenNode")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface GenNode extends InputNode {

    //! Returns a pointer to the Param, which can be used to animate the frequency.
    @CxxMethod
    public Param getParamFreq();
}
