package defpackage;

/* renamed from: d33  reason: default package */
public final class d33 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public /* synthetic */ d33(Object obj, uj5 uj5Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new v44((zq3) this.b.c());
            default:
                return ((q83) this.c).a(((sj5) this.b).c());
        }
    }
}