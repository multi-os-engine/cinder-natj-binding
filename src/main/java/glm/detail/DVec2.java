package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::dvec2")
public interface DVec2 extends CxxObject {

    @CxxFieldGetter
    public double x();

    @CxxFieldGetter
    public double y();

    @CxxConstructor()
    public static DVec2 newDVec2(double v1, double v2) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static DVec2 newDVec2(double v) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static DVec2 add(@CxxConst @CxxByReference DVec2 lhs, @CxxConst @CxxByReference DVec2 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static DVec2 sub(@CxxConst @CxxByReference DVec2 lhs, @CxxConst @CxxByReference DVec2 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY)
    @CxxByValue
    public static DVec2 mul(@CxxConst @CxxByReference DVec2 lhs, double value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    public DVec2 addAssign(@CxxConst @CxxByReference DVec2 lhs);
}
