package defpackage;

import android.content.Context;

/* renamed from: k2  reason: default package */
public final class k2 implements Runnable {
    public final /* synthetic */ pb1 P;
    public final /* synthetic */ String Q = "Controller was reloaded and current ad was closed";
    public final /* synthetic */ i2 R;

    public k2(i2 i2Var, pb1 pb1Var) {
        this.R = i2Var;
        this.P = pb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = ga1.P;
        if (context instanceof ia1) {
            pb1 pb1Var = this.P;
            ic1 ic1Var = new ic1();
            String str = this.Q;
            pb1Var.getClass();
            pb1.b(context, ic1Var, str);
        } else {
            z61 z61Var = this.R.a;
            if (z61Var != null) {
                z61Var.Q0();
                this.R.a = null;
            }
            this.R.a();
            i2 i2Var = this.R;
            i2Var.getClass();
            ga1.h().k().c.remove(i2Var.f);
            ga1.h().A = false;
        }
        ob1 ob1Var = this.R.c;
        if (ob1Var != null) {
            this.P.c(ob1Var);
            this.R.c = null;
        }
    }
}