package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: oi2  reason: default package */
public final class oi2 extends v2 {
    public final Context a;
    public final zq5 b;
    public final pq2 c;

    public oi2(Context context, String str) {
        tk2 tk2Var = new tk2();
        this.a = context;
        this.b = zq5.a;
        t42 t42Var = n62.f.b;
        zr5 zr5Var = new zr5();
        t42Var.getClass();
        this.c = (pq2) new cw1(t42Var, context, zr5Var, str, tk2Var).d(context, false);
    }

    @Override // defpackage.fy
    public final rl0 a() {
        mq3 mq3Var;
        pq2 pq2Var;
        try {
            pq2Var = this.c;
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
        if (pq2Var != null) {
            mq3Var = pq2Var.l();
            return new rl0(mq3Var);
        }
        mq3Var = null;
        return new rl0(mq3Var);
    }

    @Override // defpackage.fy
    public final void c(z61 z61Var) {
        try {
            pq2 pq2Var = this.c;
            if (pq2Var != null) {
                pq2Var.G1(new t92(z61Var));
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.fy
    public final void d(boolean z) {
        try {
            pq2 pq2Var = this.c;
            if (pq2Var != null) {
                pq2Var.B2(z);
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.fy
    public final void e(Activity activity) {
        if (activity == null) {
            sv2.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            pq2 pq2Var = this.c;
            if (pq2Var != null) {
                pq2Var.t1(new va0(activity));
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    public final void f(fx3 fx3Var, z61 z61Var) {
        try {
            pq2 pq2Var = this.c;
            if (pq2Var != null) {
                zq5 zq5Var = this.b;
                Context context = this.a;
                zq5Var.getClass();
                pq2Var.G0(zq5.a(context, fx3Var), new wj5(z61Var, this));
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
            z61Var.M0(new l20(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}