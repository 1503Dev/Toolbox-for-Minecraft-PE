package defpackage;

import defpackage.xs0;

/* renamed from: rz0  reason: default package */
public final /* synthetic */ class rz0 implements xs0.a {
    public final /* synthetic */ Object a;

    public /* synthetic */ rz0(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xs0.a
    public final void a() {
        sz0 sz0Var = (sz0) this.a;
        if (sz0Var.f.Q) {
            sz0Var.showAtLocation(sz0Var.a.getWindow().getDecorView(), 0, sz0Var.b, sz0Var.c);
        } else {
            sz0Var.dismiss();
        }
    }
}