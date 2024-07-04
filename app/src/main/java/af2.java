package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import defpackage.i21;

/* renamed from: af2  reason: default package */
public final class af2 extends ie2 {
    public final i21.a P;

    public af2(zz3 zz3Var) {
        this.P = zz3Var;
    }

    @Override // defpackage.je2
    public final void p1(ue2 ue2Var) {
        i21.a aVar = this.P;
        ve2 ve2Var = new ve2(ue2Var);
        zz3 zz3Var = (zz3) aVar;
        r50 r50Var = zz3Var.Q;
        AbstractAdViewAdapter abstractAdViewAdapter = zz3Var.P;
        bk1 bk1Var = new bk1(ve2Var);
        am2 am2Var = (am2) r50Var;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        sv2.b("Adapter called onAdLoaded.");
        am2Var.b = bk1Var;
        if (!(abstractAdViewAdapter instanceof AdMobAdapter)) {
            Object obj = new Object();
            new ql2();
            synchronized (obj) {
            }
        }
        try {
            am2Var.a.K();
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }
}