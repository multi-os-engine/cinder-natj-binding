package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import glm.detail.Vec2;

@CxxHeader(value = {"cinder/Perlin.h"}, useQuotes = false)
@CxxClass("cinder::Perlin")
public interface Perlin extends CxxObject {

    @CxxMethod(isConst = true)
    public float fBm(@CxxConst @CxxByReference Vec2 v);

    @CxxConstructor()
    public static Perlin newPerlin() {
        throw new CxxExpectedGeneratedCodeException();
    }
}
