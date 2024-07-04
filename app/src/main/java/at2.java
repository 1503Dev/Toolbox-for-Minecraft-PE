package defpackage;

import android.content.Context;

/* renamed from: at2  reason: default package */
public final class at2 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final Object d;

    public at2(hj3 hj3Var, uj5 uj5Var) {
        zk4 zk4Var = lp5.R;
        this.a = 2;
        this.d = hj3Var;
        this.b = uj5Var;
        this.c = zk4Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new zs2((Context) this.b.c(), (f25) this.c.c(), (qt2) ((uj5) this.d).c());
            case 1:
                qr3 qr3Var = (qr3) this.b.c();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                qy3 qy3Var = (qy3) ((uj5) this.d).c();
                if (((Boolean) w82.d.c.a(x92.k7)).booleanValue()) {
                    return new ii3(qy3Var, yw2Var);
                }
                return new ii3(qr3Var, yw2Var);
            default:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new ii3((bk3) this.b.c(), yw2Var2);
        }
    }

    public /* synthetic */ at2(uj5 uj5Var, lj5 lj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = lj5Var;
        this.d = uj5Var2;
    }
}