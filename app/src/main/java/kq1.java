package defpackage;

/* renamed from: kq1  reason: default package */
public final class kq1 implements iq1 {
    public final int a;
    public final int b;
    public final kh4 c;

    public kq1(aq1 aq1Var, cu1 cu1Var) {
        kh4 kh4Var = aq1Var.b;
        this.c = kh4Var;
        kh4Var.e(12);
        int p = kh4Var.p();
        if ("audio/raw".equals(cu1Var.k)) {
            int n = zn4.n(cu1Var.z, cu1Var.x);
            if (p == 0 || p % n != 0) {
                lb4.c("AtomParsers", "Audio sample size mismatch. stsd sample size: " + n + ", stsz sample size: " + p);
                p = n;
            }
        }
        this.a = p == 0 ? -1 : p;
        this.b = kh4Var.p();
    }

    @Override // defpackage.iq1
    public final int a() {
        return this.a;
    }

    @Override // defpackage.iq1
    public final int c() {
        return this.b;
    }

    @Override // defpackage.iq1
    public final int d() {
        int i = this.a;
        return i == -1 ? this.c.p() : i;
    }
}