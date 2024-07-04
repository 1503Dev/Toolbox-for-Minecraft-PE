package defpackage;

import java.util.concurrent.Executor;

/* renamed from: rg4  reason: default package */
public final class rg4 {
    public final wj4 a;
    public final wc3 b;
    public final Executor c;
    public qg4 d;

    public rg4(wj4 wj4Var, wc3 wc3Var, Executor executor) {
        this.a = wj4Var;
        this.b = wc3Var;
        this.c = executor;
    }

    @Deprecated
    public final fk4 a() {
        li4 h = this.b.h();
        pn5 pn5Var = h.d;
        String str = h.f;
        by5 by5Var = h.j;
        xj4 xj4Var = (xj4) this.a;
        return new fk4(pn5Var, str, new uq2(xj4Var.b.P).a().j, xj4Var.b.V, by5Var);
    }
}