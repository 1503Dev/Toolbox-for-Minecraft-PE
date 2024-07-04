package defpackage;

/* renamed from: ns4  reason: default package */
public final class ns4 extends hs4 {
    public final /* synthetic */ os4 Q;

    public ns4(os4 os4Var) {
        this.Q = os4Var;
    }

    @Override // defpackage.hs4
    public final void b() {
        ps4 ps4Var = this.Q.a;
        ps4Var.b.c("unlinkToDeath", new Object[0]);
        ps4Var.m.asBinder().unlinkToDeath(ps4Var.j, 0);
        ps4 ps4Var2 = this.Q.a;
        ps4Var2.m = null;
        ps4Var2.g = false;
    }
}