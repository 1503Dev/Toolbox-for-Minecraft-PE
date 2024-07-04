package defpackage;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ConcurrentSkipListMap;
import javax.annotation.CheckForNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.json.JSONObject;

/* renamed from: gv4 */
public final class gv4 implements ta0, wj2, wg3, i65 {
    public static Constructor P;
    public static Method Q;
    public static Method R;
    public static Constructor S;
    public static final /* synthetic */ gv4 T = new gv4();
    public static final i33 U = new i33(1);
    public static final j93 V = new j93(0);
    public static final /* synthetic */ gv4 W = new gv4();
    public static final o53 X = new o53(1);
    public static final j33 Y = new j33(2);
    public static final /* synthetic */ gv4 Z = new gv4();

    public static int c(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static yt2 f(p16 p16Var, boolean z) {
        yt2 h = new wk1(0).h(p16Var, z ? null : v32.S);
        if (h == null || h.P.length == 0) {
            return null;
        }
        return h;
    }

    public static /* synthetic */ boolean g(Object obj, String str) {
        return obj == str || (obj != null && obj.equals(str));
    }

    public static int h(@CheckForNull Object obj) {
        return c(obj == null ? 0 : obj.hashCode());
    }

    public static sk1 i(kh4 kh4Var) {
        kh4Var.f(1);
        int o = kh4Var.o();
        long j = kh4Var.b;
        long j2 = o;
        int i = o / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long t = kh4Var.t();
            if (t == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = t;
            jArr2[i2] = kh4Var.t();
            kh4Var.f(2);
            i2++;
        }
        kh4Var.f((int) ((j + j2) - kh4Var.b));
        return new sk1(0, jArr, jArr2);
    }

    @EnsuresNonNull({"ScaleAndRotateEffectBuilder", "SetRotationMethod", "SetRotationMethod", "VideoFrameProcessorFactoryClass"})
    public static void j() {
        if (P == null || Q == null || R == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            P = cls.getConstructor(new Class[0]);
            Q = cls.getMethod("setRotationDegrees", Float.TYPE);
            R = cls.getMethod("build", new Class[0]);
        }
        if (S == null) {
            S = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory").getConstructor(new Class[0]);
        }
    }

    @Override // defpackage.i65
    public Object a(ja jaVar) {
        return new dz1((a75) jaVar);
    }

    @Override // defpackage.wj2
    public Object b(JSONObject jSONObject) {
        Charset charset = yj2.a;
        return new ByteArrayInputStream(jSONObject.toString().getBytes(yj2.a));
    }

    @Override // defpackage.ta0
    public Object d() {
        return new ConcurrentSkipListMap();
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((vj1) obj).J();
    }
}