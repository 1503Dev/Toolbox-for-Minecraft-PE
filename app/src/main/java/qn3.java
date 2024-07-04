package defpackage;

/* renamed from: qn3  reason: default package */
public final class qn3 implements lj5 {
    public final uj5 a = lp5.R;
    public final uj5 b;
    public final uj5 c;

    public qn3(zn3 zn3Var, go3 go3Var) {
        this.b = zn3Var;
        this.c = go3Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        yn3 c = ((zn3) this.b).c();
        go3 go3Var = (go3) this.c;
        go3Var.getClass();
        return new pn3(yw2Var, c, new fo3(yw2Var, ((zn3) go3Var.b).c()));
    }
}