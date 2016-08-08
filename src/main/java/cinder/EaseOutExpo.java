package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxConstructor;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/Easing.h"}, useQuotes = false)
@CxxClass("cinder::EaseOutExpo")
public interface EaseOutExpo {

    @CxxConstructor()
    public static EaseOutExpo newEaseOutExpo() {
        throw new CxxExpectedGeneratedCodeException();
    }
}
