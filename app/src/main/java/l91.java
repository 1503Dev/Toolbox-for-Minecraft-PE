package defpackage;

/* renamed from: l91  reason: default package */
public final class l91 implements zc1 {
    public final /* synthetic */ o91 a;

    public l91(o91 o91Var) {
        this.a = o91Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        int i;
        if (o91.a(this.a, rc1Var)) {
            o91 o91Var = this.a;
            o91Var.getClass();
            if (rc1Var.b.j("visible")) {
                i = 0;
            } else {
                i = 4;
            }
            o91Var.setVisibility(i);
        }
    }
}