package defpackage;

/* renamed from: of1  reason: default package */
public final class of1 implements zc1 {
    public final /* synthetic */ yf1 a;

    public of1(yf1 yf1Var) {
        this.a = yf1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        if (this.a.b(rc1Var)) {
            yf1 yf1Var = this.a;
            yf1Var.getClass();
            ic1 ic1Var = rc1Var.b;
            yf1Var.a0 = ic1Var.l("x");
            yf1Var.b0 = ic1Var.l("y");
            yf1Var.setGravity(yf1.a(yf1Var.a0, true) | yf1.a(yf1Var.b0, false));
        }
    }
}