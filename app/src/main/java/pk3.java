package defpackage;

import android.content.Context;

/* renamed from: pk3  reason: default package */
public final class pk3 implements lj5 {
    public final /* synthetic */ int a = 0;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final Object f;

    public pk3(q83 q83Var, uj5 uj5Var, f33 f33Var, uj5 uj5Var2, ed3 ed3Var) {
        this.f = q83Var;
        this.b = uj5Var;
        this.c = f33Var;
        this.d = uj5Var2;
        this.e = ed3Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                xc3 a = ((fd3) this.c).a();
                zg3 zg3Var = ((nh3) this.d).a;
                jk3 jk3Var = ((lk3) this.e).a;
                bf3 c = ((g83) ((uj5) this.f)).c();
                f43 e = ((q23) this.b.c()).e();
                e.e = new yc3(a);
                e.d = zg3Var;
                e.i = jk3Var;
                e.f = new y54(null);
                e.g = new x93(c, (Object) null);
                e.h = new e83(0, null);
                ga3 ga3Var = (ga3) e.f().W0.c();
                tv2.C(ga3Var);
                return ga3Var;
            default:
                return new ii3(new o83((Context) this.b.c(), ((f33) this.c).a(), ((pa3) this.d).a(), ((ed3) this.e).a()), zw2.f);
        }
    }

    public pk3(mj5 mj5Var, uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, g83 g83Var) {
        this.b = mj5Var;
        this.c = uj5Var;
        this.d = uj5Var2;
        this.e = uj5Var3;
        this.f = g83Var;
    }
}