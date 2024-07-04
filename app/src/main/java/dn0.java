package defpackage;

/* renamed from: dn0  reason: default package */
public final class dn0 extends n {
    public final l P;
    public final u3 Q;

    public dn0(u3 u3Var) {
        this.P = new l(0L);
        this.Q = u3Var;
    }

    public dn0(u uVar) {
        this.P = l.w(uVar.x(0));
        this.Q = u3.p(uVar.x(1));
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        s82Var.g(this.P);
        s82Var.g(this.Q);
        return new mi(s82Var);
    }
}