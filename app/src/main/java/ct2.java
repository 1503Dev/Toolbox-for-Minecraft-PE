package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: ct2  reason: default package */
public final class ct2 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public /* synthetic */ ct2(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, int i) {
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
                return new bt2((kd) this.b.c(), (f25) this.c.c(), (qt2) this.d.c());
            case 1:
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
            default:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new ol4(yw2Var2, (ScheduledExecutorService) this.c.c(), new nl4(((sj5) ((ql4) this.d).a).c()));
        }
    }
}