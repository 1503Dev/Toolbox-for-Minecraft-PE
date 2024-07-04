package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: rd4  reason: default package */
public final class rd4 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;

    public rd4(me4 me4Var, uj5 uj5Var, uj5 uj5Var2) {
        this.a = me4Var;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        tv2.C(((me4) this.a).a.a.S);
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        return new od4((yu2) this.b.c(), (ScheduledExecutorService) this.c.c(), yw2Var);
    }
}