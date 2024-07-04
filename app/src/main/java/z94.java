package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: z94  reason: default package */
public final class z94 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public z94(av2 av2Var, uj5 uj5Var) {
        this.a = 2;
        this.c = av2Var;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                Context a = ((t23) this.b).a();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new y94(a, yw2Var);
            case 1:
                return new fb4(((ev3) this.b).c(), (PackageInfo) ((uj5) this.c).c());
            default:
                return new ii3((zm3) this.b.c(), zw2.f);
        }
    }

    public /* synthetic */ z94(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }
}