package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::uvec4")
public interface UIVec4 extends CxxObject {

    @CxxFieldGetter
    @CxxUnsigned
    public int x();

    @CxxFieldGetter
    @CxxUnsigned
    public int y();

    @CxxFieldGetter
    @CxxUnsigned
    public int z();

    @CxxFieldGetter
    @CxxUnsigned
    public int w();

    @CxxConstructor()
    public static UIVec4 newIVec4(@CxxUnsigned int v1, @CxxUnsigned int v2, @CxxUnsigned int v3, @CxxUnsigned int v4) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static UIVec4 newIIVec4(@CxxUnsigned int v) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static UIVec4 add(@CxxConst @CxxByReference UIVec4 lhs, @CxxConst @CxxByReference UIVec4 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static UIVec4 sub(@CxxConst @CxxByReference UIVec4 lhs, @CxxConst @CxxByReference UIVec4 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY)
    @CxxByValue
    public static UIVec4 mul(@CxxConst @CxxByReference UIVec4 lhs, @CxxUnsigned int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    public UIVec4 addAssign(@CxxConst @CxxByReference UIVec4 lhs);

}
