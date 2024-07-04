package defpackage;

import defpackage.lj;
import defpackage.xs0;

/* renamed from: mj  reason: default package */
public final /* synthetic */ class mj implements lj.a, xs0.a {
    public final /* synthetic */ Object a;

    public /* synthetic */ mj(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xs0.a
    public final void a() {
        qy0 qy0Var = (qy0) this.a;
        if (qy0Var.c.Q) {
            qy0Var.showAtLocation(qy0Var.a.getWindow().getDecorView(), 8388661, 0, 0);
        } else {
            qy0Var.dismiss();
        }
    }
}