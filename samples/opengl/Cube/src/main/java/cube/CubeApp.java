package cube;

import boost.filesystem.Path;
import cinder.*;
import cinder.gl.Batch;
import cinder.gl.GL;
import cinder.gl.GlslProg;
import cinder.gl.Texture2d;
import org.moe.natj.cxx.CxxRuntime;
import glm.Geometric;
import glm.detail.Mat4;
import glm.detail.Vec3;
import glm.gtx.Transform;
import sample.utils.CommonApp;
import sample.utils.CommonLauncher;
import std.SharedPtr;

public class CubeApp extends CommonApp {

    private CameraPersp mCam;
    private SharedPtr<Texture2d> mTexture;
    private SharedPtr<GlslProg> mGlsl;
    private SharedPtr<Batch> mBatch;
    private Mat4 mCubeRotation;

    public CubeApp() {
        Path dirPath = Path.newPath(CommonLauncher.locateResource(null));
        addAssetDirectory(dirPath);
        CxxRuntime.delete(dirPath);
        mCam = CameraPersp.newCameraPersp();
        mCubeRotation = Mat4.newMat4();
    }

    public void draw() {
        GL.clear();
        GL.setMatrices(mCam);
        GL.multModelMatrix(mCubeRotation);
        mBatch.get().draw();
    }

    public void setup() {
        Vec3 eyePoint = Vec3.newVec3(3, 2, 4);
        Vec3 target = Vec3.newVec3(0);
        mCam.lookAt(eyePoint, target);
        CxxRuntime.delete(eyePoint);
        CxxRuntime.delete(target);

        Path path = Path.newPath("texture.jpg");
        Texture2d.Format format = Texture2d.Format.newFormat();
        SharedPtr<DataSource> dataSource = loadAsset(path);
        CxxRuntime.delete(path);
        SharedPtr<ImageSource> imageSource = ImageIo.loadImage(dataSource);
        CxxRuntime.delete(dataSource);
        mTexture = Texture2d.create(imageSource, format.mipmap(true));
        CxxRuntime.delete(imageSource);
        CxxRuntime.delete(format);

        mTexture.get().bind();

        Path vertexPath = Path.newPath("shader.vert");
        Path fragmentPath = Path.newPath("shader.frag");
        SharedPtr<DataSource> vertexShader = loadAsset(vertexPath);
        CxxRuntime.delete(vertexPath);
        SharedPtr<DataSource> fragmentShader = loadAsset(fragmentPath);
        CxxRuntime.delete(fragmentPath);
        mGlsl = GlslProg.create(vertexShader, fragmentShader);
        CxxRuntime.delete(vertexShader);
        CxxRuntime.delete(fragmentShader);

        mBatch = Batch.create(cinder.geom.Cube.newCube(), mGlsl);

        GL.enableDepthWrite();
        GL.enableDepthRead();
    }

    public void resize() {
        mCam.setPerspective(60, getWindowAspectRatio(), 1, 1000);
        GL.setMatrices(mCam);
    }

    public void update() {
        Vec3 vec3 = Vec3.newVec3(0, 1, 0);
        Vec3 normalizedVec3 = Geometric.normalize(vec3);
        CxxRuntime.delete(vec3);
        Mat4 mat4 = Transform.rotate(CinderMath.toRadians(0.2f), normalizedVec3);
        CxxRuntime.delete(normalizedVec3);
        mCubeRotation.mulAssign(mat4);
        CxxRuntime.delete(mat4);
    }

}
