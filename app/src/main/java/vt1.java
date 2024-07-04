package defpackage;

import android.util.Pair;

/* renamed from: vt1  reason: default package */
public final class vt1 implements lk1 {
    public nk1 a;
    public pl1 b;
    public tt1 e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // defpackage.lk1
    public final boolean a(p16 p16Var) {
        return yt1.a(p16Var);
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.a = nk1Var;
        this.b = nk1Var.q(0, 1);
        nk1Var.j();
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        tt1 tt1Var = this.e;
        if (tt1Var != null) {
            tt1Var.c(j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0179, code lost:
        if (r5 != 65534) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a6  */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        boolean z;
        boolean z2;
        byte[] bArr;
        int m;
        tt1 ut1Var;
        tv2.B(this.b);
        int i = zn4.a;
        int i2 = this.c;
        boolean z3 = true;
        if (i2 != 0) {
            long j = -1;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (this.g == -1) {
                            z3 = false;
                        }
                        tv2.I(z3);
                        p16 p16Var = (p16) mk1Var;
                        long j2 = this.g - p16Var.d;
                        tt1 tt1Var = this.e;
                        tt1Var.getClass();
                        if (!tt1Var.d(p16Var, j2)) {
                            return 0;
                        }
                        return -1;
                    }
                    p16 p16Var2 = (p16) mk1Var;
                    p16Var2.f = 0;
                    xt1 b = yt1.b(1684108385, p16Var2, new kh4(8));
                    ((p16) mk1Var).k(8);
                    Pair create = Pair.create(Long.valueOf(p16Var2.d), Long.valueOf(b.b));
                    this.f = ((Long) create.first).intValue();
                    long longValue = ((Long) create.second).longValue();
                    long j3 = this.d;
                    if (j3 != -1 && longValue == 4294967295L) {
                        longValue = j3;
                    }
                    long j4 = this.f + longValue;
                    this.g = j4;
                    long j5 = p16Var2.c;
                    if (j5 != -1 && j4 > j5) {
                        lb4.c("WavExtractor", "Data exceeds input length: " + j4 + ", " + j5);
                        this.g = j5;
                        j4 = j5;
                    }
                    tt1 tt1Var2 = this.e;
                    tt1Var2.getClass();
                    tt1Var2.a(j4, this.f);
                    this.c = 4;
                    return 0;
                }
                kh4 kh4Var = new kh4(16);
                p16 p16Var3 = (p16) mk1Var;
                xt1 b2 = yt1.b(1718449184, p16Var3, kh4Var);
                if (b2.b >= 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                tv2.I(z2);
                p16 p16Var4 = (p16) mk1Var;
                p16Var4.B(kh4Var.a, 0, 16, false);
                kh4Var.e(0);
                int l = kh4Var.l();
                int l2 = kh4Var.l();
                int k = kh4Var.k();
                kh4Var.k();
                int l3 = kh4Var.l();
                int l4 = kh4Var.l();
                int i3 = ((int) b2.b) - 16;
                if (i3 > 0) {
                    byte[] bArr2 = new byte[i3];
                    p16Var4.B(bArr2, 0, i3, false);
                    bArr = bArr2;
                } else {
                    bArr = zn4.f;
                }
                p16Var4.k((int) (p16Var3.b() - p16Var3.d));
                wt1 wt1Var = new wt1(l, l2, k, l3, l4, bArr);
                if (l == 17) {
                    ut1Var = new st1(this.a, this.b, wt1Var);
                } else if (l == 6) {
                    ut1Var = new ut1(this.a, this.b, wt1Var, "audio/g711-alaw", -1);
                } else if (l == 7) {
                    ut1Var = new ut1(this.a, this.b, wt1Var, "audio/g711-mlaw", -1);
                } else {
                    if (l != 1) {
                        if (l == 3) {
                            if (l4 == 32) {
                                m = 4;
                                if (m != 0) {
                                    ut1Var = new ut1(this.a, this.b, wt1Var, "audio/raw", m);
                                } else {
                                    throw jy2.b("Unsupported WAV format type: " + l);
                                }
                            }
                        }
                        m = 0;
                        if (m != 0) {
                        }
                    }
                    m = zn4.m(l4);
                    if (m != 0) {
                    }
                }
                this.e = ut1Var;
                this.c = 3;
                return 0;
            }
            kh4 kh4Var2 = new kh4(8);
            p16 p16Var5 = (p16) mk1Var;
            xt1 a = xt1.a(p16Var5, kh4Var2);
            if (a.a != 1685272116) {
                p16Var5.f = 0;
            } else {
                p16 p16Var6 = (p16) mk1Var;
                p16Var6.h(8, false);
                kh4Var2.e(0);
                p16Var6.B(kh4Var2.a, 0, 8, false);
                j = kh4Var2.r();
                p16Var6.k(((int) a.b) + 8);
            }
            this.d = j;
            this.c = 2;
            return 0;
        }
        p16 p16Var7 = (p16) mk1Var;
        if (p16Var7.d == 0) {
            z = true;
        } else {
            z = false;
        }
        tv2.I(z);
        int i4 = this.f;
        if (i4 != -1) {
            ((p16) mk1Var).k(i4);
            this.c = 4;
        } else if (yt1.a(p16Var7)) {
            ((p16) mk1Var).k((int) (p16Var7.b() - p16Var7.d));
            this.c = 1;
        } else {
            throw jy2.a("Unsupported or unrecognized wav file type.", null);
        }
        return 0;
    }
}