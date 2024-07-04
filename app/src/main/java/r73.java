package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: r73  reason: default package */
public final class r73 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public /* synthetic */ r73(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
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
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new w14((Context) this.b.c(), (y73) this.c.c(), yw2Var2);
            case 2:
                return new q44((Context) this.b.c(), (Executor) this.c.c(), (bq3) this.d.c());
            default:
                yw2 yw2Var3 = zw2.a;
                tv2.C(yw2Var3);
                ((t23) this.d).a();
                return new vd4(yw2Var3);
        }
    }
}