package defpackage;

/* renamed from: q81  reason: default package */
public final class q81 extends n {
    public final l P;
    public final int Q;
    public final int R;
    public final u3 S;

    public q81(int i, int i2, u3 u3Var) {
        this.P = new l(0L);
        this.Q = i;
        this.R = i2;
        this.S = u3Var;
    }

    public q81(u uVar) {
        this.P = l.w(uVar.x(0));
        this.Q = l.w(uVar.x(1)).x().intValue();
        this.R = l.w(uVar.x(2)).x().intValue();
        this.S = u3.p(uVar.x(3));
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        s82Var.g(this.P);
        s82Var.g(new l(this.Q));
        s82Var.g(new l(this.R));
        s82Var.g(this.S);
        return new mi(s82Var);
    }
}