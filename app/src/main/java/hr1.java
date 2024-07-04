package defpackage;

import androidx.databinding.ViewDataBinding;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: hr1  reason: default package */
public final class hr1 implements lk1 {
    public nk1 a;
    public nr1 b;
    public boolean c;

    @Override // defpackage.lk1
    public final boolean a(p16 p16Var) {
        try {
            return b(p16Var);
        } catch (jy2 unused) {
            return false;
        }
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = ViewDataBinding.a0)
    public final boolean b(p16 p16Var) {
        nr1 lr1Var;
        jr1 jr1Var = new jr1();
        if (jr1Var.a(p16Var, true) && (jr1Var.a & 2) == 2) {
            int min = Math.min(jr1Var.e, 8);
            kh4 kh4Var = new kh4(min);
            p16Var.B(kh4Var.a, 0, min, false);
            kh4Var.e(0);
            if (kh4Var.c - kh4Var.b >= 5 && kh4Var.n() == 127 && kh4Var.u() == 1179402563) {
                lr1Var = new gr1();
            } else {
                kh4Var.e(0);
                try {
                    if (ul1.c(1, kh4Var, true)) {
                        lr1Var = new pr1();
                    }
                } catch (jy2 unused) {
                }
                kh4Var.e(0);
                if (lr1.e(kh4Var, lr1.o)) {
                    lr1Var = new lr1();
                }
            }
            this.b = lr1Var;
            return true;
        }
        return false;
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.a = nk1Var;
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        nr1 nr1Var = this.b;
        if (nr1Var != null) {
            ir1 ir1Var = nr1Var.a;
            jr1 jr1Var = ir1Var.a;
            jr1Var.a = 0;
            jr1Var.b = 0L;
            jr1Var.c = 0;
            jr1Var.d = 0;
            jr1Var.e = 0;
            ir1Var.b.b(0);
            ir1Var.c = -1;
            ir1Var.e = false;
            if (j == 0) {
                nr1Var.b(!nr1Var.l);
            } else if (nr1Var.h != 0) {
                long j3 = (nr1Var.i * j2) / 1000000;
                nr1Var.e = j3;
                kr1 kr1Var = nr1Var.d;
                int i = zn4.a;
                kr1Var.g(j3);
                nr1Var.h = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        boolean z;
        int i;
        byte[] bArr;
        tv2.B(this.a);
        if (this.b == null) {
            p16 p16Var = (p16) mk1Var;
            if (b(p16Var)) {
                p16Var.f = 0;
            } else {
                throw jy2.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.c) {
            pl1 q = this.a.q(0, 1);
            this.a.j();
            nr1 nr1Var = this.b;
            nr1Var.c = this.a;
            nr1Var.b = q;
            nr1Var.b(true);
            this.c = true;
        }
        nr1 nr1Var2 = this.b;
        tv2.B(nr1Var2.b);
        int i2 = zn4.a;
        int i3 = nr1Var2.h;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    p16 p16Var2 = (p16) mk1Var;
                    long a = nr1Var2.d.a(p16Var2);
                    if (a >= 0) {
                        jl1Var.a = a;
                        return 1;
                    }
                    if (a < -1) {
                        nr1Var2.d(-(a + 2));
                    }
                    if (!nr1Var2.l) {
                        ml1 b = nr1Var2.d.b();
                        tv2.B(b);
                        nr1Var2.c.n(b);
                        nr1Var2.l = true;
                    }
                    if (nr1Var2.k > 0 || nr1Var2.a.a(p16Var2)) {
                        nr1Var2.k = 0L;
                        kh4 kh4Var = nr1Var2.a.b;
                        long a2 = nr1Var2.a(kh4Var);
                        if (a2 >= 0) {
                            long j = nr1Var2.g;
                            if (j + a2 >= nr1Var2.e) {
                                nr1Var2.b.c(kh4Var, kh4Var.c);
                                nr1Var2.b.b((j * 1000000) / nr1Var2.i, 1, kh4Var.c, 0, null);
                                nr1Var2.e = -1L;
                            }
                        }
                        nr1Var2.g += a2;
                        return 0;
                    }
                }
                return -1;
            }
            ((p16) mk1Var).k((int) nr1Var2.f);
            nr1Var2.h = 2;
            return 0;
        }
        while (true) {
            p16 p16Var3 = (p16) mk1Var;
            if (!nr1Var2.a.a(p16Var3)) {
                break;
            }
            long j2 = p16Var3.d;
            long j3 = nr1Var2.f;
            nr1Var2.k = j2 - j3;
            if (nr1Var2.c(nr1Var2.a.b, j3, nr1Var2.j)) {
                nr1Var2.f = p16Var3.d;
            } else {
                cu1 cu1Var = (cu1) nr1Var2.j.P;
                nr1Var2.i = cu1Var.y;
                if (!nr1Var2.m) {
                    nr1Var2.b.e(cu1Var);
                    nr1Var2.m = true;
                }
                kr1 kr1Var = (kr1) nr1Var2.j.Q;
                if (kr1Var != null) {
                    nr1Var2.d = kr1Var;
                } else {
                    long j4 = p16Var3.c;
                    if (j4 == -1) {
                        nr1Var2.d = new o7(0);
                    } else {
                        jr1 jr1Var = nr1Var2.a.a;
                        if ((jr1Var.a & 4) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        long j5 = nr1Var2.f;
                        long j6 = jr1Var.b;
                        i = 2;
                        nr1Var2.d = new er1(nr1Var2, j5, j4, jr1Var.d + jr1Var.e, j6, z);
                        nr1Var2.h = i;
                        ir1 ir1Var = nr1Var2.a;
                        kh4 kh4Var2 = ir1Var.b;
                        bArr = kh4Var2.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        kh4Var2.c(Arrays.copyOf(bArr, Math.max(65025, kh4Var2.c)), ir1Var.b.c);
                        return 0;
                    }
                }
                i = 2;
                nr1Var2.h = i;
                ir1 ir1Var2 = nr1Var2.a;
                kh4 kh4Var22 = ir1Var2.b;
                bArr = kh4Var22.a;
                if (bArr.length != 65025) {
                }
            }
        }
        nr1Var2.h = 3;
        return -1;
    }
}