package defpackage;

/* renamed from: f62  reason: default package */
public enum f62 implements ke5 {
    Q("AD_FORMAT_TYPE_UNSPECIFIED"),
    R("BANNER"),
    S("INTERSTITIAL"),
    T("NATIVE_EXPRESS"),
    U("NATIVE_CONTENT"),
    V("NATIVE_APP_INSTALL"),
    W("NATIVE_CUSTOM_TEMPLATE"),
    X("DFP_BANNER"),
    Y("DFP_INTERSTITIAL"),
    Z("REWARD_BASED_VIDEO_AD"),
    a0("BANNER_SEARCH_ADS");
    
    public final int P;

    f62(String str) {
        this.P = r2;
    }

    public static f62 b(int i) {
        switch (i) {
            case 0:
                return Q;
            case 1:
                return R;
            case 2:
                return S;
            case 3:
                return T;
            case 4:
                return U;
            case 5:
                return V;
            case 6:
                return W;
            case 7:
                return X;
            case 8:
                return Y;
            case 9:
                return Z;
            case 10:
                return a0;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.P);
    }
}