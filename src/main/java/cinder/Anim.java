package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxConstructor;
import org.moe.natj.cxx.ann.CxxHeader;
import org.moe.natj.cxx.ann.CxxMethod;

@CxxHeader(value = {"cinder/Tween.h"}, useQuotes = false)
@CxxClass("cinder::Anim<float>")
public interface Anim extends AnimBase {

    @CxxMethod(isConst = true)
    public float value();

    @CxxConstructor()
    public static Anim newAnim(float value) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
