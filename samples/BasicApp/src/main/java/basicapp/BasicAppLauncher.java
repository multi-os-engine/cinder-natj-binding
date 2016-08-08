package basicapp;

import cinder.app.AppBase;
import cinder.app.RendererGl;
import sample.utils.CommonLauncher;

public class BasicAppLauncher extends CommonLauncher {

    @Override
    protected void prepareSettings(AppBase.Settings settings) {
        settings.setTitle(std.String.getString("BasicApp"));
    }

    @Override
    protected AppBase createApp() {
        System.out.println("Creating app");
        return new BasicApp();
    }

    public static void main(String[] args) throws Exception {
        final BasicAppLauncher launcher = new BasicAppLauncher();
        launcher.launch("MOE", RendererGl.class, RendererGl.create());
    }

}
