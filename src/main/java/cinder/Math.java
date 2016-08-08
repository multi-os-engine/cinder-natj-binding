package cinder;

import org.moe.natj.cxx.ann.*;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/CinderMath.h"}, useQuotes = false)
public class Math {

    @CxxFunction("cinder::math<float>::min")
    public static native float min(float x, float y);

    @CxxFunction("cinder::math<float>::max")
    public static native float max(float x, float y);

    @CxxFunction("cinder::lmap")
    public static native float lmap(float val, float inMin, float inMax, float outMin, float outMax);

    @CxxFunction("cinder::lerp")
    public static native float lerp(float a, float b, float factor);

    @CxxFunction("cinder::lerp")
    @CxxByValue
    public static native Vec3 lerp(@CxxConst @CxxByReference Vec3 a, @CxxConst @CxxByReference Vec3 b, float factor);

    @CxxFunction("cinder::lerp")
    @CxxByValue
    public static native ColorA lerp(@CxxConst @CxxByReference ColorA a, @CxxConst @CxxByReference ColorA b, float factor);

}
