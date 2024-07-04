package defpackage;

import java.io.EOFException;

/* renamed from: jr1  reason: default package */
public final class jr1 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final kh4 g = new kh4(255);

    public final boolean a(p16 p16Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.g.b(27);
        try {
            z2 = p16Var.B(this.g.a, 0, 27, z);
        } catch (EOFException e) {
            if (z) {
                z2 = false;
            } else {
                throw e;
            }
        }
        if (z2 && this.g.u() == 1332176723) {
            if (this.g.n() != 0) {
                if (z) {
                    return false;
                }
                throw jy2.b("unsupported bit stream revision");
            }
            this.a = this.g.n();
            this.b = this.g.r();
            this.g.s();
            this.g.s();
            this.g.s();
            int n = this.g.n();
            this.c = n;
            this.d = n + 27;
            this.g.b(n);
            try {
                z3 = p16Var.B(this.g.a, 0, this.c, z);
            } catch (EOFException e2) {
                if (z) {
                    z3 = false;
                } else {
                    throw e2;
                }
            }
            if (z3) {
                for (int i = 0; i < this.c; i++) {
                    this.f[i] = this.g.n();
                    this.e += this.f[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean b(p16 p16Var, long j) {
        boolean z;
        boolean z2;
        if (p16Var.d == p16Var.b()) {
            z = true;
        } else {
            z = false;
        }
        tv2.G(z);
        this.g.b(4);
        while (true) {
            if (j != -1 && p16Var.d + 4 >= j) {
                break;
            }
            try {
                z2 = p16Var.B(this.g.a, 0, 4, true);
            } catch (EOFException unused) {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            this.g.e(0);
            if (this.g.u() != 1332176723) {
                p16Var.k(1);
            } else {
                p16Var.f = 0;
                return true;
            }
        }
        do {
            if (j != -1 && p16Var.d >= j) {
                break;
            }
        } while (p16Var.g() != -1);
        return false;
    }
}