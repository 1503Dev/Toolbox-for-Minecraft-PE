package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: ki3  reason: default package */
public final class ki3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public /* synthetic */ ki3(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new ji3((Context) this.b.c(), ((sj5) this.c).c(), ((pa3) this.d).a());
            default:
                return new oo3((Executor) this.b.c(), (t73) this.c.c(), (ji3) this.d.c());
        }
    }
}