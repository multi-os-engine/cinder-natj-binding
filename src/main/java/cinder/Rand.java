package cinder;

import org.moe.natj.cxx.ann.CxxFunction;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/Rand.h"}, useQuotes = false)
public class Rand {

    //! returns a random float in the range [0.0f,1.0f)
    @CxxFunction("cinder::randFloat")
    public static native float randFloat();

    //! returns a random float in the range [0.0f,v)
    @CxxFunction("cinder::randFloat")
    public static native float randFloat(float v);

    //! returns a random float in the range [a,b]
    @CxxFunction("cinder::randFloat")
    public static native float randFloat(float a, float b);

    //! returns a random integer in the range [0,v)
    @CxxFunction("cinder::randInt")
    public static native int randInt(int v);

    //! returns a random integer in the range [a,b)
    @CxxFunction("cinder::randInt")
    public static native int randInt(int a, int b);

    //! returns a random boolean value
    @CxxFunction("cinder::randBool")
    public static native boolean randBool();

}
