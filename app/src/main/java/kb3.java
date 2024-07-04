package defpackage;

import android.content.Context;

/* renamed from: kb3  reason: default package */
public final class kb3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public kb3(uj5 uj5Var) {
        this.a = 0;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new ii3((pb3) this.b.c(), zw2.f);
            default:
                Context context = (Context) this.b.c();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new aa4(yw2Var);
        }
    }

    public kb3(uj5 uj5Var, int i) {
        zk4 zk4Var = lp5.R;
        this.a = 1;
        this.b = uj5Var;
        this.c = zk4Var;
    }
}