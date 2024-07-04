package defpackage;

/* renamed from: ps2  reason: default package */
public final class ps2 extends cs2 {
    public final ou3 P;
    public final qs2 Q;

    public ps2(ou3 ou3Var, qs2 qs2Var) {
        this.P = ou3Var;
        this.Q = qs2Var;
    }

    @Override // defpackage.ds2
    public final void h() {
        qs2 qs2Var;
        ou3 ou3Var = this.P;
        if (ou3Var == null || (qs2Var = this.Q) == null) {
            return;
        }
        ou3Var.O0(qs2Var);
    }

    @Override // defpackage.ds2
    public final void p(tz3 tz3Var) {
        ou3 ou3Var = this.P;
        if (ou3Var != null) {
            ou3Var.M0(tz3Var.d());
        }
    }

    @Override // defpackage.ds2
    public final void y(int i) {
    }
}