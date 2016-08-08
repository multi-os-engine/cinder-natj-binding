package sample.utils;

import org.moe.natj.cxx.CxxInheritedObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import std.ReferenceWrapper;
import std.UpdateFn;

@CxxInheritedClass("natj::cindersample::CommonUpdateFn")
public class CommonUpdateFn extends CxxInheritedObject {
    public interface ICommonUpdateFn {
        void run();
    }

    private final ICommonUpdateFn callback;
    private final UpdateFn updateFn;

    @CxxInheritedConstructor()
    private static native long create(long peer);

    public CommonUpdateFn(ICommonUpdateFn callback) {
        super(new ICxxConstructor() {
            @Override
            public long construct(long l) {
                return create(l);
            }
        });
        this.callback = callback;
        final ReferenceWrapper<CommonUpdateFn> wrapper = wrapBindUpdateFn(this);
        this.updateFn = createBindUpdateFn(wrapper);
        CxxRuntime.delete(wrapper);
    }

    @CxxOperator(CxxOperatorKind.FUNCTION_CALL)
    public void call() {
        callback.run();
    }

    public UpdateFn getUpdateFn() {
        return updateFn;
    }

    @CxxConstructor()
    private static native ReferenceWrapper<CommonUpdateFn> wrapBindUpdateFn(@CxxByReference CommonUpdateFn provider);

    @CxxConstructor()
    private static native UpdateFn createBindUpdateFn(@CxxConst @CxxByReference ReferenceWrapper<CommonUpdateFn> wrapper);
}
