package defpackage;

/* renamed from: fr1  reason: default package */
public final class fr1 implements kr1 {
    public final tk1 P;
    public final sk1 Q;
    public long R = -1;
    public long S = -1;

    public fr1(tk1 tk1Var, sk1 sk1Var) {
        this.P = tk1Var;
        this.Q = sk1Var;
    }

    @Override // defpackage.kr1
    public final long a(p16 p16Var) {
        long j = this.S;
        if (j >= 0) {
            this.S = -1L;
            return -(j + 2);
        }
        return -1L;
    }

    @Override // defpackage.kr1
    public final ml1 b() {
        tv2.I(this.R != -1);
        return new rk1(this.P, this.R);
    }

    @Override // defpackage.kr1
    public final void g(long j) {
        long[] jArr = (long[]) this.Q.Q;
        this.S = jArr[zn4.i(jArr, j, true)];
    }
}