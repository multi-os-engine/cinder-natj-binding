package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::vec4")
public interface Vec4 extends CxxObject {

    @CxxFieldGetter
    public float x();

    @CxxFieldGetter
    public float y();

    @CxxFieldGetter
    public float z();

    @CxxFieldGetter
    public float w();

    @CxxConstructor()
    public static Vec4 newVec4() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Vec4 newVec4(float v1) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Vec4 newVec4(float v1, float v2, float v3, float v4) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static Vec4 add(@CxxConst @CxxByReference Vec4 lhs, @CxxConst @CxxByReference Vec4 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static Vec4 sub(@CxxConst @CxxByReference Vec4 lhs, @CxxConst @CxxByReference Vec4 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY)
    @CxxByValue
    public static Vec4 mul(@CxxConst @CxxByReference Vec4 lhs, float value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    public Vec4 addAssign(@CxxConst @CxxByReference Vec4 lhs);
}
