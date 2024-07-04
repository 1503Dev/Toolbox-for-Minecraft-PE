package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: wa2  reason: default package */
public final class wa2 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public /* synthetic */ wa2(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, uj5 uj5Var4, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
        this.e = uj5Var4;
    }

    @Override // defpackage.uj5
    public final /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                ((t23) this.b).a();
                qm4 qm4Var = (qm4) this.e.c();
                return new va2((ScheduledExecutorService) this.c.c());
            case 1:
                return new t73((Executor) this.c.c(), new g73((Context) this.d.c(), (o22) this.b.c()), (kd) this.e.c());
            default:
                Context a = ((t23) this.b).a();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new gn4(a, yw2Var, (wv2) this.d.c(), (rm4) this.e.c());
        }
    }
}