package defpackage;

import java.math.BigInteger;

/* renamed from: pp0  reason: default package */
public final class pp0 extends jn {
    public long[] g;

    public pp0() {
        this.g = new long[4];
    }

    public pp0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        long[] O = z61.O(bigInteger);
        long j = O[3];
        long j2 = j >>> 1;
        O[0] = O[0] ^ ((j2 << 15) ^ j2);
        O[1] = (j2 >>> 49) ^ O[1];
        O[3] = j & 1;
        this.g = O;
    }

    public pp0(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((pp0) jnVar).g;
        return new pp0(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
    }

    @Override // defpackage.jn
    public final jn b() {
        long[] jArr = this.g;
        return new pp0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        return j(jnVar.g());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pp0) {
            return z61.H(this.g, ((pp0) obj).g);
        }
        return false;
    }

    @Override // defpackage.jn
    public final int f() {
        return 193;
    }

    @Override // defpackage.jn
    public final jn g() {
        long[] jArr = new long[4];
        long[] jArr2 = this.g;
        if (!z61.t0(jArr2)) {
            long[] jArr3 = new long[4];
            long[] jArr4 = new long[4];
            long[] jArr5 = new long[8];
            vx.i(jArr2, jArr5);
            vx.n(jArr5, jArr3);
            vx.r(1, jArr3, jArr4);
            vx.l(jArr3, jArr4, jArr3);
            vx.r(1, jArr4, jArr4);
            vx.l(jArr3, jArr4, jArr3);
            vx.r(3, jArr3, jArr4);
            vx.l(jArr3, jArr4, jArr3);
            vx.r(6, jArr3, jArr4);
            vx.l(jArr3, jArr4, jArr3);
            vx.r(12, jArr3, jArr4);
            vx.l(jArr3, jArr4, jArr3);
            vx.r(24, jArr3, jArr4);
            vx.l(jArr3, jArr4, jArr3);
            vx.r(48, jArr3, jArr4);
            vx.l(jArr3, jArr4, jArr3);
            vx.r(96, jArr3, jArr4);
            vx.l(jArr3, jArr4, jArr);
            return new pp0(jArr);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.jn
    public final boolean h() {
        return z61.l0(this.g);
    }

    public final int hashCode() {
        return j7.j(this.g, 4) ^ 1930015;
    }

    @Override // defpackage.jn
    public final boolean i() {
        return z61.t0(this.g);
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        long[] jArr = new long[4];
        vx.l(this.g, ((pp0) jnVar).g, jArr);
        return new pp0(jArr);
    }

    @Override // defpackage.jn
    public final jn k(jn jnVar, jn jnVar2, jn jnVar3) {
        return l(jnVar, jnVar2, jnVar3);
    }

    @Override // defpackage.jn
    public final jn l(jn jnVar, jn jnVar2, jn jnVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((pp0) jnVar).g;
        long[] jArr3 = ((pp0) jnVar2).g;
        long[] jArr4 = ((pp0) jnVar3).g;
        long[] jArr5 = new long[8];
        long[] jArr6 = new long[8];
        vx.g(jArr, jArr2, jArr6);
        vx.d(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[8];
        vx.g(jArr3, jArr4, jArr7);
        vx.d(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[4];
        vx.n(jArr5, jArr8);
        return new pp0(jArr8);
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
        long j = (m & 4294967295L) | (m2 << 32);
        long j2 = (m >>> 32) | (m2 & (-4294967296L));
        long m3 = ar.m(jArr[2]);
        long j3 = m3 >>> 32;
        return new pp0(new long[]{j ^ (j2 << 8), (((j3 << 8) ^ ((4294967295L & m3) ^ (jArr[3] << 32))) ^ (j2 >>> 56)) ^ (j2 << 33), ((j3 >>> 56) ^ (j3 << 33)) ^ (j2 >>> 31), j3 >>> 31});
    }

    @Override // defpackage.jn
    public final jn o() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        vx.i(this.g, jArr2);
        vx.n(jArr2, jArr);
        return new pp0(jArr);
    }

    @Override // defpackage.jn
    public final jn p(jn jnVar, jn jnVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((pp0) jnVar).g;
        long[] jArr3 = ((pp0) jnVar2).g;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        vx.i(jArr, jArr5);
        vx.d(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        vx.g(jArr2, jArr3, jArr6);
        vx.d(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        vx.n(jArr4, jArr7);
        return new pp0(jArr7);
    }

    @Override // defpackage.jn
    public final jn q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        vx.r(i, this.g, jArr);
        return new pp0(jArr);
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
        return z61.B1(this.g);
    }
}