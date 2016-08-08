package delayfeedback;

import cinder.app.AppBase;
import cinder.app.RendererGl;
import sample.utils.CommonLauncher;

public class DelayFeedbackLauncher extends CommonLauncher {

    @Override
    protected void prepareSettings(AppBase.Settings settings) {
        settings.setTitle(std.String.getString("DelayFeedback"));
        settings.setWindowPos(200, 200);
        settings.setWindowSize(1000, 800);
    }

    @Override
    protected AppBase createApp() {
        System.out.println("Creating app");
        return new DelayFeedbackApp();
    }

    public static void main(String[] args) throws Exception {
        final DelayFeedbackLauncher launcher = new DelayFeedbackLauncher();
        launcher.launch("MOE", RendererGl.class, RendererGl.create());
    }

}
