package defpackage;

import java.math.BigInteger;

/* renamed from: wo0  reason: default package */
public final class wo0 extends jn {
    public static final BigInteger h = vo0.j;
    public int[] g;

    public wo0() {
        this.g = new int[17];
    }

    public wo0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        int[] I = z61.I(521, bigInteger);
        if (z61.C(17, I, da2.P)) {
            for (int i = 0; i < 17; i++) {
                I[i] = 0;
            }
        }
        this.g = I;
    }

    public wo0(int[] iArr) {
        this.g = iArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        int[] iArr = new int[17];
        da2.a(this.g, ((wo0) jnVar).g, iArr);
        return new wo0(iArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        int[] iArr = new int[17];
        int[] iArr2 = this.g;
        int Z = z61.Z(16, iArr2, iArr) + iArr2[16];
        if (Z > 511 || (Z == 511 && z61.C(16, iArr, da2.P))) {
            Z = (z61.a0(iArr) + Z) & 511;
        }
        iArr[16] = Z;
        return new wo0(iArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        int[] iArr = new int[17];
        z61.f0(da2.P, ((wo0) jnVar).g, iArr);
        da2.f(iArr, this.g, iArr);
        return new wo0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wo0) {
            return z61.C(17, this.g, ((wo0) obj).g);
        }
        return false;
    }

    @Override // defpackage.jn
    public final int f() {
        return h.bitLength();
    }

    @Override // defpackage.jn
    public final jn g() {
        int[] iArr = new int[17];
        z61.f0(da2.P, this.g, iArr);
        return new wo0(iArr);
    }

    @Override // defpackage.jn
    public final boolean h() {
        return z61.g0(this.g, 17);
    }

    public final int hashCode() {
        return h.hashCode() ^ j7.g(17, this.g);
    }

    @Override // defpackage.jn
    public final boolean i() {
        return z61.n0(this.g, 17);
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        int[] iArr = new int[17];
        da2.f(this.g, ((wo0) jnVar).g, iArr);
        return new wo0(iArr);
    }

    @Override // defpackage.jn
    public final jn m() {
        int[] iArr = new int[17];
        int[] iArr2 = this.g;
        if (z61.n0(iArr2, 17)) {
            for (int i = 0; i < 17; i++) {
                iArr[i] = 0;
            }
        } else {
            z61.h1(17, da2.P, iArr2, iArr);
        }
        return new wo0(iArr);
    }

    @Override // defpackage.jn
    public final jn n() {
        int[] iArr = this.g;
        if (!z61.n0(iArr, 17) && !z61.g0(iArr, 17)) {
            int[] iArr2 = new int[17];
            int[] iArr3 = new int[17];
            int i = 519;
            int[] iArr4 = new int[33];
            da2.d(iArr, iArr4);
            while (true) {
                da2.g(iArr4, iArr2);
                i--;
                if (i <= 0) {
                    break;
                }
                da2.d(iArr2, iArr4);
            }
            da2.i(iArr2, iArr3);
            if (z61.C(17, iArr, iArr3)) {
                return new wo0(iArr2);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.jn
    public final jn o() {
        int[] iArr = new int[17];
        da2.i(this.g, iArr);
        return new wo0(iArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        int[] iArr = new int[17];
        da2.j(this.g, ((wo0) jnVar).g, iArr);
        return new wo0(iArr);
    }

    @Override // defpackage.jn
    public final boolean s() {
        return (this.g[0] & 1) == 1;
    }

    @Override // defpackage.jn
    public final BigInteger t() {
        return z61.v1(this.g, 17);
    }
}