package defpackage;

/* renamed from: xp1  reason: default package */
public final class xp1 implements wp1 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public xp1(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.ml1
    public final long b() {
        return this.c;
    }

    @Override // defpackage.wp1
    public final long c() {
        return this.d;
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        int i = zn4.i(this.a, j, true);
        long[] jArr = this.a;
        long j2 = jArr[i];
        long[] jArr2 = this.b;
        nl1 nl1Var = new nl1(j2, jArr2[i]);
        if (j2 >= j || i == jArr.length - 1) {
            return new kl1(nl1Var, nl1Var);
        }
        int i2 = i + 1;
        return new kl1(nl1Var, new nl1(jArr[i2], jArr2[i2]));
    }

    @Override // defpackage.wp1
    public final long h(long j) {
        return this.a[zn4.i(this.b, j, true)];
    }
}