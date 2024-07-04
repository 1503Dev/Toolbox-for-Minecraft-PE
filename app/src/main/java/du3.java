package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: du3  reason: default package */
public final class du3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final uj5 f;
    public final uj5 g;
    public final uj5 h;

    public /* synthetic */ du3(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, lj5 lj5Var, uj5 uj5Var4, uj5 uj5Var5, uj5 uj5Var6, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
        this.e = lj5Var;
        this.f = uj5Var4;
        this.g = uj5Var5;
        this.h = uj5Var6;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new cu3((ju3) this.b.c(), (uu3) this.c.c(), (st3) this.d.c(), ((t23) this.e).a(), ((f33) this.f).a(), (xt3) this.g.c(), (qu3) this.h.c());
            default:
                Context a = ((t23) this.b).a();
                li4 a2 = ((ed3) this.c).a();
                yu3 c = ((zu3) this.d).c();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new mv3(a, a2, c, yw2Var, (ScheduledExecutorService) this.f.c(), (hz3) this.g.c(), (qm4) this.h.c());
        }
    }
}