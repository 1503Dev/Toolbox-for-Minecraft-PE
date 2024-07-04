package defpackage;

import java.math.BigInteger;

/* renamed from: eo0  reason: default package */
public final class eo0 extends jn {
    public static final BigInteger h = do0.j;
    public int[] g;

    public eo0() {
        this.g = new int[6];
    }

    public eo0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        int[] K = z61.K(bigInteger);
        if (K[5] == -1) {
            int[] iArr = o7.P;
            if (z61.W(K, iArr)) {
                z61.t1(iArr, K);
            }
        }
        this.g = K;
    }

    public eo0(int[] iArr) {
        this.g = iArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        int[] iArr = new int[6];
        if (z61.c(this.g, ((eo0) jnVar).g, iArr) != 0 || (iArr[5] == -1 && z61.W(iArr, o7.P))) {
            o7.h(iArr);
        }
        return new eo0(iArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        int[] iArr = new int[6];
        if (z61.Z(6, this.g, iArr) != 0 || (iArr[5] == -1 && z61.W(iArr, o7.P))) {
            o7.h(iArr);
        }
        return new eo0(iArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        int[] iArr = new int[6];
        z61.f0(o7.P, ((eo0) jnVar).g, iArr);
        o7.i(iArr, this.g, iArr);
        return new eo0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eo0) {
            return z61.E(this.g, ((eo0) obj).g);
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
        z61.f0(o7.P, this.g, iArr);
        return new eo0(iArr);
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
        o7.i(this.g, ((eo0) jnVar).g, iArr);
        return new eo0(iArr);
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
            z61.m1(o7.P, iArr2, iArr);
        }
        return new eo0(iArr);
    }

    @Override // defpackage.jn
    public final jn n() {
        int[] iArr = this.g;
        if (z61.p0(iArr) || z61.i0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        o7.l(iArr, iArr2);
        o7.i(iArr2, iArr, iArr2);
        o7.m(2, iArr2, iArr3);
        o7.i(iArr3, iArr2, iArr3);
        o7.m(4, iArr3, iArr2);
        o7.i(iArr2, iArr3, iArr2);
        o7.m(8, iArr2, iArr3);
        o7.i(iArr3, iArr2, iArr3);
        o7.m(16, iArr3, iArr2);
        o7.i(iArr2, iArr3, iArr2);
        o7.m(32, iArr2, iArr3);
        o7.i(iArr3, iArr2, iArr3);
        o7.m(64, iArr3, iArr2);
        o7.i(iArr2, iArr3, iArr2);
        o7.m(62, iArr2, iArr2);
        o7.l(iArr2, iArr3);
        if (z61.E(iArr, iArr3)) {
            return new eo0(iArr2);
        }
        return null;
    }

    @Override // defpackage.jn
    public final jn o() {
        int[] iArr = new int[6];
        o7.l(this.g, iArr);
        return new eo0(iArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        int[] iArr = new int[6];
        o7.n(this.g, ((eo0) jnVar).g, iArr);
        return new eo0(iArr);
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