package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

@Deprecated
public interface MediationBannerAdapter extends k50 {
    View getBannerView();

    @Override // defpackage.k50, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // defpackage.k50, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // defpackage.k50, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, n50 n50Var, Bundle bundle, h3 h3Var, j50 j50Var, Bundle bundle2);
}