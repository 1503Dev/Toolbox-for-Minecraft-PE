package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Collections;

/* renamed from: yb1  reason: default package */
public final class yb1 extends ContentObserver {
    public final Context a;
    public final AudioManager b;
    public final da2 c;
    public final kb1 d;
    public float e;

    public yb1(Handler handler, Context context, da2 da2Var, jc1 jc1Var) {
        super(handler);
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.c = da2Var;
        this.d = jc1Var;
    }

    public final float a() {
        int streamVolume = this.b.getStreamVolume(3);
        int streamMaxVolume = this.b.getStreamMaxVolume(3);
        this.c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / streamMaxVolume;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public final void b() {
        kb1 kb1Var = this.d;
        float f = this.e;
        jc1 jc1Var = (jc1) kb1Var;
        jc1Var.a = f;
        if (jc1Var.e == null) {
            jc1Var.e = aa1.c;
        }
        for (z91 z91Var : Collections.unmodifiableCollection(jc1Var.e.b)) {
            gw.d(z91Var.j.f(), "setDeviceVolume", Float.valueOf(f));
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        boolean z2;
        super.onChange(z);
        float a = a();
        if (a != this.e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.e = a;
            b();
        }
    }
}