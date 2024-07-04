package defpackage;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbqi;

/* renamed from: on2  reason: default package */
public final class on2 implements zp5 {
    public final /* synthetic */ zzbqi P;

    public on2(zzbqi zzbqiVar) {
        this.P = zzbqiVar;
    }

    @Override // defpackage.zp5
    public final void A(int i) {
        sv2.b("AdMobCustomTabsAdapter overlay is closed.");
        am2 am2Var = (am2) this.P.b;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        sv2.b("Adapter called onAdClosed.");
        try {
            am2Var.a.e();
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.zp5
    public final void Z() {
        sv2.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // defpackage.zp5
    public final void b() {
    }

    @Override // defpackage.zp5
    public final void c() {
        sv2.b("Opening AdMobCustomTabsAdapter overlay.");
        am2 am2Var = (am2) this.P.b;
        am2Var.getClass();
        uf0.b("#008 Must be called on the main UI thread.");
        sv2.b("Adapter called onAdOpened.");
        try {
            am2Var.a.m();
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.zp5
    public final void d3() {
        sv2.b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // defpackage.zp5
    public final void n3() {
        sv2.b("Delay close AdMobCustomTabsAdapter overlay.");
    }
}