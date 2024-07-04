package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import defpackage.ph;

public final class zzbqi implements MediationInterstitialAdapter {
    public Activity a;
    public p50 b;
    public Uri c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        sv2.b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        sv2.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        sv2.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, p50 p50Var, Bundle bundle, j50 j50Var, Bundle bundle2) {
        this.b = p50Var;
        if (p50Var == null) {
            sv2.g("Listener not set for mediation. Returning.");
        } else if (context instanceof Activity) {
            if (!ua2.a(context)) {
                sv2.g("Default browser does not support custom tabs. Bailing out.");
                ((am2) this.b).a();
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                sv2.g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                ((am2) this.b).a();
                return;
            }
            this.a = (Activity) context;
            this.c = Uri.parse(string);
            am2 am2Var = (am2) this.b;
            am2Var.getClass();
            uf0.b("#008 Must be called on the main UI thread.");
            sv2.b("Adapter called onAdLoaded.");
            try {
                am2Var.a.K();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        } else {
            sv2.g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((am2) this.b).a();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        ph a = new ph.a().a();
        a.a.setData(this.c);
        cu5.i.post(new yk5(this, new AdOverlayInfoParcel(new tw2(a.a, null), null, new on2(this), null, new xv2(0, 0, false, false), null, null)));
        jv5 jv5Var = jv5.A;
        wu2 wu2Var = jv5Var.g.k;
        wu2Var.getClass();
        jv5Var.j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (wu2Var.a) {
            if (wu2Var.c == 3) {
                if (wu2Var.b + ((Long) w82.d.c.a(x92.T4)).longValue() <= currentTimeMillis) {
                    wu2Var.c = 1;
                }
            }
        }
        jv5Var.j.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        synchronized (wu2Var.a) {
            if (wu2Var.c == 2) {
                wu2Var.c = 3;
                if (wu2Var.c == 3) {
                    wu2Var.b = currentTimeMillis2;
                }
            }
        }
    }
}