package defpackage;

/* renamed from: ll1  reason: default package */
public class ll1 implements ml1 {
    public final long a;
    public final kl1 b;

    public ll1(long j, long j2) {
        this.a = j;
        nl1 nl1Var = j2 == 0 ? nl1.c : new nl1(0L, j2);
        this.b = new kl1(nl1Var, nl1Var);
    }

    @Override // defpackage.ml1
    public final long b() {
        return this.a;
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        return this.b;
    }
}