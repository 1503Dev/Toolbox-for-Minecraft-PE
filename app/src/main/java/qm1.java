package defpackage;

/* renamed from: qm1  reason: default package */
public final class qm1 extends n16 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qm1(tk1 tk1Var, int i, long j, long j2) {
        super(r1, r2, r3, r5, j, j2, r11, Math.max(6, tk1Var.c));
        long j3;
        om1 om1Var = new om1(0, tk1Var);
        pm1 pm1Var = new pm1(tk1Var, i);
        long a = tk1Var.a();
        long j4 = tk1Var.j;
        int i2 = tk1Var.d;
        if (i2 > 0) {
            j3 = ((i2 + tk1Var.c) / 2) + 1;
        } else {
            int i3 = tk1Var.a;
            long j5 = 4096;
            if (i3 == tk1Var.b && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * tk1Var.g) * tk1Var.h) / 8) + 64;
        }
    }
}