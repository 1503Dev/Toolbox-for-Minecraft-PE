package defpackage;

import java.util.Arrays;

/* renamed from: xr1  reason: default package */
public final class xr1 implements fs1 {
    public final String b;
    public String c;
    public pl1 d;
    public int f;
    public int g;
    public long h;
    public cu1 i;
    public int j;
    public final kh4 a = new kh4(new byte[18]);
    public int e = 0;
    public long k = -9223372036854775807L;

    public xr1(String str) {
        this.b = str;
    }

    @Override // defpackage.fs1
    public final void b() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0282  */
    @Override // defpackage.fs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(kh4 kh4Var) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        eh4 eh4Var;
        int i9;
        int i10;
        int i11;
        int i12;
        tv2.B(this.d);
        while (true) {
            int i13 = kh4Var.c - kh4Var.b;
            if (i13 > 0) {
                int i14 = this.e;
                int i15 = 2;
                if (i14 != 0) {
                    if (i14 != 1) {
                        int min = Math.min(i13, this.j - this.f);
                        this.d.a(min, kh4Var);
                        int i16 = this.f + min;
                        this.f = i16;
                        int i17 = this.j;
                        if (i16 == i17) {
                            long j = this.k;
                            if (j != -9223372036854775807L) {
                                this.d.b(j, 1, i17, 0, null);
                                this.k += this.h;
                            }
                            this.e = 0;
                        }
                    } else {
                        byte[] bArr = this.a.a;
                        int min2 = Math.min(i13, 18 - this.f);
                        kh4Var.a(bArr, this.f, min2);
                        int i18 = this.f + min2;
                        this.f = i18;
                        if (i18 == 18) {
                            byte[] bArr2 = this.a.a;
                            int i19 = 14;
                            if (this.i == null) {
                                String str = this.c;
                                String str2 = this.b;
                                if (bArr2[0] == Byte.MAX_VALUE) {
                                    eh4Var = new eh4(bArr2, bArr2.length);
                                } else {
                                    byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
                                    byte b = copyOf[0];
                                    if (b == -2 || b == -1) {
                                        for (int i20 = 0; i20 < copyOf.length - 1; i20 += 2) {
                                            byte b2 = copyOf[i20];
                                            int i21 = i20 + 1;
                                            copyOf[i20] = copyOf[i21];
                                            copyOf[i21] = b2;
                                        }
                                    }
                                    int length = copyOf.length;
                                    eh4 eh4Var2 = new eh4(copyOf, length);
                                    if (copyOf[0] == 31) {
                                        eh4 eh4Var3 = new eh4(copyOf, length);
                                        while (eh4Var3.a() >= 16) {
                                            eh4Var3.g(i15);
                                            int b3 = eh4Var3.b(i19);
                                            int min3 = Math.min(8 - eh4Var2.c, i19);
                                            int i22 = eh4Var2.c;
                                            int i23 = (8 - i22) - min3;
                                            byte[] bArr3 = eh4Var2.a;
                                            int i24 = eh4Var2.b;
                                            byte b4 = (byte) (((65280 >> i22) | ((1 << i23) - 1)) & bArr3[i24]);
                                            bArr3[i24] = b4;
                                            int i25 = 14 - min3;
                                            int i26 = b3 & 16383;
                                            bArr3[i24] = (byte) (b4 | ((i26 >>> i25) << i23));
                                            int i27 = i24 + 1;
                                            for (int i28 = 8; i25 > i28; i28 = 8) {
                                                i25 -= 8;
                                                eh4Var2.a[i27] = (byte) (i26 >>> i25);
                                                i27++;
                                            }
                                            byte[] bArr4 = eh4Var2.a;
                                            byte b5 = (byte) (bArr4[i27] & ((1 << i9) - 1));
                                            bArr4[i27] = b5;
                                            bArr4[i27] = (byte) (((i26 & ((1 << i25) - 1)) << (8 - i25)) | b5);
                                            eh4Var2.g(14);
                                            eh4Var2.j();
                                            i15 = 2;
                                            i19 = 14;
                                        }
                                    }
                                    int length2 = copyOf.length;
                                    eh4Var2.a = copyOf;
                                    eh4Var2.b = 0;
                                    eh4Var2.c = 0;
                                    eh4Var2.d = length2;
                                    eh4Var = eh4Var2;
                                }
                                eh4Var.g(60);
                                int i29 = n9.P[eh4Var.b(6)];
                                int i30 = n9.Q[eh4Var.b(4)];
                                int b6 = eh4Var.b(5);
                                if (b6 >= 29) {
                                    i11 = -1;
                                    i10 = 2;
                                } else {
                                    i10 = 2;
                                    i11 = (n9.R[b6] * 1000) / 2;
                                }
                                eh4Var.g(10);
                                if (eh4Var.b(i10) > 0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                int i31 = i29 + i12;
                                bs1 bs1Var = new bs1();
                                bs1Var.a = str;
                                bs1Var.j = "audio/vnd.dts";
                                bs1Var.e = i11;
                                bs1Var.w = i31;
                                bs1Var.x = i30;
                                bs1Var.m = null;
                                bs1Var.c = str2;
                                cu1 cu1Var = new cu1(bs1Var);
                                this.i = cu1Var;
                                this.d.e(cu1Var);
                            }
                            byte b7 = bArr2[0];
                            if (b7 != -2) {
                                if (b7 != -1) {
                                    if (b7 != 31) {
                                        i = ((3 & bArr2[5]) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4);
                                    } else {
                                        i8 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4) | ((bArr2[8] & 60) >> 2);
                                    }
                                } else {
                                    i8 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[9] & 60) >> 2);
                                }
                                i2 = i8 + 1;
                                z = true;
                                if (z) {
                                    i2 = (i2 * 16) / 14;
                                }
                                this.j = i2;
                                if (b7 == -2) {
                                    if (b7 != -1) {
                                        if (b7 != 31) {
                                            i7 = (bArr2[4] & 1) << 6;
                                            i5 = bArr2[5] & 252;
                                        } else {
                                            i7 = (7 & bArr2[5]) << 4;
                                            i5 = bArr2[6] & 60;
                                        }
                                        i4 = i7;
                                        i3 = 2;
                                    } else {
                                        i6 = ((bArr2[7] & 60) >> 2) | ((bArr2[4] & 7) << 4);
                                        this.h = (int) ((((i6 + 1) * 32) * 1000000) / this.i.y);
                                        this.a.e(0);
                                        this.d.a(18, this.a);
                                        this.e = 2;
                                    }
                                } else {
                                    i3 = 2;
                                    i4 = (bArr2[5] & 1) << 6;
                                    i5 = bArr2[4] & 252;
                                }
                                i6 = (i5 >> i3) | i4;
                                this.h = (int) ((((i6 + 1) * 32) * 1000000) / this.i.y);
                                this.a.e(0);
                                this.d.a(18, this.a);
                                this.e = 2;
                            } else {
                                i = ((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4) | ((bArr2[6] & 240) >> 4);
                            }
                            i2 = i + 1;
                            z = false;
                            if (z) {
                            }
                            this.j = i2;
                            if (b7 == -2) {
                            }
                            i6 = (i5 >> i3) | i4;
                            this.h = (int) ((((i6 + 1) * 32) * 1000000) / this.i.y);
                            this.a.e(0);
                            this.d.a(18, this.a);
                            this.e = 2;
                        }
                    }
                } else {
                    while (kh4Var.c - kh4Var.b > 0) {
                        int i32 = this.g << 8;
                        this.g = i32;
                        int n = i32 | kh4Var.n();
                        this.g = n;
                        if (n == 2147385345 || n == -25230976 || n == 536864768 || n == -14745368) {
                            byte[] bArr5 = this.a.a;
                            bArr5[0] = (byte) ((n >> 24) & 255);
                            bArr5[1] = (byte) ((n >> 16) & 255);
                            bArr5[2] = (byte) ((n >> 8) & 255);
                            bArr5[3] = (byte) (n & 255);
                            this.f = 4;
                            this.g = 0;
                            this.e = 1;
                            break;
                        }
                        while (kh4Var.c - kh4Var.b > 0) {
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.fs1
    public final void d() {
    }

    @Override // defpackage.fs1
    public final void e(nk1 nk1Var, pt1 pt1Var) {
        pt1Var.a();
        pt1Var.b();
        this.c = pt1Var.e;
        pt1Var.b();
        this.d = nk1Var.q(pt1Var.d, 1);
    }

    @Override // defpackage.fs1
    public final void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }
}