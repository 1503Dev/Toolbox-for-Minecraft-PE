package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: g83  reason: default package */
public final class g83 implements lj5 {
    public final uj5 a;
    public final uj5 b;

    public g83(uj5 uj5Var, uj5 uj5Var2) {
        this.a = uj5Var;
        this.b = uj5Var2;
    }

    @Override // defpackage.uj5
    /* renamed from: a */
    public final bf3 c() {
        return new bf3((ScheduledExecutorService) this.a.c(), (kd) this.b.c());
    }
}