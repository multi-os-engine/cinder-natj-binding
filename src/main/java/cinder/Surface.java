package cinder;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/Surface.h"}, useQuotes = false)
@CxxClass(value = "cinder::SurfaceT<uint8_t>")
@CxxDefaultConstructorUnavailable
public interface Surface extends CxxObject {
    @CxxCastOperator(isConst = true)
    @CxxByValue
    SharedPtr<ImageSource> asImageSourceRef();
}
