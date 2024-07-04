package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: e24  reason: default package */
public final class e24 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final uj5 f;

    public e24(mj5 mj5Var, uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, ed3 ed3Var, uj5 uj5Var4) {
        this.a = mj5Var;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
        this.e = ed3Var;
        this.f = uj5Var4;
    }

    @Override // defpackage.uj5
    /* renamed from: a */
    public final d24 c() {
        return new d24((d93) this.a.c(), (Context) this.b.c(), (Executor) this.c.c(), (qq3) this.d.c(), ((ed3) this.e).a(), (at4) this.f.c());
    }
}