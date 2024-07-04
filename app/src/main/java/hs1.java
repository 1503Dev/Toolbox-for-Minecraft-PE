package defpackage;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: hs1  reason: default package */
public final class hs1 implements fs1 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public pl1 b;
    public final rt1 c;
    public final kh4 d;
    public final ss1 e;
    public final boolean[] f = new boolean[4];
    public final gs1 g = new gs1();
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public hs1(rt1 rt1Var) {
        kh4 kh4Var;
        this.c = rt1Var;
        if (rt1Var != null) {
            this.e = new ss1(178);
            kh4Var = new kh4();
        } else {
            kh4Var = null;
            this.e = null;
        }
        this.d = kh4Var;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.fs1
    public final void b() {
        hl1.d(this.f);
        gs1 gs1Var = this.g;
        gs1Var.a = false;
        gs1Var.b = 0;
        gs1Var.c = 0;
        ss1 ss1Var = this.e;
        if (ss1Var != null) {
            ss1Var.b();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0205  */
    @Override // defpackage.fs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(kh4 kh4Var) {
        int i;
        int i2;
        ss1 ss1Var;
        int i3;
        long j;
        boolean z;
        long j2;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        float f;
        int i8;
        kh4 kh4Var2 = kh4Var;
        tv2.B(this.b);
        int i9 = kh4Var2.b;
        int i10 = kh4Var2.c;
        byte[] bArr = kh4Var2.a;
        int i11 = i10 - i9;
        this.h += i11;
        this.b.a(i11, kh4Var2);
        while (true) {
            int a = hl1.a(bArr, i9, i10, this.f);
            if (a == i10) {
                break;
            }
            int i12 = a + 3;
            int i13 = kh4Var2.a[i12] & 255;
            int i14 = a - i9;
            if (!this.j) {
                if (i14 > 0) {
                    this.g.a(bArr, i9, a);
                }
                if (i14 < 0) {
                    i5 = -i14;
                } else {
                    i5 = 0;
                }
                gs1 gs1Var = this.g;
                if (gs1Var.a) {
                    int i15 = gs1Var.b - i5;
                    gs1Var.b = i15;
                    if (gs1Var.c == 0 && i13 == 181) {
                        gs1Var.c = i15;
                    } else {
                        gs1Var.a = false;
                        z2 = true;
                        if (z2) {
                            gs1 gs1Var2 = this.g;
                            String str = this.a;
                            str.getClass();
                            byte[] copyOf = Arrays.copyOf(gs1Var2.d, gs1Var2.b);
                            int i16 = copyOf[5] & 255;
                            int i17 = i16 & 15;
                            i2 = i12;
                            int i18 = ((copyOf[4] & 255) << 4) | (i16 >> 4);
                            int i19 = (copyOf[7] & 240) >> 4;
                            int i20 = (i17 << 8) | (copyOf[6] & 255);
                            if (i19 != 2) {
                                if (i19 != 3) {
                                    if (i19 != 4) {
                                        f = 1.0f;
                                        bs1 bs1Var = new bs1();
                                        bs1Var.a = str;
                                        bs1Var.j = "video/mpeg2";
                                        bs1Var.o = i18;
                                        bs1Var.p = i20;
                                        bs1Var.s = f;
                                        bs1Var.l = Collections.singletonList(copyOf);
                                        cu1 cu1Var = new cu1(bs1Var);
                                        i8 = (copyOf[7] & 15) - 1;
                                        long j3 = 0;
                                        if (i8 < 0 && i8 < 8) {
                                            double d = q[i8];
                                            byte b = copyOf[gs1Var2.c + 9];
                                            int i21 = (b & 96) >> 5;
                                            int i22 = b & 31;
                                            if (i21 != i22) {
                                                double d2 = i21;
                                                Double.isNaN(d2);
                                                Double.isNaN(d2);
                                                i = i9;
                                                double d3 = i22 + 1;
                                                Double.isNaN(d3);
                                                Double.isNaN(d3);
                                                d *= (d2 + 1.0d) / d3;
                                            } else {
                                                i = i9;
                                            }
                                            j3 = (long) (1000000.0d / d);
                                        } else {
                                            i = i9;
                                        }
                                        Pair create = Pair.create(cu1Var, Long.valueOf(j3));
                                        this.b.e((cu1) create.first);
                                        this.k = ((Long) create.second).longValue();
                                        this.j = true;
                                        ss1Var = this.e;
                                        if (ss1Var != null) {
                                            if (i14 > 0) {
                                                ss1Var.a(bArr, i, a);
                                                i4 = 0;
                                            } else {
                                                i4 = -i14;
                                            }
                                            if (this.e.d(i4)) {
                                                ss1 ss1Var2 = this.e;
                                                int b2 = hl1.b(ss1Var2.d, ss1Var2.e);
                                                kh4 kh4Var3 = this.d;
                                                int i23 = zn4.a;
                                                kh4Var3.c(this.e.d, b2);
                                                this.c.a(this.n, this.d);
                                            }
                                            if (i13 == 178) {
                                                kh4Var2 = kh4Var;
                                                if (kh4Var2.a[a + 2] == 1) {
                                                    this.e.c(178);
                                                }
                                                i13 = 178;
                                                if (i13 == 0 && i13 != 179) {
                                                    if (i13 == 184) {
                                                        this.o = true;
                                                    }
                                                } else {
                                                    i3 = i10 - a;
                                                    if (this.p && this.j) {
                                                        j2 = this.n;
                                                        if (j2 != -9223372036854775807L) {
                                                            this.b.b(j2, this.o ? 1 : 0, ((int) (this.h - this.m)) - i3, i3, null);
                                                        }
                                                    }
                                                    if (this.i || this.p) {
                                                        this.m = this.h - i3;
                                                        j = this.l;
                                                        if (j == -9223372036854775807L) {
                                                            long j4 = this.n;
                                                            if (j4 != -9223372036854775807L) {
                                                                j = j4 + this.k;
                                                            } else {
                                                                j = -9223372036854775807L;
                                                            }
                                                        }
                                                        this.n = j;
                                                        this.o = false;
                                                        this.l = -9223372036854775807L;
                                                        this.i = true;
                                                    }
                                                    if (i13 != 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    this.p = z;
                                                }
                                                i9 = i2;
                                            }
                                        }
                                        kh4Var2 = kh4Var;
                                        if (i13 == 0) {
                                        }
                                        i3 = i10 - a;
                                        if (this.p) {
                                            j2 = this.n;
                                            if (j2 != -9223372036854775807L) {
                                            }
                                        }
                                        if (this.i) {
                                        }
                                        this.m = this.h - i3;
                                        j = this.l;
                                        if (j == -9223372036854775807L) {
                                        }
                                        this.n = j;
                                        this.o = false;
                                        this.l = -9223372036854775807L;
                                        this.i = true;
                                        if (i13 != 0) {
                                        }
                                        this.p = z;
                                        i9 = i2;
                                    } else {
                                        i6 = i20 * 121;
                                        i7 = i18 * 100;
                                    }
                                } else {
                                    i6 = i20 * 16;
                                    i7 = i18 * 9;
                                }
                            } else {
                                i6 = i20 * 4;
                                i7 = i18 * 3;
                            }
                            f = i6 / i7;
                            bs1 bs1Var2 = new bs1();
                            bs1Var2.a = str;
                            bs1Var2.j = "video/mpeg2";
                            bs1Var2.o = i18;
                            bs1Var2.p = i20;
                            bs1Var2.s = f;
                            bs1Var2.l = Collections.singletonList(copyOf);
                            cu1 cu1Var2 = new cu1(bs1Var2);
                            i8 = (copyOf[7] & 15) - 1;
                            long j32 = 0;
                            if (i8 < 0) {
                            }
                            i = i9;
                            Pair create2 = Pair.create(cu1Var2, Long.valueOf(j32));
                            this.b.e((cu1) create2.first);
                            this.k = ((Long) create2.second).longValue();
                            this.j = true;
                            ss1Var = this.e;
                            if (ss1Var != null) {
                            }
                            kh4Var2 = kh4Var;
                            if (i13 == 0) {
                            }
                            i3 = i10 - a;
                            if (this.p) {
                            }
                            if (this.i) {
                            }
                            this.m = this.h - i3;
                            j = this.l;
                            if (j == -9223372036854775807L) {
                            }
                            this.n = j;
                            this.o = false;
                            this.l = -9223372036854775807L;
                            this.i = true;
                            if (i13 != 0) {
                            }
                            this.p = z;
                            i9 = i2;
                        }
                    }
                } else if (i13 == 179) {
                    gs1Var.a = true;
                }
                gs1Var.a(gs1.e, 0, 3);
                z2 = false;
                if (z2) {
                }
            }
            i = i9;
            i2 = i12;
            ss1Var = this.e;
            if (ss1Var != null) {
            }
            kh4Var2 = kh4Var;
            if (i13 == 0) {
            }
            i3 = i10 - a;
            if (this.p) {
            }
            if (this.i) {
            }
            this.m = this.h - i3;
            j = this.l;
            if (j == -9223372036854775807L) {
            }
            this.n = j;
            this.o = false;
            this.l = -9223372036854775807L;
            this.i = true;
            if (i13 != 0) {
            }
            this.p = z;
            i9 = i2;
        }
        if (!this.j) {
            this.g.a(bArr, i9, i10);
        }
        ss1 ss1Var3 = this.e;
        if (ss1Var3 != null) {
            ss1Var3.a(bArr, i9, i10);
        }
    }

    @Override // defpackage.fs1
    public final void d() {
    }

    @Override // defpackage.fs1
    public final void e(nk1 nk1Var, pt1 pt1Var) {
        pt1Var.a();
        pt1Var.b();
        this.a = pt1Var.e;
        pt1Var.b();
        this.b = nk1Var.q(pt1Var.d, 2);
        rt1 rt1Var = this.c;
        if (rt1Var != null) {
            rt1Var.b(nk1Var, pt1Var);
        }
    }

    @Override // defpackage.fs1
    public final void f(long j, int i) {
        this.l = j;
    }
}