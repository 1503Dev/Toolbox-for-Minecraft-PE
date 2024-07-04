package defpackage;

import java.math.BigInteger;

/* renamed from: qo0  reason: default package */
public final class qo0 extends jn {
    public static final BigInteger h = po0.j;
    public int[] g;

    public qo0() {
        this.g = new int[8];
    }

    public qo0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        int[] M = z61.M(bigInteger);
        if (M[7] == -1) {
            int[] iArr = n42.P;
            if (z61.Y(M, iArr)) {
                z61.u1(iArr, M);
            }
        }
        this.g = M;
    }

    public qo0(int[] iArr) {
        this.g = iArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        int[] iArr = new int[8];
        if (z61.e(this.g, ((qo0) jnVar).g, iArr) != 0 || (iArr[7] == -1 && z61.Y(iArr, n42.P))) {
            n42.a(iArr);
        }
        return new qo0(iArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        int[] iArr = new int[8];
        if (z61.Z(8, this.g, iArr) != 0 || (iArr[7] == -1 && z61.Y(iArr, n42.P))) {
            n42.a(iArr);
        }
        return new qo0(iArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        int[] iArr = new int[8];
        z61.f0(n42.P, ((qo0) jnVar).g, iArr);
        n42.i(iArr, this.g, iArr);
        return new qo0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qo0) {
            return z61.G(this.g, ((qo0) obj).g);
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
        z61.f0(n42.P, this.g, iArr);
        return new qo0(iArr);
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
        n42.i(this.g, ((qo0) jnVar).g, iArr);
        return new qo0(iArr);
    }

    @Override // defpackage.jn
    public final jn m() {
        int[] iArr = new int[8];
        int[] iArr2 = this.g;
        if (z61.r0(iArr2)) {
            z61.C1(iArr);
        } else {
            z61.o1(n42.P, iArr2, iArr);
        }
        return new qo0(iArr);
    }

    @Override // defpackage.jn
    public final jn n() {
        int[] iArr = this.g;
        if (z61.r0(iArr) || z61.k0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        n42.m(iArr, iArr2);
        n42.i(iArr2, iArr, iArr2);
        n42.n(2, iArr2, iArr3);
        n42.i(iArr3, iArr2, iArr3);
        n42.n(4, iArr3, iArr2);
        n42.i(iArr2, iArr3, iArr2);
        n42.n(8, iArr2, iArr3);
        n42.i(iArr3, iArr2, iArr3);
        n42.n(16, iArr3, iArr2);
        n42.i(iArr2, iArr3, iArr2);
        n42.n(32, iArr2, iArr2);
        n42.i(iArr2, iArr, iArr2);
        n42.n(96, iArr2, iArr2);
        n42.i(iArr2, iArr, iArr2);
        n42.n(94, iArr2, iArr2);
        n42.m(iArr2, iArr3);
        if (z61.G(iArr, iArr3)) {
            return new qo0(iArr2);
        }
        return null;
    }

    @Override // defpackage.jn
    public final jn o() {
        int[] iArr = new int[8];
        n42.m(this.g, iArr);
        return new qo0(iArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        int[] iArr = new int[8];
        n42.o(this.g, ((qo0) jnVar).g, iArr);
        return new qo0(iArr);
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