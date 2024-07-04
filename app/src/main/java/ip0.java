package defpackage;

import java.math.BigInteger;

/* renamed from: ip0  reason: default package */
public final class ip0 extends jn {
    public long[] g;

    public ip0() {
        this.g = new long[3];
    }

    public ip0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        long[] N = z61.N(bigInteger);
        long j = N[2];
        long j2 = j >>> 35;
        N[0] = ((j2 << 7) ^ (((j2 << 3) ^ j2) ^ (j2 << 6))) ^ N[0];
        N[2] = j & 34359738367L;
        this.g = N;
    }

    public ip0(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((ip0) jnVar).g;
        return new ip0(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2]});
    }

    @Override // defpackage.jn
    public final jn b() {
        long[] jArr = this.g;
        return new ip0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        return j(jnVar.g());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ip0) {
            long[] jArr = this.g;
            long[] jArr2 = ((ip0) obj).g;
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
        return 163;
    }

    @Override // defpackage.jn
    public final jn g() {
        long[] jArr = new long[3];
        long[] jArr2 = this.g;
        if (!z61.s0(jArr2)) {
            long[] jArr3 = new long[3];
            long[] jArr4 = new long[3];
            long[] jArr5 = new long[6];
            j82.d(jArr2, jArr5);
            j82.f(jArr5, jArr3);
            j82.g(1, jArr3, jArr4);
            j82.e(jArr3, jArr4, jArr3);
            j82.g(1, jArr4, jArr4);
            j82.e(jArr3, jArr4, jArr3);
            j82.g(3, jArr3, jArr4);
            j82.e(jArr3, jArr4, jArr3);
            j82.g(3, jArr4, jArr4);
            j82.e(jArr3, jArr4, jArr3);
            j82.g(9, jArr3, jArr4);
            j82.e(jArr3, jArr4, jArr3);
            j82.g(9, jArr4, jArr4);
            j82.e(jArr3, jArr4, jArr3);
            j82.g(27, jArr3, jArr4);
            j82.e(jArr3, jArr4, jArr3);
            j82.g(27, jArr4, jArr4);
            j82.e(jArr3, jArr4, jArr3);
            j82.g(81, jArr3, jArr4);
            j82.e(jArr3, jArr4, jArr);
            return new ip0(jArr);
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
        return j7.j(this.g, 3) ^ 163763;
    }

    @Override // defpackage.jn
    public final boolean i() {
        return z61.s0(this.g);
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        long[] jArr = new long[3];
        j82.e(this.g, ((ip0) jnVar).g, jArr);
        return new ip0(jArr);
    }

    @Override // defpackage.jn
    public final jn k(jn jnVar, jn jnVar2, jn jnVar3) {
        return l(jnVar, jnVar2, jnVar3);
    }

    @Override // defpackage.jn
    public final jn l(jn jnVar, jn jnVar2, jn jnVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((ip0) jnVar).g;
        long[] jArr3 = ((ip0) jnVar2).g;
        long[] jArr4 = ((ip0) jnVar3).g;
        long[] jArr5 = new long[6];
        long[] jArr6 = new long[6];
        j82.b(jArr, jArr2, jArr6);
        j82.a(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[6];
        j82.b(jArr3, jArr4, jArr7);
        j82.a(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[3];
        j82.f(jArr5, jArr8);
        return new ip0(jArr8);
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
        j82.e(new long[]{(m >>> 32) | (m2 & (-4294967296L)), m3 >>> 32}, j82.c, r1);
        long[] jArr2 = {jArr2[0] ^ ((m & 4294967295L) | (m2 << 32)), jArr2[1] ^ (m3 & 4294967295L)};
        return new ip0(jArr2);
    }

    @Override // defpackage.jn
    public final jn o() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[6];
        j82.d(this.g, jArr2);
        j82.f(jArr2, jArr);
        return new ip0(jArr);
    }

    @Override // defpackage.jn
    public final jn p(jn jnVar, jn jnVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((ip0) jnVar).g;
        long[] jArr3 = ((ip0) jnVar2).g;
        long[] jArr4 = new long[6];
        long[] jArr5 = new long[6];
        j82.d(jArr, jArr5);
        j82.a(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[6];
        j82.b(jArr2, jArr3, jArr6);
        j82.a(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        j82.f(jArr4, jArr7);
        return new ip0(jArr7);
    }

    @Override // defpackage.jn
    public final jn q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[3];
        j82.g(i, this.g, jArr);
        return new ip0(jArr);
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