package defpackage;

import android.os.Build;
import android.view.View;
import defpackage.n61;

/* renamed from: g5  reason: default package */
public final class g5 implements tb0 {
    public final /* synthetic */ f5 a;

    public g5(f5 f5Var) {
        this.a = f5Var;
    }

    @Override // defpackage.tb0
    public final n61 a(View view, n61 n61Var) {
        n61.e eVar;
        int a = n61Var.a();
        int N = this.a.N(a);
        if (a != N) {
            int i = n61Var.a.g().a;
            int i2 = n61Var.a.g().c;
            int i3 = n61Var.a.g().d;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                eVar = new n61.d(n61Var);
            } else if (i4 >= 29) {
                eVar = new n61.c(n61Var);
            } else if (i4 >= 20) {
                eVar = new n61.b(n61Var);
            } else {
                eVar = new n61.e(n61Var);
            }
            eVar.d(tx.a(i, N, i2, i3));
            n61Var = eVar.b();
        }
        return a41.k(view, n61Var);
    }
}