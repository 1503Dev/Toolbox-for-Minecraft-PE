package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import defpackage.g70;
import defpackage.i21;

/* renamed from: zz3  reason: default package */
public final class zz3 extends q2 implements i21.a, g70.b, g70.a {
    public final AbstractAdViewAdapter P;
    public final r50 Q;

    public zz3(AbstractAdViewAdapter abstractAdViewAdapter, r50 r50Var) {
        this.P = abstractAdViewAdapter;
        this.Q = r50Var;
    }

    @Override // defpackage.q2
    public final void J() {
        am2 am2Var = (am2) this.Q;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        bk1 bk1Var = am2Var.b;
        if (am2Var.c == null) {
            if (bk1Var == null) {
                e = null;
                sv2.i("#007 Could not call remote method.", e);
                return;
            } else if (!bk1Var.n) {
                sv2.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        sv2.b("Adapter called onAdClicked.");
        try {
            am2Var.a.b();
        } catch (RemoteException e) {
            e = e;
        }
    }

    @Override // defpackage.q2
    public final void a() {
        am2 am2Var = (am2) this.Q;
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
        ((am2) this.Q).d(l20Var);
    }

    @Override // defpackage.q2
    public final void c() {
        am2 am2Var = (am2) this.Q;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        bk1 bk1Var = am2Var.b;
        if (am2Var.c == null) {
            if (bk1Var == null) {
                e = null;
                sv2.i("#007 Could not call remote method.", e);
                return;
            } else if (!bk1Var.m) {
                sv2.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        sv2.b("Adapter called onAdImpression.");
        try {
            am2Var.a.o();
        } catch (RemoteException e) {
            e = e;
        }
    }

    @Override // defpackage.q2
    public final void d() {
    }

    @Override // defpackage.q2
    public final void e() {
        am2 am2Var = (am2) this.Q;
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