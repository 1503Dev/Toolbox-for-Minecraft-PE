package defpackage;

/* renamed from: ub3  reason: default package */
public final class ub3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ ub3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ii3((a73) this.b.c(), yw2Var);
            case 1:
                return new ye3(((sj5) this.b).c(), ((pa3) this.c).a());
            case 2:
                return new ri3(((pa3) this.b).a(), (gn4) this.c.c());
            case 3:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new ii3((hr3) this.b.c(), yw2Var2);
            default:
                return new gm4(((t23) this.b).a(), (qm4) this.c.c());
        }
    }
}