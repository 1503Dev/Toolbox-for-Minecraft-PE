package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: b83  reason: default package */
public final class b83 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public /* synthetic */ b83(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, lj5 lj5Var, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
        this.e = lj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                z14 z14Var = (z14) this.d;
                return new o54((ol4) this.b.c(), (ez4) this.c.c(), ((j54) this.e).c(), new y14((Context) z14Var.a.c(), (y73) z14Var.b.c(), 0));
            default:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new oc3((zd3) this.b.c(), ((pa3) this.c).a(), (ScheduledExecutorService) this.d.c(), yw2Var);
        }
    }
}