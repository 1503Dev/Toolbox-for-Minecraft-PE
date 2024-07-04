package defpackage;

import android.os.RemoteException;

/* renamed from: c74  reason: default package */
public final /* synthetic */ class c74 implements qd3 {
    public final /* synthetic */ t64 P;
    public final /* synthetic */ ni2 Q;

    public /* synthetic */ c74(t64 t64Var, ni2 ni2Var) {
        this.P = t64Var;
        this.Q = ni2Var;
    }

    @Override // defpackage.qd3
    public final void p(tz3 tz3Var) {
        t64 t64Var = this.P;
        ni2 ni2Var = this.Q;
        t64Var.p(tz3Var);
        if (ni2Var != null) {
            try {
                ni2Var.p(tz3Var);
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
        if (ni2Var != null) {
            try {
                ni2Var.y(tz3Var.P);
            } catch (RemoteException e2) {
                sv2.i("#007 Could not call remote method.", e2);
            }
        }
    }
}