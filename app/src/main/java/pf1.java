package defpackage;

/* renamed from: pf1  reason: default package */
public final class pf1 implements zc1 {
    public final /* synthetic */ yf1 a;

    public pf1(yf1 yf1Var) {
        this.a = yf1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        int i;
        if (this.a.b(rc1Var)) {
            yf1 yf1Var = this.a;
            yf1Var.getClass();
            if (rc1Var.b.j("visible")) {
                i = 0;
            } else {
                i = 4;
            }
            yf1Var.setVisibility(i);
        }
    }
}