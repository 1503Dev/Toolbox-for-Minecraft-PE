package defpackage;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* renamed from: dj3  reason: default package */
public final class dj3 extends ea3 {
    public final Context i;
    public final WeakReference j;
    public final xh3 k;
    public final wj3 l;
    public final ta3 m;
    public final ip4 n;
    public final wd3 o;
    public boolean p;

    public dj3(ba3 ba3Var, Context context, @Nullable y03 y03Var, xh3 xh3Var, wj3 wj3Var, ta3 ta3Var, ip4 ip4Var, wd3 wd3Var) {
        super(ba3Var);
        this.p = false;
        this.i = context;
        this.j = new WeakReference(y03Var);
        this.k = xh3Var;
        this.l = wj3Var;
        this.m = ta3Var;
        this.n = ip4Var;
        this.o = wd3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.content.Context] */
    public final void b(@Nullable Activity activity, boolean z) {
        this.k.R0(ar.S);
        l92 l92Var = x92.r0;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            cu5 cu5Var = jv5.A.c;
            if (cu5.a(this.i)) {
                sv2.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.o.c();
                if (((Boolean) w82Var.c.a(x92.s0)).booleanValue()) {
                    this.n.a(((ci4) this.a.b.Q).b);
                    return;
                }
                return;
            }
        }
        if (this.p) {
            sv2.g("The interstitial ad has been showed.");
            this.o.p(oj4.d(10, null, null));
        }
        Activity activity2 = activity;
        if (!this.p) {
            if (activity == null) {
                activity2 = this.i;
            }
            try {
                this.l.c(z, activity2, this.o);
                this.k.R0(wh3.P);
                this.p = true;
            } catch (vj3 e) {
                this.o.H0(e);
            }
        }
    }

    public final void finalize() {
        try {
            y03 y03Var = (y03) this.j.get();
            if (((Boolean) w82.d.c.a(x92.H5)).booleanValue()) {
                if (!this.p && y03Var != null) {
                    zw2.e.execute(new cx1(5, y03Var));
                }
            } else if (y03Var != null) {
                y03Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}