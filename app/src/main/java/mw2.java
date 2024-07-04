package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* renamed from: mw2  reason: default package */
public final class mw2 extends gy {
    public final AbstractAdViewAdapter f;
    public final p50 g;

    public mw2(AbstractAdViewAdapter abstractAdViewAdapter, p50 p50Var) {
        this.f = abstractAdViewAdapter;
        this.g = p50Var;
    }

    @Override // defpackage.z61
    public final void M0(l20 l20Var) {
        ((am2) this.g).c(l20Var);
    }

    @Override // defpackage.z61
    public final void O0(Object obj) {
        fy fyVar = (fy) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f;
        abstractAdViewAdapter.mInterstitialAd = fyVar;
        fyVar.c(new lg3(abstractAdViewAdapter, this.g));
        am2 am2Var = (am2) this.g;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        sv2.b("Adapter called onAdLoaded.");
        try {
            am2Var.a.K();
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }
}