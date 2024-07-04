package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;

@Deprecated
public interface MediationNativeAdapter extends k50 {
    @Override // 
    /* synthetic */ void onDestroy();

    @Override // 
    /* synthetic */ void onPause();

    @Override // 
    /* synthetic */ void onResume();

    void requestNativeAd(Context context, r50 r50Var, Bundle bundle, i70 i70Var, Bundle bundle2);
}