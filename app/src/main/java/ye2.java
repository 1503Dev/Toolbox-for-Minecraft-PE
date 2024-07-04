package defpackage;

import android.os.RemoteException;
import defpackage.g70;

/* renamed from: ye2  reason: default package */
public final class ye2 extends ce2 {
    public final /* synthetic */ ze2 P;

    public /* synthetic */ ye2(ze2 ze2Var) {
        this.P = ze2Var;
    }

    @Override // defpackage.de2
    public final void y1(sd2 sd2Var) {
        td2 td2Var;
        String str;
        ze2 ze2Var = this.P;
        g70.b bVar = ze2Var.a;
        synchronized (ze2Var) {
            td2Var = ze2Var.c;
            if (td2Var == null) {
                td2Var = new td2(sd2Var);
                ze2Var.c = td2Var;
            }
        }
        am2 am2Var = (am2) ((zz3) bVar).Q;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        try {
            str = td2Var.a.g();
        } catch (RemoteException e) {
            sv2.e("", e);
            str = null;
        }
        sv2.b("Adapter called onAdLoaded with template id ".concat(String.valueOf(str)));
        am2Var.c = td2Var;
        try {
            am2Var.a.K();
        } catch (RemoteException e2) {
            sv2.i("#007 Could not call remote method.", e2);
        }
    }
}