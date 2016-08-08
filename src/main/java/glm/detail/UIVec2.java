package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::uvec2")
public interface UIVec2 extends CxxObject {

    @CxxFieldGetter
    @CxxUnsigned
    public int x();

    @CxxFieldGetter
    @CxxUnsigned
    public int y();

    @CxxConstructor()
    public static UIVec2 newIVec2(@CxxUnsigned int v1, @CxxUnsigned int v2) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static UIVec2 newIVec2(@CxxUnsigned int v) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static UIVec2 add(@CxxConst @CxxByReference UIVec2 lhs, @CxxConst @CxxByReference UIVec2 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static UIVec2 sub(@CxxConst @CxxByReference UIVec2 lhs, @CxxConst @CxxByReference UIVec2 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY)
    @CxxByValue
    public static UIVec2 mul(@CxxConst @CxxByReference UIVec2 lhs, @CxxUnsigned int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    public UIVec2 addAssign(@CxxConst @CxxByReference UIVec2 lhs);

    @CxxOperator(CxxOperatorKind.ASSIGN)
    @CxxByReference
    public UIVec2 assign(@CxxConst @CxxByReference UIVec2 lhs);

}
