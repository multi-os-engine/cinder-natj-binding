package sample.utils;

import cinder.app.AppBase;
import cinder.app.Renderer;
import cinder.app.Renderer2d;
import cinder.app.RendererGl;
import org.moe.natj.cxx.*;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.ConstPtr;
import std.ReferenceWrapper;
import std.SharedPtr;

import java.io.File;

public abstract class CommonLauncher {
    static {
        try {
            System.loadLibrary("natj");
            System.loadLibrary("sample");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private final CustomSettingsFn customSettingsFn;
    private final CustomAppFn customAppFn;

    protected abstract void prepareSettings(AppBase.Settings settings);

    protected abstract AppBase createApp();

    protected CommonLauncher() {
        customSettingsFn = new CustomSettingsFn(this);
        customAppFn = new CustomAppFn(this);
    }

    protected <T extends Renderer> void launch(String title, Class<T> rendererClass, SharedPtr<T> renderer) {
        try {
            ReferenceWrapper<CustomSettingsFn> settingsFnWrapper = wrapSettingsFn(customSettingsFn);
            SettingsFn settingsFn = createSettingsFn(settingsFnWrapper);

            ReferenceWrapper<CustomAppFn> appFnWrapper = wrapAppFn(customAppFn);
            AppFn appFn = createAppFn(appFnWrapper);

            try {
                if (rendererClass == Renderer2d.class) {
                    CommonLauncher.mainWithRenderer2d(appFn, (SharedPtr<Renderer2d>) renderer,
                            std.String.getBytePtr(title), 0, null, settingsFn);

                } else if (rendererClass == RendererGl.class) {
                    CommonLauncher.mainWithRendererGl(appFn, (SharedPtr<RendererGl>) renderer,
                            std.String.getBytePtr(title), 0, null, settingsFn);

                } else {
                    throw new RuntimeException("Unsupported renderer: " + rendererClass.getName());
                }

            } finally {
                CxxRuntime.delete(appFn);
                CxxRuntime.delete(appFnWrapper);
                CxxRuntime.delete(settingsFn);
                CxxRuntime.delete(settingsFnWrapper);
                CxxRuntime.delete(renderer);
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static String locateResource(String resourceName) {
        final String execParent = System.getProperty("sample.exec.parent");
        if (execParent == null) {
            throw new RuntimeException("sample.exec.parent property is not set");
        }
        if (resourceName == null) {
            return new File(execParent, "../Resources").getAbsolutePath();
        }
        return new File(execParent, "../Resources/" + resourceName).getAbsolutePath();
    }

    @CxxHeader(value = "functional", useQuotes = false)
    @CxxClass("std::function<void(cinder::app::AppBase::Settings*)>")
    public interface SettingsFn extends CxxObject {
        @CxxOperator(CxxOperatorKind.FUNCTION_CALL)
        void call(AppBase.Settings settings);
    }

    @CxxInheritedClass("natj::cindersample::SettingsFn")
    public static class CustomSettingsFn extends CxxInheritedObject {

        private final CommonLauncher commonLauncher;

        @CxxInheritedConstructor()
        private static native long constructor(long ref);

        public CustomSettingsFn(CommonLauncher commonLauncher) {
            super(new ICxxConstructor() {
                @Override
                public long construct(long javaReference) {
                    return constructor(javaReference);
                }
            });
            if (commonLauncher == null) {
                throw new NullPointerException();
            }
            this.commonLauncher = commonLauncher;
        }

        @CxxOperator(CxxOperatorKind.FUNCTION_CALL)
        void call(AppBase.Settings settings) {
            commonLauncher.prepareSettings(settings);
        }
    }

    @CxxConstructor()
    public static native ReferenceWrapper<CustomSettingsFn> wrapSettingsFn(@CxxByReference CustomSettingsFn provider);

    @CxxConstructor()
    public static native SettingsFn createSettingsFn(@CxxConst @CxxByReference ReferenceWrapper<CustomSettingsFn> wrapper);

    @CxxInheritedClass("natj::cindersample::AppFn")
    public static class CustomAppFn extends CxxInheritedObject {

        private final CommonLauncher commonLauncher;

        @CxxInheritedConstructor()
        private static native long constructor(long ref);

        public CustomAppFn(CommonLauncher commonLauncher) {
            super(new ICxxConstructor() {
                @Override
                public long construct(long javaReference) {
                    return constructor(javaReference);
                }
            });
            if (commonLauncher == null) {
                throw new NullPointerException();
            }
            this.commonLauncher = commonLauncher;
        }

        @CxxOperator(CxxOperatorKind.FUNCTION_CALL)
        AppBase call() {
            return commonLauncher.createApp();
        }
    }

    @CxxConstructor()
    public static native ReferenceWrapper<CustomAppFn> wrapAppFn(@CxxByReference CustomAppFn provider);

    @CxxConstructor()
    public static native AppFn createAppFn(@CxxConst @CxxByReference ReferenceWrapper<CustomAppFn> wrapper);

    @CxxHeader(value = "functional", useQuotes = false)
    @CxxClass("std::function<cinder::app::AppBase*()>")
    public interface AppFn extends CxxObject {
        @CxxOperator(CxxOperatorKind.FUNCTION_CALL)
        AppBase call();
    }

    @CxxFunction("cinder::app::AppMac::main")
    private static void mainWithRenderer2d(
            @CxxConst @CxxByReference AppFn app,
            @CxxConst @CxxByReference SharedPtr<Renderer2d> defaultRenderer,
            ConstBytePtr title,
            int argc, ConstPtr<BytePtr> argv,
            @CxxConst @CxxByReference SettingsFn settings) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::app::AppMac::main")
    private static void mainWithRendererGl(
            @CxxConst @CxxByReference AppFn app,
            @CxxConst @CxxByReference SharedPtr<RendererGl> defaultRenderer,
            ConstBytePtr title,
            int argc, ConstPtr<BytePtr> argv,
            @CxxConst @CxxByReference SettingsFn settings) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
