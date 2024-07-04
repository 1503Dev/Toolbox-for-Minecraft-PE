package defpackage;

/* renamed from: rb3  reason: default package */
public final class rb3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ rb3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ii3((ri3) this.b.c(), yw2Var);
            case 1:
                kp3 kp3Var = (kp3) ((al3) this.c).a.R;
                tv2.C(kp3Var);
                return new xm3((qq3) this.b.c(), kp3Var);
            default:
                return new xp3((he3) this.b.c(), ((pa3) this.c).a());
        }
    }
}