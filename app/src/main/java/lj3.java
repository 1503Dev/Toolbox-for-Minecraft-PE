package defpackage;

import java.util.Set;

/* renamed from: lj3  reason: default package */
public final class lj3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public /* synthetic */ lj3(Object obj, uj5 uj5Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                Set a = ((hj3) this.c).a((oc3) this.b.c());
                tv2.C(a);
                return a;
            default:
                return new ii3((qj4) this.b.c(), zw2.f);
        }
    }
}