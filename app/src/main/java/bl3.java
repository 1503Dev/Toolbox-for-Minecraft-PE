package defpackage;

import android.content.Context;
import java.util.HashSet;

/* renamed from: bl3  reason: default package */
public final class bl3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ bl3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new ji3((Context) this.b.c(), new HashSet(), ((pa3) this.c).a());
            case 1:
                kp3 kp3Var = (kp3) ((al3) this.b).a.R;
                tv2.C(kp3Var);
                return new km3(kp3Var, (kd) this.c.c());
            default:
                return new os3((js3) this.b.c(), (q23) this.c.c());
        }
    }
}