package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: cl3  reason: default package */
public final class cl3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public cl3(hj3 hj3Var, uj5 uj5Var) {
        this.a = 5;
        this.c = hj3Var;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                xv2 a = ((f33) this.b).a();
                cu5 cu5Var = jv5.A.c;
                return new o22(UUID.randomUUID().toString(), a, "native", new JSONObject(), true);
            case 1:
                return new xt3((jt3) this.b.c(), (yq3) ((uj5) this.c).c());
            case 2:
                return new gz3(((g04) this.b).c(), ((s23) ((uj5) this.c)).c());
            case 3:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new lc4(((t23) ((uj5) this.c)).a(), yw2Var);
            case 4:
                return new qj4(((t23) this.b).a(), ((h33) ((uj5) this.c)).c());
            default:
                Set singleton = Collections.singleton(new ii3((oc3) this.b.c(), zw2.f));
                tv2.C(singleton);
                return singleton;
        }
    }

    public /* synthetic */ cl3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }
}