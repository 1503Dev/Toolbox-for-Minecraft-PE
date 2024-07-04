package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import defpackage.zv;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: ny  reason: default package */
public class ny {
    public EGLSurface a;
    public long b;
    public long c;

    public ny(long j, int i, int i2, float f, zv.b[] bVarArr, int i3) {
        this.b = h(j, i, i2, f, iy0.L(bVarArr), i3);
    }

    public ny(SurfaceTexture surfaceTexture, int i, int i2, float f, zv zvVar, final zv.b[] bVarArr, int i3) {
        if (surfaceTexture == null) {
            this.b = h(0L, i, i2, f, new long[0], i3);
            ((iy0) zvVar).I0(new Runnable() { // from class: ly
                @Override // java.lang.Runnable
                public final void run() {
                    ny.this.g(bVarArr);
                }
            });
            return;
        }
        try {
            this.c = i(new Surface(surfaceTexture));
        } catch (UnsatisfiedLinkError unused) {
        }
        long j = this.c;
        if (j != 0) {
            this.b = h(m(j), i, i2, f, iy0.L(bVarArr), i3);
            return;
        }
        try {
            if (!ik0.a) {
                ik0.a = true;
                if (Build.VERSION.SDK_INT >= 28) {
                    try {
                        Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                        Class cls = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
                        ((Method) declaredMethod.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(((Method) declaredMethod.invoke(cls, "getRuntime", null)).invoke(null, new Object[0]), new String[]{"L"});
                    } catch (Throwable unused2) {
                    }
                }
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                Constructor<?> declaredConstructor = Class.forName("com.google.android.gles_jni.EGLConfigImpl").getDeclaredConstructor(Long.TYPE);
                declaredConstructor.setAccessible(true);
                EGLSurface eglCreateWindowSurface = egl10.eglCreateWindowSurface(eglGetDisplay, (EGLConfig) declaredConstructor.newInstance(Long.valueOf(l())), surfaceTexture, null);
                this.a = eglCreateWindowSurface;
                Field declaredField = eglCreateWindowSurface.getClass().getDeclaredField("mEGLSurface");
                declaredField.setAccessible(true);
                this.b = h(declaredField.getLong(this.a), i, i2, f, iy0.L(bVarArr), i3);
            }
            EGL10 egl102 = (EGL10) EGLContext.getEGL();
            EGLDisplay eglGetDisplay2 = egl102.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            Constructor<?> declaredConstructor2 = Class.forName("com.google.android.gles_jni.EGLConfigImpl").getDeclaredConstructor(Long.TYPE);
            declaredConstructor2.setAccessible(true);
            EGLSurface eglCreateWindowSurface2 = egl102.eglCreateWindowSurface(eglGetDisplay2, (EGLConfig) declaredConstructor2.newInstance(Long.valueOf(l())), surfaceTexture, null);
            this.a = eglCreateWindowSurface2;
            Field declaredField2 = eglCreateWindowSurface2.getClass().getDeclaredField("mEGLSurface");
            declaredField2.setAccessible(true);
            this.b = h(declaredField2.getLong(this.a), i, i2, f, iy0.L(bVarArr), i3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Runnable runnable) {
        long j = this.c;
        if (j != 0) {
            k(j);
        }
        if (this.a != null) {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            egl10.eglDestroySurface(egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY), this.a);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    private static native long h(long j, int i, int i2, float f, long[] jArr, int i3);

    private static native long i(Object obj);

    private static native void j(long j, Runnable runnable);

    private static native void k(long j);

    private static native long l();

    private static native long m(long j);

    private static native int n(long j, int i, int i2);

    private static native float o(long j);

    private static native void p(long j, long[] jArr);

    private static native void q(long j, int i, int i2);

    private static native void r(long j, int i);

    private static native void s(long j, int i, int i2);

    public void c(Runnable runnable) {
        long j = this.b;
        if (j != 0) {
            j(j, new my(0, this, runnable));
        }
        this.b = 0L;
    }

    public int d(int i, int i2) {
        return n(this.b, i, i2);
    }

    public float e() {
        return o(this.b);
    }

    /* renamed from: t */
    public void g(zv.b[] bVarArr) {
        p(this.b, iy0.L(bVarArr));
    }

    public void u(int i, int i2) {
        try {
            q(this.b, i, i2);
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public void v(int i) {
        r(this.b, i);
    }

    public void w(int i, int i2) {
        s(this.b, i, i2);
    }
}