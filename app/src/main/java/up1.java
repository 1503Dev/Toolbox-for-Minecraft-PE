package defpackage;

import java.io.EOFException;

/* renamed from: up1  reason: default package */
public final class up1 implements lk1 {
    public final kh4 a;
    public final el1 b;
    public final uk1 c;
    public final wk1 d;
    public nk1 e;
    public pl1 f;
    public pl1 g;
    public int h;
    public yt2 i;
    public long j;
    public long k;
    public long l;
    public int m;
    public wp1 n;
    public boolean o;

    public up1() {
        this(0);
    }

    public up1(int i) {
        this.a = new kh4(10);
        this.b = new el1();
        this.c = new uk1();
        this.j = -9223372036854775807L;
        this.d = new wk1(0);
        this.g = new kk1();
    }

    @Override // defpackage.lk1
    public final boolean a(p16 p16Var) {
        return f(p16Var, true);
    }

    public final rp1 b(p16 p16Var) {
        p16Var.B(this.a.a, 0, 4, false);
        this.a.e(0);
        this.b.a(this.a.i());
        return new rp1(p16Var.c, p16Var.d, this.b);
    }

    public final boolean c(p16 p16Var) {
        wp1 wp1Var = this.n;
        if (wp1Var != null) {
            long c = wp1Var.c();
            if (c != -1 && p16Var.b() > c - 4) {
                return true;
            }
        }
        try {
            if (!p16Var.B(this.a.a, 0, 4, true)) {
                return true;
            }
            return false;
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.e = nk1Var;
        pl1 q = nk1Var.q(0, 1);
        this.f = q;
        this.g = q;
        this.e.j();
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        this.h = 0;
        this.j = -9223372036854775807L;
        this.k = 0L;
        this.m = 0;
        wp1 wp1Var = this.n;
        if (wp1Var instanceof sp1) {
            sp1 sp1Var = (sp1) wp1Var;
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(p16 p16Var, boolean z) {
        int i;
        int i2;
        boolean z2;
        p16Var.f = 0;
        if (p16Var.d == 0) {
            yt2 h = this.d.h(p16Var, null);
            this.i = h;
            if (h != null) {
                this.c.a(h);
            }
            i = (int) p16Var.b();
            if (!z) {
                p16Var.k(i);
            }
        } else {
            i = 0;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (c(p16Var)) {
                if (i4 <= 0) {
                    throw new EOFException();
                }
            } else {
                this.a.e(0);
                int i6 = this.a.i();
                if (i3 != 0) {
                    if (((-128000) & i6) == (i3 & (-128000))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        if (true == z) {
                            i2 = 131072;
                        } else {
                            i2 = 32768;
                        }
                        int i7 = i5 + 1;
                        if (i5 != i2) {
                            if (z) {
                                return false;
                            }
                            throw jy2.a("Searched too many bytes.", null);
                        }
                        if (z) {
                            p16Var.f = 0;
                            p16Var.h(i + i7, false);
                        } else {
                            p16Var.k(1);
                        }
                        i5 = i7;
                        i3 = 0;
                        i4 = 0;
                    }
                }
                int s = ga1.s(i6);
                if (s == -1) {
                    if (true == z) {
                    }
                    int i72 = i5 + 1;
                    if (i5 != i2) {
                    }
                } else {
                    i4++;
                    if (i4 == 1) {
                        this.b.a(i6);
                        i3 = i6;
                    } else if (i4 == 4) {
                        break;
                    }
                    p16Var.h(s - 4, false);
                }
            }
        }
        if (z) {
            p16Var.k(i + i5);
        } else {
            p16Var.f = 0;
        }
        this.h = i3;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0257  */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        int i;
        int i2;
        mk1 mk1Var2;
        el1 el1Var;
        boolean z;
        el1 el1Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        p16 p16Var;
        wp1 wp1Var;
        p16 p16Var2;
        boolean z2;
        int p;
        yt2 yt2Var;
        wp1 wp1Var2;
        long j;
        wp1 wp1Var3;
        int i7;
        int n;
        up1 up1Var = this;
        tv2.B(up1Var.f);
        int i8 = zn4.a;
        if (up1Var.h == 0) {
            try {
                up1Var.f((p16) mk1Var, false);
            } catch (EOFException unused) {
            }
        }
        if (up1Var.n == null) {
            kh4 kh4Var = new kh4(up1Var.b.c);
            p16 p16Var3 = (p16) mk1Var;
            p16Var3.B(kh4Var.a, 0, up1Var.b.c, false);
            el1 el1Var3 = up1Var.b;
            int i9 = el1Var3.a & 1;
            int i10 = el1Var3.e;
            if (i9 != 0) {
                if (i10 != 1) {
                    i3 = 36;
                    if (kh4Var.c >= i3 + 4) {
                        kh4Var.e(i3);
                        i4 = kh4Var.i();
                        if (i4 != 1483304551) {
                            if (i4 == 1231971951) {
                                i4 = 1231971951;
                            }
                        }
                        String str = ", ";
                        if (i4 == 1483304551 && i4 != 1231971951) {
                            if (i4 == 1447187017) {
                                p16 p16Var4 = (p16) mk1Var;
                                long j2 = p16Var4.c;
                                long j3 = p16Var4.d;
                                el1 el1Var4 = up1Var.b;
                                kh4Var.f(10);
                                int i11 = kh4Var.i();
                                if (i11 > 0) {
                                    int i12 = el1Var4.d;
                                    if (i12 >= 32000) {
                                        i7 = 1152;
                                    } else {
                                        i7 = 576;
                                    }
                                    long r = zn4.r(i11, i7 * 1000000, i12);
                                    int q = kh4Var.q();
                                    int q2 = kh4Var.q();
                                    int q3 = kh4Var.q();
                                    kh4Var.f(2);
                                    long j4 = el1Var4.c + j3;
                                    long[] jArr = new long[q];
                                    long[] jArr2 = new long[q];
                                    long j5 = j3;
                                    int i13 = 0;
                                    while (true) {
                                        long j6 = j2;
                                        if (i13 < q) {
                                            int i14 = q2;
                                            int i15 = q3;
                                            jArr[i13] = (i13 * r) / q;
                                            jArr2[i13] = Math.max(j5, j4);
                                            if (i15 != 1) {
                                                if (i15 != 2) {
                                                    if (i15 != 3) {
                                                        if (i15 != 4) {
                                                            break;
                                                        }
                                                        n = kh4Var.p();
                                                    } else {
                                                        n = kh4Var.o();
                                                    }
                                                } else {
                                                    n = kh4Var.q();
                                                }
                                            } else {
                                                n = kh4Var.n();
                                            }
                                            j5 += n * i14;
                                            i13++;
                                            str = str;
                                            q2 = i14;
                                            j2 = j6;
                                            q = q;
                                            q3 = i15;
                                        } else {
                                            String str2 = str;
                                            if (j6 != -1 && j6 != j5) {
                                                lb4.c("VbriSeeker", "VBRI data size mismatch: " + j6 + str2 + j5);
                                            }
                                            wp1Var3 = new xp1(jArr, jArr2, r, j5);
                                        }
                                    }
                                    up1Var = this;
                                    p16Var3.k(up1Var.b.c);
                                    wp1Var = wp1Var3;
                                }
                                wp1Var3 = null;
                                up1Var = this;
                                p16Var3.k(up1Var.b.c);
                                wp1Var = wp1Var3;
                            } else {
                                ((p16) mk1Var).f = 0;
                                wp1Var = null;
                            }
                        } else {
                            p16 p16Var5 = (p16) mk1Var;
                            long j7 = p16Var5.c;
                            long j8 = p16Var5.d;
                            el1 el1Var5 = up1Var.b;
                            int i16 = el1Var5.g;
                            int i17 = el1Var5.d;
                            i5 = kh4Var.i();
                            if ((i5 & 1) != 1 && (p = kh4Var.p()) != 0) {
                                i6 = i4;
                                int i18 = i5 & 6;
                                p16Var = p16Var3;
                                long r2 = zn4.r(p, i16 * 1000000, i17);
                                if (i18 != 6) {
                                    wp1Var = new yp1(j8, el1Var5.c, r2, -1L, null);
                                } else {
                                    long u = kh4Var.u();
                                    long[] jArr3 = new long[100];
                                    for (int i19 = 0; i19 < 100; i19++) {
                                        jArr3[i19] = kh4Var.n();
                                    }
                                    if (j7 != -1) {
                                        long j9 = j8 + u;
                                        if (j7 != j9) {
                                            lb4.c("XingSeeker", "XING data size mismatch: " + j7 + ", " + j9);
                                        }
                                    }
                                    wp1Var = new yp1(j8, el1Var5.c, r2, u, jArr3);
                                }
                            } else {
                                i6 = i4;
                                p16Var = p16Var3;
                                wp1Var = null;
                            }
                            if (wp1Var != null) {
                                uk1 uk1Var = up1Var.c;
                                if (uk1Var.a != -1 && uk1Var.b != -1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    p16Var5.f = 0;
                                    p16Var2 = p16Var;
                                    p16Var2.h(i3 + 141, false);
                                    p16Var2.B(up1Var.a.a, 0, 3, false);
                                    up1Var.a.e(0);
                                    uk1 uk1Var2 = up1Var.c;
                                    int o = up1Var.a.o();
                                    int i20 = o >> 12;
                                    int i21 = o & 4095;
                                    if (i20 > 0 || i21 > 0) {
                                        uk1Var2.a = i20;
                                        uk1Var2.b = i21;
                                    }
                                    p16Var2.k(up1Var.b.c);
                                    if (wp1Var != null && !wp1Var.f() && i6 == 1231971951) {
                                        wp1Var = up1Var.b(p16Var5);
                                    }
                                }
                            }
                            p16Var2 = p16Var;
                            p16Var2.k(up1Var.b.c);
                            if (wp1Var != null) {
                                wp1Var = up1Var.b(p16Var5);
                            }
                        }
                        yt2Var = up1Var.i;
                        p16 p16Var6 = (p16) mk1Var;
                        long j10 = p16Var6.d;
                        if (yt2Var != null) {
                            int length = yt2Var.P.length;
                            for (int i22 = 0; i22 < length; i22++) {
                                et2[] et2VarArr = yt2Var.P;
                                et2 et2Var = et2VarArr[i22];
                                if (et2Var instanceof po1) {
                                    po1 po1Var = (po1) et2Var;
                                    int length2 = et2VarArr.length;
                                    int i23 = 0;
                                    while (true) {
                                        if (i23 < length2) {
                                            et2 et2Var2 = yt2Var.P[i23];
                                            if (et2Var2 instanceof to1) {
                                                to1 to1Var = (to1) et2Var2;
                                                if (to1Var.P.equals("TLEN")) {
                                                    j = zn4.q(Long.parseLong((String) to1Var.R.get(0)));
                                                    break;
                                                }
                                            }
                                            i23++;
                                        } else {
                                            j = -9223372036854775807L;
                                            break;
                                        }
                                    }
                                    int length3 = po1Var.T.length;
                                    int i24 = length3 + 1;
                                    long[] jArr4 = new long[i24];
                                    long[] jArr5 = new long[i24];
                                    jArr4[0] = j10;
                                    jArr5[0] = 0;
                                    long j11 = j10;
                                    int i25 = 1;
                                    long j12 = 0;
                                    while (i25 <= length3) {
                                        int i26 = i25 - 1;
                                        j11 += po1Var.R + po1Var.T[i26];
                                        j12 += po1Var.S + po1Var.U[i26];
                                        jArr4[i25] = j11;
                                        jArr5[i25] = j12;
                                        i25++;
                                        length3 = length3;
                                    }
                                    wp1Var2 = new tp1(j, jArr4, jArr5);
                                    if (up1Var.o) {
                                        wp1Var = new vp1();
                                    } else {
                                        if (wp1Var2 != null) {
                                            wp1Var = wp1Var2;
                                        } else if (wp1Var == null) {
                                            wp1Var = null;
                                        }
                                        if (wp1Var != null) {
                                            wp1Var.f();
                                        } else {
                                            wp1Var = up1Var.b(p16Var6);
                                        }
                                    }
                                    up1Var.n = wp1Var;
                                    up1Var.e.n(wp1Var);
                                    pl1 pl1Var = up1Var.g;
                                    bs1 bs1Var = new bs1();
                                    el1 el1Var6 = up1Var.b;
                                    bs1Var.j = el1Var6.b;
                                    bs1Var.k = 4096;
                                    bs1Var.w = el1Var6.e;
                                    bs1Var.x = el1Var6.d;
                                    uk1 uk1Var3 = up1Var.c;
                                    bs1Var.z = uk1Var3.a;
                                    bs1Var.A = uk1Var3.b;
                                    bs1Var.h = up1Var.i;
                                    pl1Var.e(new cu1(bs1Var));
                                    up1Var.l = p16Var6.d;
                                    mk1Var2 = mk1Var;
                                }
                            }
                        }
                        wp1Var2 = null;
                        if (up1Var.o) {
                        }
                        up1Var.n = wp1Var;
                        up1Var.e.n(wp1Var);
                        pl1 pl1Var2 = up1Var.g;
                        bs1 bs1Var2 = new bs1();
                        el1 el1Var62 = up1Var.b;
                        bs1Var2.j = el1Var62.b;
                        bs1Var2.k = 4096;
                        bs1Var2.w = el1Var62.e;
                        bs1Var2.x = el1Var62.d;
                        uk1 uk1Var32 = up1Var.c;
                        bs1Var2.z = uk1Var32.a;
                        bs1Var2.A = uk1Var32.b;
                        bs1Var2.h = up1Var.i;
                        pl1Var2.e(new cu1(bs1Var2));
                        up1Var.l = p16Var6.d;
                        mk1Var2 = mk1Var;
                    }
                    if (kh4Var.c >= 40) {
                        kh4Var.e(36);
                        if (kh4Var.i() == 1447187017) {
                            i4 = 1447187017;
                            String str3 = ", ";
                            if (i4 == 1483304551) {
                            }
                            p16 p16Var52 = (p16) mk1Var;
                            long j72 = p16Var52.c;
                            long j82 = p16Var52.d;
                            el1 el1Var52 = up1Var.b;
                            int i162 = el1Var52.g;
                            int i172 = el1Var52.d;
                            i5 = kh4Var.i();
                            if ((i5 & 1) != 1) {
                            }
                            i6 = i4;
                            p16Var = p16Var3;
                            wp1Var = null;
                            if (wp1Var != null) {
                            }
                            p16Var2 = p16Var;
                            p16Var2.k(up1Var.b.c);
                            if (wp1Var != null) {
                            }
                            yt2Var = up1Var.i;
                            p16 p16Var62 = (p16) mk1Var;
                            long j102 = p16Var62.d;
                            if (yt2Var != null) {
                            }
                            wp1Var2 = null;
                            if (up1Var.o) {
                            }
                            up1Var.n = wp1Var;
                            up1Var.e.n(wp1Var);
                            pl1 pl1Var22 = up1Var.g;
                            bs1 bs1Var22 = new bs1();
                            el1 el1Var622 = up1Var.b;
                            bs1Var22.j = el1Var622.b;
                            bs1Var22.k = 4096;
                            bs1Var22.w = el1Var622.e;
                            bs1Var22.x = el1Var622.d;
                            uk1 uk1Var322 = up1Var.c;
                            bs1Var22.z = uk1Var322.a;
                            bs1Var22.A = uk1Var322.b;
                            bs1Var22.h = up1Var.i;
                            pl1Var22.e(new cu1(bs1Var22));
                            up1Var.l = p16Var62.d;
                            mk1Var2 = mk1Var;
                        }
                    }
                    i4 = 0;
                    String str32 = ", ";
                    if (i4 == 1483304551) {
                    }
                    p16 p16Var522 = (p16) mk1Var;
                    long j722 = p16Var522.c;
                    long j822 = p16Var522.d;
                    el1 el1Var522 = up1Var.b;
                    int i1622 = el1Var522.g;
                    int i1722 = el1Var522.d;
                    i5 = kh4Var.i();
                    if ((i5 & 1) != 1) {
                    }
                    i6 = i4;
                    p16Var = p16Var3;
                    wp1Var = null;
                    if (wp1Var != null) {
                    }
                    p16Var2 = p16Var;
                    p16Var2.k(up1Var.b.c);
                    if (wp1Var != null) {
                    }
                    yt2Var = up1Var.i;
                    p16 p16Var622 = (p16) mk1Var;
                    long j1022 = p16Var622.d;
                    if (yt2Var != null) {
                    }
                    wp1Var2 = null;
                    if (up1Var.o) {
                    }
                    up1Var.n = wp1Var;
                    up1Var.e.n(wp1Var);
                    pl1 pl1Var222 = up1Var.g;
                    bs1 bs1Var222 = new bs1();
                    el1 el1Var6222 = up1Var.b;
                    bs1Var222.j = el1Var6222.b;
                    bs1Var222.k = 4096;
                    bs1Var222.w = el1Var6222.e;
                    bs1Var222.x = el1Var6222.d;
                    uk1 uk1Var3222 = up1Var.c;
                    bs1Var222.z = uk1Var3222.a;
                    bs1Var222.A = uk1Var3222.b;
                    bs1Var222.h = up1Var.i;
                    pl1Var222.e(new cu1(bs1Var222));
                    up1Var.l = p16Var622.d;
                    mk1Var2 = mk1Var;
                }
                i3 = 21;
                if (kh4Var.c >= i3 + 4) {
                }
                if (kh4Var.c >= 40) {
                }
                i4 = 0;
                String str322 = ", ";
                if (i4 == 1483304551) {
                }
                p16 p16Var5222 = (p16) mk1Var;
                long j7222 = p16Var5222.c;
                long j8222 = p16Var5222.d;
                el1 el1Var5222 = up1Var.b;
                int i16222 = el1Var5222.g;
                int i17222 = el1Var5222.d;
                i5 = kh4Var.i();
                if ((i5 & 1) != 1) {
                }
                i6 = i4;
                p16Var = p16Var3;
                wp1Var = null;
                if (wp1Var != null) {
                }
                p16Var2 = p16Var;
                p16Var2.k(up1Var.b.c);
                if (wp1Var != null) {
                }
                yt2Var = up1Var.i;
                p16 p16Var6222 = (p16) mk1Var;
                long j10222 = p16Var6222.d;
                if (yt2Var != null) {
                }
                wp1Var2 = null;
                if (up1Var.o) {
                }
                up1Var.n = wp1Var;
                up1Var.e.n(wp1Var);
                pl1 pl1Var2222 = up1Var.g;
                bs1 bs1Var2222 = new bs1();
                el1 el1Var62222 = up1Var.b;
                bs1Var2222.j = el1Var62222.b;
                bs1Var2222.k = 4096;
                bs1Var2222.w = el1Var62222.e;
                bs1Var2222.x = el1Var62222.d;
                uk1 uk1Var32222 = up1Var.c;
                bs1Var2222.z = uk1Var32222.a;
                bs1Var2222.A = uk1Var32222.b;
                bs1Var2222.h = up1Var.i;
                pl1Var2222.e(new cu1(bs1Var2222));
                up1Var.l = p16Var6222.d;
                mk1Var2 = mk1Var;
            } else {
                if (i10 == 1) {
                    i3 = 13;
                    if (kh4Var.c >= i3 + 4) {
                    }
                    if (kh4Var.c >= 40) {
                    }
                    i4 = 0;
                    String str3222 = ", ";
                    if (i4 == 1483304551) {
                    }
                    p16 p16Var52222 = (p16) mk1Var;
                    long j72222 = p16Var52222.c;
                    long j82222 = p16Var52222.d;
                    el1 el1Var52222 = up1Var.b;
                    int i162222 = el1Var52222.g;
                    int i172222 = el1Var52222.d;
                    i5 = kh4Var.i();
                    if ((i5 & 1) != 1) {
                    }
                    i6 = i4;
                    p16Var = p16Var3;
                    wp1Var = null;
                    if (wp1Var != null) {
                    }
                    p16Var2 = p16Var;
                    p16Var2.k(up1Var.b.c);
                    if (wp1Var != null) {
                    }
                    yt2Var = up1Var.i;
                    p16 p16Var62222 = (p16) mk1Var;
                    long j102222 = p16Var62222.d;
                    if (yt2Var != null) {
                    }
                    wp1Var2 = null;
                    if (up1Var.o) {
                    }
                    up1Var.n = wp1Var;
                    up1Var.e.n(wp1Var);
                    pl1 pl1Var22222 = up1Var.g;
                    bs1 bs1Var22222 = new bs1();
                    el1 el1Var622222 = up1Var.b;
                    bs1Var22222.j = el1Var622222.b;
                    bs1Var22222.k = 4096;
                    bs1Var22222.w = el1Var622222.e;
                    bs1Var22222.x = el1Var622222.d;
                    uk1 uk1Var322222 = up1Var.c;
                    bs1Var22222.z = uk1Var322222.a;
                    bs1Var22222.A = uk1Var322222.b;
                    bs1Var22222.h = up1Var.i;
                    pl1Var22222.e(new cu1(bs1Var22222));
                    up1Var.l = p16Var62222.d;
                    mk1Var2 = mk1Var;
                }
                i3 = 21;
                if (kh4Var.c >= i3 + 4) {
                }
                if (kh4Var.c >= 40) {
                }
                i4 = 0;
                String str32222 = ", ";
                if (i4 == 1483304551) {
                }
                p16 p16Var522222 = (p16) mk1Var;
                long j722222 = p16Var522222.c;
                long j822222 = p16Var522222.d;
                el1 el1Var522222 = up1Var.b;
                int i1622222 = el1Var522222.g;
                int i1722222 = el1Var522222.d;
                i5 = kh4Var.i();
                if ((i5 & 1) != 1) {
                }
                i6 = i4;
                p16Var = p16Var3;
                wp1Var = null;
                if (wp1Var != null) {
                }
                p16Var2 = p16Var;
                p16Var2.k(up1Var.b.c);
                if (wp1Var != null) {
                }
                yt2Var = up1Var.i;
                p16 p16Var622222 = (p16) mk1Var;
                long j1022222 = p16Var622222.d;
                if (yt2Var != null) {
                }
                wp1Var2 = null;
                if (up1Var.o) {
                }
                up1Var.n = wp1Var;
                up1Var.e.n(wp1Var);
                pl1 pl1Var222222 = up1Var.g;
                bs1 bs1Var222222 = new bs1();
                el1 el1Var6222222 = up1Var.b;
                bs1Var222222.j = el1Var6222222.b;
                bs1Var222222.k = 4096;
                bs1Var222222.w = el1Var6222222.e;
                bs1Var222222.x = el1Var6222222.d;
                uk1 uk1Var3222222 = up1Var.c;
                bs1Var222222.z = uk1Var3222222.a;
                bs1Var222222.A = uk1Var3222222.b;
                bs1Var222222.h = up1Var.i;
                pl1Var222222.e(new cu1(bs1Var222222));
                up1Var.l = p16Var622222.d;
                mk1Var2 = mk1Var;
            }
            if (i2 == i) {
                wp1 wp1Var4 = up1Var.n;
                if (wp1Var4 instanceof sp1) {
                    if (wp1Var4.b() != ((up1Var.k * 1000000) / up1Var.b.d) + up1Var.j) {
                        sp1 sp1Var = (sp1) up1Var.n;
                        throw null;
                    }
                }
            }
            return i2;
        }
        long j13 = up1Var.l;
        mk1Var2 = mk1Var;
        if (j13 != 0) {
            long j14 = ((p16) mk1Var2).d;
            if (j14 < j13) {
                ((p16) mk1Var2).k((int) (j13 - j14));
            }
        }
        int i27 = up1Var.m;
        if (i27 == 0) {
            p16 p16Var7 = (p16) mk1Var2;
            p16Var7.f = 0;
            if (!up1Var.c(p16Var7)) {
                up1Var.a.e(0);
                int i28 = up1Var.a.i();
                if (((-128000) & i28) == (up1Var.h & (-128000))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && ga1.s(i28) != -1) {
                    up1Var.b.a(i28);
                    if (up1Var.j == -9223372036854775807L) {
                        up1Var.j = up1Var.n.h(p16Var7.d);
                    }
                    int i29 = up1Var.b.c;
                    up1Var.m = i29;
                    wp1 wp1Var5 = up1Var.n;
                    if (!(wp1Var5 instanceof sp1)) {
                        i27 = i29;
                    } else {
                        sp1 sp1Var2 = (sp1) wp1Var5;
                        long j15 = ((up1Var.k + el1Var2.g) * 1000000) / el1Var2.d;
                        throw null;
                    }
                } else {
                    ((p16) mk1Var2).k(1);
                    up1Var.h = 0;
                    i = -1;
                    i2 = 0;
                    if (i2 == i) {
                    }
                    return i2;
                }
            }
            i = -1;
            i2 = -1;
            if (i2 == i) {
            }
            return i2;
        }
        int d = up1Var.g.d(mk1Var2, i27, true);
        if (d != -1) {
            int i30 = up1Var.m - d;
            up1Var.m = i30;
            if (i30 <= 0) {
                pl1 pl1Var3 = up1Var.g;
                long j16 = up1Var.k;
                pl1Var3.b(up1Var.j + ((j16 * 1000000) / el1Var.d), 1, up1Var.b.c, 0, null);
                up1Var.k += up1Var.b.g;
                up1Var.m = 0;
            }
            i = -1;
            i2 = 0;
            if (i2 == i) {
            }
            return i2;
        }
        i = -1;
        i2 = -1;
        if (i2 == i) {
        }
        return i2;
    }
}