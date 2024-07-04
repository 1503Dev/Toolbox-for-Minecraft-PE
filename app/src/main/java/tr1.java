package defpackage;

/* renamed from: tr1  reason: default package */
public final class tr1 implements fs1 {
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

    public tr1(String str) {
        eh4 eh4Var = new eh4(new byte[16], 16);
        this.a = eh4Var;
        this.b = new kh4(eh4Var.a);
        this.f = 0;
        this.g = 0;
        this.h = false;
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

    @Override // defpackage.fs1
    public final void c(kh4 kh4Var) {
        boolean z;
        boolean z2;
        tv2.B(this.e);
        while (true) {
            int i = kh4Var.c - kh4Var.b;
            if (i > 0) {
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 != 1) {
                        int min = Math.min(i, this.k - this.g);
                        this.e.a(min, kh4Var);
                        int i3 = this.g + min;
                        this.g = i3;
                        int i4 = this.k;
                        if (i3 == i4) {
                            long j = this.l;
                            if (j != -9223372036854775807L) {
                                this.e.b(j, 1, i4, 0, null);
                                this.l += this.i;
                            }
                            this.f = 0;
                        }
                    } else {
                        byte[] bArr = this.b.a;
                        int min2 = Math.min(i, 16 - this.g);
                        kh4Var.a(bArr, this.g, min2);
                        int i5 = this.g + min2;
                        this.g = i5;
                        if (i5 == 16) {
                            this.a.e(0);
                            g16 x = vx.x(this.a);
                            cu1 cu1Var = this.j;
                            if (cu1Var == null || cu1Var.x != 2 || x.a != cu1Var.y || !"audio/ac4".equals(cu1Var.k)) {
                                bs1 bs1Var = new bs1();
                                bs1Var.a = this.d;
                                bs1Var.j = "audio/ac4";
                                bs1Var.w = 2;
                                bs1Var.x = x.a;
                                bs1Var.c = this.c;
                                cu1 cu1Var2 = new cu1(bs1Var);
                                this.j = cu1Var2;
                                this.e.e(cu1Var2);
                            }
                            this.k = x.b;
                            this.i = (x.c * 1000000) / this.j.y;
                            this.b.e(0);
                            this.e.a(16, this.b);
                            this.f = 2;
                        }
                    }
                } else {
                    while (kh4Var.c - kh4Var.b > 0) {
                        if (!this.h) {
                            if (kh4Var.n() == 172) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.h = z;
                        } else {
                            int n = kh4Var.n();
                            if (n == 172) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.h = z2;
                            byte b = 64;
                            if (n != 64) {
                                if (n == 65) {
                                    n = 65;
                                }
                            }
                            this.f = 1;
                            byte[] bArr2 = this.b.a;
                            bArr2[0] = -84;
                            if (n == 65) {
                                b = 65;
                            }
                            bArr2[1] = b;
                            this.g = 2;
                        }
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