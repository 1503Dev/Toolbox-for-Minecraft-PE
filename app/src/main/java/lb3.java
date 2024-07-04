package defpackage;

/* renamed from: lb3  reason: default package */
public final class lb3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public /* synthetic */ lb3(Object obj, uj5 uj5Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new ii3((pb3) this.b.c(), zw2.f);
            case 1:
                return new ii3((hc3) this.b.c(), zw2.f);
            default:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ul4(yw2Var, (wv2) ((uj5) this.c).c());
        }
    }

    public lb3(uj5 uj5Var) {
        zk4 zk4Var = lp5.R;
        this.a = 2;
        this.b = zk4Var;
        this.c = uj5Var;
    }
}