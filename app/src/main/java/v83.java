package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* renamed from: v83  reason: default package */
public final class v83 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public /* synthetic */ v83(Object obj, uj5 uj5Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                Set singleton = Collections.singleton(new ii3((u93) this.b.c(), zw2.f));
                tv2.C(singleton);
                return singleton;
            case 1:
                ((t23) this.b).a();
                Context context = ((yc3) this.c).a;
                tv2.C(context);
                return context;
            default:
                Set singleton2 = Collections.singleton(new ii3((oc3) this.b.c(), zw2.f));
                tv2.C(singleton2);
                return singleton2;
        }
    }
}