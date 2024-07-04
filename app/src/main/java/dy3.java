package defpackage;

import android.content.Context;
import java.util.ArrayDeque;

/* renamed from: dy3  reason: default package */
public final class dy3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public dy3(t23 t23Var, e33 e33Var, py3 py3Var, uj5 uj5Var, uj5 uj5Var2) {
        this.a = t23Var;
        this.b = e33Var;
        this.c = py3Var;
        this.d = uj5Var;
        this.e = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Context a = ((t23) this.a).a();
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        o7 o7Var = new o7();
        q23 q23Var = (q23) ((e33) this.b).a.c();
        tv2.C(q23Var);
        return new cy3(a, yw2Var, o7Var, q23Var, new z63(2, ((k33) ((py3) this.c).a).c()), (ArrayDeque) this.d.c(), (rm4) this.e.c());
    }
}