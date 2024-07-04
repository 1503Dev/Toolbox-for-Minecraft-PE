package defpackage;

/* renamed from: b50  reason: default package */
public final class b50 extends n {
    public final int P;
    public final int Q;
    public final rs R;

    public b50(int i, int i2, rs rsVar) {
        this.P = i;
        this.Q = i2;
        this.R = new rs(rsVar);
    }

    public b50(u uVar) {
        this.P = ((l) uVar.x(0)).x().intValue();
        this.Q = ((l) uVar.x(1)).x().intValue();
        this.R = new rs(((p) uVar.x(2)).x());
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        s82Var.g(new l(this.P));
        s82Var.g(new l(this.Q));
        s82Var.g(new ii(this.R.a()));
        return new mi(s82Var);
    }
}