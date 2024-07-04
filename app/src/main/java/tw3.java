package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: tw3  reason: default package */
public final class tw3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public tw3(kx3 kx3Var, jy3 jy3Var) {
        v22 v22Var = gw.Z;
        zk4 zk4Var = lp5.R;
        this.a = v22Var;
        this.b = zk4Var;
        this.c = kx3Var;
        this.d = jy3Var;
    }

    @Override // defpackage.uj5
    /* renamed from: a */
    public final sw3 c() {
        yw2 yw2Var = zw2.b;
        tv2.C(yw2Var);
        yw2 yw2Var2 = zw2.a;
        tv2.C(yw2Var2);
        kx3 kx3Var = (kx3) this.c;
        return new sw3(yw2Var, yw2Var2, new jx3(((t23) kx3Var.a).a(), (ScheduledExecutorService) kx3Var.b.c()), kj5.a(this.d));
    }
}