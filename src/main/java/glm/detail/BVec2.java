package glm.detail;

import cinder.Vec2T;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::bvec2")
public interface BVec2 extends CxxObject {

    @CxxFieldGetter
    public boolean x();

    @CxxFieldGetter
    public boolean y();

    @CxxConstructor()
    public static BVec2 newVec2(@CxxConst @CxxByReference BVec2 toCopy) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static BVec2 newVec2() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static BVec2 newVec2(@CxxConst @CxxByReference IVec2 value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static BVec2 newVec2(@CxxConst @CxxByReference Vec2T value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static BVec2 newVec2(boolean v1) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static BVec2 newVec2(boolean v1, boolean v2) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static BVec2 add(@CxxConst @CxxByReference BVec2 lhs, @CxxConst @CxxByReference BVec2 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static BVec2 sub(@CxxConst @CxxByReference BVec2 lhs, @CxxConst @CxxByReference BVec2 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

}
