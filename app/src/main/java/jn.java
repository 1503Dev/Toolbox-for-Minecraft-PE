package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* renamed from: jn  reason: default package */
public abstract class jn implements gn {

    /* renamed from: jn$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends jn {
        public int g;
        public int h;
        public int[] i;
        public a30 j;

        public a(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.g = 2;
                this.i = new int[]{i2};
            } else if (i3 >= i4) {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            } else {
                if (i3 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.g = 3;
                this.i = new int[]{i2, i3, i4};
            }
            this.h = i;
            this.j = new a30(bigInteger);
        }

        public a(int i, a30 a30Var, int[] iArr) {
            this.h = i;
            this.g = iArr.length == 1 ? 2 : 3;
            this.i = iArr;
            this.j = a30Var;
        }

        public static void u(jn jnVar, jn jnVar2) {
            if (!(jnVar instanceof a) || !(jnVar2 instanceof a)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            a aVar = (a) jnVar;
            a aVar2 = (a) jnVar2;
            if (aVar.g != aVar2.g) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            }
            if (aVar.h != aVar2.h || !j7.b(aVar.i, aVar2.i)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        @Override // defpackage.jn
        public final jn a(jn jnVar) {
            a30 a30Var = (a30) this.j.clone();
            a30Var.c(((a) jnVar).j);
            return new a(this.h, a30Var, this.i);
        }

        @Override // defpackage.jn
        public final jn b() {
            a30 a30Var;
            int i = this.h;
            int[] iArr = this.i;
            a30 a30Var2 = this.j;
            if (a30Var2.P.length == 0) {
                a30Var = new a30(new long[]{1});
            } else {
                int max = Math.max(1, a30Var2.j());
                long[] jArr = new long[max];
                long[] jArr2 = a30Var2.P;
                System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, max));
                jArr[0] = jArr[0] ^ 1;
                a30Var = new a30(jArr);
            }
            return new a(i, a30Var, iArr);
        }

        @Override // defpackage.jn
        public final int c() {
            return this.j.f();
        }

        @Override // defpackage.jn
        public final jn d(jn jnVar) {
            return j(jnVar.g());
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.h == aVar.h && this.g == aVar.g && j7.b(this.i, aVar.i) && this.j.equals(aVar.j);
            }
            return false;
        }

        @Override // defpackage.jn
        public final int f() {
            return this.h;
        }

        @Override // defpackage.jn
        public final jn g() {
            int i;
            int i2;
            int i3 = this.h;
            int[] iArr = this.i;
            a30 a30Var = this.j;
            int f = a30Var.f();
            if (f != 0) {
                int i4 = 1;
                if (f != 1) {
                    a30 a30Var2 = (a30) a30Var.clone();
                    int i5 = (i3 + 63) >>> 6;
                    a30 a30Var3 = new a30(i5);
                    long[] jArr = a30Var3.P;
                    int i6 = (i3 >>> 6) + 0;
                    jArr[i6] = (1 << (i3 & 63)) ^ jArr[i6];
                    int i7 = i3 - i3;
                    int length = iArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        }
                        int i8 = iArr[length] + i7;
                        int i9 = (i8 >>> 6) + 0;
                        jArr[i9] = (1 << (i8 & 63)) ^ jArr[i9];
                    }
                    int i10 = (i7 >>> 6) + 0;
                    jArr[i10] = (1 << (i7 & 63)) ^ jArr[i10];
                    a30 a30Var4 = new a30(i5);
                    a30Var4.P[0] = 1;
                    a30 a30Var5 = new a30(i5);
                    int[] iArr2 = new int[2];
                    iArr2[0] = f;
                    int i11 = i3 + 1;
                    iArr2[1] = i11;
                    a30[] a30VarArr = {a30Var2, a30Var3};
                    int[] iArr3 = {1, 0};
                    a30[] a30VarArr2 = {a30Var4, a30Var5};
                    int i12 = iArr3[1];
                    int i13 = i11 - f;
                    while (true) {
                        if (i13 < 0) {
                            i13 = -i13;
                            iArr2[i4] = i11;
                            iArr3[i4] = i12;
                            i4 = 1 - i4;
                            i11 = iArr2[i4];
                            i12 = iArr3[i4];
                        }
                        i = 1 - i4;
                        a30VarArr[i4].b(a30VarArr[i], iArr2[i], i13);
                        a30 a30Var6 = a30VarArr[i4];
                        int i14 = (i11 + 62) >>> 6;
                        while (true) {
                            if (i14 == 0) {
                                a30Var6.getClass();
                                i2 = 0;
                                break;
                            }
                            i14--;
                            long j = a30Var6.P[i14];
                            if (j != 0) {
                                i2 = a30.e(j) + (i14 << 6);
                                break;
                            }
                        }
                        if (i2 == 0) {
                            break;
                        }
                        int i15 = iArr3[i];
                        a30VarArr2[i4].b(a30VarArr2[i], i15, i13);
                        int i16 = i15 + i13;
                        if (i16 <= i12) {
                            if (i16 == i12) {
                                a30 a30Var7 = a30VarArr2[i4];
                                int i17 = (i12 + 62) >>> 6;
                                while (true) {
                                    if (i17 == 0) {
                                        a30Var7.getClass();
                                        i16 = 0;
                                        break;
                                    }
                                    i17--;
                                    long j2 = a30Var7.P[i17];
                                    if (j2 != 0) {
                                        i16 = a30.e(j2) + (i17 << 6);
                                        break;
                                    }
                                }
                            } else {
                                i13 += i2 - i11;
                                i11 = i2;
                            }
                        }
                        i12 = i16;
                        i13 += i2 - i11;
                        i11 = i2;
                    }
                    a30Var = a30VarArr2[i];
                }
                return new a(i3, a30Var, iArr);
            }
            throw new IllegalStateException();
        }

        @Override // defpackage.jn
        public final boolean h() {
            return this.j.l();
        }

        public final int hashCode() {
            return (this.j.hashCode() ^ this.h) ^ j7.i(this.i);
        }

        @Override // defpackage.jn
        public final boolean i() {
            long[] jArr = this.j.P;
            for (int i = 0; i < jArr.length; i++) {
                if (jArr[i] != 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.jn
        public final jn j(jn jnVar) {
            long[] jArr;
            int i;
            long[] jArr2;
            int i2;
            int[] iArr;
            int i3 = this.h;
            int[] iArr2 = this.i;
            a30 a30Var = this.j;
            a30 a30Var2 = ((a) jnVar).j;
            int f = a30Var.f();
            if (f != 0) {
                int f2 = a30Var2.f();
                if (f2 != 0) {
                    if (f > f2) {
                        f2 = f;
                        f = f2;
                    } else {
                        a30Var2 = a30Var;
                        a30Var = a30Var2;
                    }
                    int i4 = (f + 63) >>> 6;
                    int i5 = (f2 + 63) >>> 6;
                    int i6 = ((f + f2) + 62) >>> 6;
                    if (i4 == 1) {
                        long j = a30Var2.P[0];
                        if (j != 1) {
                            long[] jArr3 = new long[i6];
                            a30.n(j, a30Var.P, i5, jArr3);
                            a30Var = new a30(jArr3, a30.o(jArr3, i6, i3, iArr2));
                        }
                    } else {
                        int i7 = ((f2 + 7) + 63) >>> 6;
                        int[] iArr3 = new int[16];
                        int i8 = i7 << 4;
                        long[] jArr4 = new long[i8];
                        iArr3[1] = i7;
                        System.arraycopy(a30Var.P, 0, jArr4, i7, i5);
                        int i9 = 2;
                        int i10 = i7;
                        for (int i11 = 16; i9 < i11; i11 = 16) {
                            i10 += i7;
                            iArr3[i9] = i10;
                            if ((i9 & 1) == 0) {
                                jArr2 = jArr4;
                                i2 = i8;
                                iArr = iArr3;
                                a30.p(jArr4, i10 >>> 1, jArr2, i10, i7, 1);
                            } else {
                                jArr2 = jArr4;
                                i2 = i8;
                                iArr = iArr3;
                                int i12 = i10 - i7;
                                for (int i13 = 0; i13 < i7; i13++) {
                                    jArr2[i10 + i13] = jArr2[i7 + i13] ^ jArr2[i12 + i13];
                                }
                            }
                            i9++;
                            i8 = i2;
                            iArr3 = iArr;
                            jArr4 = jArr2;
                        }
                        long[] jArr5 = jArr4;
                        int i14 = i8;
                        int[] iArr4 = iArr3;
                        long[] jArr6 = new long[i14];
                        a30.p(jArr5, 0, jArr6, 0, i14, 4);
                        long[] jArr7 = a30Var2.P;
                        int i15 = i6 << 3;
                        long[] jArr8 = new long[i15];
                        int i16 = 0;
                        while (i16 < i4) {
                            long j2 = jArr7[i16];
                            int i17 = i16;
                            while (true) {
                                long j3 = j2 >>> 4;
                                jArr = jArr7;
                                int i18 = iArr4[((int) j2) & 15];
                                int i19 = iArr4[((int) j3) & 15];
                                i = i4;
                                for (int i20 = 0; i20 < i7; i20++) {
                                    int i21 = i17 + i20;
                                    jArr8[i21] = jArr8[i21] ^ (jArr5[i18 + i20] ^ jArr6[i19 + i20]);
                                }
                                j2 = j3 >>> 4;
                                if (j2 == 0) {
                                    break;
                                }
                                i17 += i6;
                                jArr7 = jArr;
                                i4 = i;
                            }
                            i16++;
                            jArr7 = jArr;
                            i4 = i;
                        }
                        while (true) {
                            i15 -= i6;
                            if (i15 == 0) {
                                break;
                            }
                            a30.d(jArr8, i15 - i6, jArr8, i15, i6, 8);
                            jArr8 = jArr8;
                        }
                        long[] jArr9 = jArr8;
                        a30Var2 = new a30(jArr9, a30.o(jArr9, i6, i3, iArr2));
                    }
                }
                a30Var = a30Var2;
            }
            return new a(i3, a30Var, iArr2);
        }

        @Override // defpackage.jn
        public final jn k(jn jnVar, jn jnVar2, jn jnVar3) {
            return l(jnVar, jnVar2, jnVar3);
        }

        @Override // defpackage.jn
        public final jn l(jn jnVar, jn jnVar2, jn jnVar3) {
            a30 a30Var = this.j;
            a30 a30Var2 = ((a) jnVar).j;
            a30 a30Var3 = ((a) jnVar2).j;
            a30 a30Var4 = ((a) jnVar3).j;
            a30 m = a30Var.m(a30Var2);
            a30 m2 = a30Var3.m(a30Var4);
            if (m == a30Var || m == a30Var2) {
                m = (a30) m.clone();
            }
            m.c(m2);
            int i = this.h;
            int[] iArr = this.i;
            long[] jArr = m.P;
            int o = a30.o(jArr, jArr.length, i, iArr);
            if (o < jArr.length) {
                long[] jArr2 = new long[o];
                m.P = jArr2;
                System.arraycopy(jArr, 0, jArr2, 0, o);
            }
            return new a(this.h, m, this.i);
        }

        @Override // defpackage.jn
        public final jn m() {
            return this;
        }

        @Override // defpackage.jn
        public final jn n() {
            long[] jArr = this.j.P;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < jArr.length) {
                    if (jArr[i] != 0) {
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
            if (!z && !this.j.l()) {
                return q(this.h - 1);
            }
            return this;
        }

        @Override // defpackage.jn
        public final jn o() {
            int i = this.h;
            int[] iArr = this.i;
            a30 a30Var = this.j;
            int j = a30Var.j();
            if (j != 0) {
                int i2 = j << 1;
                long[] jArr = new long[i2];
                int i3 = 0;
                while (i3 < i2) {
                    long j2 = a30Var.P[i3 >>> 1];
                    int i4 = i3 + 1;
                    jArr[i3] = a30.k((int) j2);
                    i3 = i4 + 1;
                    jArr[i4] = a30.k((int) (j2 >>> 32));
                }
                a30Var = new a30(jArr, a30.o(jArr, i2, i, iArr));
            }
            return new a(i, a30Var, iArr);
        }

        @Override // defpackage.jn
        public final jn p(jn jnVar, jn jnVar2) {
            a30 a30Var;
            a30 a30Var2 = this.j;
            a30 a30Var3 = ((a) jnVar).j;
            a30 a30Var4 = ((a) jnVar2).j;
            int j = a30Var2.j();
            if (j == 0) {
                a30Var = a30Var2;
            } else {
                int i = j << 1;
                long[] jArr = new long[i];
                int i2 = 0;
                while (i2 < i) {
                    long j2 = a30Var2.P[i2 >>> 1];
                    int i3 = i2 + 1;
                    jArr[i2] = a30.k((int) j2);
                    i2 = i3 + 1;
                    jArr[i3] = a30.k((int) (j2 >>> 32));
                }
                a30Var = new a30(jArr, i);
            }
            a30 m = a30Var3.m(a30Var4);
            if (a30Var == a30Var2) {
                a30Var = (a30) a30Var.clone();
            }
            a30Var.c(m);
            int i4 = this.h;
            int[] iArr = this.i;
            long[] jArr2 = a30Var.P;
            int o = a30.o(jArr2, jArr2.length, i4, iArr);
            if (o < jArr2.length) {
                long[] jArr3 = new long[o];
                a30Var.P = jArr3;
                System.arraycopy(jArr2, 0, jArr3, 0, o);
            }
            return new a(this.h, a30Var, this.i);
        }

        @Override // defpackage.jn
        public final jn q(int i) {
            if (i < 1) {
                return this;
            }
            int i2 = this.h;
            int[] iArr = this.i;
            a30 a30Var = this.j;
            int j = a30Var.j();
            if (j != 0) {
                int i3 = ((i2 + 63) >>> 6) << 1;
                long[] jArr = new long[i3];
                System.arraycopy(a30Var.P, 0, jArr, 0, j);
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    int i4 = j << 1;
                    while (true) {
                        j--;
                        if (j >= 0) {
                            long j2 = jArr[j];
                            int i5 = i4 - 1;
                            jArr[i5] = a30.k((int) (j2 >>> 32));
                            i4 = i5 - 1;
                            jArr[i4] = a30.k((int) j2);
                        }
                    }
                    j = a30.o(jArr, i3, i2, iArr);
                }
                a30Var = new a30(jArr, j);
            }
            return new a(i2, a30Var, iArr);
        }

        @Override // defpackage.jn
        public final jn r(jn jnVar) {
            return a(jnVar);
        }

        @Override // defpackage.jn
        public final boolean s() {
            long[] jArr = this.j.P;
            if (jArr.length <= 0 || (1 & jArr[0]) == 0) {
                return false;
            }
            return true;
        }

        @Override // defpackage.jn
        public final BigInteger t() {
            a30 a30Var = this.j;
            int j = a30Var.j();
            if (j == 0) {
                return gn.a;
            }
            int i = j - 1;
            long j2 = a30Var.P[i];
            byte[] bArr = new byte[8];
            int i2 = 0;
            boolean z = false;
            for (int i3 = 7; i3 >= 0; i3--) {
                byte b = (byte) (j2 >>> (i3 * 8));
                if (z || b != 0) {
                    bArr[i2] = b;
                    i2++;
                    z = true;
                }
            }
            byte[] bArr2 = new byte[(i * 8) + i2];
            for (int i4 = 0; i4 < i2; i4++) {
                bArr2[i4] = bArr[i4];
            }
            for (int i5 = j - 2; i5 >= 0; i5--) {
                long j3 = a30Var.P[i5];
                int i6 = 7;
                while (i6 >= 0) {
                    bArr2[i2] = (byte) (j3 >>> (i6 * 8));
                    i6--;
                    i2++;
                }
            }
            return new BigInteger(1, bArr2);
        }
    }

    /* renamed from: jn$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends jn {
        public BigInteger g;
        public BigInteger h;
        public BigInteger i;

        public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.g = bigInteger;
            this.h = bigInteger2;
            this.i = bigInteger3;
        }

        public static BigInteger u(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return gn.b.shiftLeft(bitLength).subtract(bigInteger);
        }

        @Override // defpackage.jn
        public final jn a(jn jnVar) {
            BigInteger bigInteger = this.g;
            BigInteger bigInteger2 = this.h;
            BigInteger add = this.i.add(jnVar.t());
            if (add.compareTo(this.g) >= 0) {
                add = add.subtract(this.g);
            }
            return new b(bigInteger, bigInteger2, add);
        }

        @Override // defpackage.jn
        public final jn b() {
            BigInteger add = this.i.add(gn.b);
            if (add.compareTo(this.g) == 0) {
                add = gn.a;
            }
            return new b(this.g, this.h, add);
        }

        @Override // defpackage.jn
        public final jn d(jn jnVar) {
            BigInteger bigInteger = this.g;
            BigInteger bigInteger2 = this.h;
            BigInteger bigInteger3 = this.i;
            BigInteger t = jnVar.t();
            int f = f();
            int i = (f + 31) >> 5;
            int[] I = z61.I(f, this.g);
            int[] I2 = z61.I(f, t);
            int[] iArr = new int[i];
            z61.f0(I, I2, iArr);
            return new b(bigInteger, bigInteger2, v(bigInteger3, z61.v1(iArr, i)));
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.g.equals(bVar.g) && this.i.equals(bVar.i);
            }
            return false;
        }

        @Override // defpackage.jn
        public final int f() {
            return this.g.bitLength();
        }

        @Override // defpackage.jn
        public final jn g() {
            BigInteger bigInteger = this.g;
            BigInteger bigInteger2 = this.h;
            BigInteger bigInteger3 = this.i;
            int f = f();
            int i = (f + 31) >> 5;
            int[] I = z61.I(f, this.g);
            int[] I2 = z61.I(f, bigInteger3);
            int[] iArr = new int[i];
            z61.f0(I, I2, iArr);
            return new b(bigInteger, bigInteger2, z61.v1(iArr, i));
        }

        public final int hashCode() {
            return this.g.hashCode() ^ this.i.hashCode();
        }

        @Override // defpackage.jn
        public final jn j(jn jnVar) {
            return new b(this.g, this.h, v(this.i, jnVar.t()));
        }

        @Override // defpackage.jn
        public final jn k(jn jnVar, jn jnVar2, jn jnVar3) {
            BigInteger bigInteger = this.i;
            BigInteger t = jnVar.t();
            BigInteger t2 = jnVar2.t();
            BigInteger t3 = jnVar3.t();
            return new b(this.g, this.h, w(bigInteger.multiply(t).subtract(t2.multiply(t3))));
        }

        @Override // defpackage.jn
        public final jn l(jn jnVar, jn jnVar2, jn jnVar3) {
            BigInteger bigInteger = this.i;
            BigInteger t = jnVar.t();
            BigInteger t2 = jnVar2.t();
            BigInteger t3 = jnVar3.t();
            return new b(this.g, this.h, w(bigInteger.multiply(t).add(t2.multiply(t3))));
        }

        @Override // defpackage.jn
        public final jn m() {
            if (this.i.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.g;
            return new b(bigInteger, this.h, bigInteger.subtract(this.i));
        }

        @Override // defpackage.jn
        public final jn n() {
            BigInteger bigInteger;
            Object obj;
            BigInteger bigInteger2;
            if (i() || h()) {
                return this;
            }
            if (this.g.testBit(0)) {
                int i = 1;
                Object obj2 = null;
                if (this.g.testBit(1)) {
                    BigInteger add = this.g.shiftRight(2).add(gn.b);
                    BigInteger bigInteger3 = this.g;
                    b bVar = new b(bigInteger3, this.h, this.i.modPow(add, bigInteger3));
                    if (!bVar.o().equals(this)) {
                        return null;
                    }
                    return bVar;
                } else if (this.g.testBit(2)) {
                    BigInteger modPow = this.i.modPow(this.g.shiftRight(3), this.g);
                    BigInteger v = v(modPow, this.i);
                    if (v(v, modPow).equals(gn.b)) {
                        b bVar2 = new b(this.g, this.h, v);
                        if (!bVar2.o().equals(this)) {
                            return null;
                        }
                        return bVar2;
                    }
                    b bVar3 = new b(this.g, this.h, w(v.multiply(gn.c.modPow(this.g.shiftRight(2), this.g))));
                    if (!bVar3.o().equals(this)) {
                        return null;
                    }
                    return bVar3;
                } else {
                    BigInteger shiftRight = this.g.shiftRight(1);
                    BigInteger modPow2 = this.i.modPow(shiftRight, this.g);
                    BigInteger bigInteger4 = gn.b;
                    if (!modPow2.equals(bigInteger4)) {
                        return null;
                    }
                    BigInteger bigInteger5 = this.i;
                    BigInteger shiftLeft = bigInteger5.shiftLeft(1);
                    if (shiftLeft.compareTo(this.g) >= 0) {
                        shiftLeft = shiftLeft.subtract(this.g);
                    }
                    BigInteger shiftLeft2 = shiftLeft.shiftLeft(1);
                    if (shiftLeft2.compareTo(this.g) >= 0) {
                        shiftLeft2 = shiftLeft2.subtract(this.g);
                    }
                    BigInteger add2 = shiftRight.add(bigInteger4);
                    BigInteger subtract = this.g.subtract(bigInteger4);
                    Random random = new Random();
                    while (true) {
                        BigInteger bigInteger6 = new BigInteger(this.g.bitLength(), random);
                        if (bigInteger6.compareTo(this.g) < 0 && w(bigInteger6.multiply(bigInteger6).subtract(shiftLeft2)).modPow(shiftRight, this.g).equals(subtract)) {
                            int bitLength = add2.bitLength();
                            int lowestSetBit = add2.getLowestSetBit();
                            BigInteger bigInteger7 = gn.b;
                            int i2 = bitLength - i;
                            BigInteger bigInteger8 = bigInteger6;
                            BigInteger bigInteger9 = bigInteger7;
                            BigInteger bigInteger10 = gn.c;
                            BigInteger bigInteger11 = bigInteger9;
                            while (i2 >= lowestSetBit + 1) {
                                bigInteger7 = v(bigInteger7, bigInteger11);
                                if (add2.testBit(i2)) {
                                    BigInteger v2 = v(bigInteger7, bigInteger5);
                                    BigInteger v3 = v(bigInteger9, bigInteger8);
                                    bigInteger10 = w(bigInteger8.multiply(bigInteger10).subtract(bigInteger6.multiply(bigInteger7)));
                                    bigInteger2 = shiftRight;
                                    bigInteger8 = w(bigInteger8.multiply(bigInteger8).subtract(v2.shiftLeft(1)));
                                    bigInteger9 = v3;
                                    bigInteger11 = v2;
                                } else {
                                    bigInteger2 = shiftRight;
                                    BigInteger w = w(bigInteger9.multiply(bigInteger10).subtract(bigInteger7));
                                    bigInteger8 = w(bigInteger8.multiply(bigInteger10).subtract(bigInteger6.multiply(bigInteger7)));
                                    bigInteger9 = w;
                                    bigInteger10 = w(bigInteger10.multiply(bigInteger10).subtract(bigInteger7.shiftLeft(1)));
                                    bigInteger11 = bigInteger7;
                                }
                                i2--;
                                shiftRight = bigInteger2;
                            }
                            bigInteger = shiftRight;
                            BigInteger v4 = v(bigInteger7, bigInteger11);
                            BigInteger v5 = v(v4, bigInteger5);
                            BigInteger w2 = w(bigInteger9.multiply(bigInteger10).subtract(v4));
                            BigInteger w3 = w(bigInteger8.multiply(bigInteger10).subtract(bigInteger6.multiply(v4)));
                            BigInteger w4 = w(v4.multiply(v5));
                            for (int i3 = 1; i3 <= lowestSetBit; i3++) {
                                w2 = v(w2, w3);
                                w3 = w(w3.multiply(w3).subtract(w4.shiftLeft(1)));
                                w4 = w(w4.multiply(w4));
                            }
                            if (v(w3, w3).equals(shiftLeft2)) {
                                BigInteger bigInteger12 = this.g;
                                BigInteger bigInteger13 = this.h;
                                if (w3.testBit(0)) {
                                    w3 = this.g.subtract(w3);
                                }
                                return new b(bigInteger12, bigInteger13, w3.shiftRight(1));
                            } else if (!w2.equals(gn.b) && !w2.equals(subtract)) {
                                return null;
                            } else {
                                obj = null;
                            }
                        } else {
                            bigInteger = shiftRight;
                            obj = obj2;
                        }
                        obj2 = obj;
                        shiftRight = bigInteger;
                        i = 1;
                    }
                }
            } else {
                throw new RuntimeException("not done yet");
            }
        }

        @Override // defpackage.jn
        public final jn o() {
            BigInteger bigInteger = this.g;
            BigInteger bigInteger2 = this.h;
            BigInteger bigInteger3 = this.i;
            return new b(bigInteger, bigInteger2, v(bigInteger3, bigInteger3));
        }

        @Override // defpackage.jn
        public final jn p(jn jnVar, jn jnVar2) {
            BigInteger bigInteger = this.i;
            BigInteger t = jnVar.t();
            BigInteger t2 = jnVar2.t();
            return new b(this.g, this.h, w(bigInteger.multiply(bigInteger).add(t.multiply(t2))));
        }

        @Override // defpackage.jn
        public final jn r(jn jnVar) {
            BigInteger bigInteger = this.g;
            BigInteger bigInteger2 = this.h;
            BigInteger subtract = this.i.subtract(jnVar.t());
            if (subtract.signum() < 0) {
                subtract = subtract.add(this.g);
            }
            return new b(bigInteger, bigInteger2, subtract);
        }

        @Override // defpackage.jn
        public final BigInteger t() {
            return this.i;
        }

        public final BigInteger v(BigInteger bigInteger, BigInteger bigInteger2) {
            return w(bigInteger.multiply(bigInteger2));
        }

        public final BigInteger w(BigInteger bigInteger) {
            if (this.h != null) {
                boolean z = bigInteger.signum() < 0;
                if (z) {
                    bigInteger = bigInteger.abs();
                }
                int bitLength = this.g.bitLength();
                boolean equals = this.h.equals(gn.b);
                while (bigInteger.bitLength() > bitLength + 1) {
                    BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                    BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                    if (!equals) {
                        shiftRight = shiftRight.multiply(this.h);
                    }
                    bigInteger = shiftRight.add(subtract);
                }
                while (bigInteger.compareTo(this.g) >= 0) {
                    bigInteger = bigInteger.subtract(this.g);
                }
                return (!z || bigInteger.signum() == 0) ? bigInteger : this.g.subtract(bigInteger);
            }
            return bigInteger.mod(this.g);
        }
    }

    public abstract jn a(jn jnVar);

    public abstract jn b();

    public int c() {
        return t().bitLength();
    }

    public abstract jn d(jn jnVar);

    public final byte[] e() {
        return y9.a((f() + 7) / 8, t());
    }

    public abstract int f();

    public abstract jn g();

    public boolean h() {
        return c() == 1;
    }

    public boolean i() {
        return t().signum() == 0;
    }

    public abstract jn j(jn jnVar);

    public jn k(jn jnVar, jn jnVar2, jn jnVar3) {
        return j(jnVar).r(jnVar2.j(jnVar3));
    }

    public jn l(jn jnVar, jn jnVar2, jn jnVar3) {
        return j(jnVar).a(jnVar2.j(jnVar3));
    }

    public abstract jn m();

    public abstract jn n();

    public abstract jn o();

    public jn p(jn jnVar, jn jnVar2) {
        return o().a(jnVar.j(jnVar2));
    }

    public jn q(int i) {
        jn jnVar = this;
        for (int i2 = 0; i2 < i; i2++) {
            jnVar = jnVar.o();
        }
        return jnVar;
    }

    public abstract jn r(jn jnVar);

    public boolean s() {
        return t().testBit(0);
    }

    public abstract BigInteger t();

    public final String toString() {
        return t().toString(16);
    }
}