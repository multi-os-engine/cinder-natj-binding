package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::bvec4")
public interface BVec4 extends CxxObject {

    @CxxFieldGetter
    public boolean x();

    @CxxFieldGetter
    public boolean y();

    @CxxFieldGetter
    public boolean z();

    @CxxFieldGetter
    public boolean w();

    @CxxConstructor()
    public static BVec4 newVec4() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static BVec4 newVec4(boolean v1) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static BVec4 newVec4(boolean v1, boolean v2, boolean v3, boolean v4) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static BVec4 add(@CxxConst @CxxByReference BVec4 lhs, @CxxConst @CxxByReference BVec4 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static BVec4 sub(@CxxConst @CxxByReference BVec4 lhs, @CxxConst @CxxByReference BVec4 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    public BVec4 addAssign(@CxxConst @CxxByReference BVec4 lhs);
}
