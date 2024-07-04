package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: y83  reason: default package */
public final class y83 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public /* synthetic */ y83(Object obj, uj5 uj5Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                Set singleton = Collections.singleton(new ii3((u93) this.b.c(), zw2.f));
                tv2.C(singleton);
                return singleton;
            default:
                Set singleton2 = Collections.singleton(new ii3((oc3) this.b.c(), zw2.f));
                tv2.C(singleton2);
                return singleton2;
        }
    }
}