package defpackage;

/* renamed from: sk5  reason: default package */
public final class sk5 implements tm5 {
    public final do5 P;
    public final rk5 Q;
    public mk5 R;
    public tm5 S;
    public boolean T = true;
    public boolean U;

    public sk5(rk5 rk5Var, dx3 dx3Var) {
        this.Q = rk5Var;
        this.P = new do5(dx3Var);
    }

    @Override // defpackage.tm5
    public final long a() {
        throw null;
    }

    @Override // defpackage.tm5
    public final void b(y13 y13Var) {
        tm5 tm5Var = this.S;
        if (tm5Var != null) {
            tm5Var.b(y13Var);
            y13Var = this.S.d();
        }
        this.P.b(y13Var);
    }

    @Override // defpackage.tm5
    public final y13 d() {
        tm5 tm5Var = this.S;
        return tm5Var != null ? tm5Var.d() : this.P.S;
    }
}