package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: cx3  reason: default package */
public final class cx3 implements lj5 {
    public final uj5 a = lp5.R;
    public final uj5 b;
    public final uj5 c;

    public cx3(yw3 yw3Var, uj5 uj5Var) {
        this.b = yw3Var;
        this.c = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        yw3 yw3Var = (yw3) this.b;
        yw3Var.getClass();
        yw2 yw2Var2 = zw2.b;
        tv2.C(yw2Var2);
        mx3 mx3Var = (mx3) yw3Var.c;
        return new bx3(yw2Var, new xw3(yw2Var2, yw2Var, new lx3(((t23) mx3Var.a).a(), (ScheduledExecutorService) mx3Var.b.c())), (ol4) this.c.c());
    }
}