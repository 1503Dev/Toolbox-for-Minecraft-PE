package defpackage;

/* renamed from: zm3  reason: default package */
public final class zm3 implements ae3 {
    public final nl3 P;
    public final tl3 Q;

    public zm3(nl3 nl3Var, sl3 sl3Var) {
        this.P = nl3Var;
        this.Q = sl3Var;
    }

    @Override // defpackage.ae3
    public final void n() {
        nl3 nl3Var = this.P;
        if (nl3Var.l() == null) {
            return;
        }
        y03 i = nl3Var.i();
        y03 j = nl3Var.j();
        if (i == null) {
            i = j == null ? null : j;
        }
        if (!this.Q.c() || i == null) {
            return;
        }
        i.a("onSdkImpression", new e7());
    }
}