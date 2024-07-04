package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: lk5  reason: default package */
public final class lk5 {
    public final AudioManager a;
    public final jk5 b;
    public kk5 c;
    public int d;
    public float e = 1.0f;

    public lk5(Context context, Handler handler, xl5 xl5Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.a = audioManager;
        this.c = xl5Var;
        this.b = new jk5(this, handler);
        this.d = 0;
    }

    public final void a() {
        if (this.d == 0) {
            return;
        }
        if (zn4.a < 26) {
            this.a.abandonAudioFocus(this.b);
        }
        c(0);
    }

    public final void b(int i) {
        kk5 kk5Var = this.c;
        if (kk5Var != null) {
            xl5 xl5Var = (xl5) kk5Var;
            boolean r = xl5Var.P.r();
            int i2 = 1;
            if (r && i != 1) {
                i2 = 2;
            }
            xl5Var.P.B(i, i2, r);
        }
    }

    public final void c(int i) {
        float f;
        if (this.d == i) {
            return;
        }
        this.d = i;
        if (i == 3) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (this.e == f) {
            return;
        }
        this.e = f;
        kk5 kk5Var = this.c;
        if (kk5Var != null) {
            bm5 bm5Var = ((xl5) kk5Var).P;
            bm5Var.y(1, 2, Float.valueOf(bm5Var.M * bm5Var.v.e));
        }
    }
}