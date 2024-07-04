package defpackage;

import java.math.BigInteger;

/* renamed from: dh  reason: default package */
public final class dh extends jn {
    public static final BigInteger h = ch.j;
    public static final int[] i = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    public int[] g;

    public dh() {
        this.g = new int[8];
    }

    public dh(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        int[] M = z61.M(bigInteger);
        while (true) {
            int[] iArr = vx.c;
            if (!z61.Y(M, iArr)) {
                this.g = M;
                return;
            }
            z61.u1(iArr, M);
        }
    }

    public dh(int[] iArr) {
        this.g = iArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        int[] iArr = new int[8];
        z61.e(this.g, ((dh) jnVar).g, iArr);
        if (z61.Y(iArr, vx.c)) {
            vx.s(iArr);
        }
        return new dh(iArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        int[] iArr = new int[8];
        z61.Z(8, this.g, iArr);
        if (z61.Y(iArr, vx.c)) {
            vx.s(iArr);
        }
        return new dh(iArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        int[] iArr = new int[8];
        z61.f0(vx.c, ((dh) jnVar).g, iArr);
        vx.k(iArr, this.g, iArr);
        return new dh(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dh) {
            return z61.G(this.g, ((dh) obj).g);
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
        z61.f0(vx.c, this.g, iArr);
        return new dh(iArr);
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
        vx.k(this.g, ((dh) jnVar).g, iArr);
        return new dh(iArr);
    }

    @Override // defpackage.jn
    public final jn m() {
        int[] iArr = new int[8];
        int[] iArr2 = this.g;
        if (z61.r0(iArr2)) {
            z61.C1(iArr);
        } else {
            z61.o1(vx.c, iArr2, iArr);
        }
        return new dh(iArr);
    }

    @Override // defpackage.jn
    public final jn n() {
        int[] iArr = this.g;
        if (z61.r0(iArr) || z61.k0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        vx.p(iArr, iArr2);
        vx.k(iArr2, iArr, iArr2);
        vx.p(iArr2, iArr2);
        vx.k(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        vx.p(iArr2, iArr3);
        vx.k(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        vx.q(3, iArr3, iArr4);
        vx.k(iArr4, iArr2, iArr4);
        vx.q(4, iArr4, iArr2);
        vx.k(iArr2, iArr3, iArr2);
        vx.q(4, iArr2, iArr4);
        vx.k(iArr4, iArr3, iArr4);
        vx.q(15, iArr4, iArr3);
        vx.k(iArr3, iArr4, iArr3);
        vx.q(30, iArr3, iArr4);
        vx.k(iArr4, iArr3, iArr4);
        vx.q(60, iArr4, iArr3);
        vx.k(iArr3, iArr4, iArr3);
        vx.q(11, iArr3, iArr4);
        vx.k(iArr4, iArr2, iArr4);
        vx.q(120, iArr4, iArr2);
        vx.k(iArr2, iArr3, iArr2);
        vx.p(iArr2, iArr2);
        vx.p(iArr2, iArr3);
        if (z61.G(iArr, iArr3)) {
            return new dh(iArr2);
        }
        vx.k(iArr2, i, iArr2);
        vx.p(iArr2, iArr3);
        if (z61.G(iArr, iArr3)) {
            return new dh(iArr2);
        }
        return null;
    }

    @Override // defpackage.jn
    public final jn o() {
        int[] iArr = new int[8];
        vx.p(this.g, iArr);
        return new dh(iArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        int[] iArr = new int[8];
        vx.t(this.g, ((dh) jnVar).g, iArr);
        return new dh(iArr);
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