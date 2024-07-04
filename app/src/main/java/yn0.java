package defpackage;

import java.math.BigInteger;

/* renamed from: yn0  reason: default package */
public final class yn0 extends jn {
    public static final BigInteger h = xn0.j;
    public int[] g;

    public yn0() {
        this.g = new int[5];
    }

    public yn0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        int[] J = z61.J(bigInteger);
        if (J[4] == -1) {
            int[] iArr = h50.P;
            if (z61.V(J, iArr)) {
                z61.s1(iArr, J);
            }
        }
        this.g = J;
    }

    public yn0(int[] iArr) {
        this.g = iArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        int[] iArr = new int[5];
        if (z61.b(this.g, ((yn0) jnVar).g, iArr) != 0 || (iArr[4] == -1 && z61.V(iArr, h50.P))) {
            z61.f(5, 21389, iArr);
        }
        return new yn0(iArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        int[] iArr = new int[5];
        if (z61.Z(5, this.g, iArr) != 0 || (iArr[4] == -1 && z61.V(iArr, h50.P))) {
            z61.f(5, 21389, iArr);
        }
        return new yn0(iArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        int[] iArr = new int[5];
        z61.f0(h50.P, ((yn0) jnVar).g, iArr);
        h50.k(iArr, this.g, iArr);
        return new yn0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yn0) {
            return z61.D(this.g, ((yn0) obj).g);
        }
        return false;
    }

    @Override // defpackage.jn
    public final int f() {
        return h.bitLength();
    }

    @Override // defpackage.jn
    public final jn g() {
        int[] iArr = new int[5];
        z61.f0(h50.P, this.g, iArr);
        return new yn0(iArr);
    }

    @Override // defpackage.jn
    public final boolean h() {
        return z61.h0(this.g);
    }

    public final int hashCode() {
        return h.hashCode() ^ j7.g(5, this.g);
    }

    @Override // defpackage.jn
    public final boolean i() {
        return z61.o0(this.g);
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        int[] iArr = new int[5];
        h50.k(this.g, ((yn0) jnVar).g, iArr);
        return new yn0(iArr);
    }

    @Override // defpackage.jn
    public final jn m() {
        int[] iArr = new int[5];
        int[] iArr2 = this.g;
        if (z61.o0(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
        } else {
            z61.k1(h50.P, iArr2, iArr);
        }
        return new yn0(iArr);
    }

    @Override // defpackage.jn
    public final jn n() {
        int[] iArr = this.g;
        if (z61.o0(iArr) || z61.h0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        h50.o(iArr, iArr2);
        h50.k(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        h50.o(iArr2, iArr3);
        h50.k(iArr3, iArr, iArr3);
        int[] iArr4 = new int[5];
        h50.o(iArr3, iArr4);
        h50.k(iArr4, iArr, iArr4);
        int[] iArr5 = new int[5];
        h50.p(3, iArr4, iArr5);
        h50.k(iArr5, iArr3, iArr5);
        h50.p(7, iArr5, iArr4);
        h50.k(iArr4, iArr5, iArr4);
        h50.p(3, iArr4, iArr5);
        h50.k(iArr5, iArr3, iArr5);
        int[] iArr6 = new int[5];
        h50.p(14, iArr5, iArr6);
        h50.k(iArr6, iArr4, iArr6);
        h50.p(31, iArr6, iArr4);
        h50.k(iArr4, iArr6, iArr4);
        h50.p(62, iArr4, iArr6);
        h50.k(iArr6, iArr4, iArr6);
        h50.p(3, iArr6, iArr4);
        h50.k(iArr4, iArr3, iArr4);
        h50.p(18, iArr4, iArr4);
        h50.k(iArr4, iArr5, iArr4);
        h50.p(2, iArr4, iArr4);
        h50.k(iArr4, iArr, iArr4);
        h50.p(3, iArr4, iArr4);
        h50.k(iArr4, iArr2, iArr4);
        h50.p(6, iArr4, iArr4);
        h50.k(iArr4, iArr3, iArr4);
        h50.p(2, iArr4, iArr4);
        h50.k(iArr4, iArr, iArr4);
        h50.o(iArr4, iArr2);
        if (z61.D(iArr, iArr2)) {
            return new yn0(iArr4);
        }
        return null;
    }

    @Override // defpackage.jn
    public final jn o() {
        int[] iArr = new int[5];
        h50.o(this.g, iArr);
        return new yn0(iArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        int[] iArr = new int[5];
        h50.q(this.g, ((yn0) jnVar).g, iArr);
        return new yn0(iArr);
    }

    @Override // defpackage.jn
    public final boolean s() {
        return (this.g[0] & 1) == 1;
    }

    @Override // defpackage.jn
    public final BigInteger t() {
        return z61.w1(this.g);
    }
}