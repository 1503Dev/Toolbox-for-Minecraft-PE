package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* renamed from: ko0  reason: default package */
public final class ko0 extends jn {
    public static final BigInteger h = jo0.j;
    public int[] g;

    public ko0() {
        this.g = new int[7];
    }

    public ko0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        int[] L = z61.L(bigInteger);
        if (L[6] == -1) {
            int[] iArr = v32.P;
            if (z61.X(L, iArr)) {
                long j = ((L[0] & 4294967295L) - (iArr[0] & 4294967295L)) + 0;
                L[0] = (int) j;
                long j2 = ((L[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
                L[1] = (int) j2;
                long j3 = ((L[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
                L[2] = (int) j3;
                long j4 = ((L[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
                L[3] = (int) j4;
                long j5 = ((L[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j4 >> 32);
                L[4] = (int) j5;
                long j6 = ((L[5] & 4294967295L) - (iArr[5] & 4294967295L)) + (j5 >> 32);
                L[5] = (int) j6;
                L[6] = (int) (((L[6] & 4294967295L) - (4294967295L & iArr[6])) + (j6 >> 32));
            }
        }
        this.g = L;
    }

    public ko0(int[] iArr) {
        this.g = iArr;
    }

    @Override // defpackage.jn
    public final jn a(jn jnVar) {
        int[] iArr = new int[7];
        v32.a(this.g, ((ko0) jnVar).g, iArr);
        return new ko0(iArr);
    }

    @Override // defpackage.jn
    public final jn b() {
        int[] iArr = new int[7];
        if (z61.Z(7, this.g, iArr) != 0 || (iArr[6] == -1 && z61.X(iArr, v32.P))) {
            v32.d(iArr);
        }
        return new ko0(iArr);
    }

    @Override // defpackage.jn
    public final jn d(jn jnVar) {
        int[] iArr = new int[7];
        z61.f0(v32.P, ((ko0) jnVar).g, iArr);
        v32.f(iArr, this.g, iArr);
        return new ko0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ko0) {
            return z61.F(this.g, ((ko0) obj).g);
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
        z61.f0(v32.P, this.g, iArr);
        return new ko0(iArr);
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
        v32.f(this.g, ((ko0) jnVar).g, iArr);
        return new ko0(iArr);
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
            z61.n1(v32.P, iArr2, iArr);
        }
        return new ko0(iArr);
    }

    @Override // defpackage.jn
    public final jn n() {
        boolean z;
        int[] iArr = this.g;
        if (z61.q0(iArr) || z61.j0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        int i = 1;
        if (z61.q0(iArr)) {
            iArr2[0] = 0;
            iArr2[1] = 0;
            iArr2[2] = 0;
            iArr2[3] = 0;
            iArr2[4] = 0;
            iArr2[5] = 0;
            iArr2[6] = 0;
        } else {
            z61.n1(v32.P, iArr, iArr2);
        }
        int[] iArr3 = v32.P;
        Random random = new Random();
        int[] iArr4 = new int[7];
        int i2 = iArr3[6];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        do {
            for (int i8 = 0; i8 != 7; i8++) {
                iArr4[i8] = random.nextInt();
            }
            iArr4[6] = iArr4[6] & i7;
        } while (z61.T(7, iArr4, iArr3));
        int[] iArr5 = new int[7];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        z61.x(iArr, iArr6);
        for (int i9 = 0; i9 < 7; i9++) {
            z61.x(iArr6, iArr7);
            int i10 = 1 << i9;
            int[] iArr8 = new int[14];
            do {
                z61.e1(iArr6, iArr8);
                v32.g(iArr8, iArr6);
                i10--;
            } while (i10 > 0);
            v32.f(iArr6, iArr7, iArr6);
        }
        int i11 = 95;
        int[] iArr9 = new int[14];
        do {
            z61.e1(iArr6, iArr9);
            v32.g(iArr9, iArr6);
            i11--;
        } while (i11 > 0);
        if (!z61.j0(iArr6)) {
            return null;
        }
        while (true) {
            int[] iArr10 = new int[7];
            z61.x(iArr4, iArr10);
            int[] iArr11 = new int[7];
            iArr11[0] = i;
            int[] iArr12 = new int[7];
            z61.x(iArr2, iArr12);
            int[] iArr13 = new int[7];
            int[] iArr14 = new int[7];
            int i12 = 0;
            while (i12 < 7) {
                z61.x(iArr10, iArr13);
                z61.x(iArr11, iArr14);
                int i13 = i << i12;
                while (true) {
                    i13--;
                    if (i13 >= 0) {
                        v32.f(iArr11, iArr10, iArr11);
                        if (z61.Y0(7, 0, iArr11, iArr11) != 0 || (iArr11[6] == -1 && z61.X(iArr11, v32.P))) {
                            v32.d(iArr11);
                        }
                        v32.i(iArr10, iArr5);
                        v32.a(iArr12, iArr5, iArr10);
                        v32.f(iArr12, iArr5, iArr12);
                        v32.h(iArr12, z61.Z0(7, iArr12));
                    }
                }
                v32.f(iArr11, iArr14, iArr5);
                v32.f(iArr5, iArr2, iArr5);
                v32.f(iArr10, iArr13, iArr12);
                v32.a(iArr12, iArr5, iArr12);
                v32.f(iArr10, iArr14, iArr5);
                z61.x(iArr12, iArr10);
                v32.f(iArr11, iArr13, iArr11);
                v32.a(iArr11, iArr5, iArr11);
                v32.i(iArr11, iArr12);
                v32.f(iArr12, iArr2, iArr12);
                i12++;
                i = 1;
            }
            int[] iArr15 = new int[7];
            int[] iArr16 = new int[7];
            int i14 = 1;
            while (true) {
                if (i14 < 96) {
                    z61.x(iArr10, iArr15);
                    z61.x(iArr11, iArr16);
                    v32.f(iArr11, iArr10, iArr11);
                    if (z61.Y0(7, 0, iArr11, iArr11) != 0 || (iArr11[6] == -1 && z61.X(iArr11, v32.P))) {
                        v32.d(iArr11);
                    }
                    v32.i(iArr10, iArr5);
                    v32.a(iArr12, iArr5, iArr10);
                    v32.f(iArr12, iArr5, iArr12);
                    v32.h(iArr12, z61.Z0(7, iArr12));
                    if (z61.q0(iArr10)) {
                        z61.f0(v32.P, iArr16, iArr5);
                        v32.f(iArr5, iArr15, iArr5);
                        z = true;
                        break;
                    }
                    i14++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                break;
            }
            if (z61.Z(7, iArr4, iArr4) != 0 || (iArr4[6] == -1 && z61.X(iArr4, v32.P))) {
                v32.d(iArr4);
            }
            i = 1;
        }
        v32.i(iArr5, iArr4);
        if (z61.F(iArr, iArr4)) {
            return new ko0(iArr5);
        }
        return null;
    }

    @Override // defpackage.jn
    public final jn o() {
        int[] iArr = new int[7];
        v32.i(this.g, iArr);
        return new ko0(iArr);
    }

    @Override // defpackage.jn
    public final jn r(jn jnVar) {
        int[] iArr = new int[7];
        v32.j(this.g, ((ko0) jnVar).g, iArr);
        return new ko0(iArr);
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