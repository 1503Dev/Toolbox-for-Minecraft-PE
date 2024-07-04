package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: v24  reason: default package */
public final class v24 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public v24(mj5 mj5Var, e24 e24Var, uj5 uj5Var, uj5 uj5Var2) {
        zk4 zk4Var = lp5.R;
        this.a = mj5Var;
        this.b = e24Var;
        this.c = uj5Var;
        this.d = uj5Var2;
        this.e = zk4Var;
    }

    @Override // defpackage.uj5
    /* renamed from: a */
    public final u24 c() {
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        return new u24((d93) this.a.c(), ((e24) this.b).c(), (pd3) this.c.c(), (ScheduledExecutorService) this.d.c(), yw2Var);
    }
}