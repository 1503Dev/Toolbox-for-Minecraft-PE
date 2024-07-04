package defpackage;

import android.content.Context;

/* renamed from: xg4  reason: default package */
public final class xg4 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;

    public xg4(mj5 mj5Var, uj5 uj5Var, uj5 uj5Var2) {
        this.a = mj5Var;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    /* renamed from: a */
    public final vg4 c() {
        su2 su2Var;
        Context context = (Context) this.a.c();
        tj4 tj4Var = (tj4) this.b.c();
        ik4 ik4Var = (ik4) this.c.c();
        l92 l92Var = x92.n5;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            su2Var = jv5.A.g.b().f();
        } else {
            nl5 b = jv5.A.g.b();
            synchronized (b.a) {
                su2Var = b.p;
            }
        }
        boolean z = false;
        if (su2Var != null && su2Var.j) {
            z = true;
        }
        if (((Integer) w82Var.c.a(x92.D5)).intValue() > 0) {
            if (!((Boolean) w82Var.c.a(x92.m5)).booleanValue() || z) {
                hk4 a = ik4Var.a(ak4.AppOpen, context, tj4Var, new jz1(5, new wf4()));
                mg4 mg4Var = new mg4(new lg4());
                wj4 wj4Var = a.a;
                yw2 yw2Var = zw2.a;
                return new ag4(mg4Var, new jg4(wj4Var, yw2Var), a.b, ((xj4) a.a).b.V, yw2Var);
            }
        }
        return new lg4();
    }
}