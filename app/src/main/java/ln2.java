package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ln2  reason: default package */
public final class ln2 extends ym2 {
    public final RtbAdapter Q;

    public ln2(RtbAdapter rtbAdapter) {
        this.Q = rtbAdapter;
    }

    public static final Bundle u4(String str) {
        sv2.g("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException e) {
            sv2.e("", e);
            throw new RemoteException();
        }
    }

    public static final boolean v4(pn5 pn5Var) {
        if (!pn5Var.U) {
            mv2 mv2Var = n62.f.a;
            if (!mv2.i()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final String w4(pn5 pn5Var, String str) {
        String str2 = pn5Var.j0;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // defpackage.zm2
    public final void E3(String str) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.zm2
    public final void J1(hw hwVar, String str, Bundle bundle, Bundle bundle2, zr5 zr5Var, cn2 cn2Var) {
        char c;
        o2 o2Var;
        try {
            eg3 eg3Var = new eg3(cn2Var, 3);
            RtbAdapter rtbAdapter = this.Q;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c == 5) {
                                    o2Var = o2.APP_OPEN_AD;
                                } else {
                                    throw new IllegalArgumentException("Internal Error");
                                }
                            } else {
                                o2Var = o2.NATIVE;
                            }
                        } else {
                            o2Var = o2.REWARDED_INTERSTITIAL;
                        }
                    } else {
                        o2Var = o2.REWARDED;
                    }
                } else {
                    o2Var = o2.INTERSTITIAL;
                }
            } else {
                o2Var = o2.BANNER;
            }
            x93 x93Var = new x93(o2Var, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(x93Var);
            Context context = (Context) va0.c0(hwVar);
            new h3(zr5Var.T, zr5Var.Q, zr5Var.P);
            rtbAdapter.collectSignals(new om0(arrayList), eg3Var);
        } catch (Throwable th) {
            throw yl2.a("Error generating signals for RTB", th);
        }
    }

    @Override // defpackage.zm2
    public final void M2(String str, String str2, pn5 pn5Var, hw hwVar, tm2 tm2Var, cl2 cl2Var, nc2 nc2Var) {
        try {
            x93 x93Var = new x93(tm2Var, cl2Var, 0);
            RtbAdapter rtbAdapter = this.Q;
            Context context = (Context) va0.c0(hwVar);
            u4(str2);
            t4(pn5Var);
            boolean v4 = v4(pn5Var);
            int i = pn5Var.V;
            int i2 = pn5Var.i0;
            w4(pn5Var, str2);
            rtbAdapter.loadRtbNativeAd(new q50(v4, i, i2), x93Var);
        } catch (Throwable th) {
            throw yl2.a("Adapter failed to render native ad.", th);
        }
    }

    @Override // defpackage.zm2
    public final void N2(String str, String str2, pn5 pn5Var, hw hwVar, nm2 nm2Var, cl2 cl2Var, zr5 zr5Var) {
        try {
            eq5 eq5Var = new eq5(nm2Var, cl2Var);
            RtbAdapter rtbAdapter = this.Q;
            Context context = (Context) va0.c0(hwVar);
            u4(str2);
            t4(pn5Var);
            boolean v4 = v4(pn5Var);
            int i = pn5Var.V;
            int i2 = pn5Var.i0;
            w4(pn5Var, str2);
            new h3(zr5Var.T, zr5Var.Q, zr5Var.P);
            rtbAdapter.loadRtbInterscrollerAd(new m50(v4, i, i2), eq5Var);
        } catch (Throwable th) {
            throw yl2.a("Adapter failed to render interscroller ad.", th);
        }
    }

    @Override // defpackage.zm2
    public final void W1(String str, String str2, pn5 pn5Var, hw hwVar, km2 km2Var, cl2 cl2Var) {
        try {
            gn2 gn2Var = new gn2(km2Var, cl2Var);
            RtbAdapter rtbAdapter = this.Q;
            Context context = (Context) va0.c0(hwVar);
            u4(str2);
            t4(pn5Var);
            boolean v4 = v4(pn5Var);
            int i = pn5Var.V;
            int i2 = pn5Var.i0;
            w4(pn5Var, str2);
            rtbAdapter.loadRtbAppOpenAd(new l50(v4, i, i2), gn2Var);
        } catch (Throwable th) {
            throw yl2.a("Adapter failed to render app open ad.", th);
        }
    }

    @Override // defpackage.zm2
    public final void W2(String str, String str2, pn5 pn5Var, hw hwVar, wm2 wm2Var, cl2 cl2Var) {
        try {
            kn2 kn2Var = new kn2(this, wm2Var, cl2Var);
            RtbAdapter rtbAdapter = this.Q;
            Context context = (Context) va0.c0(hwVar);
            u4(str2);
            t4(pn5Var);
            boolean v4 = v4(pn5Var);
            int i = pn5Var.V;
            int i2 = pn5Var.i0;
            w4(pn5Var, str2);
            rtbAdapter.loadRtbRewardedAd(new s50(v4, i, i2), kn2Var);
        } catch (Throwable th) {
            throw yl2.a("Adapter failed to render rewarded ad.", th);
        }
    }

    @Override // defpackage.zm2
    public final void X3(String str, String str2, pn5 pn5Var, hw hwVar, nm2 nm2Var, cl2 cl2Var, zr5 zr5Var) {
        try {
            en2 en2Var = new en2(nm2Var, cl2Var);
            RtbAdapter rtbAdapter = this.Q;
            Context context = (Context) va0.c0(hwVar);
            u4(str2);
            t4(pn5Var);
            boolean v4 = v4(pn5Var);
            int i = pn5Var.V;
            int i2 = pn5Var.i0;
            w4(pn5Var, str2);
            new h3(zr5Var.T, zr5Var.Q, zr5Var.P);
            rtbAdapter.loadRtbBannerAd(new m50(v4, i, i2), en2Var);
        } catch (Throwable th) {
            throw yl2.a("Adapter failed to render banner ad.", th);
        }
    }

    @Override // defpackage.zm2
    public final cs3 b() {
        RtbAdapter rtbAdapter = this.Q;
        if (rtbAdapter instanceof zj1) {
            try {
                return ((zj1) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                sv2.e("", th);
            }
        }
        return null;
    }

    @Override // defpackage.zm2
    public final void c1(String str, String str2, pn5 pn5Var, hw hwVar, tm2 tm2Var, cl2 cl2Var) {
        M2(str, str2, pn5Var, hwVar, tm2Var, cl2Var, null);
    }

    @Override // defpackage.zm2
    public final mn2 e() {
        this.Q.getVersionInfo();
        throw null;
    }

    @Override // defpackage.zm2
    public final void f4(String str, String str2, pn5 pn5Var, hw hwVar, wm2 wm2Var, cl2 cl2Var) {
        try {
            kn2 kn2Var = new kn2(this, wm2Var, cl2Var);
            RtbAdapter rtbAdapter = this.Q;
            Context context = (Context) va0.c0(hwVar);
            u4(str2);
            t4(pn5Var);
            boolean v4 = v4(pn5Var);
            int i = pn5Var.V;
            int i2 = pn5Var.i0;
            w4(pn5Var, str2);
            rtbAdapter.loadRtbRewardedInterstitialAd(new s50(v4, i, i2), kn2Var);
        } catch (Throwable th) {
            throw yl2.a("Adapter failed to render rewarded interstitial ad.", th);
        }
    }

    @Override // defpackage.zm2
    public final mn2 h() {
        this.Q.getSDKVersionInfo();
        throw null;
    }

    @Override // defpackage.zm2
    public final boolean h2(hw hwVar) {
        return false;
    }

    @Override // defpackage.zm2
    public final boolean m0(hw hwVar) {
        return false;
    }

    @Override // defpackage.zm2
    public final boolean t3(va0 va0Var) {
        return false;
    }

    public final Bundle t4(pn5 pn5Var) {
        Bundle bundle;
        Bundle bundle2 = pn5Var.b0;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.Q.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // defpackage.zm2
    public final void u1(String str, String str2, pn5 pn5Var, hw hwVar, qm2 qm2Var, cl2 cl2Var) {
        try {
            fn2 fn2Var = new fn2(this, qm2Var, cl2Var);
            RtbAdapter rtbAdapter = this.Q;
            Context context = (Context) va0.c0(hwVar);
            u4(str2);
            t4(pn5Var);
            boolean v4 = v4(pn5Var);
            int i = pn5Var.V;
            int i2 = pn5Var.i0;
            w4(pn5Var, str2);
            rtbAdapter.loadRtbInterstitialAd(new o50(v4, i, i2), fn2Var);
        } catch (Throwable th) {
            throw yl2.a("Adapter failed to render interstitial ad.", th);
        }
    }
}