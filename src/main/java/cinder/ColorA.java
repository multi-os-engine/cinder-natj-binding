package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/Color.h"}, useQuotes = false)
@CxxClass("cinder::ColorAT<float>")
public interface ColorA extends CxxObject {

    @CxxFieldGetter
    public float r();

    @CxxFieldGetter
    public float g();

    @CxxFieldGetter
    public float b();

    @CxxFunction("cinder::Color::gray")
    @CxxByValue
    public static ColorA gray(float value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ColorA newColor(float red, float green, float blue) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ColorA newColor(float red, float green, float blue, float alpha) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ColorA newColorA(@CxxEnum("cinder::ColorModel") int cm, float c0, float c1, float c2, float alpha) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ColorA newColorA(@CxxEnum("cinder::ColorModel") int cm, float c0, float c1, float c2) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ColorA newColorA() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static ColorA newColorA(@CxxConst @CxxByReference ColorA orig) {
        throw new CxxExpectedGeneratedCodeException();
    }

    // The original code returns `this` byValue which is probably a mistake, we can skip memory management this way
    @CxxOperator(CxxOperatorKind.ASSIGN)
    public void assign(@CxxConst @CxxByReference ColorA orig);

}
