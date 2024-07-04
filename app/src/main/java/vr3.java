package defpackage;

import android.content.Context;

/* renamed from: vr3  reason: default package */
public final class vr3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ vr3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                sr3 sr3Var = (sr3) this.b.c();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                vy3 vy3Var = (vy3) this.c.c();
                if (((Boolean) w82.d.c.a(x92.k7)).booleanValue()) {
                    return new ii3(vy3Var, yw2Var);
                }
                return new ii3(sr3Var, yw2Var);
            default:
                Context a = ((t23) this.b).a();
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new ib4(a, yw2Var2, ((ed3) this.c).a());
        }
    }
}