package defpackage;

import android.content.Context;
import android.media.AudioFormat$Builder;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: hy5  reason: default package */
public final class hy5 {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public gy5 d;

    public hy5(Spatializer spatializer) {
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static hy5 a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new hy5(audioManager.getSpatializer());
    }

    public final void b(oy5 oy5Var, Looper looper) {
        if (this.d == null && this.c == null) {
            this.d = new gy5(oy5Var);
            final Handler handler = new Handler(looper);
            this.c = handler;
            this.a.addOnSpatializerStateChangedListener(new Executor() { // from class: fy5
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.d);
        }
    }

    public final void c() {
        gy5 gy5Var = this.d;
        if (gy5Var == null || this.c == null) {
            return;
        }
        this.a.removeOnSpatializerStateChangedListener(gy5Var);
        Handler handler = this.c;
        int i = zn4.a;
        handler.removeCallbacksAndMessages(null);
        this.c = null;
        this.d = null;
    }

    public final boolean d(pm5 pm5Var, cu1 cu1Var) {
        AudioFormat$Builder channelMask = new AudioFormat$Builder().setEncoding(2).setChannelMask(zn4.j(("audio/eac3-joc".equals(cu1Var.k) && cu1Var.x == 16) ? 12 : cu1Var.x));
        int i = cu1Var.y;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        return this.a.canBeSpatialized(pm5Var.a().a, channelMask.build());
    }

    public final boolean e() {
        return this.a.isAvailable();
    }

    public final boolean f() {
        return this.a.isEnabled();
    }
}