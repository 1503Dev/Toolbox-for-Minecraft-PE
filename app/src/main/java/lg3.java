package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* renamed from: lg3  reason: default package */
public final class lg3 extends z61 {
    public final p50 f;

    public lg3(AbstractAdViewAdapter abstractAdViewAdapter, p50 p50Var) {
        this.f = p50Var;
    }

    @Override // defpackage.z61
    public final void L0() {
        am2 am2Var = (am2) this.f;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        sv2.b("Adapter called onAdClosed.");
        try {
            am2Var.a.e();
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.z61
    public final void P0() {
        am2 am2Var = (am2) this.f;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        sv2.b("Adapter called onAdOpened.");
        try {
            am2Var.a.m();
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }
}