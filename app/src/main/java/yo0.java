package defpackage;

import java.math.BigInteger;

/* renamed from: yo0  reason: default package */
public final class yo0 extends jn {
    public long[] g;

    public yo0() {
        this.g = new long[2];
    }

    public yo0(BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= 113) {
            if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 128) {
                long[] jArr = new long[2];
                int i = 0;
                while (bigInteger.signum() != 0) {
                    jArr[i] = bigInteger.longValue();
                    bigInteger = bigInteger.shiftRight(64);
                    i++;
                }
                long j = jArr[1];
                long j2 = j >>> 49;
                jArr[0] = (j2 ^ (j2 << 9)) ^ jArr[0];
                jArr[1] = j & 562949953421311L;
                this.g = jArr;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
    }

    public yo0(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        long[] jArr = this.g;
        long[] jArr2 = ((yo0) jnVar).g;
        return new yo0(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1]});
    }

    @Override // defpackage.jn
    public final jn b() {
        long[] jArr = this.g;
        return new yo0(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        return j(jnVar.g());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yo0) {
            long[] jArr = this.g;
            long[] jArr2 = ((yo0) obj).g;
            for (int i = 1; i >= 0; i--) {
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
        return 113;
    }

    @Override // defpackage.jn
    public final jn g() {
        long[] jArr = new long[2];
        long[] jArr2 = this.g;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < 2) {
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
            long[] jArr3 = new long[2];
            long[] jArr4 = new long[2];
            long[] jArr5 = new long[4];
            vj.t(jArr2, jArr5);
            vj.z(jArr5, jArr3);
            vj.w(jArr3, jArr2, jArr3);
            long[] jArr6 = new long[4];
            vj.t(jArr3, jArr6);
            vj.z(jArr6, jArr3);
            vj.w(jArr3, jArr2, jArr3);
            vj.E(3, jArr3, jArr4);
            vj.w(jArr4, jArr3, jArr4);
            long[] jArr7 = new long[4];
            vj.t(jArr4, jArr7);
            vj.z(jArr7, jArr4);
            vj.w(jArr4, jArr2, jArr4);
            vj.E(7, jArr4, jArr3);
            vj.w(jArr3, jArr4, jArr3);
            vj.E(14, jArr3, jArr4);
            vj.w(jArr4, jArr3, jArr4);
            vj.E(28, jArr4, jArr3);
            vj.w(jArr3, jArr4, jArr3);
            vj.E(56, jArr3, jArr4);
            vj.w(jArr4, jArr3, jArr4);
            long[] jArr8 = new long[4];
            vj.t(jArr4, jArr8);
            vj.z(jArr8, jArr);
            return new yo0(jArr);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.jn
    public final boolean h() {
        long[] jArr = this.g;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return j7.j(this.g, 2) ^ 113009;
    }

    @Override // defpackage.jn
    public final boolean i() {
        long[] jArr = this.g;
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        long[] jArr = new long[2];
        vj.w(this.g, ((yo0) jnVar).g, jArr);
        return new yo0(jArr);
    }

    @Override // defpackage.jn
    public final jn k(jn jnVar, jn jnVar2, jn jnVar3) {
        return l(jnVar, jnVar2, jnVar3);
    }

    @Override // defpackage.jn
    public final jn l(jn jnVar, jn jnVar2, jn jnVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((yo0) jnVar).g;
        long[] jArr3 = ((yo0) jnVar2).g;
        long[] jArr4 = ((yo0) jnVar3).g;
        long[] jArr5 = new long[4];
        long[] jArr6 = new long[4];
        vj.r(jArr, jArr2, jArr6);
        vj.d(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[4];
        vj.r(jArr3, jArr4, jArr7);
        vj.d(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[2];
        vj.z(jArr5, jArr8);
        return new yo0(jArr8);
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
        long j = (m >>> 32) | (m2 & (-4294967296L));
        return new yo0(new long[]{((j << 57) ^ ((4294967295L & m) | (m2 << 32))) ^ (j << 5), (j >>> 7) ^ (j >>> 59)});
    }

    @Override // defpackage.jn
    public final jn o() {
        long[] jArr = new long[2];
        long[] jArr2 = new long[4];
        vj.t(this.g, jArr2);
        vj.z(jArr2, jArr);
        return new yo0(jArr);
    }

    @Override // defpackage.jn
    public final jn p(jn jnVar, jn jnVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((yo0) jnVar).g;
        long[] jArr3 = ((yo0) jnVar2).g;
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        vj.t(jArr, jArr5);
        vj.d(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[4];
        vj.r(jArr2, jArr3, jArr6);
        vj.d(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[2];
        vj.z(jArr4, jArr7);
        return new yo0(jArr7);
    }

    @Override // defpackage.jn
    public final jn q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[2];
        vj.E(i, this.g, jArr);
        return new yo0(jArr);
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
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                z61.x0((1 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }
}