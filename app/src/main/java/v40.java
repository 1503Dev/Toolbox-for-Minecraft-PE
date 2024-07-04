package defpackage;

/* renamed from: v40  reason: default package */
public final class v40 extends n {
    public final int P;
    public final int Q;
    public final rs R;
    public final u3 S;

    public v40(int i, int i2, rs rsVar, u3 u3Var) {
        this.P = i;
        this.Q = i2;
        this.R = new rs(rsVar.a());
        this.S = u3Var;
    }

    public v40(u uVar) {
        this.P = ((l) uVar.x(0)).x().intValue();
        this.Q = ((l) uVar.x(1)).x().intValue();
        this.R = new rs(((p) uVar.x(2)).x());
        this.S = u3.p(uVar.x(3));
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        s82Var.g(new l(this.P));
        s82Var.g(new l(this.Q));
        s82Var.g(new ii(this.R.a()));
        s82Var.g(this.S);
        return new mi(s82Var);
    }
}