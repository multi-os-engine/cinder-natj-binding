package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/Color.h"}, useQuotes = false)
@CxxClass("cinder::ColorT<float>")
public interface Color extends CxxObject {

    @CxxFieldGetter
    public float r();

    @CxxFieldGetter
    public float g();

    @CxxFieldGetter
    public float b();

    @CxxConstructor()
    public static Color newColor(@CxxEnum("cinder::ColorModel") int cm, @CxxConst @CxxByReference Vec3 v) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::Color::white")
    @CxxByValue
    public static Color white() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static Color newColor(float red, float green, float blue) {
        throw new CxxExpectedGeneratedCodeException();
    }

}
