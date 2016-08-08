package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::ivec4")
public interface IVec4 extends CxxObject {

    @CxxFieldGetter
    public int x();

    @CxxFieldGetter
    public int y();

    @CxxFieldGetter
    public int z();

    @CxxFieldGetter
    public int w();

    @CxxConstructor()
    public static IVec4 newIVec4(int v1, int v2, int v3, int v4) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static IVec4 newIIVec4(int v) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static IVec4 add(@CxxConst @CxxByReference IVec4 lhs, @CxxConst @CxxByReference IVec4 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static IVec4 sub(@CxxConst @CxxByReference IVec4 lhs, @CxxConst @CxxByReference IVec4 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY)
    @CxxByValue
    public static IVec4 mul(@CxxConst @CxxByReference IVec4 lhs, int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    public IVec4 addAssign(@CxxConst @CxxByReference IVec4 lhs);

}
