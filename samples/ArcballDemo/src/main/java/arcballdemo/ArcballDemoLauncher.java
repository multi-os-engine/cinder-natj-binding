package arcballdemo;

import cinder.app.AppBase;
import cinder.app.RendererGl;
import sample.utils.CommonLauncher;

public class ArcballDemoLauncher extends CommonLauncher {

    @Override
    protected void prepareSettings(AppBase.Settings settings) {
        settings.setTitle(std.String.getString("ArcballDemo"));
        settings.setMultiTouchEnabled(false);
    }

    @Override
    protected AppBase createApp() {
        System.out.println("Creating app");
        return new ArcballDemoApp();
    }

    public static void main(String[] args) throws Exception {
        final ArcballDemoLauncher launcher = new ArcballDemoLauncher();
        launcher.launch("MOE", RendererGl.class, RendererGl.create());
    }

}
