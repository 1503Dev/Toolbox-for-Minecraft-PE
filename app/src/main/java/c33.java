package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: c33  reason: default package */
public final class c33 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ c33(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Set emptySet;
        switch (this.a) {
            case 0:
                pt3 pt3Var = (pt3) this.b.c();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                if (((Boolean) w82.d.c.a(x92.n1)).booleanValue()) {
                    emptySet = Collections.singleton(new ii3(pt3Var, yw2Var));
                } else {
                    emptySet = Collections.emptySet();
                }
                tv2.C(emptySet);
                return emptySet;
            case 1:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new ii3((a73) this.b.c(), yw2Var2);
            case 2:
                yh4 a = ((pa3) this.b).a();
                JSONObject c = ((tk3) this.c).a.c();
                tv2.C(c);
                return new sl3(a, c);
            case 3:
                yw2 yw2Var3 = zw2.a;
                tv2.C(yw2Var3);
                return new ii3((hr3) this.b.c(), yw2Var3);
            case 4:
                Context a2 = ((t23) this.b).a();
                yw2 yw2Var4 = zw2.a;
                tv2.C(yw2Var4);
                return new r04(a2, yw2Var4);
            default:
                return new t74((kd) this.b.c(), ((ed3) this.c).a());
        }
    }
}