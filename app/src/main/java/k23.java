package defpackage;

/* renamed from: k23  reason: default package */
public final class k23 {
    public final int a;
    public final int b;
    public final int c;

    public k23(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }

    public static k23 a(zr5 zr5Var) {
        if (zr5Var.S) {
            return new k23(3, 0, 0);
        }
        if (zr5Var.X) {
            return new k23(2, 0, 0);
        }
        if (zr5Var.W) {
            return new k23(0, 0, 0);
        }
        return new k23(1, zr5Var.U, zr5Var.R);
    }

    public final boolean b() {
        return this.a == 3;
    }
}