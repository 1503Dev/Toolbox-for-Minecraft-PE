package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: yw3  reason: default package */
public final class yw3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;

    public yw3(mx3 mx3Var) {
        v22 v22Var = gw.Z;
        zk4 zk4Var = lp5.R;
        this.a = v22Var;
        this.b = zk4Var;
        this.c = mx3Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        yw2 yw2Var = zw2.b;
        tv2.C(yw2Var);
        yw2 yw2Var2 = zw2.a;
        tv2.C(yw2Var2);
        mx3 mx3Var = (mx3) this.c;
        return new xw3(yw2Var, yw2Var2, new lx3(((t23) mx3Var.a).a(), (ScheduledExecutorService) mx3Var.b.c()));
    }
}