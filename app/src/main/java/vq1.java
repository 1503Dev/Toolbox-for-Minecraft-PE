package defpackage;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: vq1  reason: default package */
public final class vq1 implements lk1, ml1 {
    public final kh4 a;
    public final kh4 b;
    public final kh4 c;
    public final kh4 d;
    public final ArrayDeque e;
    public final ArrayList f;
    public int g = 0;
    public int h;
    public long i;
    public int j;
    public kh4 k;
    public int l;
    public int m;
    public int n;
    public int o;
    public nk1 p;
    public uq1[] q;
    public long[][] r;
    public int s;
    public long t;
    public int u;

    public vq1() {
        new ArrayList();
        this.f = new ArrayList();
        this.d = new kh4(16);
        this.e = new ArrayDeque();
        this.a = new kh4(hl1.a);
        this.b = new kh4(4);
        this.c = new kh4();
        this.l = -1;
        this.p = nk1.K;
        this.q = new uq1[0];
    }

    @Override // defpackage.lk1
    public final boolean a(p16 p16Var) {
        return vj.H(p16Var, false);
    }

    @Override // defpackage.ml1
    public final long b() {
        return this.t;
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.p = nk1Var;
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        uq1[] uq1VarArr;
        this.e.clear();
        this.j = 0;
        this.l = -1;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        if (j == 0) {
            j();
            return;
        }
        for (uq1 uq1Var : this.q) {
            ar1 ar1Var = uq1Var.b;
            int i = zn4.i(ar1Var.f, j2, false);
            while (true) {
                if (i >= 0) {
                    if ((ar1Var.g[i] & 1) != 0) {
                        break;
                    }
                    i--;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                i = ar1Var.a(j2);
            }
            uq1Var.e = i;
            ql1 ql1Var = uq1Var.d;
            if (ql1Var != null) {
                ql1Var.b = false;
                ql1Var.c = 0;
            }
        }
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int a;
        long j8 = j;
        uq1[] uq1VarArr = this.q;
        if (uq1VarArr.length == 0) {
            nl1 nl1Var = nl1.c;
            return new kl1(nl1Var, nl1Var);
        }
        int i = this.s;
        boolean z = false;
        int i2 = -1;
        if (i != -1) {
            ar1 ar1Var = uq1VarArr[i].b;
            int i3 = zn4.i(ar1Var.f, j8, false);
            while (true) {
                if (i3 >= 0) {
                    if ((ar1Var.g[i3] & 1) != 0) {
                        break;
                    }
                    i3--;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 == -1) {
                i3 = ar1Var.a(j8);
            }
            if (i3 == -1) {
                nl1 nl1Var2 = nl1.c;
                return new kl1(nl1Var2, nl1Var2);
            }
            long j9 = ar1Var.f[i3];
            j2 = ar1Var.c[i3];
            if (j9 < j8 && i3 < ar1Var.b - 1 && (a = ar1Var.a(j8)) != -1 && a != i3) {
                j4 = ar1Var.f[a];
                j7 = ar1Var.c[a];
            } else {
                j7 = -1;
                j4 = -9223372036854775807L;
            }
            long j10 = j7;
            j8 = j9;
            j3 = j10;
        } else {
            j2 = RecyclerView.FOREVER_NS;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i4 = 0;
        while (true) {
            uq1[] uq1VarArr2 = this.q;
            if (i4 >= uq1VarArr2.length) {
                break;
            }
            if (i4 != this.s) {
                ar1 ar1Var2 = uq1VarArr2[i4].b;
                int i5 = zn4.i(ar1Var2.f, j8, z);
                while (true) {
                    if (i5 >= 0) {
                        if ((ar1Var2.g[i5] & 1) != 0) {
                            break;
                        }
                        i5--;
                    } else {
                        i5 = -1;
                        break;
                    }
                }
                if (i5 == i2) {
                    i5 = ar1Var2.a(j8);
                }
                if (i5 == i2) {
                    j6 = j3;
                } else {
                    j6 = j3;
                    j2 = Math.min(ar1Var2.c[i5], j2);
                }
                if (j4 != -9223372036854775807L) {
                    int i6 = zn4.i(ar1Var2.f, j4, false);
                    while (true) {
                        if (i6 >= 0) {
                            if ((ar1Var2.g[i6] & 1) != 0) {
                                break;
                            }
                            i6--;
                        } else {
                            i6 = -1;
                            break;
                        }
                    }
                    if (i6 == -1) {
                        i6 = ar1Var2.a(j4);
                    }
                    if (i6 == -1) {
                        j3 = j6;
                    } else {
                        j3 = Math.min(ar1Var2.c[i6], j6);
                    }
                    i4++;
                    z = false;
                    i2 = -1;
                } else {
                    j5 = j6;
                }
            } else {
                j5 = j3;
            }
            j3 = j5;
            i4++;
            z = false;
            i2 = -1;
        }
        long j11 = j3;
        nl1 nl1Var3 = new nl1(j8, j2);
        if (j4 == -9223372036854775807L) {
            return new kl1(nl1Var3, nl1Var3);
        }
        return new kl1(nl1Var3, new nl1(j4, j11));
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        long e;
        long j;
        int i2;
        boolean z4;
        boolean z5;
        kh4 kh4Var;
        while (true) {
            int i3 = this.g;
            if (i3 != 0) {
                if (i3 != 1) {
                    long e2 = mk1Var.e();
                    int i4 = this.l;
                    if (i4 == -1) {
                        long j2 = Long.MAX_VALUE;
                        long j3 = Long.MAX_VALUE;
                        long j4 = Long.MAX_VALUE;
                        int i5 = 0;
                        boolean z6 = true;
                        int i6 = -1;
                        int i7 = -1;
                        boolean z7 = true;
                        while (true) {
                            uq1[] uq1VarArr = this.q;
                            if (i5 >= uq1VarArr.length) {
                                break;
                            }
                            uq1 uq1Var = uq1VarArr[i5];
                            int i8 = uq1Var.e;
                            ar1 ar1Var = uq1Var.b;
                            if (i8 != ar1Var.b) {
                                long j5 = ar1Var.c[i8];
                                long[][] jArr = this.r;
                                int i9 = zn4.a;
                                long j6 = jArr[i5][i8];
                                long j7 = j5 - e2;
                                if (j7 >= 0 && j7 < 262144) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (!z) {
                                    if (!z7) {
                                        z2 = false;
                                    }
                                    i6 = i5;
                                    z7 = z;
                                    j4 = j7;
                                    j3 = j6;
                                    if (j6 < j2) {
                                        i7 = i5;
                                        z6 = z;
                                        j2 = j6;
                                    }
                                } else {
                                    z2 = z7;
                                }
                                if (z != z2 || j7 >= j4) {
                                    z7 = z2;
                                    if (j6 < j2) {
                                    }
                                }
                                i6 = i5;
                                z7 = z;
                                j4 = j7;
                                j3 = j6;
                                if (j6 < j2) {
                                }
                            }
                            i5++;
                        }
                        if (j2 != RecyclerView.FOREVER_NS && z6 && j3 >= j2 + 10485760) {
                            i4 = i7;
                        } else {
                            i4 = i6;
                        }
                        this.l = i4;
                        if (i4 == -1) {
                            return -1;
                        }
                    }
                    uq1 uq1Var2 = this.q[i4];
                    pl1 pl1Var = uq1Var2.c;
                    int i10 = uq1Var2.e;
                    ar1 ar1Var2 = uq1Var2.b;
                    long j8 = ar1Var2.c[i10];
                    int i11 = ar1Var2.d[i10];
                    ql1 ql1Var = uq1Var2.d;
                    long j9 = (j8 - e2) + this.m;
                    if (j9 >= 0 && j9 < 262144) {
                        if (uq1Var2.a.g == 1) {
                            j9 += 8;
                            i11 -= 8;
                        }
                        mk1Var.w((int) j9);
                        xq1 xq1Var = uq1Var2.a;
                        int i12 = xq1Var.j;
                        if (i12 != 0) {
                            byte[] bArr = this.b.a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i13 = 4 - i12;
                            while (this.n < i11) {
                                int i14 = this.o;
                                if (i14 == 0) {
                                    mk1Var.y(bArr, i13, i12);
                                    this.m += i12;
                                    this.b.e(0);
                                    int i15 = this.b.i();
                                    if (i15 >= 0) {
                                        this.o = i15;
                                        this.a.e(0);
                                        pl1Var.a(4, this.a);
                                        this.n += 4;
                                        i11 += i13;
                                    } else {
                                        throw jy2.a("Invalid NAL length", null);
                                    }
                                } else {
                                    int d = pl1Var.d(mk1Var, i14, false);
                                    this.m += d;
                                    this.n += d;
                                    this.o -= d;
                                }
                            }
                        } else {
                            if ("audio/ac4".equals(xq1Var.f.k)) {
                                if (this.n == 0) {
                                    vx.z(i11, this.c);
                                    pl1Var.a(7, this.c);
                                    this.n += 7;
                                }
                                i11 += 7;
                            } else if (ql1Var != null) {
                                ql1Var.c(mk1Var);
                            }
                            while (true) {
                                int i16 = this.n;
                                if (i16 >= i11) {
                                    break;
                                }
                                int d2 = pl1Var.d(mk1Var, i11 - i16, false);
                                this.m += d2;
                                this.n += d2;
                                this.o -= d2;
                            }
                        }
                        ar1 ar1Var3 = uq1Var2.b;
                        long j10 = ar1Var3.f[i10];
                        int i17 = ar1Var3.g[i10];
                        if (ql1Var != null) {
                            ql1Var.b(pl1Var, j10, i17, i11, 0, null);
                            if (i10 + 1 == uq1Var2.b.b) {
                                ql1Var.a(pl1Var, null);
                            }
                        } else {
                            pl1Var.b(j10, i17, i11, 0, null);
                        }
                        uq1Var2.e++;
                        this.l = -1;
                        this.m = 0;
                        this.n = 0;
                        this.o = 0;
                        return 0;
                    }
                    jl1Var.a = j8;
                    return 1;
                }
                long j11 = this.i - this.j;
                long e3 = mk1Var.e() + j11;
                kh4 kh4Var2 = this.k;
                if (kh4Var2 != null) {
                    mk1Var.y(kh4Var2.a, this.j, (int) j11);
                    if (this.h == 1718909296) {
                        kh4Var2.e(8);
                        int i18 = kh4Var2.i();
                        if (i18 != 1751476579) {
                            if (i18 != 1903435808) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                        } else {
                            i = 2;
                        }
                        if (i == 0) {
                            kh4Var2.f(4);
                            while (true) {
                                if (kh4Var2.c - kh4Var2.b > 0) {
                                    int i19 = kh4Var2.i();
                                    if (i19 != 1751476579) {
                                        if (i19 != 1903435808) {
                                            i = 0;
                                            continue;
                                        } else {
                                            i = 1;
                                            continue;
                                        }
                                    } else {
                                        i = 2;
                                        continue;
                                    }
                                    if (i != 0) {
                                        break;
                                    }
                                } else {
                                    i = 0;
                                    break;
                                }
                            }
                        }
                        this.u = i;
                    } else if (!this.e.isEmpty()) {
                        ((zp1) this.e.peek()).c.add(new aq1(this.h, kh4Var2));
                    }
                } else if (j11 < 262144) {
                    mk1Var.w((int) j11);
                } else {
                    jl1Var.a = mk1Var.e() + j11;
                    z3 = true;
                    k(e3);
                    if (z3 && this.g != 2) {
                        return 1;
                    }
                }
                z3 = false;
                k(e3);
                if (z3) {
                    return 1;
                }
                continue;
            } else {
                if (this.j == 0) {
                    if (!mk1Var.A(this.d.a, 0, 8, true)) {
                        return -1;
                    }
                    this.j = 8;
                    this.d.e(0);
                    this.i = this.d.u();
                    this.h = this.d.i();
                }
                long j12 = this.i;
                if (j12 == 1) {
                    mk1Var.y(this.d.a, 8, 8);
                    this.j += 8;
                    e = this.d.v();
                } else {
                    if (j12 == 0) {
                        long i20 = mk1Var.i();
                        if (i20 == -1) {
                            zp1 zp1Var = (zp1) this.e.peek();
                            if (zp1Var != null) {
                                i20 = zp1Var.b;
                            } else {
                                i20 = -1;
                            }
                        }
                        if (i20 != -1) {
                            e = (i20 - mk1Var.e()) + this.j;
                        }
                    }
                    j = this.i;
                    i2 = this.j;
                    if (j < i2) {
                        int i21 = this.h;
                        if (i21 != 1836019574 && i21 != 1953653099 && i21 != 1835297121 && i21 != 1835626086 && i21 != 1937007212 && i21 != 1701082227 && i21 != 1835365473) {
                            if (i21 != 1835296868 && i21 != 1836476516 && i21 != 1751411826 && i21 != 1937011556 && i21 != 1937011827 && i21 != 1937011571 && i21 != 1668576371 && i21 != 1701606260 && i21 != 1937011555 && i21 != 1937011578 && i21 != 1937013298 && i21 != 1937007471 && i21 != 1668232756 && i21 != 1953196132 && i21 != 1718909296 && i21 != 1969517665 && i21 != 1801812339 && i21 != 1768715124) {
                                mk1Var.e();
                                kh4Var = null;
                            } else {
                                if (i2 == 8) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                tv2.I(z4);
                                if (this.i <= 2147483647L) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                tv2.I(z5);
                                kh4Var = new kh4((int) this.i);
                                System.arraycopy(this.d.a, 0, kh4Var.a, 0, 8);
                            }
                            this.k = kh4Var;
                            this.g = 1;
                        } else {
                            long e4 = mk1Var.e();
                            long j13 = this.i;
                            long j14 = e4 + j13;
                            long j15 = this.j;
                            if (j13 != j15 && this.h == 1835365473) {
                                this.c.b(8);
                                mk1Var.z(this.c.a, 0, 8);
                                kh4 kh4Var3 = this.c;
                                byte[] bArr2 = mq1.a;
                                int i22 = kh4Var3.b;
                                kh4Var3.f(4);
                                if (kh4Var3.i() != 1751411826) {
                                    i22 += 4;
                                }
                                kh4Var3.e(i22);
                                mk1Var.w(this.c.b);
                                mk1Var.j();
                            }
                            long j16 = j14 - j15;
                            this.e.push(new zp1(j16, this.h));
                            if (this.i == this.j) {
                                k(j16);
                            } else {
                                j();
                            }
                        }
                    } else {
                        throw jy2.b("Atom size less than header length (unsupported).");
                    }
                }
                this.i = e;
                j = this.i;
                i2 = this.j;
                if (j < i2) {
                }
            }
        }
    }

    public final void j() {
        this.g = 0;
        this.j = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c3, code lost:
        r6 = defpackage.sq1.b(1885823344, "ITUNESGAPLESS", r5, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cd, code lost:
        r6 = 1936683886;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d0, code lost:
        if (r9 != 1936683886) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d2, code lost:
        r9 = "TVSHOWSORT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d5, code lost:
        r6 = 1953919848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d8, code lost:
        if (r9 != 1953919848) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01da, code lost:
        r9 = "TVSHOW";
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01dc, code lost:
        r9 = defpackage.sq1.d(r6, r9, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e0, code lost:
        r5.e(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e3, code lost:
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ea, code lost:
        if (r9 != 757935405) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ec, code lost:
        r6 = null;
        r9 = null;
        r11 = -1;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f0, code lost:
        r2 = r5.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f2, code lost:
        if (r2 >= r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f4, code lost:
        r20 = r5.i();
        r2 = r5.i();
        r28 = r8;
        r5.f(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0207, code lost:
        if (r2 != 1835360622) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0209, code lost:
        r9 = r5.y(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0214, code lost:
        if (r2 != 1851878757) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0216, code lost:
        r6 = r5.y(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0221, code lost:
        if (r2 != 1684108385) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0223, code lost:
        r14 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0225, code lost:
        if (r2 != 1684108385) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0227, code lost:
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0229, code lost:
        r5.f(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x022e, code lost:
        r8 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0231, code lost:
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0233, code lost:
        if (r9 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0235, code lost:
        if (r6 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0238, code lost:
        if (r11 != (-1)) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x023b, code lost:
        r5.e(r11);
        r5.f(16);
        r9 = new defpackage.no1(r9, r6, r5.y(r14 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0251, code lost:
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0255, code lost:
        r28 = r8;
        r2 = r9 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x025c, code lost:
        if (r2 != 6516084) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x025e, code lost:
        r2 = r5.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0269, code lost:
        if (r5.i() != 1684108385) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x026b, code lost:
        r5.f(8);
        r2 = r5.y(r2 - 16);
        r9 = new defpackage.bo1("und", r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x027f, code lost:
        defpackage.lb4.c("MetadataUtil", "Failed to parse comment attribute: ".concat(defpackage.bq1.b(r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x028c, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0292, code lost:
        if (r2 == 7233901) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0297, code lost:
        if (r2 != 7631467) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x029e, code lost:
        if (r2 == 6516589) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a3, code lost:
        if (r2 != 7828084) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a9, code lost:
        if (r2 != 6578553) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ab, code lost:
        r2 = "TDRC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b1, code lost:
        if (r2 != 4280916) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02b3, code lost:
        r2 = "TPE1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02b9, code lost:
        if (r2 != 7630703) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02bb, code lost:
        r2 = "TSSE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02c1, code lost:
        if (r2 != 6384738) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c3, code lost:
        r2 = "TALB";
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02c9, code lost:
        if (r2 != 7108978) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02cb, code lost:
        r2 = "USLT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02d1, code lost:
        if (r2 != 6776174) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02d3, code lost:
        r9 = defpackage.sq1.d(r9, "TCON", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02db, code lost:
        if (r2 != 6779504) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02dd, code lost:
        r2 = "TIT1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02e0, code lost:
        r2 = "Skipped unknown metadata entry: " + defpackage.bq1.b(r9);
        r6 = defpackage.lb4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02f7, code lost:
        monitor-enter(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02f8, code lost:
        android.util.Log.d("MetadataUtil", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02fb, code lost:
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02fc, code lost:
        r5.e(r15);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0304, code lost:
        r2 = "TCOM";
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0307, code lost:
        r2 = "TIT2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0309, code lost:
        r9 = defpackage.sq1.d(r9, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0310, code lost:
        if (r9 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0312, code lost:
        r7.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0315, code lost:
        r8 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x031e, code lost:
        r5.e(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0321, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0326, code lost:
        if (r7.isEmpty() == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0329, code lost:
        r20 = new defpackage.yt2(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0378, code lost:
        if (r2 != 13) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
        r5.e(r8);
        r8 = r8 + r15;
        r5.f(r2);
        r7 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
        r9 = r5.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
        if (r9 >= r8) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
        r15 = r5.i() + r9;
        r9 = r5.i();
        r6 = (r9 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
        if (r6 == 169) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
        if (r6 != 253) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
        if (r9 != 1735291493) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
        r2 = defpackage.sq1.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
        if (r2 <= 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
        if (r2 > 192) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
        r2 = defpackage.sq1.a[r2 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
        if (r2 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
        r6 = new defpackage.to1("TCON", null, defpackage.nv4.v(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
        defpackage.lb4.c("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e5, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
        r5.e(r15);
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
        r2 = 1684632427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ef, code lost:
        if (r9 != 1684632427) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
        r6 = "TPOS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
        r2 = 1953655662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f7, code lost:
        if (r9 != 1953655662) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f9, code lost:
        r6 = "TRCK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
        r9 = defpackage.sq1.c(r2, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:
        if (r9 != 1953329263) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
        r6 = defpackage.sq1.b(1953329263, "TBPM", r5, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
        if (r9 != 1668311404) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0117, code lost:
        r9 = "TCMP";
        r6 = 1668311404;
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0124, code lost:
        if (r9 != 1668249202) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
        r2 = r5.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0131, code lost:
        if (r5.i() != 1684108385) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0133, code lost:
        r6 = r5.i() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013b, code lost:
        if (r6 != 13) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013d, code lost:
        r9 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0142, code lost:
        if (r6 != 14) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0144, code lost:
        r9 = "image/png";
        r6 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0149, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014a, code lost:
        if (r9 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014c, code lost:
        r6 = "Unrecognized cover art flags: " + r6;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0160, code lost:
        r5.f(4);
        r2 = r2 - 16;
        r6 = new byte[r2];
        r5.a(r6, 0, r2);
        r9 = new defpackage.tn1(r9, null, 3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0177, code lost:
        r2 = null;
        r6 = "Failed to parse cover art attribute";
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017a, code lost:
        defpackage.lb4.c("MetadataUtil", r6);
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017f, code lost:
        r6 = 1631670868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0183, code lost:
        if (r9 != 1631670868) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
        r9 = "TPE2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0188, code lost:
        r6 = 1936682605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018b, code lost:
        if (r9 != 1936682605) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018d, code lost:
        r9 = "TSOT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0190, code lost:
        r6 = 1936679276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0193, code lost:
        if (r9 != 1936679276) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
        r9 = "TSO2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0198, code lost:
        r6 = 1936679282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019b, code lost:
        if (r9 != 1936679282) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019d, code lost:
        r9 = "TSOA";
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a0, code lost:
        r6 = 1936679265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a3, code lost:
        if (r9 != 1936679265) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a5, code lost:
        r9 = "TSOP";
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a8, code lost:
        r6 = 1936679791;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ab, code lost:
        if (r9 != 1936679791) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ad, code lost:
        r9 = "TSOC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b0, code lost:
        r6 = 1920233063;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
        if (r9 != 1920233063) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b5, code lost:
        r9 = "ITUNESADVISORY";
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b8, code lost:
        r6 = defpackage.sq1.b(r6, r9, r5, r11, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c1, code lost:
        if (r9 != 1885823344) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0668 A[LOOP:12: B:335:0x0665->B:337:0x0668, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0687  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(long j) {
        vq1 vq1Var;
        yt2 yt2Var;
        int i;
        yt2 yt2Var2;
        ArrayList arrayList;
        yt2 yt2Var3;
        boolean z;
        int size;
        int i2;
        uq1[] uq1VarArr;
        int i3;
        int i4;
        ArrayList arrayList2;
        int i5;
        int i6;
        int i7;
        yt2 yt2Var4;
        yt2 yt2Var5;
        yt2 yt2Var6;
        int i8;
        ArrayList arrayList3;
        boolean z2;
        ArrayList arrayList4;
        int i9;
        String[] strArr;
        xo1 xo1Var;
        vq1 vq1Var2 = this;
        while (!vq1Var2.e.isEmpty() && ((zp1) vq1Var2.e.peek()).b == j) {
            zp1 zp1Var = (zp1) vq1Var2.e.pop();
            if (zp1Var.a == 1836019574) {
                ArrayList arrayList5 = new ArrayList();
                int i10 = vq1Var2.u;
                uk1 uk1Var = new uk1();
                aq1 d = zp1Var.d(1969517665);
                int i11 = 1768715124;
                int i12 = 1751411826;
                int i13 = 1835365473;
                int i14 = 4;
                int i15 = 8;
                if (d != null) {
                    byte[] bArr = mq1.a;
                    kh4 kh4Var = d.b;
                    kh4Var.e(8);
                    yt2 yt2Var7 = null;
                    yt2 yt2Var8 = null;
                    while (true) {
                        int i16 = kh4Var.c;
                        int i17 = kh4Var.b;
                        if (i16 - i17 < i15) {
                            break;
                        }
                        int i18 = kh4Var.i();
                        int i19 = kh4Var.i();
                        if (i19 == i13) {
                            kh4Var.e(i17);
                            int i20 = i17 + i18;
                            kh4Var.f(i15);
                            int i21 = kh4Var.b;
                            kh4Var.f(i14);
                            if (kh4Var.i() != i12) {
                                i21 += 4;
                            }
                            kh4Var.e(i21);
                            while (true) {
                                int i22 = kh4Var.b;
                                if (i22 >= i20) {
                                    break;
                                }
                                int i23 = kh4Var.i();
                                if (kh4Var.i() == i11) {
                                    break;
                                }
                                kh4Var.e(i22 + i23);
                                i15 = 8;
                                i11 = 1768715124;
                            }
                            yt2Var7 = null;
                        } else if (i19 == 1936553057) {
                            kh4Var.e(i17);
                            int i24 = i17 + i18;
                            kh4Var.f(12);
                            while (true) {
                                int i25 = kh4Var.b;
                                if (i25 >= i24) {
                                    break;
                                }
                                int i26 = kh4Var.i();
                                if (kh4Var.i() == 1935766900) {
                                    if (i26 >= 14) {
                                        kh4Var.f(5);
                                        int n = kh4Var.n();
                                        float f = 120.0f;
                                        if (n == 12) {
                                            if (n == 12) {
                                                f = 240.0f;
                                            }
                                        }
                                        kh4Var.f(1);
                                        yt2Var8 = new yt2(-9223372036854775807L, new bp1(kh4Var.n(), f));
                                    }
                                } else {
                                    kh4Var.e(i25 + i26);
                                }
                            }
                            yt2Var8 = null;
                        }
                        kh4Var.e(i17 + i18);
                        i15 = 8;
                        i11 = 1768715124;
                        i12 = 1751411826;
                        i13 = 1835365473;
                        i14 = 4;
                    }
                    Pair create = Pair.create(yt2Var7, yt2Var8);
                    yt2 yt2Var9 = (yt2) create.first;
                    yt2Var = (yt2) create.second;
                    if (yt2Var9 != null) {
                        uk1Var.a(yt2Var9);
                    }
                    yt2Var2 = yt2Var9;
                    i = 1835365473;
                } else {
                    yt2Var = null;
                    i = 1835365473;
                    yt2Var2 = null;
                }
                zp1 c = zp1Var.c(i);
                if (c != null) {
                    byte[] bArr2 = mq1.a;
                    aq1 d2 = c.d(1751411826);
                    aq1 d3 = c.d(1801812339);
                    aq1 d4 = c.d(1768715124);
                    if (d2 != null && d3 != null && d4 != null) {
                        kh4 kh4Var2 = d2.b;
                        kh4Var2.e(16);
                        if (kh4Var2.i() == 1835299937) {
                            kh4 kh4Var3 = d3.b;
                            kh4Var3.e(12);
                            int i27 = kh4Var3.i();
                            String[] strArr2 = new String[i27];
                            for (int i28 = 0; i28 < i27; i28++) {
                                int i29 = kh4Var3.i();
                                kh4Var3.f(4);
                                strArr2[i28] = kh4Var3.z(i29 - 8, zs4.c);
                            }
                            kh4 kh4Var4 = d4.b;
                            int i30 = 8;
                            kh4Var4.e(8);
                            ArrayList arrayList6 = new ArrayList();
                            while (true) {
                                int i31 = kh4Var4.c;
                                int i32 = kh4Var4.b;
                                if (i31 - i32 <= i30) {
                                    break;
                                }
                                int i33 = kh4Var4.i();
                                int i34 = kh4Var4.i() - 1;
                                if (i34 >= 0 && i34 < i27) {
                                    String str = strArr2[i34];
                                    int i35 = i32 + i33;
                                    while (true) {
                                        int i36 = kh4Var4.b;
                                        if (i36 < i35) {
                                            int i37 = kh4Var4.i();
                                            i9 = i27;
                                            strArr = strArr2;
                                            if (kh4Var4.i() == 1684108385) {
                                                int i38 = kh4Var4.i();
                                                int i39 = kh4Var4.i();
                                                int i40 = i37 - 16;
                                                byte[] bArr3 = new byte[i40];
                                                arrayList4 = arrayList5;
                                                kh4Var4.a(bArr3, 0, i40);
                                                xo1Var = new xo1(str, bArr3, i39, i38);
                                                break;
                                            }
                                            kh4Var4.e(i36 + i37);
                                            i27 = i9;
                                            strArr2 = strArr;
                                        } else {
                                            arrayList4 = arrayList5;
                                            i9 = i27;
                                            strArr = strArr2;
                                            xo1Var = null;
                                            break;
                                        }
                                    }
                                    if (xo1Var != null) {
                                        arrayList6.add(xo1Var);
                                    }
                                } else {
                                    arrayList4 = arrayList5;
                                    i9 = i27;
                                    strArr = strArr2;
                                    lb4.c("AtomParsers", "Skipped metadata with unknown key index: " + i34);
                                }
                                kh4Var4.e(i32 + i33);
                                i27 = i9;
                                strArr2 = strArr;
                                arrayList5 = arrayList4;
                                i30 = 8;
                            }
                            arrayList = arrayList5;
                            if (!arrayList6.isEmpty()) {
                                yt2Var3 = new yt2(arrayList6);
                                if (i10 == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                ArrayList a = mq1.a(zp1Var, uk1Var, -9223372036854775807L, null, z, new at4() { // from class: tq1
                                    @Override // defpackage.at4
                                    public final Object apply(Object obj) {
                                        return (xq1) obj;
                                    }
                                });
                                size = a.size();
                                int i41 = -1;
                                long j2 = -9223372036854775807L;
                                i2 = 0;
                                while (i2 < size) {
                                    ar1 ar1Var = (ar1) a.get(i2);
                                    if (ar1Var.b == 0) {
                                        yt2Var5 = yt2Var;
                                        arrayList2 = a;
                                        i5 = size;
                                        arrayList3 = arrayList;
                                    } else {
                                        xq1 xq1Var = ar1Var.a;
                                        long j3 = xq1Var.e;
                                        if (j3 == -9223372036854775807L) {
                                            j3 = ar1Var.h;
                                        }
                                        long max = Math.max(j2, j3);
                                        arrayList2 = a;
                                        i5 = size;
                                        uq1 uq1Var = new uq1(xq1Var, ar1Var, vq1Var2.p.q(i2, xq1Var.b));
                                        if ("audio/true-hd".equals(xq1Var.f.k)) {
                                            i6 = ar1Var.e * 16;
                                        } else {
                                            i6 = ar1Var.e + 30;
                                        }
                                        cu1 cu1Var = xq1Var.f;
                                        cu1Var.getClass();
                                        bs1 bs1Var = new bs1(cu1Var);
                                        bs1Var.k = i6;
                                        int i42 = xq1Var.b;
                                        if (i42 == 2 && j3 > 0) {
                                            int i43 = ar1Var.b;
                                            i7 = 1;
                                            if (i43 > 1) {
                                                bs1Var.q = i43 / (((float) j3) / 1000000.0f);
                                            }
                                        } else {
                                            i7 = 1;
                                        }
                                        if (i42 == i7) {
                                            int i44 = uk1Var.a;
                                            if (i44 != -1 && uk1Var.b != -1) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                bs1Var.z = i44;
                                                bs1Var.A = uk1Var.b;
                                            }
                                        }
                                        yt2[] yt2VarArr = new yt2[2];
                                        yt2VarArr[0] = yt2Var;
                                        if (vq1Var2.f.isEmpty()) {
                                            yt2Var4 = null;
                                        } else {
                                            yt2Var4 = new yt2(vq1Var2.f);
                                        }
                                        yt2VarArr[1] = yt2Var4;
                                        yt2Var5 = yt2Var;
                                        yt2 yt2Var10 = new yt2(-9223372036854775807L, new et2[0]);
                                        if (i42 == 1) {
                                            if (yt2Var2 != null) {
                                                yt2Var10 = yt2Var2;
                                            }
                                        } else if (i42 == 2 && yt2Var3 != null) {
                                            int i45 = 0;
                                            while (true) {
                                                et2[] et2VarArr = yt2Var3.P;
                                                if (i45 >= et2VarArr.length) {
                                                    break;
                                                }
                                                et2 et2Var = et2VarArr[i45];
                                                if (et2Var instanceof xo1) {
                                                    xo1 xo1Var2 = (xo1) et2Var;
                                                    if ("com.android.capture.fps".equals(xo1Var2.P)) {
                                                        yt2Var6 = new yt2(-9223372036854775807L, xo1Var2);
                                                        break;
                                                    }
                                                }
                                                i45++;
                                            }
                                            for (i8 = 0; i8 < 2; i8++) {
                                                yt2 yt2Var11 = yt2VarArr[i8];
                                                if (yt2Var11 != null) {
                                                    yt2Var6 = yt2Var6.a(yt2Var11.P);
                                                }
                                            }
                                            if (yt2Var6.P.length > 0) {
                                                bs1Var.h = yt2Var6;
                                            }
                                            uq1Var.c.e(new cu1(bs1Var));
                                            if (xq1Var.b == 2 && i41 == -1) {
                                                i41 = arrayList.size();
                                            }
                                            arrayList3 = arrayList;
                                            arrayList3.add(uq1Var);
                                            j2 = max;
                                        }
                                        yt2Var6 = yt2Var10;
                                        while (i8 < 2) {
                                        }
                                        if (yt2Var6.P.length > 0) {
                                        }
                                        uq1Var.c.e(new cu1(bs1Var));
                                        if (xq1Var.b == 2) {
                                            i41 = arrayList.size();
                                        }
                                        arrayList3 = arrayList;
                                        arrayList3.add(uq1Var);
                                        j2 = max;
                                    }
                                    i2++;
                                    vq1Var2 = this;
                                    arrayList = arrayList3;
                                    a = arrayList2;
                                    size = i5;
                                    yt2Var = yt2Var5;
                                }
                                vq1 vq1Var3 = vq1Var2;
                                vq1Var3.s = i41;
                                vq1Var3.t = j2;
                                uq1VarArr = (uq1[]) arrayList.toArray(new uq1[0]);
                                vq1Var3.q = uq1VarArr;
                                int length = uq1VarArr.length;
                                long[][] jArr = new long[length];
                                int[] iArr = new int[length];
                                long[] jArr2 = new long[length];
                                boolean[] zArr = new boolean[length];
                                for (i3 = 0; i3 < uq1VarArr.length; i3++) {
                                    jArr[i3] = new long[uq1VarArr[i3].b.b];
                                    jArr2[i3] = uq1VarArr[i3].b.f[0];
                                }
                                long j4 = 0;
                                i4 = 0;
                                while (i4 < uq1VarArr.length) {
                                    long j5 = RecyclerView.FOREVER_NS;
                                    int i46 = -1;
                                    for (int i47 = 0; i47 < uq1VarArr.length; i47++) {
                                        if (!zArr[i47]) {
                                            long j6 = jArr2[i47];
                                            if (j6 <= j5) {
                                                i46 = i47;
                                                j5 = j6;
                                            }
                                        }
                                    }
                                    int i48 = iArr[i46];
                                    long[] jArr3 = jArr[i46];
                                    jArr3[i48] = j4;
                                    ar1 ar1Var2 = uq1VarArr[i46].b;
                                    j4 += ar1Var2.d[i48];
                                    int i49 = i48 + 1;
                                    iArr[i46] = i49;
                                    if (i49 < jArr3.length) {
                                        jArr2[i46] = ar1Var2.f[i49];
                                    } else {
                                        zArr[i46] = true;
                                        i4++;
                                    }
                                    vq1Var3 = this;
                                }
                                vq1Var = vq1Var3;
                                vq1Var.r = jArr;
                                vq1Var.p.j();
                                vq1Var.p.n(vq1Var);
                                vq1Var.e.clear();
                                vq1Var.g = 2;
                            }
                            yt2Var3 = null;
                            if (i10 == 1) {
                            }
                            ArrayList a2 = mq1.a(zp1Var, uk1Var, -9223372036854775807L, null, z, new at4() { // from class: tq1
                                @Override // defpackage.at4
                                public final Object apply(Object obj) {
                                    return (xq1) obj;
                                }
                            });
                            size = a2.size();
                            int i412 = -1;
                            long j22 = -9223372036854775807L;
                            i2 = 0;
                            while (i2 < size) {
                            }
                            vq1 vq1Var32 = vq1Var2;
                            vq1Var32.s = i412;
                            vq1Var32.t = j22;
                            uq1VarArr = (uq1[]) arrayList.toArray(new uq1[0]);
                            vq1Var32.q = uq1VarArr;
                            int length2 = uq1VarArr.length;
                            long[][] jArr4 = new long[length2];
                            int[] iArr2 = new int[length2];
                            long[] jArr22 = new long[length2];
                            boolean[] zArr2 = new boolean[length2];
                            while (i3 < uq1VarArr.length) {
                            }
                            long j42 = 0;
                            i4 = 0;
                            while (i4 < uq1VarArr.length) {
                            }
                            vq1Var = vq1Var32;
                            vq1Var.r = jArr4;
                            vq1Var.p.j();
                            vq1Var.p.n(vq1Var);
                            vq1Var.e.clear();
                            vq1Var.g = 2;
                        }
                    }
                }
                arrayList = arrayList5;
                yt2Var3 = null;
                if (i10 == 1) {
                }
                ArrayList a22 = mq1.a(zp1Var, uk1Var, -9223372036854775807L, null, z, new at4() { // from class: tq1
                    @Override // defpackage.at4
                    public final Object apply(Object obj) {
                        return (xq1) obj;
                    }
                });
                size = a22.size();
                int i4122 = -1;
                long j222 = -9223372036854775807L;
                i2 = 0;
                while (i2 < size) {
                }
                vq1 vq1Var322 = vq1Var2;
                vq1Var322.s = i4122;
                vq1Var322.t = j222;
                uq1VarArr = (uq1[]) arrayList.toArray(new uq1[0]);
                vq1Var322.q = uq1VarArr;
                int length22 = uq1VarArr.length;
                long[][] jArr42 = new long[length22];
                int[] iArr22 = new int[length22];
                long[] jArr222 = new long[length22];
                boolean[] zArr22 = new boolean[length22];
                while (i3 < uq1VarArr.length) {
                }
                long j422 = 0;
                i4 = 0;
                while (i4 < uq1VarArr.length) {
                }
                vq1Var = vq1Var322;
                vq1Var.r = jArr42;
                vq1Var.p.j();
                vq1Var.p.n(vq1Var);
                vq1Var.e.clear();
                vq1Var.g = 2;
            } else {
                vq1Var = vq1Var2;
                if (!vq1Var.e.isEmpty()) {
                    ((zp1) vq1Var.e.peek()).d.add(zp1Var);
                }
            }
            vq1Var2 = vq1Var;
        }
        if (vq1Var2.g != 2) {
            j();
        }
    }
}