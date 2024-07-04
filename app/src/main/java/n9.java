package defpackage;

import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Constructor;

/* renamed from: n9  reason: default package */
public final class n9 implements dx2, wg3, hk1 {
    public static final int[] P = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] Q = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] R = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final /* synthetic */ n9 S = new n9();
    public static final /* synthetic */ n9 T = new n9();
    public static final j93 U = new j93(2);
    public static final /* synthetic */ n9 V = new n9();

    public /* synthetic */ n9() {
    }

    @Override // defpackage.hk1
    public Constructor a() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(lk1.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    @Override // defpackage.dx2, defpackage.e74
    /* renamed from: a */
    public void mo1a() {
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((zg2) obj).d();
    }

    public /* synthetic */ n9(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.c = 0;
    }
}