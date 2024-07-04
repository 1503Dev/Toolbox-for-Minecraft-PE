package defpackage;

/* renamed from: pp1  reason: default package */
public final class pp1 implements v64 {
    public int P;
    public final Object Q;

    public /* synthetic */ pp1() {
        this.Q = new kh4(8);
    }

    public /* synthetic */ pp1(jn5 jn5Var, int i) {
        this.Q = jn5Var;
        this.P = i;
    }

    public final long a(p16 p16Var) {
        int i = 0;
        p16Var.B(((kh4) this.Q).a, 0, 1, false);
        int i2 = ((kh4) this.Q).a[0] & 255;
        if (i2 != 0) {
            int i3 = 128;
            int i4 = 0;
            while ((i2 & i3) == 0) {
                i3 >>= 1;
                i4++;
            }
            int i5 = i2 & (i3 ^ (-1));
            p16Var.B(((kh4) this.Q).a, 1, i4, false);
            while (i < i4) {
                i++;
                i5 = (((kh4) this.Q).a[i] & 255) + (i5 << 8);
            }
            this.P = i4 + 1 + this.P;
            return i5;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        int i = this.P;
        int i2 = bm5.X;
        kd3 kd3Var = ((jn5) this.Q).a;
        ((b53) obj).l(i);
    }
}