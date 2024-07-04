package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;

@Deprecated
public interface MediationInterstitialAdapter extends k50 {
    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, p50 p50Var, Bundle bundle, j50 j50Var, Bundle bundle2);

    void showInterstitial();
}