package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: ic3  reason: default package */
public final class ic3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final uj5 f;
    public final uj5 g;
    public final uj5 h;

    public /* synthetic */ ic3(lj5 lj5Var, uj5 uj5Var, lj5 lj5Var2, lj5 lj5Var3, uj5 uj5Var2, uj5 uj5Var3, uj5 uj5Var4, int i) {
        this.a = i;
        this.b = lj5Var;
        this.c = uj5Var;
        this.d = lj5Var2;
        this.e = lj5Var3;
        this.f = uj5Var2;
        this.g = uj5Var3;
        this.h = uj5Var4;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new hc3(((t23) this.b).a(), ((ed3) this.c).a(), ((f33) this.d).a(), ((s23) this.e).c(), (jt3) this.f.c(), (rm4) this.g.c(), (String) this.h.c());
            default:
                return new jf4((Context) this.b.c(), (Executor) this.c.c(), (q23) this.d.c(), ((xg4) this.e).c(), (if4) this.f.c(), new ki4(), ((f33) this.h).a());
        }
    }
}