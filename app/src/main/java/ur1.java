package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ur1  reason: default package */
public final class ur1 implements lk1 {
    public final kh4 c;
    public final eh4 d;
    public nk1 e;
    public long f;
    public boolean h;
    public boolean i;
    public final vr1 a = new vr1(null, true);
    public final kh4 b = new kh4(2048);
    public long g = -1;

    public ur1() {
        kh4 kh4Var = new kh4(10);
        this.c = kh4Var;
        byte[] bArr = kh4Var.a;
        this.d = new eh4(bArr, bArr.length);
    }

    @Override // defpackage.lk1
    public final boolean a(p16 p16Var) {
        boolean z;
        int i = 0;
        while (true) {
            p16Var.B(this.c.a, 0, 10, false);
            this.c.e(0);
            if (this.c.o() != 4801587) {
                break;
            }
            this.c.f(3);
            int m = this.c.m();
            i += m + 10;
            p16Var.h(m, false);
        }
        p16Var.f = 0;
        p16Var.h(i, false);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            p16Var.B(this.c.a, 0, 2, false);
            this.c.e(0);
            if ((this.c.q() & 65526) == 65520) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                p16Var.B(this.c.a, 0, 4, false);
                this.d.e(14);
                int b = this.d.b(13);
                if (b > 6) {
                    p16Var.h(b - 6, false);
                    i4 += b;
                }
            }
            i2++;
            p16Var.f = 0;
            p16Var.h(i2, false);
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.e = nk1Var;
        this.a.e(nk1Var, new pt1(RecyclerView.UNDEFINED_DURATION, 0, 1));
        nk1Var.j();
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        this.h = false;
        this.a.b();
        this.f = j2;
    }

    @Override // defpackage.lk1
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        tv2.B(this.e);
        int x = ((p16) mk1Var).x(this.b.a, 0, 2048);
        if (!this.i) {
            this.e.n(new ll1(-9223372036854775807L, 0L));
            this.i = true;
        }
        if (x == -1) {
            return -1;
        }
        this.b.e(0);
        this.b.d(x);
        if (!this.h) {
            this.a.f(this.f, 4);
            this.h = true;
        }
        this.a.c(this.b);
        return 0;
    }
}