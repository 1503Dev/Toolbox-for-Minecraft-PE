package defpackage;

/* renamed from: e12  reason: default package */
public final class e12 extends c22 {
    public final long h;

    public e12(l02 l02Var, gx1 gx1Var, long j, int i) {
        super(l02Var, "GZmNPeawNfdnWxeYT+Jkvj7Vlk5JycUitv3JUjomoDekPAkUoGh0m7MOHceNe5l+", "ehe3LQxKXFrt/NNsQSZhaLiz0oEhy5ctQpqWTqSg+00=", gx1Var, i, 25);
        this.h = j;
    }

    @Override // defpackage.c22
    public final void b() {
        long longValue = ((Long) this.e.invoke(null, new Object[0])).longValue();
        synchronized (this.d) {
            try {
                gx1 gx1Var = this.d;
                gx1Var.j();
                ey1.f0((ey1) gx1Var.Q, longValue);
                long j = this.h;
                if (j != 0) {
                    gx1 gx1Var2 = this.d;
                    gx1Var2.j();
                    ey1.H0((ey1) gx1Var2.Q, longValue - j);
                    gx1 gx1Var3 = this.d;
                    long j2 = this.h;
                    gx1Var3.j();
                    ey1.K0((ey1) gx1Var3.Q, j2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}