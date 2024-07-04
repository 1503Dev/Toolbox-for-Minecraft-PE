package defpackage;

import java.util.Arrays;

/* renamed from: rm1  reason: default package */
public final class rm1 implements lk1 {
    public nk1 d;
    public pl1 e;
    public yt2 g;
    public tk1 h;
    public int i;
    public int j;
    public qm1 k;
    public int l;
    public long m;
    public final byte[] a = new byte[42];
    public final kh4 b = new kh4(new byte[32768], 0);
    public final qk1 c = new qk1();
    public int f = 0;

    @Override // defpackage.lk1
    public final boolean a(p16 p16Var) {
        gv4.f(p16Var, false);
        kh4 kh4Var = new kh4(4);
        p16Var.B(kh4Var.a, 0, 4, false);
        if (kh4Var.u() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.d = nk1Var;
        this.e = nk1Var.q(0, 1);
        nk1Var.j();
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        if (j == 0) {
            this.f = 0;
        } else {
            qm1 qm1Var = this.k;
            if (qm1Var != null) {
                qm1Var.b(j2);
            }
        }
        this.m = j2 != 0 ? -1L : 0L;
        this.l = 0;
        this.b.b(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x013c, code lost:
        r1.e(r5);
        r1 = r24.c.a;
     */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        tk1 tk1Var;
        ml1 ll1Var;
        tk1 tk1Var2;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.f;
        boolean z4 = true;
        if (i != 0) {
            if (i != 1) {
                int i2 = 3;
                int i3 = 4;
                if (i != 2) {
                    int i4 = 7;
                    if (i != 3) {
                        long j2 = 0;
                        if (i != 4) {
                            this.e.getClass();
                            this.h.getClass();
                            qm1 qm1Var = this.k;
                            if (qm1Var != null) {
                                if (qm1Var.c != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    return qm1Var.a((p16) mk1Var, jl1Var);
                                }
                            }
                            if (this.m == -1) {
                                p16 p16Var = (p16) mk1Var;
                                p16Var.f = 0;
                                p16 p16Var2 = (p16) mk1Var;
                                p16Var2.h(1, false);
                                byte[] bArr = new byte[1];
                                p16Var2.B(bArr, 0, 1, false);
                                int i5 = bArr[0] & 1;
                                if (1 != i5) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                p16Var2.h(2, false);
                                if (1 != i5) {
                                    i4 = 6;
                                }
                                kh4 kh4Var = new kh4(i4);
                                byte[] bArr2 = kh4Var.a;
                                int i6 = 0;
                                while (i6 < i4) {
                                    int f = p16Var.f(bArr2, 0 + i6, i4 - i6);
                                    if (f == -1) {
                                        break;
                                    }
                                    i6 += f;
                                }
                                kh4Var.d(i6);
                                p16Var.f = 0;
                                try {
                                    long w = kh4Var.w();
                                    if (!z2) {
                                        w *= tk1Var2.b;
                                    }
                                    j2 = w;
                                } catch (NumberFormatException unused) {
                                    z4 = false;
                                }
                                if (z4) {
                                    this.m = j2;
                                    return 0;
                                }
                                throw jy2.a(null, null);
                            }
                            kh4 kh4Var2 = this.b;
                            int i7 = kh4Var2.c;
                            if (i7 < 32768) {
                                int x = ((p16) mk1Var).x(kh4Var2.a, i7, 32768 - i7);
                                if (x != -1) {
                                    z4 = false;
                                }
                                if (!z4) {
                                    this.b.d(i7 + x);
                                } else {
                                    kh4 kh4Var3 = this.b;
                                    if (kh4Var3.c - kh4Var3.b == 0) {
                                        tk1 tk1Var3 = this.h;
                                        int i8 = zn4.a;
                                        this.e.b((this.m * 1000000) / tk1Var3.e, 1, this.l, 0, null);
                                        return -1;
                                    }
                                }
                            } else {
                                z4 = false;
                            }
                            kh4 kh4Var4 = this.b;
                            int i9 = kh4Var4.b;
                            int i10 = this.l;
                            int i11 = this.i;
                            if (i10 < i11) {
                                kh4Var4.f(Math.min(i11 - i10, kh4Var4.c - i9));
                            }
                            kh4 kh4Var5 = this.b;
                            this.h.getClass();
                            int i12 = kh4Var5.b;
                            while (true) {
                                if (i12 <= kh4Var5.c - 16) {
                                    kh4Var5.e(i12);
                                    if (eg4.q(kh4Var5, this.h, this.j, this.c)) {
                                        break;
                                    }
                                    i12++;
                                } else {
                                    if (z4) {
                                        while (true) {
                                            int i13 = kh4Var5.c;
                                            if (i12 <= i13 - this.i) {
                                                kh4Var5.e(i12);
                                                try {
                                                    z = eg4.q(kh4Var5, this.h, this.j, this.c);
                                                } catch (IndexOutOfBoundsException unused2) {
                                                    z = false;
                                                }
                                                if (kh4Var5.b <= kh4Var5.c && z) {
                                                    break;
                                                }
                                                i12++;
                                            } else {
                                                kh4Var5.e(i13);
                                                break;
                                            }
                                        }
                                    } else {
                                        kh4Var5.e(i12);
                                    }
                                    j = -1;
                                }
                            }
                            kh4 kh4Var6 = this.b;
                            int i14 = kh4Var6.b - i9;
                            kh4Var6.e(i9);
                            this.e.c(this.b, i14);
                            int i15 = this.l + i14;
                            this.l = i15;
                            if (j != -1) {
                                tk1 tk1Var4 = this.h;
                                int i16 = zn4.a;
                                this.e.b((this.m * 1000000) / tk1Var4.e, 1, i15, 0, null);
                                this.l = 0;
                                this.m = j;
                            }
                            kh4 kh4Var7 = this.b;
                            int i17 = kh4Var7.c;
                            int i18 = kh4Var7.b;
                            int i19 = i17 - i18;
                            if (i19 >= 16) {
                                return 0;
                            }
                            byte[] bArr3 = kh4Var7.a;
                            System.arraycopy(bArr3, i18, bArr3, 0, i19);
                            this.b.e(0);
                            this.b.d(i19);
                            return 0;
                        }
                        p16 p16Var3 = (p16) mk1Var;
                        p16Var3.f = 0;
                        kh4 kh4Var8 = new kh4(2);
                        ((p16) mk1Var).B(kh4Var8.a, 0, 2, false);
                        int q = kh4Var8.q();
                        int i20 = q >> 2;
                        p16Var3.f = 0;
                        if (i20 == 16382) {
                            this.j = q;
                            nk1 nk1Var = this.d;
                            int i21 = zn4.a;
                            long j3 = p16Var3.d;
                            long j4 = p16Var3.c;
                            tk1 tk1Var5 = this.h;
                            tk1Var5.getClass();
                            if (tk1Var5.k != null) {
                                ll1Var = new rk1(tk1Var5, j3);
                            } else if (j4 != -1 && tk1Var5.j > 0) {
                                qm1 qm1Var2 = new qm1(tk1Var5, this.j, j3, j4);
                                this.k = qm1Var2;
                                ll1Var = qm1Var2.a;
                            } else {
                                ll1Var = new ll1(tk1Var5.a(), 0L);
                            }
                            nk1Var.n(ll1Var);
                            this.f = 5;
                            return 0;
                        }
                        throw jy2.a("First frame does not start with sync code.", null);
                    }
                    tk1 tk1Var6 = this.h;
                    while (true) {
                        ((p16) mk1Var).f = 0;
                        eh4 eh4Var = new eh4(new byte[i3], i3);
                        p16 p16Var4 = (p16) mk1Var;
                        p16Var4.B(eh4Var.a, 0, i3, false);
                        boolean i22 = eh4Var.i();
                        int b = eh4Var.b(i4);
                        int b2 = eh4Var.b(24) + i3;
                        if (b == 0) {
                            byte[] bArr4 = new byte[38];
                            p16Var4.A(bArr4, 0, 38, false);
                            tk1Var6 = new tk1(bArr4, i3);
                        } else if (tk1Var6 != null) {
                            if (b == i2) {
                                kh4 kh4Var9 = new kh4(b2);
                                p16Var4.A(kh4Var9.a, 0, b2, false);
                                tk1Var = new tk1(tk1Var6.a, tk1Var6.b, tk1Var6.c, tk1Var6.d, tk1Var6.e, tk1Var6.g, tk1Var6.h, tk1Var6.j, gv4.i(kh4Var9), tk1Var6.l);
                            } else if (b == i3) {
                                kh4 kh4Var10 = new kh4(b2);
                                p16Var4.A(kh4Var10.a, 0, b2, false);
                                kh4Var10.f(i3);
                                yt2 a = ul1.a(Arrays.asList((String[]) ul1.b(kh4Var10, false, false).b));
                                yt2 yt2Var = tk1Var6.l;
                                if (yt2Var != null) {
                                    if (a == null) {
                                        a = yt2Var;
                                    } else {
                                        a = yt2Var.a(a.P);
                                    }
                                }
                                tk1Var = new tk1(tk1Var6.a, tk1Var6.b, tk1Var6.c, tk1Var6.d, tk1Var6.e, tk1Var6.g, tk1Var6.h, tk1Var6.j, tk1Var6.k, a);
                            } else if (b == 6) {
                                kh4 kh4Var11 = new kh4(b2);
                                p16Var4.A(kh4Var11.a, 0, b2, false);
                                kh4Var11.f(4);
                                yt2 yt2Var2 = new yt2(nv4.v(nn1.a(kh4Var11)));
                                yt2 yt2Var3 = tk1Var6.l;
                                if (yt2Var3 != null) {
                                    yt2Var2 = yt2Var3.a(yt2Var2.P);
                                }
                                tk1Var = new tk1(tk1Var6.a, tk1Var6.b, tk1Var6.c, tk1Var6.d, tk1Var6.e, tk1Var6.g, tk1Var6.h, tk1Var6.j, tk1Var6.k, yt2Var2);
                            } else {
                                p16Var4.k(b2);
                            }
                            tk1Var6 = tk1Var;
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i23 = zn4.a;
                        this.h = tk1Var6;
                        if (i22) {
                            this.i = Math.max(tk1Var6.c, 6);
                            this.e.e(this.h.b(this.a, this.g));
                            this.f = 4;
                            return 0;
                        }
                        i2 = 3;
                        i3 = 4;
                        i4 = 7;
                    }
                } else {
                    kh4 kh4Var12 = new kh4(4);
                    ((p16) mk1Var).A(kh4Var12.a, 0, 4, false);
                    if (kh4Var12.u() == 1716281667) {
                        this.f = 3;
                        return 0;
                    }
                    throw jy2.a("Failed to read FLAC stream marker.", null);
                }
            } else {
                ((p16) mk1Var).B(this.a, 0, 42, false);
                ((p16) mk1Var).f = 0;
                this.f = 2;
                return 0;
            }
        } else {
            p16 p16Var5 = (p16) mk1Var;
            p16Var5.f = 0;
            long b3 = p16Var5.b();
            yt2 f2 = gv4.f(p16Var5, true);
            ((p16) mk1Var).k((int) (p16Var5.b() - b3));
            this.g = f2;
            this.f = 1;
            return 0;
        }
    }
}