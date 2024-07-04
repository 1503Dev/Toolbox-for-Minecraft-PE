package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: ip3  reason: default package */
public final class ip3 implements Callable {
    public final uj1 a;
    public final Context b;
    public final zr3 c;
    public final wl4 d;
    public final r04 e;
    public final Executor f;
    public final rz1 g;
    public final xv2 h;
    public final gn4 i;

    public ip3(Context context, Executor executor, rz1 rz1Var, xv2 xv2Var, uj1 uj1Var, k13 k13Var, r04 r04Var, gn4 gn4Var, zr3 zr3Var, wl4 wl4Var) {
        this.b = context;
        this.f = executor;
        this.g = rz1Var;
        this.h = xv2Var;
        this.a = uj1Var;
        this.e = r04Var;
        this.i = gn4Var;
        this.c = zr3Var;
        this.d = wl4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        kp3 kp3Var = new kp3(this);
        synchronized (kp3Var) {
            final Context context = kp3Var.c;
            final xv2 xv2Var = kp3Var.h;
            final String str = (String) w82.d.c.a(x92.Z2);
            final rz1 rz1Var = kp3Var.g;
            final uj1 uj1Var = kp3Var.b;
            by4 E = zw4.E(zw4.D(new jy4() { // from class: i13
                @Override // defpackage.jy4
                public final dz4 a() {
                    Context context2 = context;
                    rz1 rz1Var2 = rz1Var;
                    xv2 xv2Var2 = xv2Var;
                    uj1 uj1Var2 = uj1Var;
                    String str2 = str;
                    k13 k13Var = jv5.A.d;
                    l13 a = k13.a(context2, new k23(0, 0, 0), "", false, false, rz1Var2, null, xv2Var2, null, uj1Var2, new j52(), null, null);
                    ax2 ax2Var = new ax2(a);
                    a.R().V = new fk(4, ax2Var);
                    a.P.loadUrl(str2);
                    return ax2Var;
                }
            }, zw2.e), new og4(2, kp3Var), kp3Var.f);
            kp3Var.l = E;
            tv2.x(E, "NativeJavascriptExecutor.initializeEngine");
        }
        return kp3Var;
    }
}