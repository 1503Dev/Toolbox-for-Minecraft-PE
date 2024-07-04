package defpackage;

/* renamed from: ec3  reason: default package */
public final class ec3 implements lj5 {
    public final uj5 a;
    public final uj5 b;

    public ec3(uj5 uj5Var, uj5 uj5Var2) {
        this.a = uj5Var;
        this.b = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        qr3 qr3Var = (qr3) this.a.c();
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        qy3 qy3Var = (qy3) this.b.c();
        if (((Boolean) w82.d.c.a(x92.k7)).booleanValue()) {
            return new ii3(qy3Var, yw2Var);
        }
        return new ii3(qr3Var, yw2Var);
    }
}