package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* renamed from: v82  reason: default package */
public final class v82 extends q2 implements r6, vj1 {
    public final n50 P;

    public v82(AbstractAdViewAdapter abstractAdViewAdapter, n50 n50Var) {
        this.P = n50Var;
    }

    @Override // defpackage.q2
    public final void J() {
        am2 am2Var = (am2) this.P;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        sv2.b("Adapter called onAdClicked.");
        try {
            am2Var.a.b();
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.q2
    public final void a() {
        am2 am2Var = (am2) this.P;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        sv2.b("Adapter called onAdClosed.");
        try {
            am2Var.a.e();
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.q2
    public final void b(l20 l20Var) {
        ((am2) this.P).b(l20Var);
    }

    @Override // defpackage.q2
    public final void d() {
        am2 am2Var = (am2) this.P;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        sv2.b("Adapter called onAdLoaded.");
        try {
            am2Var.a.K();
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.q2
    public final void e() {
        am2 am2Var = (am2) this.P;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        sv2.b("Adapter called onAdOpened.");
        try {
            am2Var.a.m();
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.r6
    public final void i(String str, String str2) {
        am2 am2Var = (am2) this.P;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        sv2.b("Adapter called onAppEvent.");
        try {
            am2Var.a.m2(str, str2);
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }
}