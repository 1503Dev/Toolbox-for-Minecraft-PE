package defpackage;

import java.math.BigInteger;

/* renamed from: mq0  reason: default package */
public final class mq0 extends jn {
    public long[] g;

    public mq0() {
        this.g = new long[9];
    }

    public mq0(BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= 571) {
            if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 576) {
                long[] jArr = new long[9];
                int i = 0;
                while (bigInteger.signum() != 0) {
                    jArr[i] = bigInteger.longValue();
                    bigInteger = bigInteger.shiftRight(64);
                    i++;
                }
                mh.s(0, jArr);
                this.g = jArr;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
    }

    public mq0(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        long[] jArr = new long[9];
        mh.a(this.g, ((mq0) jnVar).g, jArr);
        return new mq0(jArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        long[] jArr = new long[9];
        long[] jArr2 = this.g;
        jArr[0] = jArr2[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr[i] = jArr2[i];
        }
        return new mq0(jArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        return j(jnVar.g());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mq0) {
            long[] jArr = this.g;
            long[] jArr2 = ((mq0) obj).g;
            for (int i = 8; i >= 0; i--) {
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
        return 571;
    }

    @Override // defpackage.jn
    public final jn g() {
        long[] jArr = new long[9];
        long[] jArr2 = this.g;
        if (!z61.u0(jArr2)) {
            long[] jArr3 = new long[9];
            long[] jArr4 = new long[9];
            long[] jArr5 = new long[9];
            mh.u(jArr2, jArr5);
            mh.u(jArr5, jArr3);
            mh.u(jArr3, jArr4);
            mh.l(jArr3, jArr4, jArr3);
            mh.w(2, jArr3, jArr4);
            mh.l(jArr3, jArr4, jArr3);
            mh.l(jArr3, jArr5, jArr3);
            mh.w(5, jArr3, jArr4);
            mh.l(jArr3, jArr4, jArr3);
            mh.w(5, jArr4, jArr4);
            mh.l(jArr3, jArr4, jArr3);
            mh.w(15, jArr3, jArr4);
            mh.l(jArr3, jArr4, jArr5);
            mh.w(30, jArr5, jArr3);
            mh.w(30, jArr3, jArr4);
            mh.l(jArr3, jArr4, jArr3);
            mh.w(60, jArr3, jArr4);
            mh.l(jArr3, jArr4, jArr3);
            mh.w(60, jArr4, jArr4);
            mh.l(jArr3, jArr4, jArr3);
            mh.w(180, jArr3, jArr4);
            mh.l(jArr3, jArr4, jArr3);
            mh.w(180, jArr4, jArr4);
            mh.l(jArr3, jArr4, jArr3);
            mh.l(jArr3, jArr5, jArr);
            return new mq0(jArr);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.jn
    public final boolean h() {
        long[] jArr = this.g;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return j7.j(this.g, 9) ^ 5711052;
    }

    @Override // defpackage.jn
    public final boolean i() {
        return z61.u0(this.g);
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        long[] jArr = new long[9];
        mh.l(this.g, ((mq0) jnVar).g, jArr);
        return new mq0(jArr);
    }

    @Override // defpackage.jn
    public final jn k(jn jnVar, jn jnVar2, jn jnVar3) {
        return l(jnVar, jnVar2, jnVar3);
    }

    @Override // defpackage.jn
    public final jn l(jn jnVar, jn jnVar2, jn jnVar3) {
        long[] jArr = this.g;
        long[] jArr2 = ((mq0) jnVar).g;
        long[] jArr3 = ((mq0) jnVar2).g;
        long[] jArr4 = ((mq0) jnVar3).g;
        long[] jArr5 = new long[18];
        mh.n(jArr, jArr2, jArr5);
        mh.n(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[9];
        mh.q(jArr5, jArr6);
        return new mq0(jArr6);
    }

    @Override // defpackage.jn
    public final jn m() {
        return this;
    }

    @Override // defpackage.jn
    public final jn n() {
        long[] jArr = new long[9];
        long[] jArr2 = this.g;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long m = ar.m(jArr2[i]);
            i = i3 + 1;
            long m2 = ar.m(jArr2[i3]);
            jArr3[i2] = (4294967295L & m) | (m2 << 32);
            jArr4[i2] = (m >>> 32) | ((-4294967296L) & m2);
        }
        long m3 = ar.m(jArr2[i]);
        jArr3[4] = 4294967295L & m3;
        jArr4[4] = m3 >>> 32;
        mh.l(jArr4, mh.P, jArr);
        mh.a(jArr, jArr3, jArr);
        return new mq0(jArr);
    }

    @Override // defpackage.jn
    public final jn o() {
        long[] jArr = new long[9];
        mh.u(this.g, jArr);
        return new mq0(jArr);
    }

    @Override // defpackage.jn
    public final jn p(jn jnVar, jn jnVar2) {
        long[] jArr = this.g;
        long[] jArr2 = ((mq0) jnVar).g;
        long[] jArr3 = ((mq0) jnVar2).g;
        long[] jArr4 = new long[18];
        long[] jArr5 = new long[18];
        mh.j(jArr, jArr5);
        for (int i = 0; i < 18; i++) {
            jArr4[i] = jArr4[i] ^ jArr5[i];
        }
        mh.n(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[9];
        mh.q(jArr4, jArr6);
        return new mq0(jArr6);
    }

    @Override // defpackage.jn
    public final jn q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[9];
        mh.w(i, this.g, jArr);
        return new mq0(jArr);
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
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = jArr[i];
            if (j != 0) {
                z61.x0((8 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }
}