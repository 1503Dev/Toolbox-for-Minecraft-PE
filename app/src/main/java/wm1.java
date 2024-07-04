package defpackage;

/* renamed from: wm1  reason: default package */
public final class wm1 extends yg5 {
    public final kh4 Q;
    public final kh4 R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;

    public wm1(pl1 pl1Var) {
        super(pl1Var);
        this.Q = new kh4(hl1.a);
        this.R = new kh4(4);
    }

    @Override // defpackage.yg5
    public final boolean b(kh4 kh4Var) {
        int n = kh4Var.n();
        int i = n >> 4;
        int i2 = n & 15;
        if (i2 == 7) {
            this.V = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new vm1(k6.a("Video format not supported: ", i2));
    }

    @Override // defpackage.yg5
    public final boolean d(long j, kh4 kh4Var) {
        int i;
        int n = kh4Var.n();
        byte[] bArr = kh4Var.a;
        int i2 = kh4Var.b;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        kh4Var.b = i4 + 1;
        long j2 = (bArr[i4] & 255) | (((bArr[i2] & 255) << 24) >> 8) | ((bArr[i3] & 255) << 8);
        if (n == 0) {
            if (!this.T) {
                kh4 kh4Var2 = new kh4(new byte[kh4Var.c - kh4Var.b]);
                kh4Var.a(kh4Var2.a, 0, kh4Var.c - kh4Var.b);
                h16 a = h16.a(kh4Var2);
                this.S = a.b;
                bs1 bs1Var = new bs1();
                bs1Var.j = "video/avc";
                bs1Var.g = a.f;
                bs1Var.o = a.c;
                bs1Var.p = a.d;
                bs1Var.s = a.e;
                bs1Var.l = a.a;
                ((pl1) this.P).e(new cu1(bs1Var));
                this.T = true;
                return false;
            }
        } else if (n == 1 && this.T) {
            if (this.V == 1) {
                i = 1;
            } else {
                i = 0;
            }
            if (!this.U && i == 0) {
                return false;
            }
            byte[] bArr2 = this.R.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i5 = 4 - this.S;
            int i6 = 0;
            while (kh4Var.c - kh4Var.b > 0) {
                kh4Var.a(this.R.a, i5, this.S);
                this.R.e(0);
                int p = this.R.p();
                this.Q.e(0);
                ((pl1) this.P).a(4, this.Q);
                ((pl1) this.P).a(p, kh4Var);
                i6 = i6 + 4 + p;
            }
            ((pl1) this.P).b((j2 * 1000) + j, i, i6, 0, null);
            this.U = true;
            return true;
        }
        return false;
    }
}