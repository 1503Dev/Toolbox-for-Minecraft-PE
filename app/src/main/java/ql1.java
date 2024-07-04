package defpackage;

/* renamed from: ql1  reason: default package */
public final class ql1 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(pl1 pl1Var, ol1 ol1Var) {
        if (this.c > 0) {
            pl1Var.b(this.d, this.e, this.f, this.g, ol1Var);
            this.c = 0;
        }
    }

    public final void b(pl1 pl1Var, long j, int i, int i2, int i3, ol1 ol1Var) {
        if (this.g > i2 + i3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(pl1Var, ol1Var);
            }
        }
    }

    public final void c(mk1 mk1Var) {
        if (this.b) {
            return;
        }
        mk1Var.z(this.a, 0, 10);
        mk1Var.j();
        byte[] bArr = this.a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.b = true;
        }
    }
}