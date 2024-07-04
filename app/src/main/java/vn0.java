package defpackage;

import java.math.BigInteger;

/* renamed from: vn0  reason: default package */
public final class vn0 extends jn {
    public static final BigInteger h = un0.j;
    public int[] g;

    public vn0() {
        this.g = new int[5];
    }

    public vn0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        int[] J = z61.J(bigInteger);
        if (J[4] == -1) {
            int[] iArr = vj.P;
            if (z61.V(J, iArr)) {
                z61.s1(iArr, J);
            }
        }
        this.g = J;
    }

    public vn0(int[] iArr) {
        this.g = iArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        int[] iArr = new int[5];
        if (z61.b(this.g, ((vn0) jnVar).g, iArr) != 0 || (iArr[4] == -1 && z61.V(iArr, vj.P))) {
            z61.u(5, -2147483647, iArr);
        }
        return new vn0(iArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        int[] iArr = new int[5];
        if (z61.Z(5, this.g, iArr) != 0 || (iArr[4] == -1 && z61.V(iArr, vj.P))) {
            z61.u(5, -2147483647, iArr);
        }
        return new vn0(iArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        int[] iArr = new int[5];
        z61.f0(vj.P, ((vn0) jnVar).g, iArr);
        vj.v(iArr, this.g, iArr);
        return new vn0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vn0) {
            return z61.D(this.g, ((vn0) obj).g);
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
        z61.f0(vj.P, this.g, iArr);
        return new vn0(iArr);
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
        vj.v(this.g, ((vn0) jnVar).g, iArr);
        return new vn0(iArr);
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
            z61.k1(vj.P, iArr2, iArr);
        }
        return new vn0(iArr);
    }

    @Override // defpackage.jn
    public final jn n() {
        int[] iArr = this.g;
        if (z61.o0(iArr) || z61.h0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        vj.C(iArr, iArr2);
        vj.v(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        vj.D(2, iArr2, iArr3);
        vj.v(iArr3, iArr2, iArr3);
        vj.D(4, iArr3, iArr2);
        vj.v(iArr2, iArr3, iArr2);
        vj.D(8, iArr2, iArr3);
        vj.v(iArr3, iArr2, iArr3);
        vj.D(16, iArr3, iArr2);
        vj.v(iArr2, iArr3, iArr2);
        vj.D(32, iArr2, iArr3);
        vj.v(iArr3, iArr2, iArr3);
        vj.D(64, iArr3, iArr2);
        vj.v(iArr2, iArr3, iArr2);
        vj.C(iArr2, iArr3);
        vj.v(iArr3, iArr, iArr3);
        vj.D(29, iArr3, iArr3);
        vj.C(iArr3, iArr2);
        if (z61.D(iArr, iArr2)) {
            return new vn0(iArr3);
        }
        return null;
    }

    @Override // defpackage.jn
    public final jn o() {
        int[] iArr = new int[5];
        vj.C(this.g, iArr);
        return new vn0(iArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        int[] iArr = new int[5];
        vj.F(this.g, ((vn0) jnVar).g, iArr);
        return new vn0(iArr);
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