package defpackage;

import android.app.Activity;
import android.content.Context;

/* renamed from: c83  reason: default package */
public final class c83 extends ea3 {
    public final y03 i;
    public final int j;
    public final Context k;
    public final vc2 l;
    public final wj3 m;
    public final xh3 n;
    public final wd3 o;
    public final boolean p;
    public boolean q;

    public c83(ba3 ba3Var, Context context, y03 y03Var, int i, vc2 vc2Var, wj3 wj3Var, xh3 xh3Var, wd3 wd3Var) {
        super(ba3Var);
        this.q = false;
        this.i = y03Var;
        this.k = context;
        this.j = i;
        this.l = vc2Var;
        this.m = wj3Var;
        this.n = xh3Var;
        this.o = wd3Var;
        this.p = ((Boolean) w82.d.c.a(x92.q4)).booleanValue();
    }

    public final void b() {
        ee3 ee3Var = this.c;
        ee3Var.getClass();
        ee3Var.R0(new cz1(1, null));
        y03 y03Var = this.i;
        if (y03Var != null) {
            y03Var.destroy();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r4 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Activity activity, boolean z) {
        Activity activity2;
        if (activity == null) {
            activity2 = this.k;
        }
        if (this.p) {
            this.n.R0(ar.S);
        }
        l92 l92Var = x92.r0;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            jv5 jv5Var = jv5.A;
            cu5 cu5Var = jv5Var.c;
            if (cu5.a(activity2)) {
                sv2.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.o.c();
                if (((Boolean) w82Var.c.a(x92.s0)).booleanValue()) {
                    new ip4(activity2.getApplicationContext(), jv5Var.r.a()).a(((ci4) this.a.b.Q).b);
                    return;
                }
                return;
            }
        }
        if (this.q) {
            sv2.g("App open interstitial ad is already visible.");
            this.o.p(oj4.d(10, null, null));
        }
        if (!this.q) {
            try {
                this.m.c(z, activity2, this.o);
                if (this.p) {
                    this.n.R0(wh3.P);
                }
                this.q = true;
            } catch (vj3 e) {
                this.o.H0(e);
            }
        }
    }

    public final void d(long j, int i) {
        vc2 vc2Var = this.l;
        vc2Var.getClass();
        if (((Boolean) w82.d.c.a(x92.k7)).booleanValue()) {
            vl4 b = vl4.b("ad_closed");
            b.e((ci4) ((hi4) vc2Var.c).b.Q);
            b.a("show_time", String.valueOf(j));
            b.a("ad_format", "app_open_ad");
            b.a("acr", vc2.a(i));
            ((wl4) vc2Var.a).a(b);
            return;
        }
        yr3 a = ((zr3) vc2Var.b).a();
        a.a.put("gqi", ((ci4) ((hi4) vc2Var.c).b.Q).b);
        a.a("action", "ad_closed");
        a.a("show_time", String.valueOf(j));
        a.a("ad_format", "app_open_ad");
        a.a("acr", vc2.a(i));
        a.c();
    }
}