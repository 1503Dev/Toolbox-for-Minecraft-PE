package defpackage;

/* renamed from: rr1  reason: default package */
public final class rr1 implements fs1 {
    public final eh4 a;
    public final kh4 b;
    public final String c;
    public String d;
    public pl1 e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public cu1 j;
    public int k;
    public long l;

    public rr1(String str) {
        eh4 eh4Var = new eh4(new byte[128], 128);
        this.a = eh4Var;
        this.b = new kh4(eh4Var.a);
        this.f = 0;
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // defpackage.fs1
    public final void b() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x0364, code lost:
        if (r24.n() == 11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0380, code lost:
        if (r2 == 11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0382, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0384, code lost:
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023c  */
    @Override // defpackage.fs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(kh4 kh4Var) {
        String str;
        int i;
        int i2;
        String str2;
        int i3;
        int i4;
        int i5;
        char c;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        tv2.B(this.e);
        while (true) {
            int i12 = kh4Var.c - kh4Var.b;
            if (i12 > 0) {
                int i13 = this.f;
                if (i13 == 0) {
                    while (true) {
                        if (kh4Var.c - kh4Var.b <= 0) {
                            break;
                        }
                        if (this.h) {
                            int n = kh4Var.n();
                            if (n == 119) {
                                this.h = false;
                                this.f = 1;
                                byte[] bArr = this.b.a;
                                bArr[0] = 11;
                                bArr[1] = 119;
                                this.g = 2;
                                break;
                            }
                        }
                        this.h = z;
                    }
                } else if (i13 != 1) {
                    int min = Math.min(i12, this.k - this.g);
                    this.e.a(min, kh4Var);
                    int i14 = this.g + min;
                    this.g = i14;
                    int i15 = this.k;
                    if (i14 == i15) {
                        long j = this.l;
                        if (j != -9223372036854775807L) {
                            this.e.b(j, 1, i15, 0, null);
                            this.l += this.i;
                        }
                        this.f = 0;
                    }
                } else {
                    byte[] bArr2 = this.b.a;
                    int min2 = Math.min(i12, 128 - this.g);
                    kh4Var.a(bArr2, this.g, min2);
                    int i16 = this.g + min2;
                    this.g = i16;
                    if (i16 == 128) {
                        this.a.e(0);
                        eh4 eh4Var = this.a;
                        eh4Var.g(40);
                        int b = eh4Var.b(5);
                        eh4Var.e((eh4Var.b * 8) + eh4Var.c);
                        if (b > 10) {
                            eh4Var.g(16);
                            int b2 = eh4Var.b(2);
                            if (b2 != 0) {
                                if (b2 != 1) {
                                    if (b2 != 2) {
                                        c = 65535;
                                    } else {
                                        c = 2;
                                    }
                                } else {
                                    c = 1;
                                }
                            } else {
                                c = 0;
                            }
                            eh4Var.g(3);
                            int b3 = eh4Var.b(11) + 1;
                            int b4 = eh4Var.b(2);
                            if (b4 == 3) {
                                i8 = da2.Y[eh4Var.b(2)];
                                i6 = 6;
                                i7 = 3;
                            } else {
                                int b5 = eh4Var.b(2);
                                i6 = da2.W[b5];
                                i7 = b5;
                                i8 = da2.X[b4];
                            }
                            i3 = b3 + b3;
                            int i17 = (i3 * i8) / (i6 * 32);
                            int b6 = eh4Var.b(3);
                            boolean i18 = eh4Var.i();
                            int i19 = da2.Z[b6] + (i18 ? 1 : 0);
                            eh4Var.g(10);
                            if (eh4Var.i()) {
                                eh4Var.g(8);
                            }
                            if (b6 == 0) {
                                eh4Var.g(5);
                                if (eh4Var.i()) {
                                    eh4Var.g(8);
                                }
                                i9 = 0;
                                b6 = 0;
                            } else {
                                i9 = b6;
                            }
                            if (c == 1) {
                                if (eh4Var.i()) {
                                    eh4Var.g(16);
                                }
                                c = 1;
                            }
                            if (eh4Var.i()) {
                                if (i9 > 2) {
                                    eh4Var.g(2);
                                }
                                if ((i9 & 1) != 0 && i9 > 2) {
                                    eh4Var.g(6);
                                }
                                if ((i9 & 4) != 0) {
                                    eh4Var.g(6);
                                }
                                if (i18 && eh4Var.i()) {
                                    eh4Var.g(5);
                                }
                                if (c == 0) {
                                    if (eh4Var.i()) {
                                        eh4Var.g(6);
                                    }
                                    if (i9 == 0 && eh4Var.i()) {
                                        eh4Var.g(6);
                                    }
                                    if (eh4Var.i()) {
                                        eh4Var.g(6);
                                    }
                                    int b7 = eh4Var.b(2);
                                    if (b7 == 1) {
                                        eh4Var.g(5);
                                    } else if (b7 == 2) {
                                        eh4Var.g(12);
                                    } else if (b7 == 3) {
                                        int b8 = eh4Var.b(5);
                                        if (eh4Var.i()) {
                                            eh4Var.g(5);
                                            if (eh4Var.i()) {
                                                eh4Var.g(4);
                                            }
                                            if (eh4Var.i()) {
                                                eh4Var.g(4);
                                            }
                                            if (eh4Var.i()) {
                                                eh4Var.g(4);
                                            }
                                            if (eh4Var.i()) {
                                                eh4Var.g(4);
                                            }
                                            if (eh4Var.i()) {
                                                eh4Var.g(4);
                                            }
                                            if (eh4Var.i()) {
                                                eh4Var.g(4);
                                            }
                                            if (eh4Var.i()) {
                                                eh4Var.g(4);
                                            }
                                            if (eh4Var.i()) {
                                                if (eh4Var.i()) {
                                                    eh4Var.g(4);
                                                }
                                                if (eh4Var.i()) {
                                                    eh4Var.g(4);
                                                }
                                            }
                                        }
                                        if (eh4Var.i()) {
                                            eh4Var.g(5);
                                            if (eh4Var.i()) {
                                                eh4Var.g(7);
                                                if (eh4Var.i()) {
                                                    eh4Var.g(8);
                                                    eh4Var.g((b8 + 2) * 8);
                                                    eh4Var.c();
                                                }
                                            }
                                        }
                                        eh4Var.g((b8 + 2) * 8);
                                        eh4Var.c();
                                    }
                                    if (i9 < 2) {
                                        if (eh4Var.i()) {
                                            eh4Var.g(14);
                                        }
                                        if (b6 == 0 && eh4Var.i()) {
                                            eh4Var.g(14);
                                        }
                                    }
                                    if (eh4Var.i()) {
                                        if (i7 == 0) {
                                            eh4Var.g(5);
                                            i7 = 0;
                                        } else {
                                            for (int i20 = 0; i20 < i6; i20++) {
                                                if (eh4Var.i()) {
                                                    eh4Var.g(5);
                                                }
                                            }
                                        }
                                    }
                                    i10 = i7;
                                    c = 0;
                                    if (eh4Var.i()) {
                                        eh4Var.g(5);
                                        if (i9 == 2) {
                                            eh4Var.g(4);
                                            i9 = 2;
                                        }
                                        if (i9 >= 6) {
                                            eh4Var.g(2);
                                        }
                                        if (eh4Var.i()) {
                                            i11 = 8;
                                            eh4Var.g(8);
                                        } else {
                                            i11 = 8;
                                        }
                                        if (i9 == 0 && eh4Var.i()) {
                                            eh4Var.g(i11);
                                        }
                                        if (b4 < 3) {
                                            eh4Var.f();
                                        }
                                    }
                                    if (c == 0 && i10 != 3) {
                                        eh4Var.f();
                                    }
                                    if (c == 2 && (i10 == 3 || eh4Var.i())) {
                                        eh4Var.g(6);
                                    }
                                    if (!eh4Var.i() && eh4Var.b(6) == 1 && eh4Var.b(8) == 1) {
                                        str2 = "audio/eac3-joc";
                                    } else {
                                        str2 = "audio/eac3";
                                    }
                                    i5 = i6 * 256;
                                    i2 = i8;
                                    i = i17;
                                    i4 = i19;
                                }
                            }
                            i10 = i7;
                            if (eh4Var.i()) {
                            }
                            if (c == 0) {
                                eh4Var.f();
                            }
                            if (c == 2) {
                                eh4Var.g(6);
                            }
                            if (!eh4Var.i()) {
                            }
                            str2 = "audio/eac3";
                            i5 = i6 * 256;
                            i2 = i8;
                            i = i17;
                            i4 = i19;
                        } else {
                            eh4Var.g(32);
                            int b9 = eh4Var.b(2);
                            if (b9 != 3) {
                                str = "audio/ac3";
                            } else {
                                str = null;
                            }
                            int b10 = eh4Var.b(6);
                            i = da2.a0[b10 / 2] * 1000;
                            int m = da2.m(b9, b10);
                            eh4Var.g(8);
                            int b11 = eh4Var.b(3);
                            if ((b11 & 1) != 0 && b11 != 1) {
                                eh4Var.g(2);
                            }
                            if ((b11 & 4) != 0) {
                                eh4Var.g(2);
                            }
                            if (b11 == 2) {
                                eh4Var.g(2);
                            }
                            if (b9 < 3) {
                                i2 = da2.X[b9];
                            } else {
                                i2 = -1;
                            }
                            int i21 = da2.Z[b11] + (eh4Var.i() ? 1 : 0);
                            str2 = str;
                            i3 = m;
                            i4 = i21;
                            i5 = 1536;
                        }
                        cu1 cu1Var = this.j;
                        if (cu1Var == null || i4 != cu1Var.x || i2 != cu1Var.y || !zn4.b(str2, cu1Var.k)) {
                            bs1 bs1Var = new bs1();
                            bs1Var.a = this.d;
                            bs1Var.j = str2;
                            bs1Var.w = i4;
                            bs1Var.x = i2;
                            bs1Var.c = this.c;
                            bs1Var.f = i;
                            if ("audio/ac3".equals(str2)) {
                                bs1Var.e = i;
                            }
                            cu1 cu1Var2 = new cu1(bs1Var);
                            this.j = cu1Var2;
                            this.e.e(cu1Var2);
                        }
                        this.k = i3;
                        this.i = (i5 * 1000000) / this.j.y;
                        this.b.e(0);
                        this.e.a(128, this.b);
                        this.f = 2;
                    }
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
        this.d = pt1Var.e;
        pt1Var.b();
        this.e = nk1Var.q(pt1Var.d, 1);
    }

    @Override // defpackage.fs1
    public final void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }
}