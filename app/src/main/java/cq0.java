package defpackage;

import java.math.BigInteger;

/* renamed from: cq0  reason: default package */
public final class cq0 extends jn {
    public long[] g;

    public cq0() {
        this.g = new long[5];
    }

    public cq0(BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= 283) {
            if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 320) {
                long[] jArr = new long[5];
                int i = 0;
                while (bigInteger.signum() != 0) {
                    jArr[i] = bigInteger.longValue();
                    bigInteger = bigInteger.shiftRight(64);
                    i++;
                }
                long j = jArr[4];
                long j2 = j >>> 27;
                jArr[0] = ((j2 << 12) ^ (((j2 << 5) ^ j2) ^ (j2 << 7))) ^ jArr[0];
                jArr[4] = j & 134217727;
                this.g = jArr;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
    }

    public cq0(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((cq0) jnVar).g;
        return new cq0(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3], jArr[4] ^ jArr2[4]});
    }

    @Override // defpackage.jn
    public final jn b() {
        long[] jArr = this.g;
        return new cq0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4]});
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        return j(jnVar.g());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cq0) {
            long[] jArr = this.g;
            long[] jArr2 = ((cq0) obj).g;
            for (int i = 4; i >= 0; i--) {
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
        return 283;
    }

    @Override // defpackage.jn
    public final jn g() {
        long[] jArr = new long[5];
        long[] jArr2 = this.g;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < 5) {
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
            long[] jArr3 = new long[5];
            long[] jArr4 = new long[5];
            zw4.k(jArr2, jArr3);
            zw4.i(jArr3, jArr2, jArr3);
            zw4.l(2, jArr3, jArr4);
            zw4.i(jArr4, jArr3, jArr4);
            zw4.l(4, jArr4, jArr3);
            zw4.i(jArr3, jArr4, jArr3);
            zw4.l(8, jArr3, jArr4);
            zw4.i(jArr4, jArr3, jArr4);
            zw4.k(jArr4, jArr4);
            zw4.i(jArr4, jArr2, jArr4);
            zw4.l(17, jArr4, jArr3);
            zw4.i(jArr3, jArr4, jArr3);
            zw4.k(jArr3, jArr3);
            zw4.i(jArr3, jArr2, jArr3);
            zw4.l(35, jArr3, jArr4);
            zw4.i(jArr4, jArr3, jArr4);
            zw4.l(70, jArr4, jArr3);
            zw4.i(jArr3, jArr4, jArr3);
            zw4.k(jArr3, jArr3);
            zw4.i(jArr3, jArr2, jArr3);
            zw4.l(141, jArr3, jArr4);
            zw4.i(jArr4, jArr3, jArr4);
            zw4.k(jArr4, jArr);
            return new cq0(jArr);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.jn
    public final boolean h() {
        long[] jArr = this.g;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return j7.j(this.g, 5) ^ 2831275;
    }

    @Override // defpackage.jn
    public final boolean i() {
        long[] jArr = this.g;
        for (int i = 0; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        long[] jArr = new long[5];
        zw4.i(this.g, ((cq0) jnVar).g, jArr);
        return new cq0(jArr);
    }

    @Override // defpackage.jn
    public final jn k(jn jnVar, jn jnVar2, jn jnVar3) {
        return l(jnVar, jnVar2, jnVar3);
    }

    @Override // defpackage.jn
    public final jn l(jn jnVar, jn jnVar2, jn jnVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((cq0) jnVar).g;
        long[] jArr3 = ((cq0) jnVar2).g;
        long[] jArr4 = ((cq0) jnVar3).g;
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[10];
        zw4.f(jArr, jArr2, jArr6);
        zw4.b(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[10];
        zw4.f(jArr3, jArr4, jArr7);
        zw4.b(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[5];
        zw4.j(jArr5, jArr8);
        return new cq0(jArr8);
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
        long m3 = ar.m(jArr[2]);
        long m4 = ar.m(jArr[3]);
        long m5 = ar.m(jArr[4]);
        zw4.i(new long[]{(m >>> 32) | (m2 & (-4294967296L)), (m3 >>> 32) | (m4 & (-4294967296L)), m5 >>> 32}, zw4.Q, r1);
        long[] jArr2 = {jArr2[0] ^ j, jArr2[1] ^ ((m3 & 4294967295L) | (m4 << 32)), jArr2[2] ^ (4294967295L & m5)};
        return new cq0(jArr2);
    }

    @Override // defpackage.jn
    public final jn o() {
        long[] jArr = new long[5];
        zw4.k(this.g, jArr);
        return new cq0(jArr);
    }

    @Override // defpackage.jn
    public final jn p(jn jnVar, jn jnVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((cq0) jnVar).g;
        long[] jArr3 = ((cq0) jnVar2).g;
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        zw4.h(jArr, jArr5);
        zw4.b(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[10];
        zw4.f(jArr2, jArr3, jArr6);
        zw4.b(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[5];
        zw4.j(jArr4, jArr7);
        return new cq0(jArr7);
    }

    @Override // defpackage.jn
    public final jn q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[5];
        zw4.l(i, this.g, jArr);
        return new cq0(jArr);
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
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j = jArr[i];
            if (j != 0) {
                z61.x0((4 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }
}