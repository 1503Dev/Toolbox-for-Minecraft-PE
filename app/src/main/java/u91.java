package defpackage;

/* renamed from: u91  reason: default package */
public final class u91 implements zc1 {
    public final /* synthetic */ v91 a;

    public u91(v91 v91Var) {
        this.a = v91Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        double optDouble;
        if (v91.a(this.a, rc1Var)) {
            v91 v91Var = this.a;
            if (v91Var.o0) {
                ic1 ic1Var = rc1Var.b;
                synchronized (ic1Var.a) {
                    optDouble = ic1Var.a.optDouble("volume", 0.0d);
                }
                float f = (float) optDouble;
                i2 i2Var = ga1.h().o;
                v91Var.C0.setVolume(f, f);
                ic1 ic1Var2 = new ic1();
                eb1.m(ic1Var2, "success", true);
                rc1Var.a(ic1Var2).b();
            }
        }
    }
}