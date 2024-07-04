package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* renamed from: hq1  reason: default package */
public final /* synthetic */ class hq1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ hq1(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                aa aaVar = (aa) this.Q;
                da daVar = (da) this.R;
                ug0 ug0Var = ((mp5) aaVar.S.Q).a;
                eq5 eq5Var = aaVar.S;
                if (ug0Var != null) {
                    ((ve0) ((mp5) eq5Var.Q).a).c(daVar, null);
                    return;
                }
                ((mp5) eq5Var.Q).getClass();
                m82.e("BillingClient", "No valid listener is set in BroadcastManager");
                return;
            case 1:
                ((c04) this.Q).l.addView((View) va0.c0((hw) this.R));
                return;
            case 2:
                s2 s2Var = (s2) this.Q;
                fx3 fx3Var = (fx3) this.R;
                s2Var.getClass();
                try {
                    ik2 ik2Var = s2Var.c;
                    zq5 zq5Var = s2Var.a;
                    Context context = s2Var.b;
                    zq5Var.getClass();
                    ik2Var.X2(zq5.a(context, fx3Var));
                    return;
                } catch (RemoteException e) {
                    sv2.e("Failed to load ad.", e);
                    return;
                }
            case 3:
                ((zi2) this.Q).P.loadData((String) this.R, "text/html", "UTF-8");
                return;
            default:
                jt3 jt3Var = (jt3) this.Q;
                try {
                    ((di2) this.R).l2(jt3Var.a());
                    return;
                } catch (RemoteException e2) {
                    sv2.e("", e2);
                    return;
                }
        }
    }
}