package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::ivec3")
public interface IVec3 extends CxxObject {

    @CxxFieldGetter
    public int x();

    @CxxFieldGetter
    public int y();

    @CxxFieldGetter
    public int z();

    @CxxConstructor()
    public static IVec3 newIVec3(int v1, int v2, int v3) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static IVec3 newIVec3(int v) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static IVec3 add(@CxxConst @CxxByReference IVec3 lhs, @CxxConst @CxxByReference IVec3 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static IVec3 sub(@CxxConst @CxxByReference IVec3 lhs, @CxxConst @CxxByReference IVec3 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY)
    @CxxByValue
    public static IVec3 mul(@CxxConst @CxxByReference IVec3 lhs, int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    public IVec3 addAssign(@CxxConst @CxxByReference IVec3 lhs);

}
