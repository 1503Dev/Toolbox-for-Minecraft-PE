package defpackage;

import defpackage.k9;

/* renamed from: f52  reason: default package */
public final class f52 implements k9.b {
    public final /* synthetic */ bx2 a;
    public final /* synthetic */ g52 b;

    public f52(g52 g52Var, b52 b52Var) {
        this.b = g52Var;
        this.a = b52Var;
    }

    @Override // defpackage.k9.b
    public final void Z(gf gfVar) {
        synchronized (this.b.c) {
            this.a.c(new RuntimeException("Connection failed."));
        }
    }
}