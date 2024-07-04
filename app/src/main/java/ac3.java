package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.Executor;

/* renamed from: ac3  reason: default package */
public final class ac3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ ac3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new ii3((of3) this.b.c(), (Executor) this.c.c());
            case 1:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ii3((ut3) this.b.c(), yw2Var);
            case 2:
                try {
                    return c81.a((Context) this.b.c()).b(((ev3) this.c).c().packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            default:
                l94 l94Var = (l94) this.b;
                l94Var.getClass();
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new p94(new g94(((t23) l94Var.b).a(), yw2Var2), 10000L, (kd) this.c.c());
        }
    }
}