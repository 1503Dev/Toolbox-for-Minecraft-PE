package defpackage;

/* renamed from: rs1  reason: default package */
public final class rs1 implements fs1 {
    public final kh4 a;
    public final el1 b;
    public final String c;
    public pl1 d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public rs1(String str) {
        kh4 kh4Var = new kh4(4);
        this.a = kh4Var;
        kh4Var.a[0] = -1;
        this.b = new el1();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // defpackage.fs1
    public final void b() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.fs1
    public final void c(kh4 kh4Var) {
        boolean z;
        boolean z2;
        tv2.B(this.d);
        while (true) {
            int i = kh4Var.c;
            int i2 = kh4Var.b;
            int i3 = i - i2;
            if (i3 > 0) {
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 != 1) {
                        int min = Math.min(i3, this.k - this.g);
                        this.d.a(min, kh4Var);
                        int i5 = this.g + min;
                        this.g = i5;
                        int i6 = this.k;
                        if (i5 >= i6) {
                            long j = this.l;
                            if (j != -9223372036854775807L) {
                                this.d.b(j, 1, i6, 0, null);
                                this.l += this.j;
                            }
                            this.g = 0;
                            this.f = 0;
                        }
                    } else {
                        int min2 = Math.min(i3, 4 - this.g);
                        kh4Var.a(this.a.a, this.g, min2);
                        int i7 = this.g + min2;
                        this.g = i7;
                        if (i7 >= 4) {
                            this.a.e(0);
                            if (!this.b.a(this.a.i())) {
                                this.g = 0;
                                this.f = 1;
                                break;
                            }
                            el1 el1Var = this.b;
                            this.k = el1Var.c;
                            if (!this.h) {
                                int i8 = el1Var.d;
                                this.j = (el1Var.g * 1000000) / i8;
                                bs1 bs1Var = new bs1();
                                bs1Var.a = this.e;
                                bs1Var.j = el1Var.b;
                                bs1Var.k = 4096;
                                bs1Var.w = el1Var.e;
                                bs1Var.x = i8;
                                bs1Var.c = this.c;
                                this.d.e(new cu1(bs1Var));
                                this.h = true;
                            }
                            this.a.e(0);
                            this.d.a(4, this.a);
                            this.f = 2;
                        }
                    }
                } else {
                    byte[] bArr = kh4Var.a;
                    while (i2 < i) {
                        byte b = bArr[i2];
                        if ((b & 255) == 255) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.i && (b & 224) == 224) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.i = z;
                        if (z2) {
                            kh4Var.e(i2 + 1);
                            this.i = false;
                            this.a.a[1] = bArr[i2];
                            this.g = 2;
                            this.f = 1;
                            break;
                            break;
                        }
                        i2++;
                    }
                    kh4Var.e(i);
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
        this.e = pt1Var.e;
        pt1Var.b();
        this.d = nk1Var.q(pt1Var.d, 1);
    }

    @Override // defpackage.fs1
    public final void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }
}