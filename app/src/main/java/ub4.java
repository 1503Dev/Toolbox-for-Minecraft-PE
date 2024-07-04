package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ub4  reason: default package */
public final class ub4 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final uj5 f;
    public final uj5 g;
    public final uj5 h;

    public ub4(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, uj5 uj5Var4, uj5 uj5Var5, uj5 uj5Var6, uj5 uj5Var7, uj5 uj5Var8) {
        this.a = uj5Var;
        this.b = uj5Var2;
        this.c = uj5Var3;
        this.d = uj5Var4;
        this.e = uj5Var5;
        this.f = uj5Var6;
        this.g = uj5Var7;
        this.h = uj5Var8;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        return new sb4(yw2Var, (ScheduledExecutorService) this.a.c(), (String) this.b.c(), (f64) this.c.c(), (Context) this.d.c(), ((ed3) this.e).a(), (e64) this.f.c(), (zq3) this.g.c(), (pt3) this.h.c());
    }
}