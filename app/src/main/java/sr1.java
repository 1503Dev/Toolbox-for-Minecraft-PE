package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: sr1  reason: default package */
public final class sr1 implements lk1 {
    public final tr1 a = new tr1(null);
    public final kh4 b = new kh4(16384);
    public boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        r15.f = 0;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
        if ((r4 - r3) >= 8192) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        return false;
     */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(p16 p16Var) {
        int i;
        kh4 kh4Var = new kh4(10);
        int i2 = 0;
        while (true) {
            p16Var.B(kh4Var.a, 0, 10, false);
            kh4Var.e(0);
            if (kh4Var.o() != 4801587) {
                break;
            }
            kh4Var.f(3);
            int m = kh4Var.m();
            i2 += m + 10;
            p16Var.h(m, false);
        }
        p16Var.f = 0;
        p16Var.h(i2, false);
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                p16Var.B(kh4Var.a, 0, 7, false);
                kh4Var.e(0);
                int q = kh4Var.q();
                if (q != 44096 && q != 44097) {
                    break;
                }
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] bArr = kh4Var.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (q == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                p16Var.h(i - 7, false);
            }
            p16Var.h(i3, false);
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
        int x = ((p16) mk1Var).x(this.b.a, 0, 16384);
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