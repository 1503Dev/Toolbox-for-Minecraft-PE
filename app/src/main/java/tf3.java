package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: tf3  reason: default package */
public final class tf3 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ tf3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new sf3(((sj5) ((uj5) this.b)).c());
            case 1:
                Set singleton = Collections.singleton(new ii3((zj3) ((uj5) this.b).c(), zw2.f));
                tv2.C(singleton);
                return singleton;
            default:
                return ((zg3) this.b).b;
        }
    }
}