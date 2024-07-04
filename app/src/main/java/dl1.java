package defpackage;

/* renamed from: dl1  reason: default package */
public final class dl1 implements ml1 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public dl1(long j, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        tv2.G(length == length2);
        boolean z = length2 > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.c = j;
    }

    @Override // defpackage.ml1
    public final long b() {
        return this.c;
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        if (!this.d) {
            nl1 nl1Var = nl1.c;
            return new kl1(nl1Var, nl1Var);
        }
        int i = zn4.i(this.b, j, true);
        long[] jArr = this.b;
        long j2 = jArr[i];
        long[] jArr2 = this.a;
        nl1 nl1Var2 = new nl1(j2, jArr2[i]);
        if (j2 == j || i == jArr.length - 1) {
            return new kl1(nl1Var2, nl1Var2);
        }
        int i2 = i + 1;
        return new kl1(nl1Var2, new nl1(jArr[i2], jArr2[i2]));
    }
}