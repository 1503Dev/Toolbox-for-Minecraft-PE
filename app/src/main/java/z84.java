package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: z84  reason: default package */
public final class z84 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;

    public z84(t23 t23Var, uj5 uj5Var, uj5 uj5Var2) {
        this.a = t23Var;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        return new x84(((t23) this.a).a(), (yu2) this.b.c(), (ScheduledExecutorService) this.c.c(), yw2Var);
    }
}