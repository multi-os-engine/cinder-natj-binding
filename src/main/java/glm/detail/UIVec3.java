package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::uvec3")
public interface UIVec3 extends CxxObject {

    @CxxFieldGetter
    @CxxUnsigned
    public int x();

    @CxxFieldGetter
    @CxxUnsigned
    public int y();

    @CxxFieldGetter
    @CxxUnsigned
    public int z();

    @CxxConstructor()
    public static UIVec3 newIVec3(@CxxUnsigned int v1, @CxxUnsigned int v2, @CxxUnsigned int v3) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static UIVec3 newIVec3(@CxxUnsigned int v) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static UIVec3 add(@CxxConst @CxxByReference UIVec3 lhs, @CxxConst @CxxByReference UIVec3 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static UIVec3 sub(@CxxConst @CxxByReference UIVec3 lhs, @CxxConst @CxxByReference UIVec3 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY)
    @CxxByValue
    public static UIVec3 mul(@CxxConst @CxxByReference UIVec3 lhs, @CxxUnsigned int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    public UIVec3 addAssign(@CxxConst @CxxByReference UIVec3 lhs);

}
