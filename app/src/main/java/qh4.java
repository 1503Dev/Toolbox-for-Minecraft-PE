package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: qh4  reason: default package */
public final class qh4 implements f74 {
    public final Context a;
    public final Executor b;
    public final q23 c;
    public final mh4 d;
    public final vg4 e;
    public final ii4 f;
    public final rm4 g;
    public final ki4 h;
    public dz4 i;

    public qh4(Context context, Executor executor, q23 q23Var, vg4 vg4Var, mh4 mh4Var, ki4 ki4Var, ii4 ii4Var) {
        this.a = context;
        this.b = executor;
        this.c = q23Var;
        this.e = vg4Var;
        this.d = mh4Var;
        this.h = ki4Var;
        this.f = ii4Var;
        this.g = q23Var.q();
    }

    @Override // defpackage.f74
    public final boolean a() {
        throw null;
    }

    @Override // defpackage.f74
    public final boolean b(pn5 pn5Var, String str, xa2 xa2Var, e74 e74Var) {
        qm4 qm4Var;
        hr2 hr2Var = new hr2(pn5Var, str);
        if (hr2Var.Q == null) {
            sv2.d("Ad unit ID should not be null for rewarded video ad.");
            this.b.execute(new qz3(5, this));
            return false;
        }
        dz4 dz4Var = this.i;
        if (dz4Var != null && !dz4Var.isDone()) {
            return false;
        }
        if (((Boolean) fb2.c.d()).booleanValue()) {
            vg4 vg4Var = this.e;
            if (vg4Var.i() != null) {
                qm4 f = ((x43) ((bq3) vg4Var.i())).f();
                f.i(5);
                f.c(hr2Var.P.e0);
                qm4Var = f;
                lj4.a(this.a, hr2Var.P.U);
                if (((Boolean) w82.d.c.a(x92.x7)).booleanValue() && hr2Var.P.U) {
                    this.c.j().e(true);
                }
                ki4 ki4Var = this.h;
                ki4Var.c = hr2Var.Q;
                ki4Var.b = new zr5("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
                ki4Var.a = hr2Var.P;
                li4 a = ki4Var.a();
                hm4 v = eb1.v(this.a, pm4.b(a), 5, hr2Var.P);
                ph4 ph4Var = new ph4(0);
                ph4Var.a = a;
                dz4 a2 = this.e.a(new wg4(ph4Var, null), new z63(4, this));
                this.i = a2;
                zw4.J(a2, new oh4(this, e74Var, qm4Var, v, ph4Var), this.b);
                return true;
            }
        }
        qm4Var = null;
        lj4.a(this.a, hr2Var.P.U);
        if (((Boolean) w82.d.c.a(x92.x7)).booleanValue()) {
            this.c.j().e(true);
        }
        ki4 ki4Var2 = this.h;
        ki4Var2.c = hr2Var.Q;
        ki4Var2.b = new zr5("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
        ki4Var2.a = hr2Var.P;
        li4 a3 = ki4Var2.a();
        hm4 v2 = eb1.v(this.a, pm4.b(a3), 5, hr2Var.P);
        ph4 ph4Var2 = new ph4(0);
        ph4Var2.a = a3;
        dz4 a22 = this.e.a(new wg4(ph4Var2, null), new z63(4, this));
        this.i = a22;
        zw4.J(a22, new oh4(this, e74Var, qm4Var, v2, ph4Var2), this.b);
        return true;
    }

    public final rh c(tg4 tg4Var) {
        rh i = this.c.i();
        xc3 xc3Var = new xc3();
        xc3Var.a = this.a;
        xc3Var.b = ((ph4) tg4Var).a;
        xc3Var.d = this.f;
        i.e = xc3Var.a();
        i.d = new yg3().e();
        return i;
    }
}