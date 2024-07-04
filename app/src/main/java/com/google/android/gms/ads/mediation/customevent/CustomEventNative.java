package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;

@Deprecated
public interface CustomEventNative extends gh {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, jh jhVar, String str, i70 i70Var, Bundle bundle);
}