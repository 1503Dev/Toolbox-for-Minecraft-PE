package defpackage;

/* renamed from: br1  reason: default package */
public final class br1 implements ml1 {
    public final /* synthetic */ er1 a;

    @Override // defpackage.ml1
    public final long b() {
        er1 er1Var = this.a;
        nr1 nr1Var = er1Var.S;
        return (er1Var.U * 1000000) / nr1Var.i;
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        er1 er1Var = this.a;
        long j2 = er1Var.Q;
        long j3 = er1Var.R;
        nl1 nl1Var = new nl1(j, Math.max(j2, Math.min(((((j3 - j2) * ((er1Var.S.i * j) / 1000000)) / er1Var.U) + j2) - 30000, j3 - 1)));
        return new kl1(nl1Var, nl1Var);
    }
}