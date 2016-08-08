package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::vec3")
public interface Vec3 extends CxxObject {

    @CxxFieldGetter
    public float x();

    @CxxFieldGetter
    public float y();

    @CxxFieldGetter
    public float z();

    @CxxConstructor()
    public static Vec3 newVec3() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Vec3 newVec3(float v1) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Vec3 newVec3(float v1, float v2, float v3) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static Vec3 add(@CxxConst @CxxByReference Vec3 lhs, @CxxConst @CxxByReference Vec3 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static Vec3 sub(@CxxConst @CxxByReference Vec3 lhs, @CxxConst @CxxByReference Vec3 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY)
    @CxxByValue
    public static Vec3 mul(@CxxConst @CxxByReference Vec3 lhs, float value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    public Vec3 addAssign(@CxxConst @CxxByReference Vec3 lhs);

    @CxxOperator(CxxOperatorKind.ASSIGN)
    @CxxByReference
    public Vec3 assign(@CxxConst @CxxByReference Vec3 lhs);

    default Vec3 assign(float x, float y, float z) {
        CxxRuntime.castToPtr(this).getFloatPtr().copyFrom(new float[]{x, y, z});
        return this;
    }
}
