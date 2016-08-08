package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxConstructor;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/Color.h"}, useQuotes = false)
@CxxClass("cinder::ColorAT<float>")
public interface ColorAf extends CxxObject {

    @CxxConstructor
    public static ColorAf newColor() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ColorAf newColor(float red, float green, float blue) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ColorAf newColor(float red, float green, float blue, float alpha) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
