package defpackage;

/* renamed from: gn1  reason: default package */
public final class gn1 implements ml1 {
    public final /* synthetic */ ml1 a;
    public final /* synthetic */ hn1 b;

    public gn1(hn1 hn1Var, ml1 ml1Var) {
        this.b = hn1Var;
        this.a = ml1Var;
    }

    @Override // defpackage.ml1
    public final long b() {
        return this.a.b();
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        kl1 g = this.a.g(j);
        nl1 nl1Var = g.a;
        long j2 = nl1Var.a;
        long j3 = nl1Var.b;
        long j4 = this.b.P;
        nl1 nl1Var2 = new nl1(j2, j3 + j4);
        nl1 nl1Var3 = g.b;
        return new kl1(nl1Var2, new nl1(nl1Var3.a, nl1Var3.b + j4));
    }
}