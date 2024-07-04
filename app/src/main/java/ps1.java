package defpackage;

/* renamed from: ps1  reason: default package */
public final class ps1 implements fs1 {
    public pl1 b;
    public boolean c;
    public int e;
    public int f;
    public final kh4 a = new kh4(10);
    public long d = -9223372036854775807L;

    @Override // defpackage.fs1
    public final void b() {
        this.c = false;
        this.d = -9223372036854775807L;
    }

    @Override // defpackage.fs1
    public final void c(kh4 kh4Var) {
        tv2.B(this.b);
        if (!this.c) {
            return;
        }
        int i = kh4Var.c - kh4Var.b;
        int i2 = this.f;
        if (i2 < 10) {
            int min = Math.min(i, 10 - i2);
            System.arraycopy(kh4Var.a, kh4Var.b, this.a.a, this.f, min);
            if (this.f + min == 10) {
                this.a.e(0);
                if (this.a.n() == 73 && this.a.n() == 68 && this.a.n() == 51) {
                    this.a.f(3);
                    this.e = this.a.m() + 10;
                } else {
                    lb4.c("Id3Reader", "Discarding invalid ID3 tag");
                    this.c = false;
                    return;
                }
            }
        }
        int min2 = Math.min(i, this.e - this.f);
        this.b.a(min2, kh4Var);
        this.f += min2;
    }

    @Override // defpackage.fs1
    public final void d() {
        int i;
        tv2.B(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                this.b.b(j, 1, i, 0, null);
            }
            this.c = false;
        }
    }

    @Override // defpackage.fs1
    public final void e(nk1 nk1Var, pt1 pt1Var) {
        pt1Var.a();
        pt1Var.b();
        pl1 q = nk1Var.q(pt1Var.d, 5);
        this.b = q;
        bs1 bs1Var = new bs1();
        pt1Var.b();
        bs1Var.a = pt1Var.e;
        bs1Var.j = "application/id3";
        q.e(new cu1(bs1Var));
    }

    @Override // defpackage.fs1
    public final void f(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }
}