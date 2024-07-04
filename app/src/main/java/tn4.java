package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Collections;

/* renamed from: tn4  reason: default package */
public final class tn4 extends ContentObserver {
    public final Context a;
    public final AudioManager b;
    public float c;
    public final co4 d;

    public tn4(Handler handler, Context context, co4 co4Var) {
        super(handler);
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.d = co4Var;
    }

    public final float a() {
        int streamVolume = this.b.getStreamVolume(3);
        int streamMaxVolume = this.b.getStreamMaxVolume(3);
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
        co4 co4Var = this.d;
        float f = this.c;
        co4Var.a = f;
        if (co4Var.c == null) {
            co4Var.c = un4.c;
        }
        for (nn4 nn4Var : Collections.unmodifiableCollection(co4Var.c.b)) {
            yn4.a(nn4Var.d.a(), "setDeviceVolume", Float.valueOf(f));
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float a = a();
        if (a != this.c) {
            this.c = a;
            b();
        }
    }
}