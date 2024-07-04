package defpackage;

/* renamed from: cc3  reason: default package */
public final class cc3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public /* synthetic */ cc3(Object obj, uj5 uj5Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new ii3((ta3) this.b.c(), zw2.f);
            default:
                return new ii3((xj3) this.b.c(), zw2.e);
        }
    }
}