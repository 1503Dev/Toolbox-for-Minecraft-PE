package defpackage;

import java.math.BigInteger;

/* renamed from: bn0  reason: default package */
public final class bn0 extends jn {
    public static final BigInteger h = an0.j;
    public int[] g;

    public bn0() {
        this.g = new int[8];
    }

    public bn0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        int[] M = z61.M(bigInteger);
        if ((M[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = yf.P;
            if (z61.Y(M, iArr)) {
                z61.u1(iArr, M);
            }
        }
        this.g = M;
    }

    public bn0(int[] iArr) {
        this.g = iArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        int[] iArr = new int[8];
        if (z61.e(this.g, ((bn0) jnVar).g, iArr) != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && z61.Y(iArr, yf.P))) {
            yf.b(iArr);
        }
        return new bn0(iArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        int[] iArr = new int[8];
        if (z61.Z(8, this.g, iArr) != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && z61.Y(iArr, yf.P))) {
            yf.b(iArr);
        }
        return new bn0(iArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        int[] iArr = new int[8];
        z61.f0(yf.P, ((bn0) jnVar).g, iArr);
        yf.f(iArr, this.g, iArr);
        return new bn0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bn0) {
            return z61.G(this.g, ((bn0) obj).g);
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
        z61.f0(yf.P, this.g, iArr);
        return new bn0(iArr);
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
        yf.f(this.g, ((bn0) jnVar).g, iArr);
        return new bn0(iArr);
    }

    @Override // defpackage.jn
    public final jn m() {
        int[] iArr = new int[8];
        int[] iArr2 = this.g;
        if (z61.r0(iArr2)) {
            z61.C1(iArr);
        } else {
            z61.o1(yf.P, iArr2, iArr);
        }
        return new bn0(iArr);
    }

    @Override // defpackage.jn
    public final jn n() {
        int[] iArr = this.g;
        if (z61.r0(iArr) || z61.k0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        yf.i(iArr, iArr2);
        yf.f(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        yf.j(2, iArr2, iArr3);
        yf.f(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[8];
        yf.j(2, iArr3, iArr4);
        yf.f(iArr4, iArr2, iArr4);
        yf.j(6, iArr4, iArr2);
        yf.f(iArr2, iArr4, iArr2);
        int[] iArr5 = new int[8];
        yf.j(12, iArr2, iArr5);
        yf.f(iArr5, iArr2, iArr5);
        yf.j(6, iArr5, iArr2);
        yf.f(iArr2, iArr4, iArr2);
        yf.i(iArr2, iArr4);
        yf.f(iArr4, iArr, iArr4);
        yf.j(31, iArr4, iArr5);
        yf.f(iArr5, iArr4, iArr2);
        yf.j(32, iArr5, iArr5);
        yf.f(iArr5, iArr2, iArr5);
        yf.j(62, iArr5, iArr5);
        yf.f(iArr5, iArr2, iArr5);
        yf.j(4, iArr5, iArr5);
        yf.f(iArr5, iArr3, iArr5);
        yf.j(32, iArr5, iArr5);
        yf.f(iArr5, iArr, iArr5);
        yf.j(62, iArr5, iArr5);
        yf.i(iArr5, iArr3);
        if (z61.G(iArr, iArr3)) {
            return new bn0(iArr5);
        }
        return null;
    }

    @Override // defpackage.jn
    public final jn o() {
        int[] iArr = new int[8];
        yf.i(this.g, iArr);
        return new bn0(iArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        int[] iArr = new int[8];
        yf.k(this.g, ((bn0) jnVar).g, iArr);
        return new bn0(iArr);
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