package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: zb4  reason: default package */
public final class zb4 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public zb4(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, uj5 uj5Var4, mj5 mj5Var) {
        this.a = uj5Var;
        this.b = uj5Var2;
        this.c = uj5Var3;
        this.d = uj5Var4;
        this.e = mj5Var;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        return new yb4(yw2Var, (ScheduledExecutorService) this.a.c(), (String) this.b.c(), (Context) this.c.c(), ((ed3) this.d).a(), (q23) this.e.c());
    }
}