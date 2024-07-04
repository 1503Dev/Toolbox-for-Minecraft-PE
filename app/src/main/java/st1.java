package defpackage;

/* renamed from: st1  reason: default package */
public final class st1 implements tt1 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final nk1 a;
    public final pl1 b;
    public final wt1 c;
    public final int d;
    public final byte[] e;
    public final kh4 f;
    public final int g;
    public final cu1 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public st1(nk1 nk1Var, pl1 pl1Var, wt1 wt1Var) {
        this.a = nk1Var;
        this.b = pl1Var;
        this.c = wt1Var;
        int max = Math.max(1, wt1Var.b / 10);
        this.g = max;
        kh4 kh4Var = new kh4(wt1Var.e);
        kh4Var.l();
        int l = kh4Var.l();
        this.d = l;
        int i = wt1Var.a;
        int i2 = wt1Var.c;
        int c = qq.c(i2 - (i * 4), 8, wt1Var.d * i, 1);
        if (l == c) {
            int i3 = zn4.a;
            int i4 = ((max + l) - 1) / l;
            this.e = new byte[i2 * i4];
            this.f = new kh4((l + l) * i * i4);
            int i5 = wt1Var.b;
            int i6 = ((wt1Var.c * i5) * 8) / l;
            bs1 bs1Var = new bs1();
            bs1Var.j = "audio/raw";
            bs1Var.e = i6;
            bs1Var.f = i6;
            bs1Var.k = (max + max) * i;
            bs1Var.w = wt1Var.a;
            bs1Var.x = i5;
            bs1Var.y = 2;
            this.h = new cu1(bs1Var);
            return;
        }
        throw jy2.a("Expected frames per block: " + c + "; got: " + l, null);
    }

    @Override // defpackage.tt1
    public final void a(long j, int i) {
        this.a.n(new zt1(this.c, this.d, i, j));
        this.b.e(this.h);
    }

    public final void b(int i) {
        long r = this.j + zn4.r(this.l, 1000000L, this.c.b);
        int i2 = (i + i) * this.c.a;
        this.b.b(r, 1, i2, this.k - i2, null);
        this.l += i;
        this.k -= i2;
    }

    @Override // defpackage.tt1
    public final void c(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0040 -> B:11:0x0042). Please submit an issue!!! */
    @Override // defpackage.tt1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(p16 p16Var, long j) {
        int i;
        boolean z;
        p16 p16Var2;
        int i2;
        int i3;
        int i4;
        int i5 = this.g;
        int i6 = this.k;
        wt1 wt1Var = this.c;
        int i7 = wt1Var.a;
        int i8 = i5 - (i6 / (i7 + i7));
        int i9 = this.d;
        int i10 = zn4.a;
        int i11 = (((i8 + i9) - 1) / i9) * wt1Var.c;
        if (j == 0) {
            i = i11;
            p16Var2 = p16Var;
            z = true;
            while (!z) {
                if (this.i >= i) {
                    break;
                }
                int x = p16Var2.x(this.e, this.i, (int) Math.min(i - i4, j));
                if (x == -1) {
                    z = true;
                    while (!z) {
                    }
                } else {
                    this.i += x;
                }
            }
            i2 = this.i / this.c.c;
            if (i2 > 0) {
                byte[] bArr = this.e;
                kh4 kh4Var = this.f;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = 0;
                    while (true) {
                        wt1 wt1Var2 = this.c;
                        int i14 = wt1Var2.a;
                        if (i13 < i14) {
                            byte[] bArr2 = kh4Var.a;
                            int i15 = wt1Var2.c;
                            int i16 = i12 * i15;
                            int i17 = (i15 / i14) - 4;
                            int i18 = (i13 * 4) + i16;
                            int min = Math.min(bArr[i18 + 2] & 255, 88);
                            int i19 = n[min];
                            int i20 = (this.d * i12 * i14) + i13;
                            int i21 = (short) (((bArr[i18 + 1] & 255) << 8) | (bArr[i18] & 255));
                            int i22 = i20 + i20;
                            bArr2[i22] = (byte) (i21 & 255);
                            bArr2[i22 + 1] = (byte) (i21 >> 8);
                            int i23 = 0;
                            while (i23 < i17 + i17) {
                                int i24 = bArr[((i23 / 8) * i14 * 4) + (i14 * 4) + i18 + ((i23 / 2) % 4)] & 255;
                                if (i23 % 2 == 0) {
                                    i3 = i24 & 15;
                                } else {
                                    i3 = i24 >> 4;
                                }
                                int i25 = i3 & 7;
                                byte[] bArr3 = bArr;
                                int i26 = (((i25 + i25) + 1) * i19) >> 3;
                                if ((i3 & 8) != 0) {
                                    i26 = -i26;
                                }
                                i21 = Math.max(-32768, Math.min(i21 + i26, 32767));
                                i22 += i14 + i14;
                                bArr2[i22] = (byte) (i21 & 255);
                                bArr2[i22 + 1] = (byte) (i21 >> 8);
                                int max = Math.max(0, Math.min(min + m[i3], 88));
                                i19 = n[max];
                                i23++;
                                i17 = i17;
                                min = max;
                                bArr = bArr3;
                            }
                            i13++;
                        }
                    }
                }
                int i27 = this.d * i2;
                kh4Var.e(0);
                kh4Var.d((i27 + i27) * this.c.a);
                this.i -= i2 * this.c.c;
                kh4 kh4Var2 = this.f;
                int i28 = kh4Var2.c;
                this.b.c(kh4Var2, i28);
                int i29 = this.k + i28;
                this.k = i29;
                int i30 = this.c.a;
                int i31 = i29 / (i30 + i30);
                int i32 = this.g;
                if (i31 >= i32) {
                    b(i32);
                }
            }
            if (z) {
                int i33 = this.k;
                int i34 = this.c.a;
                int i35 = i33 / (i34 + i34);
                if (i35 > 0) {
                    b(i35);
                }
            }
            return z;
        }
        i = i11;
        z = false;
        p16Var2 = p16Var;
        while (!z) {
        }
        i2 = this.i / this.c.c;
        if (i2 > 0) {
        }
        if (z) {
        }
        return z;
    }
}