package defpackage;

import java.math.BigInteger;

/* renamed from: bo0  reason: default package */
public final class bo0 extends jn {
    public static final BigInteger h = ao0.j;
    public int[] g;

    public bo0() {
        this.g = new int[6];
    }

    public bo0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        int[] K = z61.K(bigInteger);
        if (K[5] == -1) {
            int[] iArr = eg4.P;
            if (z61.W(K, iArr)) {
                z61.t1(iArr, K);
            }
        }
        this.g = K;
    }

    public bo0(int[] iArr) {
        this.g = iArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        int[] iArr = new int[6];
        if (z61.c(this.g, ((bo0) jnVar).g, iArr) != 0 || (iArr[5] == -1 && z61.W(iArr, eg4.P))) {
            z61.f(6, 4553, iArr);
        }
        return new bo0(iArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        int[] iArr = new int[6];
        if (z61.Z(6, this.g, iArr) != 0 || (iArr[5] == -1 && z61.W(iArr, eg4.P))) {
            z61.f(6, 4553, iArr);
        }
        return new bo0(iArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        int[] iArr = new int[6];
        z61.f0(eg4.P, ((bo0) jnVar).g, iArr);
        eg4.b(iArr, this.g, iArr);
        return new bo0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bo0) {
            return z61.E(this.g, ((bo0) obj).g);
        }
        return false;
    }

    @Override // defpackage.jn
    public final int f() {
        return h.bitLength();
    }

    @Override // defpackage.jn
    public final jn g() {
        int[] iArr = new int[6];
        z61.f0(eg4.P, this.g, iArr);
        return new bo0(iArr);
    }

    @Override // defpackage.jn
    public final boolean h() {
        return z61.i0(this.g);
    }

    public final int hashCode() {
        return h.hashCode() ^ j7.g(6, this.g);
    }

    @Override // defpackage.jn
    public final boolean i() {
        return z61.p0(this.g);
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        int[] iArr = new int[6];
        eg4.b(this.g, ((bo0) jnVar).g, iArr);
        return new bo0(iArr);
    }

    @Override // defpackage.jn
    public final jn m() {
        int[] iArr = new int[6];
        int[] iArr2 = this.g;
        if (z61.p0(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
        } else {
            z61.m1(eg4.P, iArr2, iArr);
        }
        return new bo0(iArr);
    }

    @Override // defpackage.jn
    public final jn n() {
        int[] iArr = this.g;
        if (z61.p0(iArr) || z61.i0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        eg4.g(iArr, iArr2);
        eg4.b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        eg4.g(iArr2, iArr3);
        eg4.b(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        eg4.i(3, iArr3, iArr4);
        eg4.b(iArr4, iArr3, iArr4);
        eg4.i(2, iArr4, iArr4);
        eg4.b(iArr4, iArr2, iArr4);
        eg4.i(8, iArr4, iArr2);
        eg4.b(iArr2, iArr4, iArr2);
        eg4.i(3, iArr2, iArr4);
        eg4.b(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        eg4.i(16, iArr4, iArr5);
        eg4.b(iArr5, iArr2, iArr5);
        eg4.i(35, iArr5, iArr2);
        eg4.b(iArr2, iArr5, iArr2);
        eg4.i(70, iArr2, iArr5);
        eg4.b(iArr5, iArr2, iArr5);
        eg4.i(19, iArr5, iArr2);
        eg4.b(iArr2, iArr4, iArr2);
        eg4.i(20, iArr2, iArr2);
        eg4.b(iArr2, iArr4, iArr2);
        eg4.i(4, iArr2, iArr2);
        eg4.b(iArr2, iArr3, iArr2);
        eg4.i(6, iArr2, iArr2);
        eg4.b(iArr2, iArr3, iArr2);
        eg4.g(iArr2, iArr2);
        eg4.g(iArr2, iArr3);
        if (z61.E(iArr, iArr3)) {
            return new bo0(iArr2);
        }
        return null;
    }

    @Override // defpackage.jn
    public final jn o() {
        int[] iArr = new int[6];
        eg4.g(this.g, iArr);
        return new bo0(iArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        int[] iArr = new int[6];
        eg4.j(this.g, ((bo0) jnVar).g, iArr);
        return new bo0(iArr);
    }

    @Override // defpackage.jn
    public final boolean s() {
        return (this.g[0] & 1) == 1;
    }

    @Override // defpackage.jn
    public final BigInteger t() {
        return z61.x1(this.g);
    }
}