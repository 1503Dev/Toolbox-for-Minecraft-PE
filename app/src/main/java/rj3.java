package defpackage;

/* renamed from: rj3  reason: default package */
public final class rj3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public rj3(xa2 xa2Var, uj5 uj5Var) {
        this.a = 4;
        this.c = xa2Var;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new qj3((xe3) this.b.c(), (hi3) ((uj5) this.c).c());
            case 1:
                return new zq3(kj4.b(((t23) ((m53) this.b).a).a()), (yq3) ((uj5) this.c).c());
            case 2:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new t84(yw2Var, (yu2) ((uj5) this.c).c());
            case 3:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new xc4(((t23) ((uj5) this.c)).a(), yw2Var2);
            default:
                return new ii3((pb3) this.b.c(), zw2.f);
        }
    }

    public /* synthetic */ rj3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }
}