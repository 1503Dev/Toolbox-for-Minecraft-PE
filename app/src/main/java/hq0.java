package defpackage;

import java.math.BigInteger;

/* renamed from: hq0  reason: default package */
public final class hq0 extends jn {
    public long[] g;

    public hq0() {
        this.g = new long[7];
    }

    public hq0(BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= 409) {
            if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 448) {
                long[] jArr = new long[7];
                int i = 0;
                while (bigInteger.signum() != 0) {
                    jArr[i] = bigInteger.longValue();
                    bigInteger = bigInteger.shiftRight(64);
                    i++;
                }
                long j = jArr[6];
                long j2 = j >>> 25;
                jArr[0] = jArr[0] ^ j2;
                jArr[1] = (j2 << 23) ^ jArr[1];
                jArr[6] = j & 33554431;
                this.g = jArr;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
    }

    public hq0(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((hq0) jnVar).g;
        return new hq0(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3], jArr[4] ^ jArr2[4], jArr[5] ^ jArr2[5], jArr[6] ^ jArr2[6]});
    }

    @Override // defpackage.jn
    public final jn b() {
        long[] jArr = this.g;
        return new hq0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        return j(jnVar.g());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hq0) {
            long[] jArr = this.g;
            long[] jArr2 = ((hq0) obj).g;
            for (int i = 6; i >= 0; i--) {
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
        return 409;
    }

    @Override // defpackage.jn
    public final jn g() {
        long[] jArr = new long[7];
        long[] jArr2 = this.g;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < 7) {
                if (jArr2[i] != 0) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            long[] jArr3 = new long[7];
            long[] jArr4 = new long[7];
            long[] jArr5 = new long[7];
            long[] jArr6 = new long[13];
            ea2.o(jArr2, jArr6);
            ea2.s(jArr6, jArr3);
            ea2.u(1, jArr3, jArr4);
            ea2.q(jArr3, jArr4, jArr3);
            ea2.u(1, jArr4, jArr4);
            ea2.q(jArr3, jArr4, jArr3);
            ea2.u(3, jArr3, jArr4);
            ea2.q(jArr3, jArr4, jArr3);
            ea2.u(6, jArr3, jArr4);
            ea2.q(jArr3, jArr4, jArr3);
            ea2.u(12, jArr3, jArr4);
            ea2.q(jArr3, jArr4, jArr5);
            ea2.u(24, jArr5, jArr3);
            ea2.u(24, jArr3, jArr4);
            ea2.q(jArr3, jArr4, jArr3);
            ea2.u(48, jArr3, jArr4);
            ea2.q(jArr3, jArr4, jArr3);
            ea2.u(96, jArr3, jArr4);
            ea2.q(jArr3, jArr4, jArr3);
            ea2.u(192, jArr3, jArr4);
            ea2.q(jArr3, jArr4, jArr3);
            ea2.q(jArr3, jArr5, jArr);
            return new hq0(jArr);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.jn
    public final boolean h() {
        long[] jArr = this.g;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return j7.j(this.g, 7) ^ 4090087;
    }

    @Override // defpackage.jn
    public final boolean i() {
        long[] jArr = this.g;
        for (int i = 0; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        long[] jArr = new long[7];
        ea2.q(this.g, ((hq0) jnVar).g, jArr);
        return new hq0(jArr);
    }

    @Override // defpackage.jn
    public final jn k(jn jnVar, jn jnVar2, jn jnVar3) {
        return l(jnVar, jnVar2, jnVar3);
    }

    @Override // defpackage.jn
    public final jn l(jn jnVar, jn jnVar2, jn jnVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((hq0) jnVar).g;
        long[] jArr3 = ((hq0) jnVar2).g;
        long[] jArr4 = ((hq0) jnVar3).g;
        long[] jArr5 = new long[13];
        long[] jArr6 = new long[14];
        ea2.l(jArr, jArr2, jArr6);
        for (int i = 0; i < 13; i++) {
            jArr5[i] = jArr5[i] ^ jArr6[i];
        }
        long[] jArr7 = new long[14];
        ea2.l(jArr3, jArr4, jArr7);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr5[i2] = jArr5[i2] ^ jArr7[i2];
        }
        long[] jArr8 = new long[7];
        ea2.s(jArr5, jArr8);
        return new hq0(jArr8);
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
        long m4 = ar.m(jArr[3]);
        long j3 = (m3 & 4294967295L) | (m4 << 32);
        long j4 = (m3 >>> 32) | (m4 & (-4294967296L));
        long m5 = ar.m(jArr[4]);
        long m6 = ar.m(jArr[5]);
        long j5 = (m5 >>> 32) | (m6 & (-4294967296L));
        long m7 = ar.m(jArr[6]);
        long j6 = m7 & 4294967295L;
        long j7 = m7 >>> 32;
        return new hq0(new long[]{j ^ (j2 << 44), (j3 ^ (j4 << 44)) ^ (j2 >>> 20), (((m5 & 4294967295L) | (m6 << 32)) ^ (j5 << 44)) ^ (j4 >>> 20), (((j7 << 44) ^ j6) ^ (j5 >>> 20)) ^ (j2 << 13), (j2 >>> 51) ^ ((j7 >>> 20) ^ (j4 << 13)), (j5 << 13) ^ (j4 >>> 51), (j5 >>> 51) ^ (j7 << 13)});
    }

    @Override // defpackage.jn
    public final jn o() {
        long[] jArr = new long[7];
        long[] jArr2 = new long[13];
        ea2.o(this.g, jArr2);
        ea2.s(jArr2, jArr);
        return new hq0(jArr);
    }

    @Override // defpackage.jn
    public final jn p(jn jnVar, jn jnVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((hq0) jnVar).g;
        long[] jArr3 = ((hq0) jnVar2).g;
        long[] jArr4 = new long[13];
        long[] jArr5 = new long[13];
        ea2.o(jArr, jArr5);
        for (int i = 0; i < 13; i++) {
            jArr4[i] = jArr4[i] ^ jArr5[i];
        }
        long[] jArr6 = new long[14];
        ea2.l(jArr2, jArr3, jArr6);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr4[i2] = jArr4[i2] ^ jArr6[i2];
        }
        long[] jArr7 = new long[7];
        ea2.s(jArr4, jArr7);
        return new hq0(jArr7);
    }

    @Override // defpackage.jn
    public final jn q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[7];
        ea2.u(i, this.g, jArr);
        return new hq0(jArr);
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
        long[] jArr = this.g;
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = jArr[i];
            if (j != 0) {
                z61.x0((6 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }
}