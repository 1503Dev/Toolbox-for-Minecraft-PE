package defpackage;

/* renamed from: o81  reason: default package */
public final class o81 extends n {
    public final l P;
    public final int Q;
    public final u3 R;

    public o81(int i, u3 u3Var) {
        this.P = new l(0L);
        this.Q = i;
        this.R = u3Var;
    }

    public o81(u uVar) {
        this.P = l.w(uVar.x(0));
        this.Q = l.w(uVar.x(1)).x().intValue();
        this.R = u3.p(uVar.x(2));
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        s82Var.g(this.P);
        s82Var.g(new l(this.Q));
        s82Var.g(this.R);
        return new mi(s82Var);
    }
}