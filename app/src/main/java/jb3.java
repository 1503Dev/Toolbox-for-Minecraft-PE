package defpackage;

/* renamed from: jb3  reason: default package */
public final class jb3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public /* synthetic */ jb3(Object obj, uj5 uj5Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new ii3((pb3) this.b.c(), zw2.f);
            case 1:
                return new ii3((pc3) this.b.c(), zw2.f);
            default:
                return new ii3(new vq3((y03) ((wq3) this.b).a.c()), zw2.e);
        }
    }
}