package defpackage;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: zs1  reason: default package */
public final class zs1 implements lk1 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public ws1 i;
    public nk1 j;
    public boolean k;
    public final km4 a = new km4();
    public final kh4 c = new kh4(4096);
    public final SparseArray b = new SparseArray();
    public final xs1 d = new xs1();

    @Override // defpackage.lk1
    public final boolean a(p16 p16Var) {
        byte[] bArr = new byte[14];
        p16Var.B(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            p16Var.h(bArr[13] & 7, false);
            p16Var.B(bArr, 0, 3, false);
            return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
        }
        return false;
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.j = nk1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r0 != r7) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[LOOP:0: B:19:0x002d->B:21:0x0035, LOOP_END] */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j, long j2) {
        long j3;
        ws1 ws1Var;
        int i;
        km4 km4Var = this.a;
        synchronized (km4Var) {
            j3 = km4Var.b;
        }
        if (j3 != -9223372036854775807L) {
            long c = km4Var.c();
            if (c != -9223372036854775807L) {
                if (c != 0) {
                }
            }
            ws1Var = this.i;
            if (ws1Var != null) {
                ws1Var.b(j2);
            }
            for (i = 0; i < this.b.size(); i++) {
                ys1 ys1Var = (ys1) this.b.valueAt(i);
                ys1Var.f = false;
                ys1Var.a.b();
            }
        }
        km4Var.d(j2);
        ws1Var = this.i;
        if (ws1Var != null) {
        }
        while (i < this.b.size()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021d  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        ?? r13;
        long j;
        long j2;
        fs1 hs1Var;
        boolean z;
        boolean z2;
        nk1 nk1Var;
        ml1 ll1Var;
        int i;
        int i2;
        tv2.B(this.j);
        p16 p16Var = (p16) mk1Var;
        long j3 = p16Var.c;
        long j4 = -9223372036854775807L;
        long j5 = 0;
        if (j3 != -1) {
            xs1 xs1Var = this.d;
            if (!xs1Var.c) {
                if (!xs1Var.e) {
                    int min = (int) Math.min(20000L, j3);
                    j5 = j3 - min;
                    if (p16Var.d == j5) {
                        xs1Var.b.b(min);
                        p16Var.f = 0;
                        ((p16) mk1Var).B(xs1Var.b.a, 0, min, false);
                        kh4 kh4Var = xs1Var.b;
                        int i3 = kh4Var.b;
                        int i4 = kh4Var.c - 4;
                        while (true) {
                            if (i4 < i3) {
                                break;
                            }
                            if (xs1.c(kh4Var.a, i4) == 442) {
                                kh4Var.e(i4 + 4);
                                long a = xs1.a(kh4Var);
                                if (a != -9223372036854775807L) {
                                    j4 = a;
                                    break;
                                }
                            }
                            i4--;
                        }
                        xs1Var.g = j4;
                        xs1Var.e = true;
                        i2 = 0;
                    }
                    jl1Var.a = j5;
                    i2 = 1;
                } else {
                    if (xs1Var.g == -9223372036854775807L) {
                        i = 0;
                    } else if (!xs1Var.d) {
                        int min2 = (int) Math.min(20000L, j3);
                        if (p16Var.d == 0) {
                            xs1Var.b.b(min2);
                            p16Var.f = 0;
                            ((p16) mk1Var).B(xs1Var.b.a, 0, min2, false);
                            kh4 kh4Var2 = xs1Var.b;
                            int i5 = kh4Var2.b;
                            int i6 = kh4Var2.c;
                            while (true) {
                                if (i5 >= i6 - 3) {
                                    break;
                                }
                                if (xs1.c(kh4Var2.a, i5) == 442) {
                                    kh4Var2.e(i5 + 4);
                                    long a2 = xs1.a(kh4Var2);
                                    if (a2 != -9223372036854775807L) {
                                        j4 = a2;
                                        break;
                                    }
                                }
                                i5++;
                            }
                            xs1Var.f = j4;
                            xs1Var.d = true;
                            i2 = 0;
                        }
                        jl1Var.a = j5;
                        i2 = 1;
                    } else {
                        i = 0;
                        long j6 = xs1Var.f;
                        if (j6 != -9223372036854775807L) {
                            long b = xs1Var.a.b(xs1Var.g) - xs1Var.a.b(j6);
                            xs1Var.h = b;
                            if (b < 0) {
                                lb4.c("PsDurationReader", "Invalid duration: " + b + ". Using TIME_UNSET instead.");
                                xs1Var.h = -9223372036854775807L;
                            }
                        }
                    }
                    xs1Var.b(p16Var);
                    return i;
                }
                return i2;
            }
        }
        if (!this.k) {
            this.k = true;
            xs1 xs1Var2 = this.d;
            long j7 = xs1Var2.h;
            if (j7 != -9223372036854775807L) {
                z2 = false;
                ws1 ws1Var = new ws1(xs1Var2.a, j7, j3);
                this.i = ws1Var;
                nk1Var = this.j;
                ll1Var = ws1Var.a;
            } else {
                z2 = false;
                nk1Var = this.j;
                ll1Var = new ll1(j7, 0L);
            }
            nk1Var.n(ll1Var);
            r13 = z2;
        } else {
            r13 = 0;
        }
        ws1 ws1Var2 = this.i;
        if (ws1Var2 != null) {
            if (ws1Var2.c != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return ws1Var2.a(p16Var, jl1Var);
            }
        }
        p16Var.f = r13;
        if (j3 != -1) {
            j = j3 - p16Var.b();
        } else {
            j = -1;
        }
        if ((j != -1 && j < 4) || !p16Var.B(this.c.a, r13, 4, true)) {
            return -1;
        }
        this.c.e(r13);
        int i7 = this.c.i();
        if (i7 == 441) {
            return -1;
        }
        if (i7 == 442) {
            p16 p16Var2 = (p16) mk1Var;
            p16Var2.B(this.c.a, r13, 10, r13);
            this.c.e(9);
            p16Var2.k((this.c.n() & 7) + 14);
            return r13;
        } else if (i7 == 443) {
            p16 p16Var3 = (p16) mk1Var;
            p16Var3.B(this.c.a, r13, 2, r13);
            this.c.e(r13);
            p16Var3.k(this.c.q() + 6);
            return r13;
        } else if ((i7 >> 8) != 1) {
            ((p16) mk1Var).k(1);
            return r13;
        } else {
            int i8 = i7 & 255;
            ys1 ys1Var = (ys1) this.b.get(i8);
            if (!this.e) {
                if (ys1Var == null) {
                    fs1 fs1Var = null;
                    if (i8 == 189) {
                        hs1Var = new rr1(null);
                    } else if ((i8 & 224) == 192) {
                        hs1Var = new rs1(null);
                    } else {
                        if ((i8 & 240) == 224) {
                            hs1Var = new hs1(null);
                            this.g = true;
                            fs1Var = hs1Var;
                            this.h = p16Var.d;
                        }
                        if (fs1Var != null) {
                            fs1Var.e(this.j, new pt1(RecyclerView.UNDEFINED_DURATION, i8, 256));
                            ys1Var = new ys1(fs1Var, this.a);
                            this.b.put(i8, ys1Var);
                        }
                    }
                    this.f = true;
                    fs1Var = hs1Var;
                    this.h = p16Var.d;
                    if (fs1Var != null) {
                    }
                }
                long j8 = 1048576;
                if (this.f && this.g) {
                    j8 = this.h + 8192;
                }
                if (p16Var.d > j8) {
                    this.e = true;
                    this.j.j();
                }
            }
            p16 p16Var4 = (p16) mk1Var;
            p16Var4.B(this.c.a, r13, 2, r13);
            this.c.e(r13);
            int q = this.c.q() + 6;
            if (ys1Var == null) {
                p16Var4.k(q);
                return 0;
            }
            this.c.b(q);
            p16Var4.A(this.c.a, r13, q, r13);
            this.c.e(6);
            kh4 kh4Var3 = this.c;
            kh4Var3.a(ys1Var.c.a, r13, 3);
            ys1Var.c.e(r13);
            ys1Var.c.g(8);
            ys1Var.d = ys1Var.c.i();
            ys1Var.e = ys1Var.c.i();
            ys1Var.c.g(6);
            kh4Var3.a(ys1Var.c.a, r13, ys1Var.c.b(8));
            ys1Var.c.e(r13);
            if (ys1Var.d) {
                ys1Var.c.g(4);
                long b2 = ys1Var.c.b(3);
                ys1Var.c.g(1);
                int b3 = ys1Var.c.b(15) << 15;
                ys1Var.c.g(1);
                long b4 = ys1Var.c.b(15);
                ys1Var.c.g(1);
                if (!ys1Var.f && ys1Var.e) {
                    ys1Var.c.g(4);
                    ys1Var.c.g(1);
                    ys1Var.c.g(1);
                    ys1Var.c.g(1);
                    j2 = b4;
                    ys1Var.b.b((ys1Var.c.b(3) << 30) | (ys1Var.c.b(15) << 15) | ys1Var.c.b(15));
                    ys1Var.f = true;
                } else {
                    j2 = b4;
                }
                j5 = ys1Var.b.b((b2 << 30) | b3 | j2);
            }
            ys1Var.a.f(j5, 4);
            ys1Var.a.c(kh4Var3);
            ys1Var.a.d();
            kh4 kh4Var4 = this.c;
            kh4Var4.d(kh4Var4.a.length);
            return 0;
        }
    }
}