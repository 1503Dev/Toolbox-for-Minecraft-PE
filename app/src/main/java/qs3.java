package defpackage;

import java.util.Arrays;

/* renamed from: qs3  reason: default package */
public final class qs3 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public qs3(int i, int i2, float f, float f2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 + i4;
        this.h = i5;
        this.i = new short[i5];
        int i6 = i5 * i2;
        this.j = new short[i6];
        this.l = new short[i6];
        this.n = new short[i6];
    }

    public static void d(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i7])) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    public final int a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            int i11 = i9 * i7;
            int i12 = i5 * i2;
            if (i11 < i12) {
                i5 = i9;
            }
            if (i11 < i12) {
                i7 = i2;
            }
            int i13 = i9 * i6;
            int i14 = i8 * i2;
            if (i13 > i14) {
                i8 = i9;
            }
            if (i13 > i14) {
                i6 = i2;
            }
            i2++;
        }
        this.u = i5 / i7;
        this.v = i8 / i6;
        return i7;
    }

    public final void b(short[] sArr, int i, int i2) {
        short[] f = f(this.l, this.m, i2);
        this.l = f;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, f, this.m * i3, i3 * i2);
        this.m += i2;
    }

    public final void c(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public final void e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.m;
        float f = this.c;
        float f2 = this.d;
        float f3 = f / f2;
        float f4 = this.e * f2;
        double d = f3;
        float f5 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.k;
            if (i11 >= this.h) {
                int i12 = 0;
                while (true) {
                    int i13 = this.r;
                    if (i13 > 0) {
                        int min = Math.min(this.h, i13);
                        b(this.j, i12, min);
                        this.r -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.j;
                        int i14 = this.a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.b == i10 && i15 == i10) {
                            i = a(sArr, i12, this.f, this.g);
                        } else {
                            c(sArr, i12, i15);
                            int a = a(this.i, 0, this.f / i15, this.g / i15);
                            if (i15 != i10) {
                                int i16 = a * i15;
                                int i17 = i15 * 4;
                                int i18 = this.f;
                                int i19 = i16 - i17;
                                if (i19 >= i18) {
                                    i18 = i19;
                                }
                                int i20 = i16 + i17;
                                int i21 = this.g;
                                if (i20 > i21) {
                                    i20 = i21;
                                }
                                if (this.b == i10) {
                                    i = a(sArr, i12, i18, i20);
                                } else {
                                    c(sArr, i12, i10);
                                    i = a(this.i, 0, i18, i20);
                                }
                            } else {
                                i = a;
                            }
                        }
                        int i22 = this.u;
                        int i23 = (i22 == 0 || (i4 = this.s) == 0 || this.v > i22 * 3 || i22 + i22 <= this.t * 3) ? i : i4;
                        this.t = i22;
                        this.s = i;
                        if (d > 1.0d) {
                            short[] sArr2 = this.j;
                            if (f3 >= 2.0f) {
                                i3 = (int) (i23 / ((-1.0f) + f3));
                            } else {
                                this.r = (int) ((i23 * (2.0f - f3)) / ((-1.0f) + f3));
                                i3 = i23;
                            }
                            short[] f6 = f(this.l, this.m, i3);
                            this.l = f6;
                            int i24 = i3;
                            d(i3, this.b, f6, this.m, sArr2, i12, sArr2, i12 + i23);
                            this.m += i24;
                            i12 = i23 + i24 + i12;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.j;
                            if (f3 < 0.5f) {
                                i2 = (int) ((i25 * f3) / (f5 - f3));
                            } else {
                                this.r = (int) ((((f3 + f3) - 1.0f) * i25) / (f5 - f3));
                                i2 = i25;
                            }
                            int i26 = i25 + i2;
                            short[] f7 = f(this.l, this.m, i26);
                            this.l = f7;
                            int i27 = this.b;
                            System.arraycopy(sArr3, i12 * i27, f7, this.m * i27, i27 * i25);
                            d(i2, this.b, this.l, this.m + i25, sArr3, i12 + i25, sArr3, i12);
                            this.m += i26;
                            i12 += i2;
                        }
                    }
                    if (this.h + i12 > i11) {
                        break;
                    }
                    f5 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.k - i12;
                short[] sArr4 = this.j;
                int i29 = this.b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.k = i28;
                f5 = 1.0f;
            }
        } else {
            b(this.j, 0, this.k);
            this.k = 0;
        }
        if (f4 == f5 || this.m == i9) {
            return;
        }
        int i30 = this.a;
        int i31 = (int) (i30 / f4);
        while (true) {
            if (i31 <= 16384 && i30 <= 16384) {
                break;
            }
            i31 /= 2;
            i30 /= 2;
        }
        int i32 = this.m - i9;
        short[] f8 = f(this.n, this.o, i32);
        this.n = f8;
        short[] sArr5 = this.l;
        int i33 = this.b;
        System.arraycopy(sArr5, i9 * i33, f8, this.o * i33, i33 * i32);
        this.m = i9;
        this.o += i32;
        int i34 = 0;
        while (true) {
            i5 = this.o;
            i6 = i5 - 1;
            if (i34 >= i6) {
                break;
            }
            while (true) {
                i7 = this.p + 1;
                int i35 = i7 * i31;
                i8 = this.q;
                if (i35 <= i8 * i30) {
                    break;
                }
                this.l = f(this.l, this.m, 1);
                int i36 = 0;
                while (true) {
                    int i37 = this.b;
                    if (i36 < i37) {
                        short[] sArr6 = this.l;
                        int i38 = this.m * i37;
                        short[] sArr7 = this.n;
                        int i39 = (i34 * i37) + i36;
                        short s = sArr7[i39];
                        short s2 = sArr7[i39 + i37];
                        int i40 = this.p;
                        int i41 = i40 * i31;
                        int i42 = (i40 + 1) * i31;
                        int i43 = i42 - (this.q * i30);
                        int i44 = i42 - i41;
                        sArr6[i38 + i36] = (short) ((((i44 - i43) * s2) + (s * i43)) / i44);
                        i36++;
                    }
                }
                this.q++;
                this.m++;
            }
            this.p = i7;
            if (i7 == i30) {
                this.p = 0;
                tv2.I(i8 == i31);
                this.q = 0;
            }
            i34++;
        }
        if (i6 != 0) {
            short[] sArr8 = this.n;
            int i45 = this.b;
            System.arraycopy(sArr8, i6 * i45, sArr8, 0, (i5 - i6) * i45);
            this.o -= i6;
        }
    }

    public final short[] f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }
}