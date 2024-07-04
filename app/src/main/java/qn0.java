package defpackage;

import java.math.BigInteger;

/* renamed from: qn0  reason: default package */
public final class qn0 extends jn {
    public static final BigInteger h = pn0.j;
    public int[] g;

    public qn0() {
        this.g = new int[4];
    }

    public qn0(BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(h) < 0) {
            if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 128) {
                int[] iArr = new int[4];
                int i = 0;
                while (bigInteger.signum() != 0) {
                    iArr[i] = bigInteger.intValue();
                    bigInteger = bigInteger.shiftRight(32);
                    i++;
                }
                if ((iArr[3] >>> 1) >= 2147483646) {
                    int[] iArr2 = gw.S;
                    if (z61.U(iArr, iArr2)) {
                        long j = ((iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L)) + 0;
                        iArr[0] = (int) j;
                        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
                        iArr[1] = (int) j2;
                        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
                        iArr[2] = (int) j3;
                        iArr[3] = (int) (((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32));
                    }
                }
                this.g = iArr;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
    }

    public qn0(int[] iArr) {
        this.g = iArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        int[] iArr = new int[4];
        gw.e(this.g, ((qn0) jnVar).g, iArr);
        return new qn0(iArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        int[] iArr = new int[4];
        if (z61.Z(4, this.g, iArr) != 0 || ((iArr[3] >>> 1) >= 2147483646 && z61.U(iArr, gw.S))) {
            gw.g(iArr);
        }
        return new qn0(iArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        int[] iArr = new int[4];
        z61.f0(gw.S, ((qn0) jnVar).g, iArr);
        gw.l(iArr, this.g, iArr);
        return new qn0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qn0) {
            int[] iArr = this.g;
            int[] iArr2 = ((qn0) obj).g;
            for (int i = 3; i >= 0; i--) {
                if (iArr[i] != iArr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jn
    public final int f() {
        return h.bitLength();
    }

    @Override // defpackage.jn
    public final jn g() {
        int[] iArr = new int[4];
        z61.f0(gw.S, this.g, iArr);
        return new qn0(iArr);
    }

    @Override // defpackage.jn
    public final boolean h() {
        int[] iArr = this.g;
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return h.hashCode() ^ j7.g(4, this.g);
    }

    @Override // defpackage.jn
    public final boolean i() {
        return z61.m0(this.g);
    }

    @Override // defpackage.jn
    public final jn j(jn jnVar) {
        int[] iArr = new int[4];
        gw.l(this.g, ((qn0) jnVar).g, iArr);
        return new qn0(iArr);
    }

    @Override // defpackage.jn
    public final jn m() {
        int[] iArr = new int[4];
        int[] iArr2 = this.g;
        if (z61.m0(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
        } else {
            z61.i1(gw.S, iArr2, iArr);
        }
        return new qn0(iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    @Override // defpackage.jn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jn n() {
        boolean z;
        int[] iArr = this.g;
        if (!z61.m0(iArr)) {
            boolean z2 = false;
            if (iArr[0] == 1) {
                for (int i = 1; i < 4; i++) {
                    if (iArr[i] == 0) {
                    }
                }
                z = true;
                if (!z) {
                    int[] iArr2 = new int[4];
                    gw.o(iArr, iArr2);
                    gw.l(iArr2, iArr, iArr2);
                    int[] iArr3 = new int[4];
                    gw.p(2, iArr2, iArr3);
                    gw.l(iArr3, iArr2, iArr3);
                    int[] iArr4 = new int[4];
                    gw.p(4, iArr3, iArr4);
                    gw.l(iArr4, iArr3, iArr4);
                    gw.p(2, iArr4, iArr3);
                    gw.l(iArr3, iArr2, iArr3);
                    gw.p(10, iArr3, iArr2);
                    gw.l(iArr2, iArr3, iArr2);
                    gw.p(10, iArr2, iArr4);
                    gw.l(iArr4, iArr3, iArr4);
                    gw.o(iArr4, iArr3);
                    gw.l(iArr3, iArr, iArr3);
                    gw.p(95, iArr3, iArr3);
                    gw.o(iArr3, iArr4);
                    int i2 = 3;
                    while (true) {
                        if (i2 >= 0) {
                            if (iArr[i2] != iArr4[i2]) {
                                break;
                            }
                            i2--;
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    if (z2) {
                        return new qn0(iArr3);
                    }
                    return null;
                }
            }
            z = false;
            if (!z) {
            }
        }
        return this;
    }

    @Override // defpackage.jn
    public final jn o() {
        int[] iArr = new int[4];
        gw.o(this.g, iArr);
        return new qn0(iArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        int[] iArr = new int[4];
        gw.q(this.g, ((qn0) jnVar).g, iArr);
        return new qn0(iArr);
    }

    @Override // defpackage.jn
    public final boolean s() {
        return (this.g[0] & 1) == 1;
    }

    @Override // defpackage.jn
    public final BigInteger t() {
        int[] iArr = this.g;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                z61.d0(bArr, i2, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}