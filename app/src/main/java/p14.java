package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: p14  reason: default package */
public final class p14 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final uj5 f;
    public final uj5 g;
    public final uj5 h;

    public /* synthetic */ p14(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, uj5 uj5Var4, uj5 uj5Var5, uj5 uj5Var6, lj5 lj5Var, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
        this.e = uj5Var4;
        this.f = uj5Var5;
        this.g = uj5Var6;
        this.h = lj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new o14((y73) this.b.c(), (Context) this.c.c(), (Executor) this.d.c(), (qq3) this.e.c(), ((ed3) this.f).a(), ((f33) this.g).a(), new og2());
            case 1:
                return new c34((Context) this.b.c(), ((f33) this.c).a(), ((ed3) this.d).a(), (Executor) this.e.c(), (sj3) this.f.c(), (qq3) this.g.c(), new og2());
            default:
                Integer.valueOf(((ne4) this.c).a.b).intValue();
                ((t23) this.d).a();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                tv2.C(((me4) this.h).a.a.S);
                return new td4((yu2) this.e.c(), (ScheduledExecutorService) this.f.c(), yw2Var);
        }
    }
}