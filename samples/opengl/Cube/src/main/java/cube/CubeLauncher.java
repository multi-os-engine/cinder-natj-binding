package cube;

import cinder.app.AppBase;
import cinder.app.RendererGl;
import sample.utils.CommonLauncher;

public class CubeLauncher extends CommonLauncher {

    @Override
    protected void prepareSettings(AppBase.Settings settings) {
        settings.setTitle(std.String.getString("Cube"));
    }

    @Override
    protected AppBase createApp() {
        System.out.println("Creating app");
        return new CubeApp();
    }

    public static void main(String[] args) throws Exception {
        final CubeLauncher launcher = new CubeLauncher();
        launcher.launch("MOE", RendererGl.class, RendererGl.create(RendererGl.Options.newOptions().msaa(16)));
    }

}
