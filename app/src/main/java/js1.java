package defpackage;

/* renamed from: js1  reason: default package */
public final class js1 {
    public final pl1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public js1(pl1 pl1Var) {
        this.a = pl1Var;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f = (i2 - i) + i3;
                return;
            }
            this.d = ((bArr[i4] & 192) >> 6) == 0;
            this.c = false;
        }
    }
}