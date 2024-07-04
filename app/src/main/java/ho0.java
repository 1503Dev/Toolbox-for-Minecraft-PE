package defpackage;

import java.math.BigInteger;

/* renamed from: ho0  reason: default package */
public final class ho0 extends jn {
    public static final BigInteger h = go0.j;
    public static final int[] i = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};
    public int[] g;

    public ho0() {
        this.g = new int[7];
    }

    public ho0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        int[] L = z61.L(bigInteger);
        if (L[6] == -1 && z61.X(L, ga1.U)) {
            z61.f(7, 6803, L);
        }
        this.g = L;
    }

    public ho0(int[] iArr) {
        this.g = iArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        int[] iArr = new int[7];
        if (z61.d(this.g, ((ho0) jnVar).g, iArr) != 0 || (iArr[6] == -1 && z61.X(iArr, ga1.U))) {
            z61.f(7, 6803, iArr);
        }
        return new ho0(iArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        int[] iArr = new int[7];
        if (z61.Z(7, this.g, iArr) != 0 || (iArr[6] == -1 && z61.X(iArr, ga1.U))) {
            z61.f(7, 6803, iArr);
        }
        return new ho0(iArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        int[] iArr = new int[7];
        z61.f0(ga1.U, ((ho0) jnVar).g, iArr);
        ga1.m(iArr, this.g, iArr);
        return new ho0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ho0) {
            return z61.F(this.g, ((ho0) obj).g);
        }
        return false;
    }

    @Override // defpackage.jn
    public final int f() {
        return h.bitLength();
    }

    @Override // defpackage.jn
    public final jn g() {
        int[] iArr = new int[7];
        z61.f0(ga1.U, this.g, iArr);
        return new ho0(iArr);
    }

    @Override // defpackage.jn
    public final boolean h() {
        return z61.j0(this.g);
    }

    public final int hashCode() {
        return h.hashCode() ^ j7.g(7, this.g);
    }

    @Override // defpackage.jn
    public final boolean i() {
        return z61.q0(this.g);
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        int[] iArr = new int[7];
        ga1.m(this.g, ((ho0) jnVar).g, iArr);
        return new ho0(iArr);
    }

    @Override // defpackage.jn
    public final jn m() {
        int[] iArr = new int[7];
        int[] iArr2 = this.g;
        if (z61.q0(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
            iArr[6] = 0;
        } else {
            z61.n1(ga1.U, iArr2, iArr);
        }
        return new ho0(iArr);
    }

    @Override // defpackage.jn
    public final jn n() {
        int[] iArr = this.g;
        if (z61.q0(iArr) || z61.j0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        ga1.p(iArr, iArr2);
        ga1.m(iArr2, iArr, iArr2);
        ga1.p(iArr2, iArr2);
        ga1.m(iArr2, iArr, iArr2);
        int[] iArr3 = new int[7];
        ga1.p(iArr2, iArr3);
        ga1.m(iArr3, iArr, iArr3);
        int[] iArr4 = new int[7];
        ga1.q(4, iArr3, iArr4);
        ga1.m(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[7];
        ga1.q(3, iArr4, iArr5);
        ga1.m(iArr5, iArr2, iArr5);
        ga1.q(8, iArr5, iArr5);
        ga1.m(iArr5, iArr4, iArr5);
        ga1.q(4, iArr5, iArr4);
        ga1.m(iArr4, iArr3, iArr4);
        ga1.q(19, iArr4, iArr3);
        ga1.m(iArr3, iArr5, iArr3);
        int[] iArr6 = new int[7];
        ga1.q(42, iArr3, iArr6);
        ga1.m(iArr6, iArr3, iArr6);
        ga1.q(23, iArr6, iArr3);
        ga1.m(iArr3, iArr4, iArr3);
        ga1.q(84, iArr3, iArr4);
        ga1.m(iArr4, iArr6, iArr4);
        ga1.q(20, iArr4, iArr4);
        ga1.m(iArr4, iArr5, iArr4);
        ga1.q(3, iArr4, iArr4);
        ga1.m(iArr4, iArr, iArr4);
        ga1.q(2, iArr4, iArr4);
        ga1.m(iArr4, iArr, iArr4);
        ga1.q(4, iArr4, iArr4);
        ga1.m(iArr4, iArr2, iArr4);
        ga1.p(iArr4, iArr4);
        ga1.p(iArr4, iArr6);
        if (z61.F(iArr, iArr6)) {
            return new ho0(iArr4);
        }
        ga1.m(iArr4, i, iArr4);
        ga1.p(iArr4, iArr6);
        if (z61.F(iArr, iArr6)) {
            return new ho0(iArr4);
        }
        return null;
    }

    @Override // defpackage.jn
    public final jn o() {
        int[] iArr = new int[7];
        ga1.p(this.g, iArr);
        return new ho0(iArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        int[] iArr = new int[7];
        ga1.r(this.g, ((ho0) jnVar).g, iArr);
        return new ho0(iArr);
    }

    @Override // defpackage.jn
    public final boolean s() {
        return (this.g[0] & 1) == 1;
    }

    @Override // defpackage.jn
    public final BigInteger t() {
        return z61.y1(this.g);
    }
}