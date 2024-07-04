package defpackage;

import android.view.View;

/* renamed from: cb1  reason: default package */
public final class cb1 implements zc1 {
    public final /* synthetic */ ob1 a;

    public cb1(ob1 ob1Var) {
        this.a = ob1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        if (this.a.b(rc1Var)) {
            ob1 ob1Var = this.a;
            ob1Var.getClass();
            int l = rc1Var.b.l("id");
            View remove = ob1Var.V.remove(Integer.valueOf(l));
            o91 remove2 = ob1Var.T.remove(Integer.valueOf(l));
            if (remove != null && remove2 != null) {
                ob1Var.removeView(remove2);
                return;
            }
            pb1 k = ga1.h().k();
            k.getClass();
            pb1.d(rc1Var.a, "" + l);
        }
    }
}