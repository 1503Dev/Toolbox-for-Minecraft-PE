package defpackage;

/* renamed from: rk1  reason: default package */
public final class rk1 implements ml1 {
    public final tk1 a;
    public final long b;

    public rk1(tk1 tk1Var, long j) {
        this.a = tk1Var;
        this.b = j;
    }

    @Override // defpackage.ml1
    public final long b() {
        return this.a.a();
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        tk1 tk1Var;
        long j2;
        tv2.B(this.a.k);
        sk1 sk1Var = this.a.k;
        long[] jArr = (long[]) sk1Var.Q;
        long[] jArr2 = (long[]) sk1Var.R;
        long j3 = 0;
        int i = zn4.i(jArr, Math.max(0L, Math.min((tk1Var.e * j) / 1000000, tk1Var.j - 1)), false);
        if (i == -1) {
            j2 = 0;
        } else {
            j2 = jArr[i];
        }
        if (i != -1) {
            j3 = jArr2[i];
        }
        int i2 = this.a.e;
        long j4 = (j2 * 1000000) / i2;
        long j5 = this.b;
        nl1 nl1Var = new nl1(j4, j3 + j5);
        if (j4 != j && i != jArr.length - 1) {
            int i3 = i + 1;
            return new kl1(nl1Var, new nl1((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
        }
        return new kl1(nl1Var, nl1Var);
    }
}