package defpackage;

/* renamed from: om4  reason: default package */
public final class om4 implements wy4 {
    public final /* synthetic */ qm4 P;
    public final /* synthetic */ hm4 Q;
    public final /* synthetic */ boolean R;

    public om4(qm4 qm4Var, hm4 hm4Var, boolean z) {
        this.P = qm4Var;
        this.Q = hm4Var;
        this.R = z;
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        qm4 qm4Var = this.P;
        hm4 hm4Var = this.Q;
        hm4Var.k0(true);
        qm4Var.b(hm4Var);
        if (this.R) {
            this.P.h();
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        hm4 hm4Var = this.Q;
        if (hm4Var.j()) {
            qm4 qm4Var = this.P;
            hm4Var.b(th);
            hm4Var.k0(false);
            qm4Var.b(hm4Var);
            if (this.R) {
                this.P.h();
            }
        }
    }
}