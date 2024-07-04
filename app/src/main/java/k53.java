package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: k53  reason: default package */
public final class k53 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;

    public /* synthetic */ k53(uj5 uj5Var, int i) {
        this.a = i;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Set emptySet;
        switch (this.a) {
            case 0:
                return new ip4(((t23) this.b).a(), jv5.A.r.a());
            case 1:
                return new wi3(((sj5) this.b).c());
            case 2:
                wl3 wl3Var = (wl3) ((mk3) this.b).a.P;
                tv2.C(wl3Var);
                if (wl3Var.d != null) {
                    emptySet = Collections.singleton("banner");
                } else {
                    emptySet = Collections.emptySet();
                }
                tv2.C(emptySet);
                return emptySet;
            case 3:
                return new ii3((ci3) this.b.c(), zw2.f);
            default:
                return new mh4((tj4) this.b.c());
        }
    }
}