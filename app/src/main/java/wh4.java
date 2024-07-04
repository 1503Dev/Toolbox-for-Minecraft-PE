package defpackage;

import android.app.Activity;
import android.content.Context;

/* renamed from: wh4  reason: default package */
public final class wh4 extends er2 {
    public final qh4 P;
    public final mh4 Q;
    public final ii4 R;
    public yp3 S;
    public boolean T = false;

    public wh4(qh4 qh4Var, mh4 mh4Var, ii4 ii4Var) {
        this.P = qh4Var;
        this.Q = mh4Var;
        this.R = ii4Var;
    }

    public final synchronized void J0(hw hwVar) {
        Context context;
        uf0.b("pause must be called on the main UI thread.");
        if (this.S != null) {
            if (hwVar == null) {
                context = null;
            } else {
                context = (Context) va0.c0(hwVar);
            }
            ee3 ee3Var = this.S.c;
            ee3Var.getClass();
            ee3Var.R0(new y54(context));
        }
    }

    public final synchronized mq3 d() {
        if (!((Boolean) w82.d.c.a(x92.J5)).booleanValue()) {
            return null;
        }
        yp3 yp3Var = this.S;
        if (yp3Var == null) {
            return null;
        }
        return yp3Var.f;
    }

    public final synchronized void o3(hw hwVar) {
        uf0.b("destroy must be called on the main UI thread.");
        Context context = null;
        this.Q.Q.set(null);
        if (this.S != null) {
            if (hwVar != null) {
                context = (Context) va0.c0(hwVar);
            }
            ee3 ee3Var = this.S.c;
            ee3Var.getClass();
            ee3Var.R0(new cz1(1, context));
        }
    }

    public final synchronized void t4(hw hwVar) {
        Context context;
        uf0.b("resume must be called on the main UI thread.");
        if (this.S != null) {
            if (hwVar == null) {
                context = null;
            } else {
                context = (Context) va0.c0(hwVar);
            }
            ee3 ee3Var = this.S.c;
            ee3Var.getClass();
            ee3Var.R0(new dk5(3, context));
        }
    }

    public final synchronized void u4(String str) {
        uf0.b("#008 Must be called on the main UI thread.: setCustomData");
        this.R.b = str;
    }

    public final synchronized void v4(boolean z) {
        uf0.b("setImmersiveMode must be called on the main UI thread.");
        this.T = z;
    }

    public final synchronized void w4(hw hwVar) {
        uf0.b("showAd must be called on the main UI thread.");
        if (this.S != null) {
            Activity activity = null;
            if (hwVar != null) {
                Object c0 = va0.c0(hwVar);
                if (c0 instanceof Activity) {
                    activity = (Activity) c0;
                }
            }
            this.S.b(activity, this.T);
        }
    }
}