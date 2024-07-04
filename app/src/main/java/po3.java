package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: po3  reason: default package */
public final class po3 {
    public final li4 a;
    public final Executor b;
    public final qq3 c;
    public final tp3 d;
    public final Context e;
    public final zr3 f;
    public final wl4 g;
    public final gn4 h;
    public final r04 i;

    public po3(li4 li4Var, Executor executor, qq3 qq3Var, Context context, zr3 zr3Var, wl4 wl4Var, gn4 gn4Var, r04 r04Var, tp3 tp3Var) {
        this.a = li4Var;
        this.b = executor;
        this.c = qq3Var;
        this.e = context;
        this.f = zr3Var;
        this.g = wl4Var;
        this.h = gn4Var;
        this.i = r04Var;
        this.d = tp3Var;
    }

    public static final void b(l13 l13Var) {
        l13Var.D0("/videoClicked", lg2.d);
        g13 R = l13Var.R();
        synchronized (R.S) {
            R.d0 = true;
        }
        if (((Boolean) w82.d.c.a(x92.b3)).booleanValue()) {
            l13Var.D0("/getNativeAdViewSignals", lg2.n);
        }
        l13Var.D0("/getNativeClickMeta", lg2.o);
    }

    public final void a(l13 l13Var) {
        b(l13Var);
        l13Var.D0("/video", lg2.g);
        l13Var.D0("/videoMeta", lg2.h);
        l13Var.D0("/precache", new pz2());
        l13Var.D0("/delayPageLoaded", lg2.k);
        l13Var.D0("/instrument", lg2.i);
        l13Var.D0("/log", lg2.c);
        l13Var.D0("/click", new kf2(null));
        if (this.a.b != null) {
            g13 R = l13Var.R();
            synchronized (R.S) {
                R.e0 = true;
            }
            l13Var.D0("/open", new vg2(null, null, null, null, null));
        } else {
            g13 R2 = l13Var.R();
            synchronized (R2.S) {
                R2.e0 = false;
            }
        }
        if (jv5.A.w.j(l13Var.getContext())) {
            l13Var.D0("/logScionEvent", new qg2(l13Var.getContext()));
        }
    }
}