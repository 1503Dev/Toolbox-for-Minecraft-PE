package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bd4  reason: default package */
public final class bd4 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public bd4(t23 t23Var, uj5 uj5Var, ne4 ne4Var, oe4 oe4Var, qe4 qe4Var) {
        this.a = t23Var;
        this.b = uj5Var;
        this.c = ne4Var;
        this.d = oe4Var;
        this.e = qe4Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        return new zc4(new pu2(), ((t23) this.a).a(), (ScheduledExecutorService) this.b.c(), yw2Var, Integer.valueOf(((ne4) this.c).a.b).intValue(), Boolean.valueOf(((oe4) this.d).a.a.a0).booleanValue(), Boolean.valueOf(((qe4) this.e).a.a.Z).booleanValue());
    }
}