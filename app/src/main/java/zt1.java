package defpackage;

/* renamed from: zt1  reason: default package */
public final class zt1 implements ml1 {
    public final wt1 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public zt1(wt1 wt1Var, int i, long j, long j2) {
        this.a = wt1Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / wt1Var.c;
        this.d = j3;
        this.e = a(j3);
    }

    public final long a(long j) {
        return zn4.r(j * this.b, 1000000L, this.a.b);
    }

    @Override // defpackage.ml1
    public final long b() {
        return this.e;
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        long max = Math.max(0L, Math.min((this.a.b * j) / (this.b * 1000000), this.d - 1));
        long j2 = (this.a.c * max) + this.c;
        long a = a(max);
        nl1 nl1Var = new nl1(a, j2);
        if (a >= j || max == this.d - 1) {
            return new kl1(nl1Var, nl1Var);
        }
        long j3 = max + 1;
        return new kl1(nl1Var, new nl1(a(j3), (this.a.c * j3) + this.c));
    }
}