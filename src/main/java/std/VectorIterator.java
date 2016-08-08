package std;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.CxxByReference;
import org.moe.natj.cxx.ann.CxxOperator;
import org.moe.natj.cxx.ann.CxxTemplate;

@CxxTemplate("std::vector<{{T}}>::iterator")
public interface VectorIterator<T extends CxxObject> extends CxxObject {

    @CxxOperator(CxxOperatorKind.INDIRECT)
    @CxxByReference
    T get();

    @CxxOperator(CxxOperatorKind.PRE_INCREMENT)
    @CxxByReference
    VectorIterator<T> succ();
}
