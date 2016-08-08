package cinder.audio;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/audio/NodeMath.h"}, useQuotes = false)
@CxxClass("cinder::audio::AddNode")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface AddNode extends MathNode {

    @CxxConstructor()
    public static AddNode newAddNode(float initialValue) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
