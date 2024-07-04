package defpackage;

/* renamed from: v93  reason: default package */
public final class v93 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public /* synthetic */ v93(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new u93(((pa3) this.b).a(), (zd3) this.c.c(), (ue3) this.d.c());
            default:
                sr3 sr3Var = (sr3) this.b.c();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                vy3 vy3Var = (vy3) this.d.c();
                if (((Boolean) w82.d.c.a(x92.k7)).booleanValue()) {
                    return new ii3(vy3Var, yw2Var);
                }
                return new ii3(sr3Var, yw2Var);
        }
    }
}