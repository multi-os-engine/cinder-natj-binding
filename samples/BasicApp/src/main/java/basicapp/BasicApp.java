package basicapp;

import cinder.ColorA;
import cinder.app.KeyEvent;
import cinder.app.MouseEvent;
import cinder.gl.GL;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.CxxByValue;
import glm.detail.Vec2;
import sample.utils.CommonApp;

public class BasicApp extends CommonApp {

    private std.Vector<Vec2> mPoints;

    public BasicApp() {
        mPoints = Vec2.newVec2Vector();
    }

    public void keyDown(@CxxByValue KeyEvent event) {
        if (event.getChar() == 'f') {
            // Toggle full screen when the user presses the 'f' key.
            setFullScreen(!isFullScreen());
        } else if (event.getCode() == KeyEvent.KEY_SPACE) {
            // Clear the list of points when the user presses the space bar.
            mPoints.clear();
        } else if (event.getCode() == KeyEvent.KEY_ESCAPE) {
            // Exit full screen, or quit the application, when the user presses the ESC key.
            if (isFullScreen()) {
                setFullScreen(false);
            } else {
                quit();
            }
        }
    }

    static final ColorA CLEAR_COLOR = ColorA.gray(0.1f);

    public void draw() {
        // Clear the contents of the window. This call will clear
        // both the color and depth buffers.
        GL.clear(CLEAR_COLOR);

        // Set the current draw color to orange by setting values for
        // red, green and blue directly. Values range from 0 to 1.
        // See also: gl::ScopedColor
        GL.color(1.0f, 0.5f, 0.25f);

        // We're going to draw a line through all the points in the list
        // using a few convenience functions: 'begin' will tell OpenGL to
        // start constructing a line strip, 'vertex' will add a point to the
        // line strip and 'end' will execute the draw calls on the GPU.
        int GL_LINE_STRIP = 0x0003;
        GL.begin(GL_LINE_STRIP);
        for (int i = 0; i < mPoints.size(); i++) {
            Vec2 point = mPoints.get(i);
            GL.vertex(point);
        }
        GL.end();
    }

    public void mouseDrag(@CxxByValue MouseEvent event) {
        // Store the current mouse position in the list.
        final Vec2 vec2 = Vec2.newVec2(event.getPos());
        mPoints.push_back(vec2);
        CxxRuntime.delete(vec2);
    }

}
