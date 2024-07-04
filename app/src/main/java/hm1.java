package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: hm1  reason: default package */
public final class hm1 implements lk1 {
    public int c;
    public im1 e;
    public long h;
    public km1 i;
    public int m;
    public boolean n;
    public final kh4 a = new kh4(12);
    public final gm1 b = new gm1();
    public nk1 d = new mu2();
    public km1[] g = new km1[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = -9223372036854775807L;

    @Override // defpackage.lk1
    public final boolean a(p16 p16Var) {
        p16Var.B(this.a.a, 0, 12, false);
        this.a.e(0);
        if (this.a.j() != 1179011410) {
            return false;
        }
        this.a.f(4);
        if (this.a.j() != 541677121) {
            return false;
        }
        return true;
    }

    public final km1 b(int i) {
        km1[] km1VarArr;
        boolean z;
        for (km1 km1Var : this.g) {
            if (km1Var.b != i && km1Var.c != i) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return km1Var;
            }
        }
        return null;
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.c = 0;
        this.d = nk1Var;
        this.h = -1L;
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        km1[] km1VarArr;
        int i;
        int i2;
        this.h = -1L;
        this.i = null;
        for (km1 km1Var : this.g) {
            if (km1Var.j == 0) {
                i2 = 0;
            } else {
                i2 = km1Var.l[zn4.i(km1Var.k, j, true)];
            }
            km1Var.h = i2;
        }
        if (j == 0) {
            if (this.g.length == 0) {
                this.c = 0;
                return;
            }
            i = 3;
        } else {
            i = 6;
        }
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        String str;
        gm1 gm1Var;
        long j;
        km1[] km1VarArr;
        long j2;
        boolean z2;
        int i4;
        long j3 = this.h;
        if (j3 != -1) {
            long j4 = ((p16) mk1Var).d;
            if (j3 >= j4 && j3 <= 262144 + j4) {
                ((p16) mk1Var).k((int) (j3 - j4));
            } else {
                jl1Var.a = j3;
                z = true;
                this.h = -1L;
                if (!z) {
                    return 1;
                }
                int i5 = this.c;
                int i6 = 12;
                km1 km1Var = null;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                if (i5 != 4) {
                                    if (i5 != 5) {
                                        p16 p16Var = (p16) mk1Var;
                                        long j5 = p16Var.d;
                                        if (j5 >= this.l) {
                                            return -1;
                                        }
                                        km1 km1Var2 = this.i;
                                        if (km1Var2 != null) {
                                            int i7 = km1Var2.g;
                                            int d = i7 - km1Var2.a.d(mk1Var, i7, false);
                                            km1Var2.g = d;
                                            if (d == 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                if (km1Var2.f > 0) {
                                                    pl1 pl1Var = km1Var2.a;
                                                    int i8 = km1Var2.h;
                                                    long j6 = (km1Var2.d * i8) / km1Var2.e;
                                                    int binarySearch = Arrays.binarySearch(km1Var2.l, i8);
                                                    int i9 = km1Var2.f;
                                                    if (binarySearch >= 0) {
                                                        i4 = 1;
                                                    } else {
                                                        i4 = 0;
                                                    }
                                                    pl1Var.b(j6, i4, i9, 0, null);
                                                }
                                                km1Var2.h++;
                                            }
                                            if (!z2) {
                                                return 0;
                                            }
                                            this.i = null;
                                            return 0;
                                        }
                                        if ((j5 & 1) == 1) {
                                            ((p16) mk1Var).k(1);
                                        }
                                        p16 p16Var2 = (p16) mk1Var;
                                        p16Var2.B(this.a.a, 0, 12, false);
                                        this.a.e(0);
                                        int j7 = this.a.j();
                                        if (j7 == 1414744396) {
                                            this.a.e(8);
                                            if (this.a.j() != 1769369453) {
                                                i6 = 8;
                                            }
                                            p16Var2.k(i6);
                                            p16Var.f = 0;
                                            return 0;
                                        }
                                        int j8 = this.a.j();
                                        if (j7 == 1263424842) {
                                            j2 = p16Var.d + j8 + 8;
                                        } else {
                                            p16Var2.k(8);
                                            p16Var.f = 0;
                                            km1 b = b(j7);
                                            if (b == null) {
                                                j2 = p16Var.d + j8;
                                            } else {
                                                b.f = j8;
                                                b.g = j8;
                                                this.i = b;
                                                return 0;
                                            }
                                        }
                                        this.h = j2;
                                        return 0;
                                    }
                                    kh4 kh4Var = new kh4(this.m);
                                    ((p16) mk1Var).A(kh4Var.a, 0, this.m, false);
                                    int i10 = kh4Var.c;
                                    int i11 = kh4Var.b;
                                    if (i10 - i11 < 16) {
                                        j = 0;
                                    } else {
                                        kh4Var.f(8);
                                        long j9 = this.k;
                                        if (kh4Var.j() > j9) {
                                            j = 0;
                                        } else {
                                            j = j9 + 8;
                                        }
                                        kh4Var.e(i11);
                                    }
                                    while (kh4Var.c - kh4Var.b >= 16) {
                                        int j10 = kh4Var.j();
                                        int j11 = kh4Var.j();
                                        long j12 = kh4Var.j() + j;
                                        kh4Var.j();
                                        km1 b2 = b(j10);
                                        if (b2 != null) {
                                            if ((j11 & 16) == 16) {
                                                if (b2.j == b2.l.length) {
                                                    long[] jArr = b2.k;
                                                    b2.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                                    int[] iArr = b2.l;
                                                    b2.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                                }
                                                long[] jArr2 = b2.k;
                                                int i12 = b2.j;
                                                jArr2[i12] = j12;
                                                b2.l[i12] = b2.i;
                                                b2.j = i12 + 1;
                                            }
                                            b2.i++;
                                        }
                                    }
                                    for (km1 km1Var3 : this.g) {
                                        km1Var3.k = Arrays.copyOf(km1Var3.k, km1Var3.j);
                                        km1Var3.l = Arrays.copyOf(km1Var3.l, km1Var3.j);
                                    }
                                    this.n = true;
                                    this.d.n(new xl1(this, this.f));
                                    this.c = 6;
                                    this.h = this.k;
                                    return 0;
                                }
                                ((p16) mk1Var).A(this.a.a, 0, 8, false);
                                this.a.e(0);
                                int j13 = this.a.j();
                                int j14 = this.a.j();
                                if (j13 == 829973609) {
                                    this.c = 5;
                                    this.m = j14;
                                } else {
                                    this.h = ((p16) mk1Var).d + j14;
                                }
                                return 0;
                            }
                            long j15 = this.k;
                            if (j15 != -1 && ((p16) mk1Var).d != j15) {
                                this.h = j15;
                                return 0;
                            }
                            p16 p16Var3 = (p16) mk1Var;
                            p16Var3.B(this.a.a, 0, 12, false);
                            p16 p16Var4 = (p16) mk1Var;
                            p16Var4.f = 0;
                            this.a.e(0);
                            gm1 gm1Var2 = this.b;
                            kh4 kh4Var2 = this.a;
                            gm1Var2.getClass();
                            gm1Var2.a = kh4Var2.j();
                            gm1Var2.b = kh4Var2.j();
                            gm1Var2.c = 0;
                            int j16 = this.a.j();
                            int i13 = this.b.a;
                            if (i13 == 1179011410) {
                                p16Var3.k(12);
                                return 0;
                            } else if (i13 == 1414744396 && j16 == 1769369453) {
                                long j17 = p16Var4.d;
                                this.k = j17;
                                long j18 = j17 + gm1Var.b + 8;
                                this.l = j18;
                                if (!this.n) {
                                    im1 im1Var = this.e;
                                    im1Var.getClass();
                                    if ((im1Var.b & 16) != 16) {
                                        this.d.n(new ll1(this.f, 0L));
                                        this.n = true;
                                    } else {
                                        this.c = 4;
                                        this.h = j18;
                                        return 0;
                                    }
                                }
                                this.h = p16Var4.d + 12;
                                this.c = 6;
                                return 0;
                            } else {
                                this.h = p16Var4.d + gm1Var.b + 8;
                                return 0;
                            }
                        }
                        int i14 = this.j - 4;
                        kh4 kh4Var3 = new kh4(i14);
                        ((p16) mk1Var).A(kh4Var3.a, 0, i14, false);
                        lm1 c = lm1.c(1819436136, kh4Var3);
                        int i15 = c.b;
                        if (i15 == 1819436136) {
                            im1 im1Var2 = (im1) c.b(im1.class);
                            if (im1Var2 != null) {
                                this.e = im1Var2;
                                this.f = im1Var2.c * im1Var2.a;
                                ArrayList arrayList = new ArrayList();
                                nv4 nv4Var = c.a;
                                int size = nv4Var.size();
                                int i16 = 0;
                                int i17 = 0;
                                while (i16 < size) {
                                    wl1 wl1Var = (wl1) nv4Var.get(i16);
                                    if (wl1Var.a() == 1819440243) {
                                        lm1 lm1Var = (lm1) wl1Var;
                                        int i18 = i17 + 1;
                                        jm1 jm1Var = (jm1) lm1Var.b(jm1.class);
                                        mm1 mm1Var = (mm1) lm1Var.b(mm1.class);
                                        if (jm1Var == null) {
                                            str = "Missing Stream Header";
                                        } else if (mm1Var == null) {
                                            str = "Missing Stream Format";
                                        } else {
                                            i2 = i18;
                                            long r = zn4.r(jm1Var.d, jm1Var.b * 1000000, jm1Var.c);
                                            cu1 cu1Var = mm1Var.a;
                                            cu1Var.getClass();
                                            bs1 bs1Var = new bs1(cu1Var);
                                            bs1Var.c(i17);
                                            int i19 = jm1Var.e;
                                            if (i19 != 0) {
                                                bs1Var.k = i19;
                                            }
                                            nm1 nm1Var = (nm1) lm1Var.b(nm1.class);
                                            if (nm1Var != null) {
                                                bs1Var.b = nm1Var.a;
                                            }
                                            int a = mx2.a(cu1Var.k);
                                            if (a != 1) {
                                                if (a == 2) {
                                                    i3 = 2;
                                                } else {
                                                    km1Var = null;
                                                    if (km1Var != null) {
                                                        arrayList.add(km1Var);
                                                    }
                                                    i17 = i2;
                                                }
                                            } else {
                                                i3 = a;
                                            }
                                            pl1 q = this.d.q(i17, i3);
                                            q.e(new cu1(bs1Var));
                                            km1Var = new km1(i17, i3, r, jm1Var.d, q);
                                            this.f = r;
                                            if (km1Var != null) {
                                            }
                                            i17 = i2;
                                        }
                                        lb4.c("AviExtractor", str);
                                        i2 = i18;
                                        if (km1Var != null) {
                                        }
                                        i17 = i2;
                                    }
                                    i16++;
                                    km1Var = null;
                                }
                                this.g = (km1[]) arrayList.toArray(new km1[0]);
                                this.d.j();
                                this.c = 3;
                                return 0;
                            }
                            throw jy2.a("AviHeader not found", null);
                        }
                        throw jy2.a("Unexpected header list type " + i15, null);
                    }
                    ((p16) mk1Var).A(this.a.a, 0, 12, false);
                    this.a.e(0);
                    gm1 gm1Var3 = this.b;
                    kh4 kh4Var4 = this.a;
                    gm1Var3.getClass();
                    gm1Var3.a = kh4Var4.j();
                    gm1Var3.b = kh4Var4.j();
                    gm1Var3.c = 0;
                    int i20 = gm1Var3.a;
                    if (i20 == 1414744396) {
                        gm1Var3.c = kh4Var4.j();
                        gm1 gm1Var4 = this.b;
                        int i21 = gm1Var4.c;
                        if (i21 == 1819436136) {
                            this.j = gm1Var4.b;
                            i = 2;
                        } else {
                            throw jy2.a("hdrl expected, found: " + i21, null);
                        }
                    } else {
                        throw jy2.a("LIST expected, found: " + i20, null);
                    }
                } else if (a((p16) mk1Var)) {
                    ((p16) mk1Var).k(12);
                    i = 1;
                } else {
                    throw jy2.a("AVI Header List not found", null);
                }
                this.c = i;
                return 0;
            }
        }
        z = false;
        this.h = -1L;
        if (!z) {
        }
    }
}