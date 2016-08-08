package cinder;

import org.moe.natj.cxx.ann.CxxFunction;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/CinderMath.h"}, useQuotes = false)
public class CinderMath {

    @CxxFunction("cinder::toRadians")
    public static native float toRadians(float x);
}
