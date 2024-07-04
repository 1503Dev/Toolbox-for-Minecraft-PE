package defpackage;

import java.util.concurrent.Executor;

/* renamed from: kn3  reason: default package */
public final class kn3 implements lj5 {
    public final uj5 a;
    public final uj5 b;

    public kn3(wp3 wp3Var, uj5 uj5Var) {
        this.a = wp3Var;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        return new ii3(new vp3(((yl3) ((wp3) this.a).a).a()), (Executor) this.b.c());
    }
}