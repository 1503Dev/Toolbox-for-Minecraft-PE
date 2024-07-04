package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: uo3  reason: default package */
public final class uo3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public /* synthetic */ uo3(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new to3((String) ((qa3) this.b).a.c, (jl3) this.c.c(), ((yl3) this.d).a());
            case 1:
                return new t34((Context) this.b.c(), (nk3) this.c.c(), ((f33) this.d).a());
            default:
                return new h54((Context) this.b.c(), (Executor) this.c.c(), (bq3) this.d.c());
        }
    }
}