package std;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.CxxByReference;
import org.moe.natj.cxx.ann.CxxConst;
import org.moe.natj.cxx.ann.CxxOperator;
import org.moe.natj.cxx.ann.CxxTemplate;

@CxxTemplate("std::list<{{T}}>::const_iterator")
public interface ListConstIterator<T extends CxxObject> extends CxxObject {

    @CxxOperator(CxxOperatorKind.INDIRECT)
    @CxxConst
    @CxxByReference
    T get();

    @CxxOperator(CxxOperatorKind.PRE_INCREMENT)
    @CxxByReference
    ListConstIterator<T> succ();
}
