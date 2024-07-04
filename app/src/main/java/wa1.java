package defpackage;

import android.view.View;

/* renamed from: wa1  reason: default package */
public final class wa1 implements zc1 {
    public final /* synthetic */ ob1 a;

    public wa1(ob1 ob1Var) {
        this.a = ob1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        if (this.a.b(rc1Var)) {
            ob1 ob1Var = this.a;
            ob1Var.getClass();
            int l = rc1Var.b.l("id");
            View remove = ob1Var.V.remove(Integer.valueOf(l));
            v91 remove2 = ob1Var.P.remove(Integer.valueOf(l));
            boolean z = false;
            if (remove != null && remove2 != null) {
                if (remove2.C0 != null) {
                    z = true;
                }
                if (z) {
                    remove2.e();
                }
                if (remove2.y0 != null) {
                    remove2.p0 = true;
                }
                remove2.E0.shutdown();
                ob1Var.removeView(remove2);
                return;
            }
            pb1 k = ga1.h().k();
            k.getClass();
            pb1.d(rc1Var.a, "" + l);
        }
    }
}