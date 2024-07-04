package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import defpackage.d3;
import defpackage.e70;
import defpackage.s2;
import java.util.Date;
import java.util.Set;

public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, cc0, zj1 {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private s2 adLoader;
    public i3 mAdView;
    public fy mInterstitialAd;

    public d3 buildAdRequest(Context context, j50 j50Var, Bundle bundle, Bundle bundle2) {
        d3.a aVar = new d3.a();
        Date b = j50Var.b();
        if (b != null) {
            aVar.a.g = b;
        }
        int f = j50Var.f();
        if (f != 0) {
            aVar.a.i = f;
        }
        Set<String> d = j50Var.d();
        if (d != null) {
            for (String str : d) {
                aVar.a.a.add(str);
            }
        }
        if (j50Var.c()) {
            mv2 mv2Var = n62.f.a;
            aVar.a.d.add(mv2.l(context));
        }
        if (j50Var.e() != -1) {
            int i = 1;
            if (j50Var.e() != 1) {
                i = 0;
            }
            aVar.a.j = i;
        }
        aVar.a.k = j50Var.a();
        aVar.a(buildExtrasBundle(bundle, bundle2));
        return new d3(aVar);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public fy getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // defpackage.zj1
    public cs3 getVideoController() {
        cs3 cs3Var;
        i3 i3Var = this.mAdView;
        if (i3Var != null) {
            p31 p31Var = i3Var.P.c;
            synchronized (p31Var.a) {
                cs3Var = p31Var.b;
            }
            return cs3Var;
        }
        return null;
    }

    public s2.a newAdLoader(Context context, String str) {
        return new s2.a(context, str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(2:5|(2:7|8))|9|10|11|(1:13)|8) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        defpackage.sv2.i("#007 Could not call remote method.", r0);
     */
    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.k50, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDestroy() {
        i3 i3Var = this.mAdView;
        if (i3Var != null) {
            x92.a(i3Var.getContext());
            if (((Boolean) kb2.e.d()).booleanValue()) {
                if (((Boolean) w82.d.c.a(x92.H8)).booleanValue()) {
                    jv2.b.execute(new qz3(0, i3Var));
                    this.mAdView = null;
                }
            }
            c04 c04Var = i3Var.P;
            c04Var.getClass();
            pq2 pq2Var = c04Var.i;
            if (pq2Var != null) {
                pq2Var.F();
            }
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // defpackage.cc0
    public void onImmersiveModeUpdated(boolean z) {
        fy fyVar = this.mInterstitialAd;
        if (fyVar != null) {
            fyVar.d(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.k50, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        i3 i3Var = this.mAdView;
        if (i3Var != null) {
            x92.a(i3Var.getContext());
            if (((Boolean) kb2.g.d()).booleanValue()) {
                if (((Boolean) w82.d.c.a(x92.I8)).booleanValue()) {
                    jv2.b.execute(new cx1(1, i3Var));
                    return;
                }
            }
            c04 c04Var = i3Var.P;
            c04Var.getClass();
            try {
                pq2 pq2Var = c04Var.i;
                if (pq2Var != null) {
                    pq2Var.M1();
                }
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.k50, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        i3 i3Var = this.mAdView;
        if (i3Var != null) {
            x92.a(i3Var.getContext());
            if (((Boolean) kb2.h.d()).booleanValue()) {
                if (((Boolean) w82.d.c.a(x92.G8)).booleanValue()) {
                    jv2.b.execute(new bj4(0, i3Var));
                    return;
                }
            }
            c04 c04Var = i3Var.P;
            c04Var.getClass();
            try {
                pq2 pq2Var = c04Var.i;
                if (pq2Var != null) {
                    pq2Var.J();
                }
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, n50 n50Var, Bundle bundle, h3 h3Var, j50 j50Var, Bundle bundle2) {
        i3 i3Var = new i3(context);
        this.mAdView = i3Var;
        i3Var.setAdSize(new h3(h3Var.a, h3Var.b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new v82(this, n50Var));
        this.mAdView.a(buildAdRequest(context, j50Var, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, p50 p50Var, Bundle bundle, j50 j50Var, Bundle bundle2) {
        fy.b(context, getAdUnitId(bundle), buildAdRequest(context, j50Var, bundle2, bundle), new mw2(this, p50Var));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, r50 r50Var, Bundle bundle, i70 i70Var, Bundle bundle2) {
        boolean z;
        int i;
        boolean z2;
        q31 q31Var;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        boolean z6;
        int i5;
        s2 s2Var;
        zz3 zz3Var;
        xe2 xe2Var;
        zq4 zq4Var;
        zz3 zz3Var2 = new zz3(this, r50Var);
        s2.a newAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        newAdLoader.getClass();
        try {
            newAdLoader.b.q2(new d25(zz3Var2));
        } catch (RemoteException e) {
            sv2.h("Failed to set AdListener.", e);
        }
        cm2 cm2Var = (cm2) i70Var;
        nc2 nc2Var = cm2Var.f;
        e70.a aVar = new e70.a();
        if (nc2Var != null) {
            int i6 = nc2Var.P;
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        aVar.g = nc2Var.V;
                        aVar.c = nc2Var.W;
                    }
                    aVar.a = nc2Var.Q;
                    aVar.b = nc2Var.R;
                    aVar.d = nc2Var.S;
                }
                zq4 zq4Var2 = nc2Var.U;
                if (zq4Var2 != null) {
                    aVar.e = new q31(zq4Var2);
                }
            }
            aVar.f = nc2Var.T;
            aVar.a = nc2Var.Q;
            aVar.b = nc2Var.R;
            aVar.d = nc2Var.S;
        }
        try {
            newAdLoader.b.j3(new nc2(new e70(aVar)));
        } catch (RemoteException e2) {
            sv2.h("Failed to specify native ad options", e2);
        }
        nc2 nc2Var2 = cm2Var.f;
        int i7 = 0;
        if (nc2Var2 == null) {
            q31Var = null;
            z6 = false;
            z3 = false;
            i5 = 1;
            z4 = false;
            i3 = 0;
            i4 = 0;
            z5 = false;
        } else {
            int i8 = nc2Var2.P;
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        z = false;
                        i = 0;
                        z2 = false;
                        q31Var = null;
                        i2 = 1;
                        boolean z7 = nc2Var2.Q;
                        z3 = nc2Var2.S;
                        i3 = i7;
                        z4 = z;
                        i4 = i;
                        z5 = z2;
                        z6 = z7;
                        i5 = i2;
                    } else {
                        boolean z8 = nc2Var2.V;
                        int i9 = nc2Var2.W;
                        i = nc2Var2.X;
                        z2 = nc2Var2.Y;
                        z = z8;
                        i7 = i9;
                    }
                } else {
                    z = false;
                    i = 0;
                    z2 = false;
                }
                zq4 zq4Var3 = nc2Var2.U;
                if (zq4Var3 != null) {
                    q31Var = new q31(zq4Var3);
                    i2 = nc2Var2.T;
                    boolean z72 = nc2Var2.Q;
                    z3 = nc2Var2.S;
                    i3 = i7;
                    z4 = z;
                    i4 = i;
                    z5 = z2;
                    z6 = z72;
                    i5 = i2;
                }
            } else {
                z = false;
                i = 0;
                z2 = false;
            }
            q31Var = null;
            i2 = nc2Var2.T;
            boolean z722 = nc2Var2.Q;
            z3 = nc2Var2.S;
            i3 = i7;
            z4 = z;
            i4 = i;
            z5 = z2;
            z6 = z722;
            i5 = i2;
        }
        try {
            jn2 jn2Var = newAdLoader.b;
            if (q31Var != null) {
                zq4Var = new zq4(q31Var);
            } else {
                zq4Var = null;
            }
            jn2Var.j3(new nc2(4, z6, -1, z3, i5, zq4Var, z4, i3, i4, z5));
        } catch (RemoteException e3) {
            sv2.h("Failed to specify native ad options", e3);
        }
        if (cm2Var.g.contains("6")) {
            try {
                newAdLoader.b.M0(new af2(zz3Var2));
            } catch (RemoteException e4) {
                sv2.h("Failed to add google native ad listener", e4);
            }
        }
        if (cm2Var.g.contains("3")) {
            for (String str : cm2Var.i.keySet()) {
                if (true != ((Boolean) cm2Var.i.get(str)).booleanValue()) {
                    zz3Var = null;
                } else {
                    zz3Var = zz3Var2;
                }
                ze2 ze2Var = new ze2(zz3Var2, zz3Var);
                try {
                    jn2 jn2Var2 = newAdLoader.b;
                    ye2 ye2Var = new ye2(ze2Var);
                    if (zz3Var == null) {
                        xe2Var = null;
                    } else {
                        xe2Var = new xe2(ze2Var);
                    }
                    jn2Var2.e1(str, ye2Var, xe2Var);
                } catch (RemoteException e5) {
                    sv2.h("Failed to add custom template ad listener", e5);
                }
            }
        }
        try {
            s2Var = new s2(newAdLoader.a, newAdLoader.b.b());
        } catch (RemoteException e6) {
            sv2.e("Failed to build AdLoader.", e6);
            s2Var = new s2(newAdLoader.a, new je4(new af4()));
        }
        this.adLoader = s2Var;
        s2Var.a(buildAdRequest(context, i70Var, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        fy fyVar = this.mInterstitialAd;
        if (fyVar != null) {
            fyVar.e(null);
        }
    }
}