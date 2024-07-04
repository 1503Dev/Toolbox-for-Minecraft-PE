package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zl2  reason: default package */
public final class zl2 extends yk2 {
    public final Object P;
    public am2 Q;
    public pr2 R;
    public hw S;

    public zl2(j3 j3Var) {
        this.P = j3Var;
    }

    public zl2(k50 k50Var) {
        this.P = k50Var;
    }

    public static final boolean w4(pn5 pn5Var) {
        if (!pn5Var.U) {
            mv2 mv2Var = n62.f.a;
            if (!mv2.i()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final String x4(pn5 pn5Var, String str) {
        String str2 = pn5Var.j0;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // defpackage.zk2
    public final ml2 C() {
        return null;
    }

    @Override // defpackage.zk2
    public final void C3(hw hwVar) {
        Object obj = this.P;
        if ((obj instanceof j3) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                s1();
                return;
            }
            sv2.b("Show interstitial ad from adapter.");
            sv2.d("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = j3.class.getCanonicalName();
        String canonicalName3 = this.P.getClass().getCanonicalName();
        sv2.g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
        throw new RemoteException();
    }

    @Override // defpackage.zk2
    public final void E0(hw hwVar, pn5 pn5Var, String str, cl2 cl2Var) {
        if (!(this.P instanceof j3)) {
            String canonicalName = j3.class.getCanonicalName();
            String canonicalName2 = this.P.getClass().getCanonicalName();
            sv2.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        sv2.b("Requesting app open ad from adapter.");
        try {
            xl2 xl2Var = new xl2(this, cl2Var);
            Context context = (Context) va0.c0(hwVar);
            v4(pn5Var, str, null);
            u4(pn5Var);
            boolean w4 = w4(pn5Var);
            int i = pn5Var.V;
            int i2 = pn5Var.i0;
            x4(pn5Var, str);
            ((j3) this.P).loadAppOpenAd(new l50(w4, i, i2), xl2Var);
        } catch (Exception e) {
            sv2.e("", e);
            throw new RemoteException();
        }
    }

    @Override // defpackage.zk2
    public final void E2(hw hwVar, pr2 pr2Var, List list) {
        sv2.g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // defpackage.zk2
    public final void F3(hw hwVar, pn5 pn5Var, String str, String str2, cl2 cl2Var) {
        RemoteException a;
        HashSet hashSet;
        Date date;
        Object obj = this.P;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof j3)) {
            sv2.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + j3.class.getCanonicalName() + " #009 Class mismatch: " + this.P.getClass().getCanonicalName());
            throw new RemoteException();
        }
        sv2.b("Requesting interstitial ad from adapter.");
        Object obj2 = this.P;
        if (obj2 instanceof MediationInterstitialAdapter) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                List list = pn5Var.T;
                Bundle bundle = null;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j = pn5Var.Q;
                if (j == -1) {
                    date = null;
                } else {
                    date = new Date(j);
                }
                int i = pn5Var.S;
                boolean w4 = w4(pn5Var);
                int i2 = pn5Var.V;
                boolean z = pn5Var.g0;
                x4(pn5Var, str);
                rl2 rl2Var = new rl2(date, i, hashSet, w4, i2, z);
                Bundle bundle2 = pn5Var.b0;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) va0.c0(hwVar), new am2(cl2Var), v4(pn5Var, str, str2), rl2Var, bundle);
            } finally {
            }
        } else if (obj2 instanceof j3) {
            try {
                ul2 ul2Var = new ul2(this, cl2Var);
                Context context = (Context) va0.c0(hwVar);
                v4(pn5Var, str, str2);
                u4(pn5Var);
                boolean w42 = w4(pn5Var);
                int i3 = pn5Var.V;
                int i4 = pn5Var.i0;
                x4(pn5Var, str);
                ((j3) obj2).loadInterstitialAd(new o50(w42, i3, i4), ul2Var);
            } finally {
            }
        }
    }

    @Override // defpackage.zk2
    public final void H2(hw hwVar, pn5 pn5Var, String str, cl2 cl2Var) {
        if (!(this.P instanceof j3)) {
            String canonicalName = j3.class.getCanonicalName();
            String canonicalName2 = this.P.getClass().getCanonicalName();
            sv2.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        sv2.b("Requesting rewarded interstitial ad from adapter.");
        try {
            wl2 wl2Var = new wl2(this, cl2Var);
            Context context = (Context) va0.c0(hwVar);
            v4(pn5Var, str, null);
            u4(pn5Var);
            boolean w4 = w4(pn5Var);
            int i = pn5Var.V;
            int i2 = pn5Var.i0;
            x4(pn5Var, str);
            ((j3) this.P).loadRewardedInterstitialAd(new s50(w4, i, i2), wl2Var);
        } catch (Exception e) {
            sv2.e("", e);
            throw new RemoteException();
        }
    }

    @Override // defpackage.zk2
    public final void I3(pn5 pn5Var, String str) {
        t4(pn5Var, str);
    }

    @Override // defpackage.zk2
    public final void K() {
        Object obj = this.P;
        if (!(obj instanceof k50)) {
            return;
        }
        try {
            ((k50) obj).onDestroy();
        } catch (Throwable th) {
            throw yl2.a("", th);
        }
    }

    @Override // defpackage.zk2
    public final ll2 L() {
        return null;
    }

    @Override // defpackage.zk2
    public final void N() {
        if (this.P instanceof j3) {
            sv2.d("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = j3.class.getCanonicalName();
        String canonicalName2 = this.P.getClass().getCanonicalName();
        sv2.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // defpackage.zk2
    public final boolean O() {
        return false;
    }

    @Override // defpackage.zk2
    public final void O1() {
        Object obj = this.P;
        if (!(obj instanceof k50)) {
            return;
        }
        try {
            ((k50) obj).onPause();
        } catch (Throwable th) {
            throw yl2.a("", th);
        }
    }

    @Override // defpackage.zk2
    public final boolean R() {
        if (this.P instanceof j3) {
            return this.R != null;
        }
        String canonicalName = j3.class.getCanonicalName();
        String canonicalName2 = this.P.getClass().getCanonicalName();
        sv2.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // defpackage.zk2
    public final void T1(boolean z) {
        Object obj = this.P;
        if (obj instanceof cc0) {
            try {
                ((cc0) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                sv2.e("", th);
                return;
            }
        }
        String canonicalName = cc0.class.getCanonicalName();
        String canonicalName2 = this.P.getClass().getCanonicalName();
        sv2.b(canonicalName + " #009 Class mismatch: " + canonicalName2);
    }

    @Override // defpackage.zk2
    public final void T2(hw hwVar) {
        Context context = (Context) va0.c0(hwVar);
        Object obj = this.P;
        if (obj instanceof ac0) {
            ((ac0) obj).a();
        }
    }

    @Override // defpackage.zk2
    public final void U3(hw hwVar, pn5 pn5Var, pr2 pr2Var, String str) {
        Object obj = this.P;
        if (obj instanceof j3) {
            this.S = hwVar;
            this.R = pr2Var;
            pr2Var.y3(new va0(obj));
            return;
        }
        String canonicalName = j3.class.getCanonicalName();
        String canonicalName2 = this.P.getClass().getCanonicalName();
        sv2.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // defpackage.zk2
    public final void V0(hw hwVar, pn5 pn5Var, String str, cl2 cl2Var) {
        if (!(this.P instanceof j3)) {
            String canonicalName = j3.class.getCanonicalName();
            String canonicalName2 = this.P.getClass().getCanonicalName();
            sv2.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        sv2.b("Requesting rewarded ad from adapter.");
        try {
            wl2 wl2Var = new wl2(this, cl2Var);
            Context context = (Context) va0.c0(hwVar);
            v4(pn5Var, str, null);
            u4(pn5Var);
            boolean w4 = w4(pn5Var);
            int i = pn5Var.V;
            int i2 = pn5Var.i0;
            x4(pn5Var, str);
            ((j3) this.P).loadRewardedAd(new s50(w4, i, i2), wl2Var);
        } catch (Exception e) {
            sv2.e("", e);
            throw new RemoteException();
        }
    }

    @Override // defpackage.zk2
    public final void W0(hw hwVar, zr5 zr5Var, pn5 pn5Var, String str, String str2, cl2 cl2Var) {
        h3 h3Var;
        RemoteException a;
        HashSet hashSet;
        Date date;
        Object obj = this.P;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof j3)) {
            sv2.g(MediationBannerAdapter.class.getCanonicalName() + " or " + j3.class.getCanonicalName() + " #009 Class mismatch: " + this.P.getClass().getCanonicalName());
            throw new RemoteException();
        }
        sv2.b("Requesting banner ad from adapter.");
        if (zr5Var.c0) {
            int i = zr5Var.T;
            int i2 = zr5Var.Q;
            h3 h3Var2 = new h3(i, i2);
            h3Var2.d = true;
            h3Var2.e = i2;
            h3Var = h3Var2;
        } else {
            h3Var = new h3(zr5Var.T, zr5Var.Q, zr5Var.P);
        }
        Object obj2 = this.P;
        if (obj2 instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                List list = pn5Var.T;
                Bundle bundle = null;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j = pn5Var.Q;
                if (j == -1) {
                    date = null;
                } else {
                    date = new Date(j);
                }
                int i3 = pn5Var.S;
                boolean w4 = w4(pn5Var);
                int i4 = pn5Var.V;
                boolean z = pn5Var.g0;
                x4(pn5Var, str);
                rl2 rl2Var = new rl2(date, i3, hashSet, w4, i4, z);
                Bundle bundle2 = pn5Var.b0;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationBannerAdapter.getClass().getName());
                }
                mediationBannerAdapter.requestBannerAd((Context) va0.c0(hwVar), new am2(cl2Var), v4(pn5Var, str, str2), h3Var, rl2Var, bundle);
            } finally {
            }
        } else if (obj2 instanceof j3) {
            try {
                tl2 tl2Var = new tl2(this, cl2Var);
                Context context = (Context) va0.c0(hwVar);
                v4(pn5Var, str, str2);
                u4(pn5Var);
                boolean w42 = w4(pn5Var);
                int i5 = pn5Var.V;
                int i6 = pn5Var.i0;
                x4(pn5Var, str);
                ((j3) obj2).loadBannerAd(new m50(w42, i5, i6), tl2Var);
            } finally {
            }
        }
    }

    @Override // defpackage.zk2
    public final void Y0(hw hwVar, zr5 zr5Var, pn5 pn5Var, String str, String str2, cl2 cl2Var) {
        if (this.P instanceof j3) {
            sv2.b("Requesting interscroller ad from adapter.");
            try {
                j3 j3Var = (j3) this.P;
                sl2 sl2Var = new sl2(cl2Var, j3Var);
                Context context = (Context) va0.c0(hwVar);
                v4(pn5Var, str, str2);
                u4(pn5Var);
                boolean w4 = w4(pn5Var);
                int i = pn5Var.V;
                int i2 = pn5Var.i0;
                x4(pn5Var, str);
                int i3 = zr5Var.T;
                int i4 = zr5Var.Q;
                h3 h3Var = new h3(i3, i4);
                h3Var.f = true;
                h3Var.g = i4;
                j3Var.loadInterscrollerAd(new m50(w4, i, i2), sl2Var);
                return;
            } catch (Exception e) {
                sv2.e("", e);
                throw new RemoteException();
            }
        }
        String canonicalName = j3.class.getCanonicalName();
        String canonicalName2 = this.P.getClass().getCanonicalName();
        sv2.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // defpackage.zk2
    public final cs3 f() {
        Object obj = this.P;
        if (obj instanceof zj1) {
            try {
                return ((zj1) obj).getVideoController();
            } catch (Throwable th) {
                sv2.e("", th);
            }
        }
        return null;
    }

    @Override // defpackage.zk2
    public final void i3(hw hwVar) {
        if (this.P instanceof j3) {
            sv2.b("Show app open ad from adapter.");
            sv2.d("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = j3.class.getCanonicalName();
        String canonicalName2 = this.P.getClass().getCanonicalName();
        sv2.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // defpackage.zk2
    public final jl2 j() {
        return null;
    }

    @Override // defpackage.zk2
    public final hw k() {
        Object obj = this.P;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new va0(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                throw yl2.a("", th);
            }
        } else if (obj instanceof j3) {
            return new va0(null);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = j3.class.getCanonicalName();
            String canonicalName3 = this.P.getClass().getCanonicalName();
            sv2.g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    @Override // defpackage.zk2
    public final pl2 l() {
        bk1 bk1Var;
        Object obj = this.P;
        if (obj instanceof MediationNativeAdapter) {
            am2 am2Var = this.Q;
            if (am2Var != null && (bk1Var = am2Var.b) != null) {
                return new dm2(bk1Var);
            }
            return null;
        }
        boolean z = obj instanceof j3;
        return null;
    }

    @Override // defpackage.zk2
    public final mn2 n() {
        Object obj = this.P;
        if (obj instanceof j3) {
            ((j3) obj).getVersionInfo();
            throw null;
        }
        return null;
    }

    @Override // defpackage.zk2
    public final mn2 o() {
        Object obj = this.P;
        if (obj instanceof j3) {
            ((j3) obj).getSDKVersionInfo();
            throw null;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.zk2
    public final void p3(hw hwVar, ai2 ai2Var, List list) {
        char c;
        if (!(this.P instanceof j3)) {
            throw new RemoteException();
        }
        fk fkVar = new fk(ai2Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ei2 ei2Var = (ei2) it.next();
            String str = ei2Var.P;
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
            o2 o2Var = c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? c != 5 ? null : o2.APP_OPEN_AD : o2.NATIVE : o2.REWARDED_INTERSTITIAL : o2.REWARDED : o2.INTERSTITIAL : o2.BANNER;
            if (o2Var != null) {
                arrayList.add(new x93(o2Var, ei2Var.Q));
            }
        }
        ((j3) this.P).initialize((Context) va0.c0(hwVar), fkVar, arrayList);
    }

    @Override // defpackage.zk2
    public final void s1() {
        if (this.P instanceof MediationInterstitialAdapter) {
            sv2.b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.P).showInterstitial();
                return;
            } catch (Throwable th) {
                throw yl2.a("", th);
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = this.P.getClass().getCanonicalName();
        sv2.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    public final void t4(pn5 pn5Var, String str) {
        Object obj = this.P;
        if (obj instanceof j3) {
            V0(this.S, pn5Var, str, new bm2((j3) obj, this.R));
            return;
        }
        String canonicalName = j3.class.getCanonicalName();
        String canonicalName2 = this.P.getClass().getCanonicalName();
        sv2.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // defpackage.zk2
    public final void u2(hw hwVar, pn5 pn5Var, String str, String str2, cl2 cl2Var, nc2 nc2Var, ArrayList arrayList) {
        RemoteException a;
        HashSet hashSet;
        Date date;
        Object obj = this.P;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof j3)) {
            sv2.g(MediationNativeAdapter.class.getCanonicalName() + " or " + j3.class.getCanonicalName() + " #009 Class mismatch: " + this.P.getClass().getCanonicalName());
            throw new RemoteException();
        }
        sv2.b("Requesting native ad from adapter.");
        Object obj2 = this.P;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list = pn5Var.T;
                Bundle bundle = null;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j = pn5Var.Q;
                if (j == -1) {
                    date = null;
                } else {
                    date = new Date(j);
                }
                int i = pn5Var.S;
                boolean w4 = w4(pn5Var);
                int i2 = pn5Var.V;
                boolean z = pn5Var.g0;
                x4(pn5Var, str);
                cm2 cm2Var = new cm2(date, i, hashSet, w4, i2, nc2Var, arrayList, z);
                Bundle bundle2 = pn5Var.b0;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationNativeAdapter.getClass().getName());
                }
                this.Q = new am2(cl2Var);
                mediationNativeAdapter.requestNativeAd((Context) va0.c0(hwVar), this.Q, v4(pn5Var, str, str2), cm2Var, bundle);
            } finally {
            }
        } else if (obj2 instanceof j3) {
            try {
                vl2 vl2Var = new vl2(this, cl2Var);
                Context context = (Context) va0.c0(hwVar);
                v4(pn5Var, str, str2);
                u4(pn5Var);
                boolean w42 = w4(pn5Var);
                int i3 = pn5Var.V;
                int i4 = pn5Var.i0;
                x4(pn5Var, str);
                ((j3) obj2).loadNativeAd(new q50(w42, i3, i4), vl2Var);
            } finally {
            }
        }
    }

    public final Bundle u4(pn5 pn5Var) {
        Bundle bundle;
        Bundle bundle2 = pn5Var.b0;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.P.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    public final Bundle v4(pn5 pn5Var, String str, String str2) {
        sv2.b("Server parameters: ".concat(String.valueOf(str)));
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
                bundle = bundle2;
            }
            if (this.P instanceof AdMobAdapter) {
                bundle.putString(AdMobAdapter.AD_JSON_PARAMETER, str2);
                if (pn5Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", pn5Var.V);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            throw yl2.a("", th);
        }
    }

    @Override // defpackage.zk2
    public final void x() {
        Object obj = this.P;
        if (!(obj instanceof k50)) {
            return;
        }
        try {
            ((k50) obj).onResume();
        } catch (Throwable th) {
            throw yl2.a("", th);
        }
    }

    @Override // defpackage.zk2
    public final void y0(hw hwVar) {
        if (this.P instanceof j3) {
            sv2.b("Show rewarded ad from adapter.");
            sv2.d("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = j3.class.getCanonicalName();
        String canonicalName2 = this.P.getClass().getCanonicalName();
        sv2.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }
}