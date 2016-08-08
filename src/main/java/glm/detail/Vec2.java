package glm.detail;

import cinder.Vec2T;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::vec2")
public interface Vec2 extends CxxObject {

    @CxxFieldGetter
    public float x();

    @CxxFieldGetter
    public float y();

    @CxxConstructor()
    public static Vec2 newVec2(@CxxConst @CxxByReference Vec2 toCopy) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Vec2 newVec2() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Vec2 newVec2(@CxxConst @CxxByReference IVec2 value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Vec2 newVec2(@CxxConst @CxxByReference Vec2T value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Vec2 newVec2(float v1) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Vec2 newVec2(float v1, float v2) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static std.Vector<Vec2> newVec2Vector() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static Vec2 add(@CxxConst @CxxByReference Vec2 lhs, @CxxConst @CxxByReference Vec2 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static Vec2 sub(@CxxConst @CxxByReference Vec2 lhs, @CxxConst @CxxByReference Vec2 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY)
    @CxxByValue
    public static Vec2 mul(@CxxConst @CxxByReference Vec2 lhs, float value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    public Vec2 addAssign(@CxxConst @CxxByReference Vec2 lhs);

    @CxxOperator(CxxOperatorKind.ASSIGN)
    @CxxByReference
    public Vec2 assign(@CxxConst @CxxByReference Vec2 lhs);

    default Vec2 assign(float x, float y) {
        CxxRuntime.castToPtr(this).getFloatPtr().copyFrom(new float[]{x, y});
        return this;
    }

}
