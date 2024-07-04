package defpackage;

/* renamed from: us1  reason: default package */
public final class us1 implements qt1 {
    public final fs1 a;
    public final eh4 b = new eh4(new byte[10], 10);
    public int c = 0;
    public int d;
    public km4 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public us1(fs1 fs1Var) {
        this.a = fs1Var;
    }

    @Override // defpackage.qt1
    public final void a(km4 km4Var, nk1 nk1Var, pt1 pt1Var) {
        this.e = km4Var;
        this.a.e(nk1Var, pt1Var);
    }

    @Override // defpackage.qt1
    public final void b(int i, kh4 kh4Var) {
        String str;
        String str2;
        int i2;
        String str3;
        long j;
        int i3;
        long j2;
        long j3;
        int i4;
        tv2.B(this.e);
        int i5 = 2;
        int i6 = 0;
        String str4 = "PesReader";
        if ((i & 1) != 0) {
            int i7 = this.c;
            if (i7 != 0 && i7 != 1) {
                if (i7 != 2) {
                    int i8 = this.j;
                    if (i8 != -1) {
                        lb4.c("PesReader", "Unexpected start indicator: expected " + i8 + " more bytes");
                    }
                    this.a.d();
                } else {
                    lb4.c("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i9 = i;
        while (true) {
            int i10 = kh4Var.c;
            int i11 = kh4Var.b;
            int i12 = i10 - i11;
            if (i12 > 0) {
                int i13 = this.c;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != i5) {
                            int i14 = this.j;
                            if (i14 == -1) {
                                i4 = 0;
                            } else {
                                i4 = i12 - i14;
                            }
                            if (i4 > 0) {
                                i12 -= i4;
                                kh4Var.d(i11 + i12);
                            }
                            this.a.c(kh4Var);
                            int i15 = this.j;
                            if (i15 != -1) {
                                int i16 = i15 - i12;
                                this.j = i16;
                                if (i16 == 0) {
                                    this.a.d();
                                    this.c = 1;
                                    this.d = i6;
                                }
                            }
                        } else {
                            if (c(kh4Var, this.b.a, Math.min(10, this.i)) && c(kh4Var, null, this.i)) {
                                this.b.e(i6);
                                if (this.f) {
                                    this.b.g(4);
                                    long b = this.b.b(3);
                                    this.b.g(1);
                                    int b2 = this.b.b(15) << 15;
                                    this.b.g(1);
                                    long b3 = this.b.b(15);
                                    this.b.g(1);
                                    if (!this.h && this.g) {
                                        this.b.g(4);
                                        str3 = str4;
                                        this.b.g(1);
                                        this.b.g(1);
                                        j2 = b;
                                        long b4 = this.b.b(15);
                                        this.b.g(1);
                                        j3 = b3;
                                        this.e.b((this.b.b(3) << 30) | (this.b.b(15) << 15) | b4);
                                        this.h = true;
                                    } else {
                                        str3 = str4;
                                        j2 = b;
                                        j3 = b3;
                                    }
                                    j = this.e.b((j2 << 30) | b2 | j3);
                                } else {
                                    str3 = str4;
                                    j = -9223372036854775807L;
                                }
                                if (true != this.k) {
                                    i3 = 0;
                                } else {
                                    i3 = 4;
                                }
                                i9 |= i3;
                                this.a.f(j, i9);
                                this.c = 3;
                                this.d = 0;
                                str4 = str3;
                                i5 = 2;
                                i6 = 0;
                            }
                        }
                        str2 = str4;
                    } else {
                        str2 = str4;
                        if (c(kh4Var, this.b.a, 9)) {
                            this.b.e(0);
                            int b5 = this.b.b(24);
                            if (b5 != 1) {
                                str = str2;
                                lb4.c(str, "Unexpected start code prefix: " + b5);
                                this.j = -1;
                                i2 = 0;
                            } else {
                                str = str2;
                                this.b.g(8);
                                int b6 = this.b.b(16);
                                this.b.g(5);
                                this.k = this.b.i();
                                this.b.g(2);
                                this.f = this.b.i();
                                this.g = this.b.i();
                                this.b.g(6);
                                int b7 = this.b.b(8);
                                this.i = b7;
                                if (b6 != 0) {
                                    int i17 = (b6 - 3) - b7;
                                    this.j = i17;
                                    if (i17 < 0) {
                                        lb4.c(str, "Found negative packet payload size: " + i17);
                                    }
                                    i2 = 2;
                                }
                                this.j = -1;
                                i2 = 2;
                            }
                            this.c = i2;
                            this.d = 0;
                        }
                    }
                    str = str2;
                } else {
                    str = str4;
                    kh4Var.f(i12);
                }
                str4 = str;
                i5 = 2;
                i6 = 0;
            } else {
                return;
            }
        }
    }

    public final boolean c(kh4 kh4Var, byte[] bArr, int i) {
        int min = Math.min(kh4Var.c - kh4Var.b, i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            kh4Var.f(min);
        } else {
            kh4Var.a(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.qt1
    public final void d() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.b();
    }
}