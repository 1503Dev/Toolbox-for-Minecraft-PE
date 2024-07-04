package defpackage;

import java.math.BigInteger;

/* renamed from: zp0  reason: default package */
public final class zp0 extends jn {
    public long[] g;

    public zp0() {
        this.g = new long[4];
    }

    public zp0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        long[] O = z61.O(bigInteger);
        long j = O[3];
        long j2 = j >>> 47;
        O[0] = O[0] ^ j2;
        O[2] = (j2 << 30) ^ O[2];
        O[3] = j & 140737488355327L;
        this.g = O;
    }

    public zp0(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((zp0) jnVar).g;
        return new zp0(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
    }

    @Override // defpackage.jn
    public final jn b() {
        long[] jArr = this.g;
        return new zp0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        return j(jnVar.g());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zp0) {
            return z61.H(this.g, ((zp0) obj).g);
        }
        return false;
    }

    @Override // defpackage.jn
    public final int f() {
        return 239;
    }

    @Override // defpackage.jn
    public final jn g() {
        long[] jArr = new long[4];
        long[] jArr2 = this.g;
        if (!z61.t0(jArr2)) {
            long[] jArr3 = new long[4];
            long[] jArr4 = new long[4];
            p5.o(jArr2, jArr3);
            p5.l(jArr3, jArr2, jArr3);
            p5.o(jArr3, jArr3);
            p5.l(jArr3, jArr2, jArr3);
            p5.p(3, jArr3, jArr4);
            p5.l(jArr4, jArr3, jArr4);
            p5.o(jArr4, jArr4);
            p5.l(jArr4, jArr2, jArr4);
            p5.p(7, jArr4, jArr3);
            p5.l(jArr3, jArr4, jArr3);
            p5.p(14, jArr3, jArr4);
            p5.l(jArr4, jArr3, jArr4);
            p5.o(jArr4, jArr4);
            p5.l(jArr4, jArr2, jArr4);
            p5.p(29, jArr4, jArr3);
            p5.l(jArr3, jArr4, jArr3);
            p5.o(jArr3, jArr3);
            p5.l(jArr3, jArr2, jArr3);
            p5.p(59, jArr3, jArr4);
            p5.l(jArr4, jArr3, jArr4);
            p5.o(jArr4, jArr4);
            p5.l(jArr4, jArr2, jArr4);
            p5.p(119, jArr4, jArr3);
            p5.l(jArr3, jArr4, jArr3);
            p5.o(jArr3, jArr);
            return new zp0(jArr);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.jn
    public final boolean h() {
        return z61.l0(this.g);
    }

    public final int hashCode() {
        return j7.j(this.g, 4) ^ 23900158;
    }

    @Override // defpackage.jn
    public final boolean i() {
        return z61.t0(this.g);
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        long[] jArr = new long[4];
        p5.l(this.g, ((zp0) jnVar).g, jArr);
        return new zp0(jArr);
    }

    @Override // defpackage.jn
    public final jn k(jn jnVar, jn jnVar2, jn jnVar3) {
        return l(jnVar, jnVar2, jnVar3);
    }

    @Override // defpackage.jn
    public final jn l(jn jnVar, jn jnVar2, jn jnVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((zp0) jnVar).g;
        long[] jArr3 = ((zp0) jnVar2).g;
        long[] jArr4 = ((zp0) jnVar3).g;
        long[] jArr5 = new long[8];
        long[] jArr6 = new long[8];
        p5.i(jArr, jArr2, jArr6);
        p5.c(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[8];
        p5.i(jArr3, jArr4, jArr7);
        p5.c(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[4];
        p5.n(jArr5, jArr8);
        return new zp0(jArr8);
    }

    @Override // defpackage.jn
    public final jn m() {
        return this;
    }

    @Override // defpackage.jn
    public final jn n() {
        long[] jArr = new long[4];
        long[] jArr2 = this.g;
        long m = ar.m(jArr2[0]);
        long m2 = ar.m(jArr2[1]);
        long j = (m & 4294967295L) | (m2 << 32);
        long j2 = (m >>> 32) | (m2 & (-4294967296L));
        long m3 = ar.m(jArr2[2]);
        long m4 = ar.m(jArr2[3]);
        long j3 = (m3 & 4294967295L) | (m4 << 32);
        long j4 = (m4 & (-4294967296L)) | (m3 >>> 32);
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] jArr3 = new long[8];
        int[] iArr = {39, 120};
        int i = 0;
        for (int i2 = 2; i < i2; i2 = 2) {
            int i3 = iArr[i];
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            jArr3[i4] = jArr3[i4] ^ (j2 << i5);
            int i6 = i4 + 1;
            int i7 = -i5;
            jArr3[i6] = jArr3[i6] ^ ((j7 << i5) | (j2 >>> i7));
            int i8 = i4 + 2;
            jArr3[i8] = jArr3[i8] ^ ((j6 << i5) | (j7 >>> i7));
            int i9 = i4 + 3;
            jArr3[i9] = jArr3[i9] ^ ((j5 << i5) | (j6 >>> i7));
            int i10 = i4 + 4;
            jArr3[i10] = jArr3[i10] ^ (j5 >>> i7);
            i++;
        }
        p5.n(jArr3, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new zp0(jArr);
    }

    @Override // defpackage.jn
    public final jn o() {
        long[] jArr = new long[4];
        p5.o(this.g, jArr);
        return new zp0(jArr);
    }

    @Override // defpackage.jn
    public final jn p(jn jnVar, jn jnVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((zp0) jnVar).g;
        long[] jArr3 = ((zp0) jnVar2).g;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        p5.k(jArr, jArr5);
        p5.c(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        p5.i(jArr2, jArr3, jArr6);
        p5.c(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        p5.n(jArr4, jArr7);
        return new zp0(jArr7);
    }

    @Override // defpackage.jn
    public final jn q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        p5.p(i, this.g, jArr);
        return new zp0(jArr);
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