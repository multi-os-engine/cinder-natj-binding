package std;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;

@CxxHeader(value = "list", useQuotes = false)
@CxxTemplate("std::list<{{T}}>")
public interface List<T extends CxxObject> extends CxxObject {

    @CxxMethod(isConst = true)
    @NULong
    public long size();

    @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
    @CxxConst
    @CxxByReference
    public T get(@NULong long index);

    @CxxMethod
    public void push_back(@CxxConst @CxxByReference T value);

    @CxxMethod
    public void push_front(@CxxConst @CxxByReference T value);

    @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
    @CxxConst
    @CxxByValue
    public T set(@NULong long index, @CxxConst @CxxByReference T value);

    @CxxMethod
    public void clear();

    @CxxMethod
    public void pop_front();

    @CxxMethod
    public void pop_back();

    @CxxMethod
    public void remove(@CxxConst @CxxByReference T value);
}
