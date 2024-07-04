package defpackage;

import java.math.BigInteger;

/* renamed from: no0  reason: default package */
public final class no0 extends jn {
    public static final BigInteger h = mo0.j;
    public int[] g;

    public no0() {
        this.g = new int[8];
    }

    public no0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        int[] M = z61.M(bigInteger);
        if (M[7] == -1) {
            int[] iArr = ar.P;
            if (z61.Y(M, iArr)) {
                z61.u1(iArr, M);
            }
        }
        this.g = M;
    }

    public no0(int[] iArr) {
        this.g = iArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        int[] iArr = new int[8];
        if (z61.e(this.g, ((no0) jnVar).g, iArr) != 0 || (iArr[7] == -1 && z61.Y(iArr, ar.P))) {
            z61.f(8, 977, iArr);
        }
        return new no0(iArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        int[] iArr = new int[8];
        if (z61.Z(8, this.g, iArr) != 0 || (iArr[7] == -1 && z61.Y(iArr, ar.P))) {
            z61.f(8, 977, iArr);
        }
        return new no0(iArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        int[] iArr = new int[8];
        z61.f0(ar.P, ((no0) jnVar).g, iArr);
        ar.g(iArr, this.g, iArr);
        return new no0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof no0) {
            return z61.G(this.g, ((no0) obj).g);
        }
        return false;
    }

    @Override // defpackage.jn
    public final int f() {
        return h.bitLength();
    }

    @Override // defpackage.jn
    public final jn g() {
        int[] iArr = new int[8];
        z61.f0(ar.P, this.g, iArr);
        return new no0(iArr);
    }

    @Override // defpackage.jn
    public final boolean h() {
        return z61.k0(this.g);
    }

    public final int hashCode() {
        return h.hashCode() ^ j7.g(8, this.g);
    }

    @Override // defpackage.jn
    public final boolean i() {
        return z61.r0(this.g);
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        int[] iArr = new int[8];
        ar.g(this.g, ((no0) jnVar).g, iArr);
        return new no0(iArr);
    }

    @Override // defpackage.jn
    public final jn m() {
        int[] iArr = new int[8];
        int[] iArr2 = this.g;
        if (z61.r0(iArr2)) {
            z61.C1(iArr);
        } else {
            z61.o1(ar.P, iArr2, iArr);
        }
        return new no0(iArr);
    }

    @Override // defpackage.jn
    public final jn n() {
        int[] iArr = this.g;
        if (z61.r0(iArr) || z61.k0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        ar.j(iArr, iArr2);
        ar.g(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        ar.j(iArr2, iArr3);
        ar.g(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        ar.k(3, iArr3, iArr4);
        ar.g(iArr4, iArr3, iArr4);
        ar.k(3, iArr4, iArr4);
        ar.g(iArr4, iArr3, iArr4);
        ar.k(2, iArr4, iArr4);
        ar.g(iArr4, iArr2, iArr4);
        int[] iArr5 = new int[8];
        ar.k(11, iArr4, iArr5);
        ar.g(iArr5, iArr4, iArr5);
        ar.k(22, iArr5, iArr4);
        ar.g(iArr4, iArr5, iArr4);
        int[] iArr6 = new int[8];
        ar.k(44, iArr4, iArr6);
        ar.g(iArr6, iArr4, iArr6);
        int[] iArr7 = new int[8];
        ar.k(88, iArr6, iArr7);
        ar.g(iArr7, iArr6, iArr7);
        ar.k(44, iArr7, iArr6);
        ar.g(iArr6, iArr4, iArr6);
        ar.k(3, iArr6, iArr4);
        ar.g(iArr4, iArr3, iArr4);
        ar.k(23, iArr4, iArr4);
        ar.g(iArr4, iArr5, iArr4);
        ar.k(6, iArr4, iArr4);
        ar.g(iArr4, iArr2, iArr4);
        ar.k(2, iArr4, iArr4);
        ar.j(iArr4, iArr2);
        if (z61.G(iArr, iArr2)) {
            return new no0(iArr4);
        }
        return null;
    }

    @Override // defpackage.jn
    public final jn o() {
        int[] iArr = new int[8];
        ar.j(this.g, iArr);
        return new no0(iArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        int[] iArr = new int[8];
        ar.l(this.g, ((no0) jnVar).g, iArr);
        return new no0(iArr);
    }

    @Override // defpackage.jn
    public final boolean s() {
        return (this.g[0] & 1) == 1;
    }

    @Override // defpackage.jn
    public final BigInteger t() {
        return z61.z1(this.g);
    }
}