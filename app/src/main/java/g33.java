package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: g33  reason: default package */
public final class g33 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ g33(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Set emptySet;
        switch (this.a) {
            case 0:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new nj4((ip3) this.b.c(), yw2Var);
            case 1:
                return new ii3((of3) this.b.c(), (Executor) this.c.c());
            case 2:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                pr3 pr3Var = (pr3) this.c;
                or3 or3Var = new or3((j52) pr3Var.a.c(), ((oj5) pr3Var.b).c());
                if (((Boolean) w82.d.c.a(x92.c4)).booleanValue()) {
                    emptySet = Collections.singleton(new ii3(or3Var, yw2Var2));
                } else {
                    emptySet = Collections.emptySet();
                }
                tv2.C(emptySet);
                return emptySet;
            case 3:
                cw3 cw3Var = (cw3) this.b;
                bw3 bw3Var = new bw3(((t23) cw3Var.a).a(), (qt2) cw3Var.b.c());
                yw2 yw2Var3 = zw2.a;
                tv2.C(yw2Var3);
                return new ii3(bw3Var, yw2Var3);
            default:
                yw2 yw2Var4 = zw2.a;
                tv2.C(yw2Var4);
                return new a84((dz4) this.b.c(), yw2Var4);
        }
    }
}