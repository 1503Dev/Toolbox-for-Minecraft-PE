package defpackage;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: yp3  reason: default package */
public final class yp3 extends ea3 {
    public final Context i;
    public final WeakReference j;
    public final wj3 k;
    public final xh3 l;
    public final wd3 m;
    public final pe3 n;
    public final ta3 o;
    public final ns2 p;
    public final ip4 q;
    public final ji4 r;
    public boolean s;

    public yp3(ba3 ba3Var, Context context, y03 y03Var, wj3 wj3Var, xh3 xh3Var, wd3 wd3Var, pe3 pe3Var, ta3 ta3Var, yh4 yh4Var, ip4 ip4Var, ji4 ji4Var) {
        super(ba3Var);
        this.s = false;
        this.i = context;
        this.k = wj3Var;
        this.j = new WeakReference(y03Var);
        this.l = xh3Var;
        this.m = wd3Var;
        this.n = pe3Var;
        this.o = ta3Var;
        this.q = ip4Var;
        qr2 qr2Var = yh4Var.l;
        this.p = new ns2(qr2Var != null ? qr2Var.P : "", qr2Var != null ? qr2Var.Q : 1);
        this.r = ji4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.content.Context] */
    public final void b(Activity activity, boolean z) {
        l92 l92Var = x92.r0;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            cu5 cu5Var = jv5.A.c;
            if (cu5.a(this.i)) {
                sv2.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.m.c();
                if (((Boolean) w82Var.c.a(x92.s0)).booleanValue()) {
                    this.q.a(((ci4) this.a.b.Q).b);
                    return;
                }
                return;
            }
        }
        if (this.s) {
            sv2.g("The rewarded ad have been showed.");
            this.m.p(oj4.d(10, null, null));
            return;
        }
        this.s = true;
        this.l.R0(ar.S);
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.i;
        }
        try {
            this.k.c(z, activity2, this.m);
            this.l.R0(wh3.P);
        } catch (vj3 e) {
            this.m.H0(e);
        }
    }

    public final void finalize() {
        try {
            y03 y03Var = (y03) this.j.get();
            if (((Boolean) w82.d.c.a(x92.H5)).booleanValue()) {
                if (!this.s && y03Var != null) {
                    zw2.e.execute(new fn1(3, y03Var));
                }
            } else if (y03Var != null) {
                y03Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}