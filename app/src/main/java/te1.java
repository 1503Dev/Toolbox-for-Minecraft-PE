package defpackage;

/* renamed from: te1  reason: default package */
public final class te1 implements zc1 {
    public final /* synthetic */ gf1 a;

    public te1(gf1 gf1Var) {
        this.a = gf1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        if (this.a.b(rc1Var)) {
            gf1 gf1Var = this.a;
            gf1Var.getClass();
            ic1 ic1Var = rc1Var.b;
            gf1Var.a0 = ic1Var.l("x");
            gf1Var.b0 = ic1Var.l("y");
            gf1Var.setGravity(gf1.a(gf1Var.a0, true) | gf1.a(gf1Var.b0, false));
        }
    }
}