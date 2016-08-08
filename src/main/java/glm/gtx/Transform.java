package glm.gtx;

import org.moe.natj.cxx.ann.CxxByValue;
import org.moe.natj.cxx.ann.CxxFunction;
import org.moe.natj.cxx.ann.CxxHeader;
import glm.detail.Mat4;
import glm.detail.Vec3;

@CxxHeader(value = {"glm/gtx/transform.hpp"}, useQuotes = false)
public class Transform {

    @CxxFunction("glm::rotate")
    @CxxByValue
    public static native Mat4 rotate(float angle, @CxxByValue Vec3 v);
}
