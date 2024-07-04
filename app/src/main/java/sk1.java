package defpackage;

import android.content.Context;

/* renamed from: sk1  reason: default package */
public final class sk1 implements wy4, wj3, v64 {
    public final /* synthetic */ int P;
    public Object Q;
    public Object R;

    public /* synthetic */ sk1(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // defpackage.wj3
    public final void c(boolean z, Context context, wd3 wd3Var) {
        e34 e34Var = (e34) this.Q;
        h14 h14Var = (h14) this.R;
        e34Var.getClass();
        try {
            ((mj4) h14Var.b).b(z);
            if (e34Var.c.R < ((Integer) w82.d.c.a(x92.u0)).intValue()) {
                mj4 mj4Var = (mj4) h14Var.b;
                mj4Var.getClass();
                mj4Var.a.s1();
                return;
            }
            mj4 mj4Var2 = (mj4) h14Var.b;
            mj4Var2.getClass();
            mj4Var2.a.C3(new va0(context));
        } catch (ni4 e) {
            sv2.f("Cannot show interstitial.");
            throw new vj3(e.getCause());
        }
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        switch (this.P) {
            case 4:
                jo5 jo5Var = (jo5) obj;
                return;
            default:
                jo5 jo5Var2 = (jo5) obj;
                return;
        }
    }

    @Override // defpackage.wy4
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        ((y03) obj).I((yh4) this.Q, (ci4) this.R);
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
    }

    public sk1(yh4 yh4Var, ci4 ci4Var) {
        this.P = 1;
        this.Q = yh4Var;
        this.R = ci4Var;
    }
}