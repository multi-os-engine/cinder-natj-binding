package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::bvec3")
public interface BVec3 extends CxxObject {

    @CxxFieldGetter
    public boolean x();

    @CxxFieldGetter
    public boolean y();

    @CxxFieldGetter
    public boolean z();

    @CxxConstructor()
    public static BVec3 newVec3() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static BVec3 newVec3(boolean v1) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static BVec3 newVec3(boolean v1, boolean v2, boolean v3) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static BVec3 add(@CxxConst @CxxByReference BVec3 lhs, @CxxConst @CxxByReference BVec3 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static BVec3 sub(@CxxConst @CxxByReference BVec3 lhs, @CxxConst @CxxByReference BVec3 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

}
