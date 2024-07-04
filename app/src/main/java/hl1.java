package defpackage;

import java.util.Arrays;

/* renamed from: hl1  reason: default package */
public final class hl1 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static int a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        tv2.I(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            d(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            d(zArr);
            return i - 2;
        } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            d(zArr);
            return i - 1;
        } else {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b2 = bArr[i5];
                if ((b2 & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                        d(zArr);
                        return i6;
                    }
                    i5 = i6;
                }
                i5 += 3;
            }
            zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
            zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
            zArr[2] = bArr[i4] == 0;
            return i2;
        }
    }

    public static int b(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        } else if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        } else {
                            i3++;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    int length = iArr.length;
                    if (length <= i4) {
                        d = Arrays.copyOf(iArr, length + length);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i10 + 1;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gl1 c(byte[] bArr, int i, int i2) {
        int f;
        int i3;
        int i4;
        int i5;
        int f2;
        boolean e;
        float f3;
        int a2;
        int i6;
        il1 il1Var = new il1(bArr, i, i2);
        int a3 = il1Var.a(8);
        int a4 = il1Var.a(8);
        int a5 = il1Var.a(8);
        int f4 = il1Var.f();
        int i7 = 1;
        if (a3 != 100 && a3 != 110 && a3 != 122 && a3 != 244 && a3 != 44 && a3 != 83 && a3 != 86 && a3 != 118 && a3 != 128) {
            if (a3 == 138) {
                a3 = 138;
            } else {
                f = 1;
                il1Var.f();
                f2 = il1Var.f();
                if (f2 != 0) {
                    il1Var.f();
                } else if (f2 == 1) {
                    il1Var.e();
                    il1Var.b();
                    il1Var.b();
                    long f5 = il1Var.f();
                    for (int i8 = 0; i8 < f5; i8++) {
                        il1Var.f();
                    }
                }
                il1Var.f();
                il1Var.c();
                int f6 = il1Var.f() + 1;
                int f7 = il1Var.f() + 1;
                e = il1Var.e();
                int i9 = 2 - (e ? 1 : 0);
                if (!e) {
                    il1Var.c();
                }
                il1Var.c();
                int i10 = f6 * 16;
                int i11 = f7 * i9 * 16;
                if (il1Var.e()) {
                    int f8 = il1Var.f();
                    int f9 = il1Var.f();
                    int f10 = il1Var.f();
                    int f11 = il1Var.f();
                    if (f != 0) {
                        if (f == 3) {
                            i6 = 1;
                        } else {
                            i6 = 2;
                        }
                        if (f == 1) {
                            i7 = 2;
                        }
                        i9 *= i7;
                        i7 = i6;
                    }
                    i10 -= (f8 + f9) * i7;
                    i11 -= (f10 + f11) * i9;
                }
                int i12 = i10;
                if (il1Var.e() && il1Var.e()) {
                    a2 = il1Var.a(8);
                    if (a2 != 255) {
                        int a6 = il1Var.a(16);
                        int a7 = il1Var.a(16);
                        if (a6 != 0 && a7 != 0) {
                            f3 = a6 / a7;
                        }
                    } else if (a2 < 17) {
                        f3 = b[a2];
                    } else {
                        lb4.c("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + a2);
                    }
                    return new gl1(a3, a4, a5, f4, i12, i11, f3);
                }
                f3 = 1.0f;
                return new gl1(a3, a4, a5, f4, i12, i11, f3);
            }
        }
        f = il1Var.f();
        if (f == 3) {
            il1Var.e();
            i3 = 3;
        } else {
            i3 = f;
        }
        il1Var.f();
        il1Var.f();
        il1Var.c();
        if (il1Var.e()) {
            if (i3 != 3) {
                i4 = 8;
            } else {
                i4 = 12;
            }
            for (int i13 = 0; i13 < i4; i13++) {
                if (il1Var.e()) {
                    if (i13 < 6) {
                        i5 = 16;
                    } else {
                        i5 = 64;
                    }
                    int i14 = 8;
                    int i15 = 8;
                    for (int i16 = 0; i16 < i5; i16++) {
                        if (i14 != 0) {
                            i14 = ((il1Var.b() + i15) + 256) % 256;
                        }
                        if (i14 != 0) {
                            i15 = i14;
                        }
                    }
                }
            }
        }
        il1Var.f();
        f2 = il1Var.f();
        if (f2 != 0) {
        }
        il1Var.f();
        il1Var.c();
        int f62 = il1Var.f() + 1;
        int f72 = il1Var.f() + 1;
        e = il1Var.e();
        int i92 = 2 - (e ? 1 : 0);
        if (!e) {
        }
        il1Var.c();
        int i102 = f62 * 16;
        int i112 = f72 * i92 * 16;
        if (il1Var.e()) {
        }
        int i122 = i102;
        if (il1Var.e()) {
            a2 = il1Var.a(8);
            if (a2 != 255) {
            }
            return new gl1(a3, a4, a5, f4, i122, i112, f3);
        }
        f3 = 1.0f;
        return new gl1(a3, a4, a5, f4, i122, i112, f3);
    }

    public static void d(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}