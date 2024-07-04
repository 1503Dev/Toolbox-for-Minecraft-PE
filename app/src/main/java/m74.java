package defpackage;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: m74  reason: default package */
public final /* synthetic */ class m74 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m74(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ey1 ey1Var;
        int i;
        boolean z;
        switch (this.a) {
            case 0:
                n74 n74Var = (n74) this.b;
                return new r74(n74Var.c, n74Var.d.e, n74Var.b());
            case 1:
                AudioManager audioManager = (AudioManager) ((d94) this.b).b.getSystemService("audio");
                int mode = audioManager.getMode();
                boolean isMusicActive = audioManager.isMusicActive();
                boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
                int streamVolume = audioManager.getStreamVolume(3);
                int i2 = -1;
                if (((Boolean) w82.d.c.a(x92.A8)).booleanValue()) {
                    i = jv5.A.e.i(audioManager);
                    i2 = audioManager.getStreamMaxVolume(3);
                } else {
                    i = -1;
                }
                int ringerMode = audioManager.getRingerMode();
                int streamVolume2 = audioManager.getStreamVolume(2);
                jv5 jv5Var = jv5.A;
                float a = jv5Var.h.a();
                xk1 xk1Var = jv5Var.h;
                synchronized (xk1Var) {
                    z = xk1Var.a;
                }
                return new e94(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, ringerMode, streamVolume2, a, z);
            default:
                Context context = ((op4) this.b).a;
                try {
                    ey1Var = (ey1) new gp4(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode)).d.poll(5000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    ey1Var = null;
                }
                if (ey1Var == null) {
                    return gp4.a();
                }
                return ey1Var;
        }
    }
}