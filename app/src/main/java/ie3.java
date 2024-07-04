package defpackage;

/* renamed from: ie3  reason: default package */
public final class ie3 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ie3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new he3(((sj5) ((uj5) this.b)).c());
            case 1:
                return new ii3((ci3) ((uj5) this.b).c(), zw2.f);
            case 2:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new fa4(yw2Var);
            default:
                return new eb1();
        }
    }
}