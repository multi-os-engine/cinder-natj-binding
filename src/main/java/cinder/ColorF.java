package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxConstructor;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/Color.h"}, useQuotes = false)
@CxxClass("cinder::ColorT<float>")
public interface ColorF extends Color {

    @CxxConstructor
    public static ColorF newColor() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ColorF newColor(float red, float green, float blue) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
