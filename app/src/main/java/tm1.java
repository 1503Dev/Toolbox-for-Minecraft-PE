package defpackage;

/* renamed from: tm1  reason: default package */
public final class tm1 implements lk1 {
    public nk1 f;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public sm1 o;
    public wm1 p;
    public final kh4 a = new kh4(4);
    public final kh4 b = new kh4(9);
    public final kh4 c = new kh4(11);
    public final kh4 d = new kh4();
    public final um1 e = new um1();
    public int g = 1;

    @Override // defpackage.lk1
    public final boolean a(p16 p16Var) {
        p16Var.B(this.a.a, 0, 3, false);
        this.a.e(0);
        if (this.a.o() != 4607062) {
            return false;
        }
        p16Var.B(this.a.a, 0, 2, false);
        this.a.e(0);
        if ((this.a.q() & 250) != 0) {
            return false;
        }
        p16Var.B(this.a.a, 0, 4, false);
        this.a.e(0);
        int i = this.a.i();
        p16Var.f = 0;
        p16Var.h(i, false);
        p16Var.B(this.a.a, 0, 4, false);
        this.a.e(0);
        if (this.a.i() != 0) {
            return false;
        }
        return true;
    }

    public final kh4 b(p16 p16Var) {
        int i = this.l;
        kh4 kh4Var = this.d;
        byte[] bArr = kh4Var.a;
        if (i > bArr.length) {
            int length = bArr.length;
            kh4Var.c(new byte[Math.max(length + length, i)], 0);
        } else {
            kh4Var.e(0);
        }
        this.d.d(this.l);
        p16Var.A(this.d.a, 0, this.l, false);
        return this.d;
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.f = nk1Var;
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0007 A[SYNTHETIC] */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        long j;
        boolean j2;
        boolean z;
        yg5 yg5Var;
        tv2.B(this.f);
        while (true) {
            int i = this.g;
            int i2 = 8;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            long j3 = 0;
                            if (this.h) {
                                j = this.i + this.m;
                            } else if (this.e.Q == -9223372036854775807L) {
                                j = 0;
                            } else {
                                j = this.m;
                            }
                            int i3 = this.k;
                            if (i3 == 8) {
                                if (this.o != null) {
                                    if (!this.n) {
                                        this.f.n(new ll1(-9223372036854775807L, 0L));
                                        this.n = true;
                                    }
                                    yg5Var = this.o;
                                    j2 = yg5Var.j(j, b((p16) mk1Var));
                                    z = true;
                                    if (!this.h && j2) {
                                        this.h = true;
                                        if (this.e.Q == -9223372036854775807L) {
                                            j3 = -this.m;
                                        }
                                        this.i = j3;
                                    }
                                    this.j = 4;
                                    this.g = 2;
                                    if (!z) {
                                        return 0;
                                    }
                                }
                            } else {
                                i2 = i3;
                            }
                            if (i2 == 9) {
                                if (this.p != null) {
                                    if (!this.n) {
                                        this.f.n(new ll1(-9223372036854775807L, 0L));
                                        this.n = true;
                                    }
                                    yg5Var = this.p;
                                    j2 = yg5Var.j(j, b((p16) mk1Var));
                                    z = true;
                                    if (!this.h) {
                                        this.h = true;
                                        if (this.e.Q == -9223372036854775807L) {
                                        }
                                        this.i = j3;
                                    }
                                    this.j = 4;
                                    this.g = 2;
                                    if (!z) {
                                    }
                                }
                            } else if (i2 == 18 && !this.n) {
                                j2 = this.e.j(j, b((p16) mk1Var));
                                um1 um1Var = this.e;
                                long j4 = um1Var.Q;
                                if (j4 != -9223372036854775807L) {
                                    this.f.n(new dl1(j4, um1Var.S, um1Var.R));
                                    this.n = true;
                                }
                                z = true;
                                if (!this.h) {
                                }
                                this.j = 4;
                                this.g = 2;
                                if (!z) {
                                }
                            }
                            ((p16) mk1Var).k(this.l);
                            j2 = false;
                            z = false;
                            if (!this.h) {
                            }
                            this.j = 4;
                            this.g = 2;
                            if (!z) {
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (!((p16) mk1Var).A(this.c.a, 0, 11, true)) {
                            return -1;
                        }
                        this.c.e(0);
                        this.k = this.c.n();
                        this.l = this.c.o();
                        this.m = this.c.o();
                        this.m = (this.m | (this.c.n() << 24)) * 1000;
                        this.c.f(3);
                        this.g = 4;
                    }
                } else {
                    ((p16) mk1Var).k(this.j);
                    this.j = 0;
                    this.g = 3;
                }
            } else {
                if (!((p16) mk1Var).A(this.b.a, 0, 9, true)) {
                    return -1;
                }
                this.b.e(0);
                this.b.f(4);
                int n = this.b.n();
                int i4 = n & 4;
                int i5 = n & 1;
                if (i4 != 0 && this.o == null) {
                    this.o = new sm1(this.f.q(8, 1));
                }
                if (i5 != 0 && this.p == null) {
                    this.p = new wm1(this.f.q(9, 2));
                }
                this.f.j();
                this.j = this.b.i() - 5;
                this.g = 2;
            }
        }
    }
}