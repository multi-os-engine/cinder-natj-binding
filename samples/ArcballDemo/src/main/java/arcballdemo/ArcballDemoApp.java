package arcballdemo;

import boost.filesystem.Path;
import cinder.*;
import cinder.app.MouseEvent;
import cinder.gl.Batch;
import cinder.gl.GL;
import cinder.gl.ShaderDef;
import cinder.gl.Texture2d;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.CxxByValue;
import glm.detail.Vec3;
import sample.utils.CommonApp;
import sample.utils.CommonLauncher;
import std.SharedPtr;

public class ArcballDemoApp extends CommonApp {

    public static final String EARTH_IMAGE = CommonLauncher.locateResource("earth.jpg");

    public Arcball mArcball;
    public CameraPersp mCamera;
    public Sphere mEarthSphere;
    public SharedPtr<Batch> mEarth;
    public SharedPtr<Texture2d> mEarthTex;

    public ArcballDemoApp() {
        mCamera = CameraPersp.newCameraPersp();
    }

    public void setup() {
        GL.enableDepthRead();
        GL.enableDepthWrite();

        mCamera.setPerspective(45.0f, getWindowAspectRatio(), 0.1f, 1000.0f);

        Vec3 eyePoint = Vec3.newVec3(0, 0, 3);
        Vec3 target = Vec3.newVec3(0);
        mCamera.lookAt(eyePoint, target);
        CxxRuntime.delete(eyePoint);
        CxxRuntime.delete(target);

        Vec3 center = Vec3.newVec3(0);
        mEarthSphere = Sphere.newSphere(center, 1);
        CxxRuntime.delete(center);
        ShaderDef shaderDef = ShaderDef.newShaderDef();
        mEarth = Batch.create(cinder.geom.Sphere.newSphere(mEarthSphere).subdivisions(50), GL.getStockShader(shaderDef.texture()));
        CxxRuntime.delete(shaderDef);
        Path path = Path.newPath(EARTH_IMAGE);
        SharedPtr<DataSourcePath> dataSource = DataSourcePath.create(path);
        CxxRuntime.delete(path);
        SharedPtr<ImageSource> imageSource = ImageIo.loadImageWithDataSourcePath(dataSource);
        CxxRuntime.delete(dataSource);
        mEarthTex = Texture2d.create(imageSource);
        CxxRuntime.delete(imageSource);

        mArcball = Arcball.newArcball(mCamera, mEarthSphere);
    }

    public void draw() {
        ColorF clearColor = ColorF.newColor(0.0f, 0.0f, 0.15f);
        GL.clear(clearColor);
        CxxRuntime.delete(clearColor);

        GL.setMatrices(mCamera);
        GL.rotate(mArcball.getQuat());
        mEarthTex.get().bind();
        mEarth.get().draw();
    }

    public void mouseDown(@CxxByValue MouseEvent event) {
        mArcball.mouseDown(event);
    }

    public void mouseDrag(@CxxByValue MouseEvent event) {
        mArcball.mouseDrag(event);
    }

    public void resize() {
        mCamera.setAspectRatio(getWindowAspectRatio());
    }

}
