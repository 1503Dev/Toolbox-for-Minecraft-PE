package defpackage;

import defpackage.k9;

/* renamed from: th2  reason: default package */
public final class th2 implements k9.b {
    public final /* synthetic */ bx2 a;

    public th2(bx2 bx2Var) {
        this.a = bx2Var;
    }

    @Override // defpackage.k9.b
    public final void Z(gf gfVar) {
        this.a.c(new RuntimeException("Connection failed."));
    }
}