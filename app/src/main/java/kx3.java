package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: kx3  reason: default package */
public final class kx3 implements lj5 {
    public final uj5 a;
    public final uj5 b;

    public kx3(t23 t23Var, uj5 uj5Var) {
        this.a = t23Var;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        return new jx3(((t23) this.a).a(), (ScheduledExecutorService) this.b.c());
    }
}