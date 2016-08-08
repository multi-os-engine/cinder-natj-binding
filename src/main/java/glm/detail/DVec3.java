package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_vec.hpp"}, useQuotes = false)
@CxxClass("glm::dvec3")
public interface DVec3 extends CxxObject {

    @CxxFieldGetter
    public double x();

    @CxxFieldGetter
    public double y();

    @CxxFieldGetter
    public double z();

    @CxxConstructor()
    public static DVec3 newDVec2(double v1, double v2, double v3) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static DVec3 newDVec2(double v) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    public static DVec3 add(@CxxConst @CxxByReference DVec3 lhs, @CxxConst @CxxByReference DVec3 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    public static DVec3 sub(@CxxConst @CxxByReference DVec3 lhs, @CxxConst @CxxByReference DVec3 rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY)
    @CxxByValue
    public static DVec3 mul(@CxxConst @CxxByReference DVec3 lhs, double value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    public DVec3 addAssign(@CxxConst @CxxByReference DVec3 lhs);
}
