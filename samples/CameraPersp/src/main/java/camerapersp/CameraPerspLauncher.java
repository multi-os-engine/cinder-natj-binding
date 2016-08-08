package camerapersp;

import cinder.app.AppBase;
import cinder.app.RendererGl;
import sample.utils.CommonLauncher;

public class CameraPerspLauncher extends CommonLauncher {

    @Override
    protected void prepareSettings(AppBase.Settings settings) {
        settings.setTitle(std.String.getString("CameraPersp"));
        settings.setResizable(false);
    }

    @Override
    protected AppBase createApp() {
        System.out.println("Creating app");
        return new CameraPerspApp();
    }

    public static void main(String[] args) throws Exception {
        final CameraPerspLauncher launcher = new CameraPerspLauncher();
        launcher.launch("MOE", RendererGl.class, RendererGl.create(RendererGl.Options.newOptions().msaa(16)));
    }
}
