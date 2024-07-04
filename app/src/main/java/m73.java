package defpackage;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: m73  reason: default package */
public final class m73 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public /* synthetic */ m73(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Set singleton;
        switch (this.a) {
            case 0:
                j73 j73Var = (j73) this.b.c();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                if (((JSONObject) this.d.c()) == null) {
                    singleton = Collections.emptySet();
                } else {
                    singleton = Collections.singleton(new ii3(j73Var, yw2Var));
                }
                tv2.C(singleton);
                return singleton;
            case 1:
                qr3 qr3Var = (qr3) this.b.c();
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                qy3 qy3Var = (qy3) this.d.c();
                if (((Boolean) w82.d.c.a(x92.k7)).booleanValue()) {
                    return new ii3(qy3Var, yw2Var2);
                }
                return new ii3(qr3Var, yw2Var2);
            case 2:
                yw2 yw2Var3 = zw2.a;
                tv2.C(yw2Var3);
                ((t23) this.c).a();
                return new bb4(yw2Var3, (Set) this.d.c());
            default:
                return new wh4((qh4) this.b.c(), (mh4) this.c.c(), (ii4) this.d.c());
        }
    }
}