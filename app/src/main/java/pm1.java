package defpackage;

/* renamed from: pm1  reason: default package */
public final class pm1 implements m16 {
    public final tk1 P;
    public final int Q;
    public final qk1 R = new qk1();

    public /* synthetic */ pm1(tk1 tk1Var, int i) {
        this.P = tk1Var;
        this.Q = i;
    }

    @Override // defpackage.m16
    public final l16 a(p16 p16Var, long j) {
        long j2 = p16Var.d;
        long b = b(p16Var);
        long b2 = p16Var.b();
        p16Var.h(Math.max(6, this.P.c), false);
        int i = (b > j ? 1 : (b == j ? 0 : -1));
        long b3 = b(p16Var);
        long b4 = p16Var.b();
        if (i <= 0 && b3 > j) {
            return l16.a(b2);
        }
        if (b3 <= j) {
            return new l16(b3, -2, b4);
        }
        return new l16(b, -1, j2);
    }

    public final long b(p16 p16Var) {
        while (p16Var.b() < p16Var.c - 6) {
            tk1 tk1Var = this.P;
            int i = this.Q;
            qk1 qk1Var = this.R;
            long b = p16Var.b();
            int i2 = 2;
            byte[] bArr = new byte[2];
            p16Var.B(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                p16Var.f = 0;
                p16Var.h((int) (b - p16Var.d), false);
            } else {
                kh4 kh4Var = new kh4(16);
                System.arraycopy(bArr, 0, kh4Var.a, 0, 2);
                byte[] bArr2 = kh4Var.a;
                int i3 = 0;
                for (int i4 = 14; i3 < i4; i4 = 14) {
                    int f = p16Var.f(bArr2, i2 + i3, 14 - i3);
                    if (f == -1) {
                        break;
                    }
                    i3 += f;
                    i2 = 2;
                }
                kh4Var.d(i3);
                p16Var.f = 0;
                p16Var.h((int) (b - p16Var.d), false);
                if (eg4.q(kh4Var, tk1Var, i, qk1Var)) {
                    break;
                }
            }
            p16Var.h(1, false);
        }
        long b2 = p16Var.b();
        long j = p16Var.c;
        if (b2 >= (-6) + j) {
            p16Var.h((int) (j - p16Var.b()), false);
            return this.P.j;
        }
        return this.R.a;
    }

    @Override // defpackage.m16
    public final /* synthetic */ void c() {
    }
}