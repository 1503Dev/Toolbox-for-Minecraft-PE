package defpackage;

/* renamed from: fr3  reason: default package */
public final class fr3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public fr3(r23 r23Var, uj5 uj5Var) {
        this.a = 2;
        this.c = r23Var;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ii3((hr3) this.b.c(), yw2Var);
            case 1:
                return new is3((String) this.b.c(), (fs3) ((uj5) this.c).c());
            default:
                return new j34((zq3) this.b.c());
        }
    }

    public /* synthetic */ fr3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }
}