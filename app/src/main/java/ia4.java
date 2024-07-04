package defpackage;

/* renamed from: ia4  reason: default package */
public final class ia4 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ ia4(uj5 uj5Var, uj5 uj5Var2, int i) {
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
                return new ha4(yw2Var, ((ed3) this.c).a());
            default:
                return new kb4((String) this.b.c(), (String) this.c.c());
        }
    }
}