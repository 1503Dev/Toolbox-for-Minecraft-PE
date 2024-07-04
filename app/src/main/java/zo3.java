package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: zo3  reason: default package */
public final class zo3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public /* synthetic */ zo3(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new vo3((String) ((qa3) this.b).a.c, (jl3) this.c.c(), ((yl3) this.d).a());
            case 1:
                final rz1 rz1Var = (rz1) this.b.c();
                final Context a = ((t23) this.c).a();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                dz4 b = yw2Var.b(new Callable() { // from class: cv3
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        rz1 rz1Var2 = rz1.this;
                        return rz1Var2.b.f(a);
                    }
                });
                tv2.C(b);
                return b;
            default:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                li4 a2 = ((ed3) this.c).a();
                ij4 ij4Var = (ij4) this.d.c();
                return new w74(yw2Var2, a2);
        }
    }
}