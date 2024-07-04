package defpackage;

/* renamed from: n16  reason: default package */
public class n16 {
    public final i16 a;
    public final m16 b;
    public j16 c;
    public final int d;

    public n16(k16 k16Var, m16 m16Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = m16Var;
        this.d = i;
        this.a = new i16(k16Var, j, j2, j3, j4, j5);
    }

    public static final int c(p16 p16Var, long j, jl1 jl1Var) {
        if (j == p16Var.d) {
            return 0;
        }
        jl1Var.a = j;
        return 1;
    }

    public final int a(p16 p16Var, jl1 jl1Var) {
        boolean z;
        while (true) {
            j16 j16Var = this.c;
            tv2.B(j16Var);
            long j = j16Var.f;
            long j2 = j16Var.h;
            if (j16Var.g - j <= this.d) {
                this.c = null;
                this.b.c();
                return c(p16Var, j, jl1Var);
            }
            long j3 = j2 - p16Var.d;
            if (j3 >= 0 && j3 <= 262144) {
                p16Var.k((int) j3);
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return c(p16Var, j2, jl1Var);
            }
            p16Var.f = 0;
            l16 a = this.b.a(p16Var, j16Var.b);
            int i = a.a;
            if (i != -3) {
                if (i != -2) {
                    if (i != -1) {
                        long j4 = a.c - p16Var.d;
                        if (j4 >= 0 && j4 <= 262144) {
                            p16Var.k((int) j4);
                        }
                        this.c = null;
                        this.b.c();
                        return c(p16Var, a.c, jl1Var);
                    }
                    long j5 = a.b;
                    long j6 = a.c;
                    j16Var.e = j5;
                    j16Var.g = j6;
                    j16Var.h = j16.a(j16Var.b, j16Var.d, j5, j16Var.f, j6, j16Var.c);
                } else {
                    long j7 = a.b;
                    long j8 = a.c;
                    j16Var.d = j7;
                    j16Var.f = j8;
                    j16Var.h = j16.a(j16Var.b, j7, j16Var.e, j8, j16Var.g, j16Var.c);
                }
            } else {
                this.c = null;
                this.b.c();
                return c(p16Var, j2, jl1Var);
            }
        }
    }

    public final void b(long j) {
        j16 j16Var = this.c;
        if (j16Var != null && j16Var.a == j) {
            return;
        }
        long b = this.a.a.b(j);
        i16 i16Var = this.a;
        this.c = new j16(j, b, i16Var.c, i16Var.d, i16Var.e, i16Var.f);
    }
}