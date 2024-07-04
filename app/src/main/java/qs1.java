package defpackage;

import java.util.Collections;

/* renamed from: qs1  reason: default package */
public final class qs1 implements fs1 {
    public final String a;
    public final kh4 b;
    public final eh4 c;
    public pl1 d;
    public String e;
    public cu1 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public qs1(String str) {
        this.a = str;
        kh4 kh4Var = new kh4(1024);
        this.b = kh4Var;
        byte[] bArr = kh4Var.a;
        this.c = new eh4(bArr, bArr.length);
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.fs1
    public final void b() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x018b, code lost:
        throw defpackage.jy2.a(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019a, code lost:
        if (r17.l == false) goto L26;
     */
    @Override // defpackage.fs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(kh4 kh4Var) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean i5;
        tv2.B(this.d);
        while (true) {
            int i6 = kh4Var.c - kh4Var.b;
            if (i6 > 0) {
                int i7 = this.g;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            int min = Math.min(i6, this.i - this.h);
                            kh4Var.a(this.c.a, this.h, min);
                            int i8 = this.h + min;
                            this.h = i8;
                            if (i8 == this.i) {
                                this.c.e(0);
                                eh4 eh4Var = this.c;
                                if (!eh4Var.i()) {
                                    this.l = true;
                                    int b = eh4Var.b(1);
                                    if (b == 1) {
                                        i3 = eh4Var.b(1);
                                        i2 = 1;
                                    } else {
                                        i2 = b;
                                        i3 = 0;
                                    }
                                    this.m = i3;
                                    if (i3 == 0) {
                                        if (i2 == 1) {
                                            eh4Var.b((eh4Var.b(2) + 1) * 8);
                                            i2 = 1;
                                        }
                                        if (eh4Var.i()) {
                                            int i9 = 6;
                                            this.n = eh4Var.b(6);
                                            int b2 = eh4Var.b(4);
                                            int b3 = eh4Var.b(3);
                                            if (b2 != 0 || b3 != 0) {
                                                break;
                                            }
                                            if (i2 == 0) {
                                                int i10 = (eh4Var.b * 8) + eh4Var.c;
                                                int a = eh4Var.a();
                                                e16 a2 = f16.a(eh4Var, true);
                                                this.u = a2.c;
                                                this.r = a2.a;
                                                this.t = a2.b;
                                                int a3 = a - eh4Var.a();
                                                eh4Var.e(i10);
                                                byte[] bArr = new byte[(a3 + 7) / 8];
                                                eh4Var.d(bArr, a3);
                                                bs1 bs1Var = new bs1();
                                                bs1Var.a = this.e;
                                                bs1Var.j = "audio/mp4a-latm";
                                                bs1Var.g = this.u;
                                                bs1Var.w = this.t;
                                                bs1Var.x = this.r;
                                                bs1Var.l = Collections.singletonList(bArr);
                                                bs1Var.c = this.a;
                                                cu1 cu1Var = new cu1(bs1Var);
                                                if (!cu1Var.equals(this.f)) {
                                                    this.f = cu1Var;
                                                    i4 = i2;
                                                    this.s = 1024000000 / cu1Var.y;
                                                    this.d.e(cu1Var);
                                                } else {
                                                    i4 = i2;
                                                }
                                            } else {
                                                i4 = i2;
                                                int a4 = eh4Var.a();
                                                e16 a5 = f16.a(eh4Var, true);
                                                this.u = a5.c;
                                                this.r = a5.a;
                                                this.t = a5.b;
                                                eh4Var.g(eh4Var.b((eh4Var.b(2) + 1) * 8) - (a4 - eh4Var.a()));
                                            }
                                            int b4 = eh4Var.b(3);
                                            this.o = b4;
                                            if (b4 != 0) {
                                                if (b4 != 1) {
                                                    if (b4 != 3 && b4 != 4 && b4 != 5) {
                                                        if (b4 != 6 && b4 != 7) {
                                                            throw new IllegalStateException();
                                                        }
                                                        eh4Var.g(1);
                                                    }
                                                } else {
                                                    i9 = 9;
                                                }
                                                eh4Var.g(i9);
                                            } else {
                                                eh4Var.g(8);
                                            }
                                            boolean i11 = eh4Var.i();
                                            this.p = i11;
                                            this.q = 0L;
                                            if (i11) {
                                                if (i4 != 1) {
                                                    do {
                                                        i5 = eh4Var.i();
                                                        this.q = (this.q << 8) + eh4Var.b(8);
                                                    } while (i5);
                                                } else {
                                                    this.q = eh4Var.b((eh4Var.b(2) + 1) * 8);
                                                }
                                            }
                                            if (eh4Var.i()) {
                                                eh4Var.g(8);
                                            }
                                        } else {
                                            throw jy2.a(null, null);
                                        }
                                    } else {
                                        throw jy2.a(null, null);
                                    }
                                }
                                if (this.m == 0) {
                                    if (this.n == 0) {
                                        if (this.o == 0) {
                                            int i12 = 0;
                                            while (true) {
                                                int b5 = eh4Var.b(8);
                                                i = i12 + b5;
                                                if (b5 != 255) {
                                                    break;
                                                }
                                                i12 = i;
                                            }
                                            int i13 = (eh4Var.b * 8) + eh4Var.c;
                                            if ((i13 & 7) == 0) {
                                                this.b.e(i13 >> 3);
                                            } else {
                                                eh4Var.d(this.b.a, i * 8);
                                                this.b.e(0);
                                            }
                                            this.d.a(i, this.b);
                                            long j = this.k;
                                            if (j != -9223372036854775807L) {
                                                this.d.b(j, 1, i, 0, null);
                                                this.k += this.s;
                                            }
                                            if (this.p) {
                                                eh4Var.g((int) this.q);
                                            }
                                            this.g = 0;
                                        } else {
                                            throw jy2.a(null, null);
                                        }
                                    } else {
                                        throw jy2.a(null, null);
                                    }
                                } else {
                                    throw jy2.a(null, null);
                                }
                            } else {
                                continue;
                            }
                        } else {
                            int n = ((this.j & (-225)) << 8) | kh4Var.n();
                            this.i = n;
                            kh4 kh4Var2 = this.b;
                            if (n > kh4Var2.a.length) {
                                kh4Var2.b(n);
                                eh4 eh4Var2 = this.c;
                                byte[] bArr2 = this.b.a;
                                int length = bArr2.length;
                                eh4Var2.a = bArr2;
                                eh4Var2.b = 0;
                                eh4Var2.c = 0;
                                eh4Var2.d = length;
                            }
                            this.h = 0;
                            this.g = 3;
                        }
                    } else {
                        int n2 = kh4Var.n();
                        if ((n2 & 224) == 224) {
                            this.j = n2;
                            this.g = 2;
                        } else if (n2 != 86) {
                            this.g = 0;
                        }
                    }
                } else if (kh4Var.n() == 86) {
                    this.g = 1;
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
        this.d = nk1Var.q(pt1Var.d, 1);
        pt1Var.b();
        this.e = pt1Var.e;
    }

    @Override // defpackage.fs1
    public final void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }
}