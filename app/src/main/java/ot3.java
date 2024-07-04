package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ot3  reason: default package */
public final class ot3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final uj5 f;
    public final uj5 g;
    public final uj5 h;
    public final uj5 i;

    public ot3(uj5 uj5Var, t23 t23Var, u23 u23Var, uj5 uj5Var2, uj5 uj5Var3, uj5 uj5Var4, f33 f33Var, uh3 uh3Var, uj5 uj5Var5) {
        this.a = uj5Var;
        this.b = t23Var;
        this.c = u23Var;
        this.d = uj5Var2;
        this.e = uj5Var3;
        this.f = uj5Var4;
        this.g = f33Var;
        this.h = uh3Var;
        this.i = uj5Var5;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Executor executor = (Executor) this.a.c();
        Context a = ((t23) this.b).a();
        WeakReference weakReference = ((u23) this.c).a.c;
        tv2.C(weakReference);
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        return new jt3(executor, a, weakReference, yw2Var, (zq3) this.d.c(), (ScheduledExecutorService) this.e.c(), (is3) this.f.c(), ((f33) this.g).a(), new th3(((sj5) ((uh3) this.h).a).c()), (rm4) this.i.c());
    }
}