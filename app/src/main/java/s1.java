package defpackage;

/* renamed from: s1  reason: default package */
public final class s1 implements Runnable {
    public final /* synthetic */ e2 P;

    public s1(e2 e2Var) {
        this.P = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad1 h = ga1.h();
        h.D.a(15000L);
        boolean z = h.D.a;
        ic1 ic1Var = new ic1();
        eb1.i(ic1Var, "options", this.P.b);
        new rc1(1, ic1Var, "Options.set_options").b();
    }
}