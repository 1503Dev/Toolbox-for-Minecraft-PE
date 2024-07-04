package com.google.android.gms.ads.mediation.rtb;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class RtbAdapter extends j3 {
    public abstract void collectSignals(om0 om0Var, es0 es0Var);

    public void loadRtbAppOpenAd(l50 l50Var, i50<Object, Object> i50Var) {
        loadAppOpenAd(l50Var, i50Var);
    }

    public void loadRtbBannerAd(m50 m50Var, i50<Object, Object> i50Var) {
        loadBannerAd(m50Var, i50Var);
    }

    public void loadRtbInterscrollerAd(m50 m50Var, i50<Object, Object> i50Var) {
        i50Var.c(new n2(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
    }

    public void loadRtbInterstitialAd(o50 o50Var, i50<Object, Object> i50Var) {
        loadInterstitialAd(o50Var, i50Var);
    }

    public void loadRtbNativeAd(q50 q50Var, i50<bk1, Object> i50Var) {
        loadNativeAd(q50Var, i50Var);
    }

    public void loadRtbRewardedAd(s50 s50Var, i50<Object, Object> i50Var) {
        loadRewardedAd(s50Var, i50Var);
    }

    public void loadRtbRewardedInterstitialAd(s50 s50Var, i50<Object, Object> i50Var) {
        loadRewardedInterstitialAd(s50Var, i50Var);
    }
}