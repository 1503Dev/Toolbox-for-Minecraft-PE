package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: es3  reason: default package */
public final class es3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public /* synthetic */ es3(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new ds3((xr3) this.b.c(), ((sj5) this.c).c(), (kd) this.d.c());
            case 1:
                return new g24((Context) this.b.c(), (d93) this.c.c(), (Executor) this.d.c());
            default:
                ((t23) this.d).a();
                return new ge4((ScheduledExecutorService) this.c.c());
        }
    }
}