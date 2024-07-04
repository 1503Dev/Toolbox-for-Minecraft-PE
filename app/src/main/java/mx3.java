package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: mx3  reason: default package */
public final class mx3 implements lj5 {
    public final uj5 a;
    public final uj5 b;

    public mx3(t23 t23Var, uj5 uj5Var) {
        this.a = t23Var;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        return new lx3(((t23) this.a).a(), (ScheduledExecutorService) this.b.c());
    }
}