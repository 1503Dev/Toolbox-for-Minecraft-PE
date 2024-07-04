package defpackage;

/* renamed from: sb3  reason: default package */
public final class sb3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ sb3(uj5 uj5Var, uj5 uj5Var2, int i) {
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
                return new ii3((a73) this.b.c(), yw2Var);
            default:
                nl3 a = ((yl3) this.b).a();
                sl3 sl3Var = (sl3) ((uk3) this.c).a.c();
                tv2.C(sl3Var);
                return new zm3(a, sl3Var);
        }
    }
}