package defpackage;

/* renamed from: s52  reason: default package */
public enum s52 implements ke5 {
    Q("AD_INITIATER_UNSPECIFIED"),
    R("BANNER"),
    S("DFP_BANNER"),
    T("INTERSTITIAL"),
    U("DFP_INTERSTITIAL"),
    V("NATIVE_EXPRESS"),
    W("AD_LOADER"),
    X("REWARD_BASED_VIDEO_AD"),
    Y("BANNER_SEARCH_ADS"),
    Z("GOOGLE_MOBILE_ADS_SDK_ADAPTER"),
    a0("APP_OPEN"),
    b0("REWARDED_INTERSTITIAL");
    
    public final int P;

    s52(String str) {
        this.P = r2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.P);
    }
}