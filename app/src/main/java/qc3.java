package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: qc3  reason: default package */
public final class qc3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public /* synthetic */ qc3(uj5 uj5Var, lj5 lj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = lj5Var;
        this.d = uj5Var2;
    }

    @Override // defpackage.uj5
    public final /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.b.c();
                return new pc3(((pa3) this.c).a());
            default:
                return new r34((Context) this.b.c(), (nk3) this.c.c(), (Executor) this.d.c());
        }
    }
}