package defpackage;

import java.math.BigInteger;

/* renamed from: dp0  reason: default package */
public final class dp0 extends jn {
    public long[] g;

    public dp0() {
        this.g = new long[3];
    }

    public dp0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        long[] N = z61.N(bigInteger);
        long j = N[2];
        long j2 = j >>> 3;
        N[0] = N[0] ^ ((((j2 << 2) ^ j2) ^ (j2 << 3)) ^ (j2 << 8));
        N[1] = (j2 >>> 56) ^ N[1];
        N[2] = j & 7;
        this.g = N;
    }

    public dp0(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((dp0) jnVar).g;
        return new dp0(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2]});
    }

    @Override // defpackage.jn
    public final jn b() {
        long[] jArr = this.g;
        return new dp0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        return j(jnVar.g());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dp0) {
            long[] jArr = this.g;
            long[] jArr2 = ((dp0) obj).g;
            for (int i = 2; i >= 0; i--) {
                if (jArr[i] != jArr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jn
    public final int f() {
        return 131;
    }

    @Override // defpackage.jn
    public final jn g() {
        long[] jArr = new long[3];
        long[] jArr2 = this.g;
        if (!z61.s0(jArr2)) {
            long[] jArr3 = new long[3];
            long[] jArr4 = new long[3];
            long[] jArr5 = new long[5];
            ea2.n(jArr2, jArr5);
            ea2.r(jArr5, jArr3);
            ea2.p(jArr3, jArr2, jArr3);
            ea2.t(2, jArr3, jArr4);
            ea2.p(jArr4, jArr3, jArr4);
            ea2.t(4, jArr4, jArr3);
            ea2.p(jArr3, jArr4, jArr3);
            ea2.t(8, jArr3, jArr4);
            ea2.p(jArr4, jArr3, jArr4);
            ea2.t(16, jArr4, jArr3);
            ea2.p(jArr3, jArr4, jArr3);
            ea2.t(32, jArr3, jArr4);
            ea2.p(jArr4, jArr3, jArr4);
            long[] jArr6 = new long[5];
            ea2.n(jArr4, jArr6);
            ea2.r(jArr6, jArr4);
            ea2.p(jArr4, jArr2, jArr4);
            ea2.t(65, jArr4, jArr3);
            ea2.p(jArr3, jArr4, jArr3);
            long[] jArr7 = new long[5];
            ea2.n(jArr3, jArr7);
            ea2.r(jArr7, jArr);
            return new dp0(jArr);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.jn
    public final boolean h() {
        long[] jArr = this.g;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return j7.j(this.g, 3) ^ 131832;
    }

    @Override // defpackage.jn
    public final boolean i() {
        return z61.s0(this.g);
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        long[] jArr = new long[3];
        ea2.p(this.g, ((dp0) jnVar).g, jArr);
        return new dp0(jArr);
    }

    @Override // defpackage.jn
    public final jn k(jn jnVar, jn jnVar2, jn jnVar3) {
        return l(jnVar, jnVar2, jnVar3);
    }

    @Override // defpackage.jn
    public final jn l(jn jnVar, jn jnVar2, jn jnVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((dp0) jnVar).g;
        long[] jArr3 = ((dp0) jnVar2).g;
        long[] jArr4 = ((dp0) jnVar3).g;
        long[] jArr5 = new long[5];
        long[] jArr6 = new long[6];
        ea2.k(jArr, jArr2, jArr6);
        ea2.d(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[6];
        ea2.k(jArr3, jArr4, jArr7);
        ea2.d(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[3];
        ea2.r(jArr5, jArr8);
        return new dp0(jArr8);
    }

    @Override // defpackage.jn
    public final jn m() {
        return this;
    }

    @Override // defpackage.jn
    public final jn n() {
        long[] jArr = this.g;
        long m = ar.m(jArr[0]);
        long m2 = ar.m(jArr[1]);
        long m3 = ar.m(jArr[2]);
        ea2.p(new long[]{(m >>> 32) | (m2 & (-4294967296L)), m3 >>> 32}, ea2.Q, r1);
        long[] jArr2 = {jArr2[0] ^ ((m & 4294967295L) | (m2 << 32)), jArr2[1] ^ (m3 & 4294967295L)};
        return new dp0(jArr2);
    }

    @Override // defpackage.jn
    public final jn o() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[5];
        ea2.n(this.g, jArr2);
        ea2.r(jArr2, jArr);
        return new dp0(jArr);
    }

    @Override // defpackage.jn
    public final jn p(jn jnVar, jn jnVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((dp0) jnVar).g;
        long[] jArr3 = ((dp0) jnVar2).g;
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        ea2.n(jArr, jArr5);
        ea2.d(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[6];
        ea2.k(jArr2, jArr3, jArr6);
        ea2.d(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        ea2.r(jArr4, jArr7);
        return new dp0(jArr7);
    }

    @Override // defpackage.jn
    public final jn q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[3];
        ea2.t(i, this.g, jArr);
        return new dp0(jArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        return a(jnVar);
    }

    @Override // defpackage.jn
    public final boolean s() {
        return (this.g[0] & 1) != 0;
    }

    @Override // defpackage.jn
    public final BigInteger t() {
        return z61.A1(this.g);
    }
}