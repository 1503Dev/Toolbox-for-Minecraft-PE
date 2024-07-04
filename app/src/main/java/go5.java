package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: go5  reason: default package */
public final class go5 {
    public final Context a;
    public final Handler b;
    public final eo5 c;
    public final AudioManager d;
    public fo5 e;
    public int f;
    public int g;
    public boolean h;

    public go5(Context context, Handler handler, xl5 xl5Var) {
        boolean z;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = xl5Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        tv2.B(audioManager);
        this.d = audioManager;
        this.f = 3;
        this.g = b(audioManager, 3);
        int i = this.f;
        if (zn4.a >= 23) {
            z = audioManager.isStreamMute(i);
        } else if (b(audioManager, i) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        fo5 fo5Var = new fo5(this);
        try {
            applicationContext.registerReceiver(fo5Var, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = fo5Var;
        } catch (RuntimeException e) {
            lb4.d("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public static int b(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            lb4.d("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final void a() {
        if (this.f == 3) {
            return;
        }
        this.f = 3;
        c();
        xl5 xl5Var = (xl5) this.c;
        cz5 u = bm5.u(xl5Var.P.w);
        if (!u.equals(xl5Var.P.Q)) {
            bm5 bm5Var = xl5Var.P;
            bm5Var.Q = u;
            i94 i94Var = bm5Var.k;
            i94Var.b(29, new gb3(4, u));
            i94Var.a();
        }
    }

    public final void c() {
        final boolean z;
        final int b = b(this.d, this.f);
        AudioManager audioManager = this.d;
        int i = this.f;
        if (zn4.a >= 23) {
            z = audioManager.isStreamMute(i);
        } else if (b(audioManager, i) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.g == b && this.h == z) {
            return;
        }
        this.g = b;
        this.h = z;
        i94 i94Var = ((xl5) this.c).P.k;
        i94Var.b(30, new v64() { // from class: wl5
            @Override // defpackage.v64
            /* renamed from: e */
            public final void mo5e(Object obj) {
                ((b53) obj).n(b, z);
            }
        });
        i94Var.a();
    }
}