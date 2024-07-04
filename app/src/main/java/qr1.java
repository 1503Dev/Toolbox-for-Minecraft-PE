package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: qr1  reason: default package */
public final class qr1 implements lk1 {
    public final rr1 a = new rr1(null);
    public final kh4 b = new kh4(2786);
    public boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        if ((r4 - r3) >= 8192) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        r14.f = 0;
        r4 = r4 + 1;
     */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(p16 p16Var) {
        int m;
        kh4 kh4Var = new kh4(10);
        int i = 0;
        while (true) {
            p16Var.B(kh4Var.a, 0, 10, false);
            kh4Var.e(0);
            if (kh4Var.o() != 4801587) {
                break;
            }
            kh4Var.f(3);
            int m2 = kh4Var.m();
            i += m2 + 10;
            p16Var.h(m2, false);
        }
        p16Var.f = 0;
        p16Var.h(i, false);
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                p16Var.B(kh4Var.a, 0, 6, false);
                kh4Var.e(0);
                if (kh4Var.q() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = kh4Var.a;
                if (bArr.length < 6) {
                    m = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i4 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    m = i4 + i4;
                } else {
                    byte b = bArr[4];
                    m = da2.m((b & 192) >> 6, b & 63);
                }
                if (m == -1) {
                    return false;
                }
                p16Var.h(m - 6, false);
            }
            p16Var.h(i2, false);
        }
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.a.e(nk1Var, new pt1(RecyclerView.UNDEFINED_DURATION, 0, 1));
        nk1Var.j();
        nk1Var.n(new ll1(-9223372036854775807L, 0L));
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        this.c = false;
        this.a.b();
    }

    @Override // defpackage.lk1
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        int x = ((p16) mk1Var).x(this.b.a, 0, 2786);
        if (x == -1) {
            return -1;
        }
        this.b.e(0);
        this.b.d(x);
        if (!this.c) {
            this.a.f(0L, 4);
            this.c = true;
        }
        this.a.c(this.b);
        return 0;
    }
}