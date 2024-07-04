package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: vr1  reason: default package */
public final class vr1 implements fs1 {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final String d;
    public String e;
    public pl1 f;
    public pl1 g;
    public boolean k;
    public boolean l;
    public int o;
    public boolean p;
    public int r;
    public pl1 t;
    public long u;
    public final eh4 b = new eh4(new byte[7], 7);
    public final kh4 c = new kh4(Arrays.copyOf(v, 10));
    public int h = 0;
    public int i = 0;
    public int j = 256;
    public int m = -1;
    public int n = -1;
    public long q = -9223372036854775807L;
    public long s = -9223372036854775807L;

    public vr1(String str, boolean z) {
        this.a = z;
        this.d = str;
    }

    public final void a(pl1 pl1Var, long j, int i, int i2) {
        this.h = 4;
        this.i = i;
        this.t = pl1Var;
        this.u = j;
        this.r = i2;
    }

    @Override // defpackage.fs1
    public final void b() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d7  */
    @Override // defpackage.fs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(kh4 kh4Var) {
        int i;
        pl1 pl1Var;
        long j;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.f.getClass();
        int i6 = zn4.a;
        while (true) {
            int i7 = kh4Var.c;
            int i8 = kh4Var.b;
            int i9 = i7 - i8;
            if (i9 > 0) {
                int i10 = this.h;
                int i11 = 4;
                int i12 = -1;
                int i13 = 13;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                int min = Math.min(i9, this.r - this.i);
                                this.t.a(min, kh4Var);
                                int i14 = this.i + min;
                                this.i = i14;
                                int i15 = this.r;
                                if (i14 == i15) {
                                    long j2 = this.s;
                                    if (j2 != -9223372036854775807L) {
                                        this.t.b(j2, 1, i15, 0, null);
                                        this.s += this.u;
                                    }
                                    this.h = 0;
                                    this.i = 0;
                                    this.j = 256;
                                }
                            } else {
                                if (true != this.k) {
                                    i = 5;
                                } else {
                                    i = 7;
                                }
                                if (g(kh4Var, this.b.a, i)) {
                                    this.b.e(0);
                                    if (!this.p) {
                                        int b = this.b.b(2) + 1;
                                        if (b != 2) {
                                            lb4.c("AdtsReader", "Detected audio object type: " + b + ", but assuming AAC LC.");
                                        }
                                        this.b.g(5);
                                        int b2 = this.b.b(3);
                                        int i16 = this.n;
                                        byte[] bArr = {(byte) (((i16 >> 1) & 7) | 16), (byte) (((b2 << 3) & 120) | ((i16 << 7) & 128))};
                                        e16 a = f16.a(new eh4(bArr, 2), false);
                                        bs1 bs1Var = new bs1();
                                        bs1Var.a = this.e;
                                        bs1Var.j = "audio/mp4a-latm";
                                        bs1Var.g = a.c;
                                        bs1Var.w = a.b;
                                        bs1Var.x = a.a;
                                        bs1Var.l = Collections.singletonList(bArr);
                                        bs1Var.c = this.d;
                                        cu1 cu1Var = new cu1(bs1Var);
                                        this.q = 1024000000 / cu1Var.y;
                                        this.f.e(cu1Var);
                                        this.p = true;
                                    } else {
                                        this.b.g(10);
                                    }
                                    this.b.g(4);
                                    int b3 = this.b.b(13) - 7;
                                    if (this.k) {
                                        b3 -= 2;
                                    }
                                    pl1Var = this.f;
                                    j = this.q;
                                    i2 = b3;
                                    i3 = 0;
                                    a(pl1Var, j, i3, i2);
                                }
                            }
                        } else if (g(kh4Var, this.c.a, 10)) {
                            this.g.a(10, this.c);
                            this.c.e(6);
                            pl1Var = this.g;
                            j = 0;
                            i2 = this.c.m() + 10;
                            i3 = 10;
                            a(pl1Var, j, i3, i2);
                        }
                    } else if (i9 != 0) {
                        eh4 eh4Var = this.b;
                        eh4Var.a[0] = kh4Var.a[i8];
                        eh4Var.e(2);
                        int b4 = this.b.b(4);
                        int i17 = this.n;
                        if (i17 != -1 && b4 != i17) {
                            this.l = false;
                            this.h = 0;
                            this.i = 0;
                            this.j = 256;
                        } else {
                            if (!this.l) {
                                this.l = true;
                                this.m = this.o;
                                this.n = b4;
                            }
                            this.h = 3;
                            this.i = 0;
                        }
                    }
                } else {
                    byte[] bArr2 = kh4Var.a;
                    while (i8 < i7) {
                        int i18 = i8 + 1;
                        int i19 = bArr2[i8] & 255;
                        if (this.j == 512) {
                            if ((((((byte) i19) & 255) | 65280) & 65526) == 65520) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (!this.l) {
                                    int i20 = i18 - 2;
                                    kh4Var.e(i20 + 1);
                                    byte[] bArr3 = this.b.a;
                                    if (kh4Var.c - kh4Var.b < 1) {
                                        z3 = false;
                                    } else {
                                        kh4Var.a(bArr3, 0, 1);
                                        z3 = true;
                                    }
                                    if (z3) {
                                        this.b.e(i11);
                                        int b5 = this.b.b(1);
                                        int i21 = this.m;
                                        if (i21 == i12 || b5 == i21) {
                                            if (this.n != i12) {
                                                byte[] bArr4 = this.b.a;
                                                if (kh4Var.c - kh4Var.b < 1) {
                                                    z6 = false;
                                                } else {
                                                    kh4Var.a(bArr4, 0, 1);
                                                    z6 = true;
                                                }
                                                if (z6) {
                                                    this.b.e(2);
                                                    if (this.b.b(i11) == this.n) {
                                                        kh4Var.e(i20 + 2);
                                                    }
                                                }
                                            }
                                            byte[] bArr5 = this.b.a;
                                            if (kh4Var.c - kh4Var.b < i11) {
                                                z4 = false;
                                            } else {
                                                kh4Var.a(bArr5, 0, i11);
                                                z4 = true;
                                            }
                                            if (z4) {
                                                this.b.e(14);
                                                int b6 = this.b.b(i13);
                                                if (b6 >= 7) {
                                                    byte[] bArr6 = kh4Var.a;
                                                    int i22 = kh4Var.c;
                                                    int i23 = i20 + b6;
                                                    if (i23 < i22) {
                                                        byte b7 = bArr6[i23];
                                                        if (b7 == -1) {
                                                            int i24 = i23 + 1;
                                                            if (i24 != i22) {
                                                                byte b8 = bArr6[i24];
                                                                if ((((b8 & 255) | 65280) & 65526) == 65520) {
                                                                    z5 = true;
                                                                } else {
                                                                    z5 = false;
                                                                }
                                                                if (z5 && ((b8 & 8) >> 3) == b5) {
                                                                }
                                                            }
                                                        } else if (b7 == 73) {
                                                            int i25 = i23 + 1;
                                                            if (i25 != i22) {
                                                                if (bArr6[i25] == 68) {
                                                                    int i26 = i23 + 2;
                                                                    if (i26 != i22) {
                                                                        if (bArr6[i26] == 51) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        kh4Var.e(i18);
                                                        break;
                                                    }
                                                }
                                                int i27 = this.j;
                                                i4 = i19 | i27;
                                                if (i4 == 329) {
                                                    if (i4 != 511) {
                                                        if (i4 != 836) {
                                                            if (i4 != 1075) {
                                                                if (i27 != 256) {
                                                                    this.j = 256;
                                                                    i8 = i18 - 1;
                                                                    i11 = 4;
                                                                    i12 = -1;
                                                                    i13 = 13;
                                                                } else {
                                                                    i8 = i18;
                                                                    i11 = 4;
                                                                    i12 = -1;
                                                                    i13 = 13;
                                                                }
                                                            } else {
                                                                this.h = 2;
                                                                this.i = 3;
                                                                this.r = 0;
                                                                this.c.e(0);
                                                                kh4Var.e(i18);
                                                                break;
                                                                break;
                                                            }
                                                        } else {
                                                            i5 = 1024;
                                                        }
                                                    } else {
                                                        i5 = 512;
                                                    }
                                                } else {
                                                    i5 = 768;
                                                }
                                                this.j = i5;
                                                i8 = i18;
                                                i11 = 4;
                                                i12 = -1;
                                                i13 = 13;
                                            }
                                        }
                                    }
                                }
                                this.o = (i19 & 8) >> 3;
                                if (1 != ((i19 & 1) ^ 1)) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                this.k = z2;
                                if (!this.l) {
                                    this.h = 1;
                                    this.i = 0;
                                } else {
                                    this.h = 3;
                                    this.i = 0;
                                }
                                kh4Var.e(i18);
                                break;
                                break;
                            }
                        }
                        int i272 = this.j;
                        i4 = i19 | i272;
                        if (i4 == 329) {
                        }
                        this.j = i5;
                        i8 = i18;
                        i11 = 4;
                        i12 = -1;
                        i13 = 13;
                    }
                    kh4Var.e(i8);
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
        this.e = pt1Var.e;
        pt1Var.b();
        pl1 q = nk1Var.q(pt1Var.d, 1);
        this.f = q;
        this.t = q;
        if (this.a) {
            pt1Var.a();
            pt1Var.b();
            pl1 q2 = nk1Var.q(pt1Var.d, 5);
            this.g = q2;
            bs1 bs1Var = new bs1();
            pt1Var.b();
            bs1Var.a = pt1Var.e;
            bs1Var.j = "application/id3";
            q2.e(new cu1(bs1Var));
            return;
        }
        this.g = new kk1();
    }

    @Override // defpackage.fs1
    public final void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    public final boolean g(kh4 kh4Var, byte[] bArr, int i) {
        int min = Math.min(kh4Var.c - kh4Var.b, i - this.i);
        kh4Var.a(bArr, this.i, min);
        int i2 = this.i + min;
        this.i = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}