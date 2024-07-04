package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: es1  reason: default package */
public final class es1 implements fs1 {
    public final List a;
    public final pl1[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = -9223372036854775807L;

    public es1(List list) {
        this.a = list;
        this.b = new pl1[list.size()];
    }

    @Override // defpackage.fs1
    public final void b() {
        this.c = false;
        this.f = -9223372036854775807L;
    }

    @Override // defpackage.fs1
    public final void c(kh4 kh4Var) {
        pl1[] pl1VarArr;
        boolean z;
        boolean z2;
        if (this.c) {
            if (this.d == 2) {
                if (kh4Var.c - kh4Var.b == 0) {
                    z2 = false;
                } else {
                    if (kh4Var.n() != 32) {
                        this.c = false;
                    }
                    this.d--;
                    z2 = this.c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.d == 1) {
                if (kh4Var.c - kh4Var.b == 0) {
                    z = false;
                } else {
                    if (kh4Var.n() != 0) {
                        this.c = false;
                    }
                    this.d--;
                    z = this.c;
                }
                if (!z) {
                    return;
                }
            }
            int i = kh4Var.b;
            int i2 = kh4Var.c - i;
            for (pl1 pl1Var : this.b) {
                kh4Var.e(i);
                pl1Var.a(i2, kh4Var);
            }
            this.e += i2;
        }
    }

    @Override // defpackage.fs1
    public final void d() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                for (pl1 pl1Var : this.b) {
                    pl1Var.b(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    @Override // defpackage.fs1
    public final void e(nk1 nk1Var, pt1 pt1Var) {
        for (int i = 0; i < this.b.length; i++) {
            nt1 nt1Var = (nt1) this.a.get(i);
            pt1Var.a();
            pt1Var.b();
            pl1 q = nk1Var.q(pt1Var.d, 3);
            bs1 bs1Var = new bs1();
            pt1Var.b();
            bs1Var.a = pt1Var.e;
            bs1Var.j = "application/dvbsubs";
            bs1Var.l = Collections.singletonList(nt1Var.b);
            bs1Var.c = nt1Var.a;
            q.e(new cu1(bs1Var));
            this.b[i] = q;
        }
    }

    @Override // defpackage.fs1
    public final void f(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }
}