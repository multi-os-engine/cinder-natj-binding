package wisteria;

import cinder.app.AppBase;
import cinder.app.Renderer2d;
import sample.utils.CommonLauncher;

public class WisteriaLauncher extends CommonLauncher {

    @Override
    protected void prepareSettings(AppBase.Settings settings) {
        settings.setTitle(std.String.getString("Wisteria"));
        settings.setWindowSize(640, 480);
        settings.setResizable(false);
    }

    @Override
    protected AppBase createApp() {
        System.out.println("Creating app");
        return new WisteriaApp();
    }

    public static void main(String[] args) throws Exception {
        final WisteriaLauncher launcher = new WisteriaLauncher();
        launcher.launch("MOE", Renderer2d.class, Renderer2d.create());
    }

}
