package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/Tween.h"}, useQuotes = false)
@CxxClass("std::function<float (float)>")
public interface EaseFn extends CxxObject {

    @CxxConstructor()
    public static EaseFn newEaseFn(@CxxConst @CxxByReference EaseOutExpo easeOutExpo) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
