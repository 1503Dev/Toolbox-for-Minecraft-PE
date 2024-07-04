package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: b33  reason: default package */
public final class b33 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ b33(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Set emptySet;
        switch (this.a) {
            case 0:
                wy3 wy3Var = (wy3) this.b.c();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                l92 l92Var = x92.G1;
                w82 w82Var = w82.d;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    if (((Boolean) w82Var.c.a(x92.k7)).booleanValue()) {
                        emptySet = Collections.singleton(new ii3(wy3Var, yw2Var));
                        tv2.C(emptySet);
                        return emptySet;
                    }
                }
                emptySet = Collections.emptySet();
                tv2.C(emptySet);
                return emptySet;
            case 1:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new ii3((a73) this.b.c(), yw2Var2);
            case 2:
                return new so3((jl3) this.b.c(), ((yl3) this.c).a());
            case 3:
                yw2 yw2Var3 = zw2.a;
                tv2.C(yw2Var3);
                return new ii3((hr3) this.b.c(), yw2Var3);
            default:
                yw2 yw2Var4 = zw2.a;
                tv2.C(yw2Var4);
                return new ma4(yw2Var4, (cu3) this.c.c());
        }
    }
}