package defpackage;

/* renamed from: f53  reason: default package */
public final class f53 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f53(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final Object c() {
        ii3 ii3Var;
        switch (this.a) {
            case 0:
                return new zf();
            default:
                xf3 xf3Var = (xf3) ((x93) this.b).Q;
                if (xf3Var != null) {
                    ii3Var = new ii3(xf3Var, zw2.f);
                } else {
                    ii3Var = new ii3(new w93(), zw2.f);
                }
                return ii3Var;
        }
    }
}