package defpackage;

/* renamed from: qp5  reason: default package */
public final class qp5 {
    public final String a;
    public int b;
    public long c;
    public ov5 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ rp5 g;

    public qp5(rp5 rp5Var, String str, int i, ov5 ov5Var) {
        this.g = rp5Var;
        this.a = str;
        this.b = i;
        this.c = ov5Var == null ? -1L : ov5Var.d;
        if (ov5Var == null || !ov5Var.a()) {
            return;
        }
        this.d = ov5Var;
    }

    public final boolean a(io5 io5Var) {
        ov5 ov5Var = io5Var.d;
        if (ov5Var == null) {
            return this.b != io5Var.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (ov5Var.d > j) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        int a = io5Var.b.a(ov5Var.a);
        int a2 = io5Var.b.a(this.d.a);
        ov5 ov5Var2 = io5Var.d;
        if (ov5Var2.d < this.d.d || a < a2) {
            return false;
        }
        if (a > a2) {
            return true;
        }
        boolean a3 = ov5Var2.a();
        ov5 ov5Var3 = io5Var.d;
        if (!a3) {
            int i = ov5Var3.e;
            return i == -1 || i > this.d.b;
        }
        int i2 = ov5Var3.b;
        int i3 = ov5Var3.c;
        ov5 ov5Var4 = this.d;
        int i4 = ov5Var4.b;
        return i2 > i4 || (i2 == i4 && i3 > ov5Var4.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.c()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(kd3 kd3Var, kd3 kd3Var2) {
        int i = this.b;
        if (i < kd3Var.c()) {
            kd3Var.e(i, this.g.a, 0L);
            for (int i2 = this.g.a.l; i2 <= this.g.a.m; i2++) {
                int a = kd3Var2.a(kd3Var.f(i2));
                if (a != -1) {
                    i = kd3Var2.d(a, this.g.b, false).c;
                    break;
                }
            }
            i = -1;
        }
        this.b = i;
        if (i == -1) {
            return false;
        }
        ov5 ov5Var = this.d;
        if (ov5Var != null && kd3Var2.a(ov5Var.a) == -1) {
            return false;
        }
        return true;
    }
}