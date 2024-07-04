package defpackage;

import android.content.Context;

/* renamed from: u63  reason: default package */
public final class u63 implements be3 {
    public final mj4 P;

    public u63(mj4 mj4Var) {
        this.P = mj4Var;
    }

    @Override // defpackage.be3
    public final void a(Context context) {
        try {
            mj4 mj4Var = this.P;
            mj4Var.getClass();
            mj4Var.a.K();
        } catch (ni4 e) {
            sv2.h("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // defpackage.be3
    public final void d(Context context) {
        try {
            mj4 mj4Var = this.P;
            mj4Var.getClass();
            mj4Var.a.x();
            if (context != null) {
                mj4 mj4Var2 = this.P;
                mj4Var2.getClass();
                mj4Var2.a.T2(new va0(context));
            }
        } catch (ni4 e) {
            sv2.h("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // defpackage.be3
    public final void e(Context context) {
        try {
            mj4 mj4Var = this.P;
            mj4Var.getClass();
            mj4Var.a.O1();
        } catch (ni4 e) {
            sv2.h("Cannot invoke onPause for the mediation adapter.", e);
        }
    }
}