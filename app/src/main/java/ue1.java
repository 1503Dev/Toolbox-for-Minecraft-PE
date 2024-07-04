package defpackage;

/* renamed from: ue1  reason: default package */
public final class ue1 implements zc1 {
    public final /* synthetic */ gf1 a;

    public ue1(gf1 gf1Var) {
        this.a = gf1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        int i;
        if (this.a.b(rc1Var)) {
            gf1 gf1Var = this.a;
            gf1Var.getClass();
            if (rc1Var.b.j("visible")) {
                i = 0;
            } else {
                i = 4;
            }
            gf1Var.setVisibility(i);
        }
    }
}