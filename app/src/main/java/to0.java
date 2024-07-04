package defpackage;

import java.math.BigInteger;

/* renamed from: to0  reason: default package */
public final class to0 extends jn {
    public static final BigInteger h = so0.j;
    public int[] g;

    public to0() {
        this.g = new int[12];
    }

    public to0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        int[] I = z61.I(384, bigInteger);
        if (I[11] == -1) {
            int[] iArr = dt4.P;
            if (z61.T(12, I, iArr)) {
                z61.q1(12, iArr, I);
            }
        }
        this.g = I;
    }

    public to0(int[] iArr) {
        this.g = iArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        int[] iArr = new int[12];
        if (z61.a(12, this.g, ((to0) jnVar).g, iArr) != 0 || (iArr[11] == -1 && z61.T(12, iArr, dt4.P))) {
            dt4.a(iArr);
        }
        return new to0(iArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        int[] iArr = new int[12];
        if (z61.Z(12, this.g, iArr) != 0 || (iArr[11] == -1 && z61.T(12, iArr, dt4.P))) {
            dt4.a(iArr);
        }
        return new to0(iArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        int[] iArr = new int[12];
        z61.f0(dt4.P, ((to0) jnVar).g, iArr);
        dt4.b(iArr, this.g, iArr);
        return new to0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof to0) {
            return z61.C(12, this.g, ((to0) obj).g);
        }
        return false;
    }

    @Override // defpackage.jn
    public final int f() {
        return h.bitLength();
    }

    @Override // defpackage.jn
    public final jn g() {
        int[] iArr = new int[12];
        z61.f0(dt4.P, this.g, iArr);
        return new to0(iArr);
    }

    @Override // defpackage.jn
    public final boolean h() {
        return z61.g0(this.g, 12);
    }

    public final int hashCode() {
        return h.hashCode() ^ j7.g(12, this.g);
    }

    @Override // defpackage.jn
    public final boolean i() {
        return z61.n0(this.g, 12);
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        int[] iArr = new int[12];
        dt4.b(this.g, ((to0) jnVar).g, iArr);
        return new to0(iArr);
    }

    @Override // defpackage.jn
    public final jn m() {
        int[] iArr = new int[12];
        int[] iArr2 = this.g;
        if (z61.n0(iArr2, 12)) {
            for (int i = 0; i < 12; i++) {
                iArr[i] = 0;
            }
        } else {
            z61.h1(12, dt4.P, iArr2, iArr);
        }
        return new to0(iArr);
    }

    @Override // defpackage.jn
    public final jn n() {
        int[] iArr = this.g;
        if (z61.n0(iArr, 12) || z61.g0(iArr, 12)) {
            return this;
        }
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        dt4.g(iArr, iArr2);
        dt4.b(iArr2, iArr, iArr2);
        dt4.h(2, iArr2, iArr3);
        dt4.b(iArr3, iArr2, iArr3);
        dt4.g(iArr3, iArr3);
        dt4.b(iArr3, iArr, iArr3);
        dt4.h(5, iArr3, iArr4);
        dt4.b(iArr4, iArr3, iArr4);
        dt4.h(5, iArr4, iArr5);
        dt4.b(iArr5, iArr3, iArr5);
        dt4.h(15, iArr5, iArr3);
        dt4.b(iArr3, iArr5, iArr3);
        dt4.h(2, iArr3, iArr4);
        dt4.b(iArr2, iArr4, iArr2);
        dt4.h(28, iArr4, iArr4);
        dt4.b(iArr3, iArr4, iArr3);
        dt4.h(60, iArr3, iArr4);
        dt4.b(iArr4, iArr3, iArr4);
        dt4.h(120, iArr4, iArr3);
        dt4.b(iArr3, iArr4, iArr3);
        dt4.h(15, iArr3, iArr3);
        dt4.b(iArr3, iArr5, iArr3);
        dt4.h(33, iArr3, iArr3);
        dt4.b(iArr3, iArr2, iArr3);
        dt4.h(64, iArr3, iArr3);
        dt4.b(iArr3, iArr, iArr3);
        dt4.h(30, iArr3, iArr2);
        dt4.g(iArr2, iArr3);
        if (z61.C(12, iArr, iArr3)) {
            return new to0(iArr2);
        }
        return null;
    }

    @Override // defpackage.jn
    public final jn o() {
        int[] iArr = new int[12];
        dt4.g(this.g, iArr);
        return new to0(iArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        int[] iArr = new int[12];
        dt4.i(this.g, ((to0) jnVar).g, iArr);
        return new to0(iArr);
    }

    @Override // defpackage.jn
    public final boolean s() {
        return (this.g[0] & 1) == 1;
    }

    @Override // defpackage.jn
    public final BigInteger t() {
        return z61.v1(this.g, 12);
    }
}