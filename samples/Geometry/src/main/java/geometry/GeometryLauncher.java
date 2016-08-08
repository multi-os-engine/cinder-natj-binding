package geometry;

import cinder.app.AppBase;
import cinder.app.RendererGl;
import sample.utils.CommonLauncher;

public class GeometryLauncher extends CommonLauncher {

    @Override
    protected void prepareSettings(AppBase.Settings settings) {
        settings.setTitle(std.String.getString("Geometry"));
        settings.setWindowSize(1024, 768);
        settings.setHighDensityDisplayEnabled(true);
        settings.setMultiTouchEnabled(false);
        settings.disableFrameRate();
    }

    @Override
    protected AppBase createApp() {
        System.out.println("Creating app");
        return new Geometry();
    }

    public static void main(String[] args) throws Exception {
        final GeometryLauncher launcher = new GeometryLauncher();
        launcher.launch("MOE", RendererGl.class, RendererGl.create(RendererGl.Options.newOptions().msaa(16)));
    }

}
