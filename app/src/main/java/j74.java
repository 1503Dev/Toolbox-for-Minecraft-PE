package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: j74  reason: default package */
public final class j74 implements f74 {
    public final ki4 a;
    public final q23 b;
    public final Context c;
    public final d74 d;
    public final rm4 e;
    public oa3 f;

    public j74(q23 q23Var, Context context, d74 d74Var, ki4 ki4Var) {
        this.b = q23Var;
        this.c = context;
        this.d = d74Var;
        this.a = ki4Var;
        this.e = q23Var.q();
        ki4Var.q = d74Var.b;
    }

    @Override // defpackage.f74
    public final boolean a() {
        oa3 oa3Var = this.f;
        return oa3Var != null && oa3Var.d;
    }

    @Override // defpackage.f74
    public final boolean b(pn5 pn5Var, String str, xa2 xa2Var, e74 e74Var) {
        gf2 gf2Var;
        qm4 qm4Var;
        Executor a;
        Runnable vz2Var;
        cu5 cu5Var = jv5.A.c;
        if (cu5.b(this.c) && pn5Var.h0 == null) {
            sv2.d("Failed to load the ad because app ID is missing.");
            a = this.b.a();
            vz2Var = new zw1(2, this);
        } else if (str == null) {
            sv2.d("Ad unit ID should not be null for NativeAdLoader.");
            a = this.b.a();
            vz2Var = new vz2(2, this);
        } else {
            lj4.a(this.c, pn5Var.U);
            if (((Boolean) w82.d.c.a(x92.x7)).booleanValue() && pn5Var.U) {
                this.b.j().e(true);
            }
            int i = ((g74) xa2Var).P;
            ki4 ki4Var = this.a;
            ki4Var.a = pn5Var;
            ki4Var.m = i;
            li4 a2 = ki4Var.a();
            hm4 v = eb1.v(this.c, pm4.b(a2), 8, pn5Var);
            px2 px2Var = a2.n;
            if (px2Var != null) {
                this.d.b.a(px2Var);
            }
            m33 h = this.b.h();
            xc3 xc3Var = new xc3();
            xc3Var.a = this.c;
            xc3Var.b = a2;
            h.e = new yc3(xc3Var);
            yg3 yg3Var = new yg3();
            yg3Var.c(this.d.b, this.b.a());
            h.d = new zg3(yg3Var);
            d74 d74Var = this.d;
            wl3 wl3Var = d74Var.a;
            t64 t64Var = d74Var.b;
            synchronized (t64Var) {
                gf2Var = (gf2) t64Var.P.get();
            }
            h.f = new jk3(wl3Var, gf2Var);
            h.g = new e83(0, null);
            n33 f = h.f();
            if (((Boolean) fb2.c.d()).booleanValue()) {
                qm4 qm4Var2 = (qm4) f.e.c();
                qm4Var2.i(8);
                qm4Var2.c(pn5Var.e0);
                qm4Var = qm4Var2;
            } else {
                qm4Var = null;
            }
            this.b.o().b(1);
            yw2 yw2Var = zw2.a;
            tv2.C(yw2Var);
            ScheduledExecutorService b = this.b.b();
            hb3 a3 = f.a();
            el4 b2 = a3.b(a3.c());
            oa3 oa3Var = new oa3(yw2Var, b, b2);
            this.f = oa3Var;
            zw4.J(b2, new na3(oa3Var, new i74(this, (fb3) e74Var, qm4Var, v, f)), yw2Var);
            return true;
        }
        a.execute(vz2Var);
        return false;
    }
}