package defpackage;

import defpackage.v91;

/* renamed from: r91  reason: default package */
public final class r91 implements zc1 {
    public final /* synthetic */ v91 a;

    public r91(v91 v91Var) {
        this.a = v91Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        int i;
        v91.b bVar;
        if (v91.a(this.a, rc1Var)) {
            v91 v91Var = this.a;
            v91Var.getClass();
            if (rc1Var.b.j("visible")) {
                i = 0;
                v91Var.setVisibility(0);
                if (!v91Var.r0 || (bVar = v91Var.A0) == null) {
                    return;
                }
            } else {
                i = 4;
                v91Var.setVisibility(4);
                if (!v91Var.r0 || (bVar = v91Var.A0) == null) {
                    return;
                }
            }
            bVar.setVisibility(i);
        }
    }
}