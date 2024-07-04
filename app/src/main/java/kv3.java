package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: kv3  reason: default package */
public final class kv3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public kv3(uj5 uj5Var, yv3 yv3Var, dy3 dy3Var) {
        zk4 zk4Var = lp5.R;
        v22 v22Var = gw.Z;
        this.a = uj5Var;
        this.b = zk4Var;
        this.c = v22Var;
        this.d = yv3Var;
        this.e = dy3Var;
    }

    @Override // defpackage.uj5
    /* renamed from: a */
    public final jv3 c() {
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        yw2 yw2Var2 = zw2.b;
        tv2.C(yw2Var2);
        return new jv3((ScheduledExecutorService) this.a.c(), yw2Var, yw2Var2, new xv3(((t23) ((yv3) this.d).a).a()), kj5.a(this.e));
    }
}