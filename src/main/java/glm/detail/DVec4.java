package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::dvec4")
public interface DVec4 extends CxxObject {

    @CxxFieldGetter
    public double x();

    @CxxFieldGetter
    public double y();

    @CxxFieldGetter
    public double z();

    @CxxFieldGetter
    public double w();

    @CxxConstructor()
    public static DVec4 newDVec2(double v1, double v2, double v3, double v4) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static DVec4 newDVec2(double v) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static DVec4 add(@CxxConst @CxxByReference DVec4 lhs, @CxxConst @CxxByReference DVec4 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static DVec4 sub(@CxxConst @CxxByReference DVec4 lhs, @CxxConst @CxxByReference DVec4 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY)
    @CxxByValue
    public static DVec4 mul(@CxxConst @CxxByReference DVec4 lhs, double value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    public DVec4 addAssign(@CxxConst @CxxByReference DVec4 lhs);
}
