package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;

@Deprecated
public interface CustomEventInterstitial extends gh {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, ih ihVar, String str, j50 j50Var, Bundle bundle);

    void showInterstitial();
}