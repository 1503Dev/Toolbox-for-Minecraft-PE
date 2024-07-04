package defpackage;

/* renamed from: rp1  reason: default package */
public final class rp1 implements wp1, ml1 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;

    public rp1(long j, long j2, el1 el1Var) {
        long max;
        int i = el1Var.f;
        int i2 = el1Var.c;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            max = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            max = (Math.max(0L, j3) * 8000000) / i;
        }
        this.f = max;
    }

    @Override // defpackage.ml1
    public final long b() {
        return this.f;
    }

    @Override // defpackage.wp1
    public final long c() {
        return -1L;
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return this.d != -1;
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        long j2 = this.d;
        if (j2 != -1) {
            long j3 = this.c;
            long j4 = (((this.e * j) / 8000000) / j3) * j3;
            if (j2 != -1) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = Math.max(j4, 0L);
            long j5 = this.b;
            long j6 = max + j5;
            long max2 = (Math.max(0L, j6 - j5) * 8000000) / this.e;
            nl1 nl1Var = new nl1(max2, j6);
            if (this.d != -1 && max2 < j) {
                long j7 = j6 + this.c;
                if (j7 < this.a) {
                    return new kl1(nl1Var, new nl1((Math.max(0L, j7 - this.b) * 8000000) / this.e, j7));
                }
            }
            return new kl1(nl1Var, nl1Var);
        }
        nl1 nl1Var2 = new nl1(0L, this.b);
        return new kl1(nl1Var2, nl1Var2);
    }

    @Override // defpackage.wp1
    public final long h(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.e;
    }
}