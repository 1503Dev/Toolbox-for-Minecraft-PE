package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: j3  reason: default package */
public abstract class j3 {
    public abstract l31 getSDKVersionInfo();

    public abstract l31 getVersionInfo();

    public abstract void initialize(Context context, px pxVar, List<x93> list);

    public void loadAppOpenAd(l50 l50Var, i50<Object, Object> i50Var) {
        i50Var.c(new n2(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(m50 m50Var, i50<Object, Object> i50Var) {
        i50Var.c(new n2(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterscrollerAd(m50 m50Var, i50<Object, Object> i50Var) {
        i50Var.c(new n2(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(o50 o50Var, i50<Object, Object> i50Var) {
        i50Var.c(new n2(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAd(q50 q50Var, i50<bk1, Object> i50Var) {
        i50Var.c(new n2(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedAd(s50 s50Var, i50<Object, Object> i50Var) {
        i50Var.c(new n2(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(s50 s50Var, i50<Object, Object> i50Var) {
        i50Var.c(new n2(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}