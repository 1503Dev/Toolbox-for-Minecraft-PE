package defpackage;

import android.content.Context;

/* renamed from: d64  reason: default package */
public final class d64 implements lj5 {
    public final uj5 a;
    public final uj5 b;

    public d64(uj5 uj5Var, uj5 uj5Var2) {
        this.a = uj5Var;
        this.b = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Context context = (Context) this.a.c();
        return new c64((sj3) this.b.c());
    }
}