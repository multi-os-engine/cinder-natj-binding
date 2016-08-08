package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::ivec2")
public interface IVec2 extends CxxObject {

    @CxxFieldGetter
    public int x();

    @CxxFieldGetter
    public int y();

    @CxxConstructor()
    public static IVec2 newIVec2(int v1, int v2) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static IVec2 newIVec2(int v) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static IVec2 add(@CxxConst @CxxByReference IVec2 lhs, @CxxConst @CxxByReference IVec2 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static IVec2 sub(@CxxConst @CxxByReference IVec2 lhs, @CxxConst @CxxByReference IVec2 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY)
    @CxxByValue
    public static IVec2 mul(@CxxConst @CxxByReference IVec2 lhs, int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    public IVec2 addAssign(@CxxConst @CxxByReference IVec2 lhs);

    @CxxOperator(CxxOperatorKind.ASSIGN)
    @CxxByReference
    public IVec2 assign(@CxxConst @CxxByReference IVec2 lhs);

}
