package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: x34  reason: default package */
public abstract class x34 implements e14 {
    @Override // defpackage.e14
    public final boolean a(hi4 hi4Var, yh4 yh4Var) {
        return !TextUtils.isEmpty(yh4Var.v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // defpackage.e14
    public final dz4 b(hi4 hi4Var, yh4 yh4Var) {
        Bundle bundle;
        Bundle bundle2;
        String optString = yh4Var.v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        li4 li4Var = (li4) hi4Var.a.P;
        ki4 ki4Var = new ki4();
        ki4Var.o.a = li4Var.o.P;
        pn5 pn5Var = li4Var.d;
        ki4Var.a = pn5Var;
        ki4Var.b = li4Var.e;
        ki4Var.s = li4Var.r;
        ki4Var.c = li4Var.f;
        ki4Var.d = li4Var.a;
        ki4Var.f = li4Var.g;
        ki4Var.g = li4Var.h;
        ki4Var.h = li4Var.i;
        ki4Var.i = li4Var.j;
        u2 u2Var = li4Var.l;
        ki4Var.j = u2Var;
        if (u2Var != null) {
            ki4Var.e = u2Var.P;
        }
        rg0 rg0Var = li4Var.m;
        ki4Var.k = rg0Var;
        if (rg0Var != null) {
            ki4Var.e = rg0Var.P;
            ki4Var.l = rg0Var.Q;
        }
        ki4Var.p = li4Var.p;
        ki4Var.q = li4Var.c;
        ki4Var.r = li4Var.q;
        ki4Var.c = optString;
        Bundle bundle3 = pn5Var.b0;
        if (bundle3 == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(bundle3);
        }
        Bundle bundle4 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle4 == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle4);
        }
        bundle2.putInt("gw", 1);
        String optString2 = yh4Var.v.optString(AdMobAdapter.HOUSE_ADS_PARAMETER, null);
        if (optString2 != null) {
            bundle2.putString(AdMobAdapter.HOUSE_ADS_PARAMETER, optString2);
        }
        String optString3 = yh4Var.v.optString(AdMobAdapter.AD_JSON_PARAMETER, null);
        if (optString3 != null) {
            bundle2.putString(AdMobAdapter.AD_PARAMETER, optString3);
        }
        bundle2.putBoolean("_noRefresh", true);
        Iterator<String> keys = yh4Var.D.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = yh4Var.D.optString(next, null);
            if (next != null) {
                bundle2.putString(next, optString4);
            }
        }
        bundle.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        pn5 pn5Var2 = li4Var.d;
        ki4Var.a = new pn5(pn5Var2.P, pn5Var2.Q, bundle2, pn5Var2.S, pn5Var2.T, pn5Var2.U, pn5Var2.V, pn5Var2.W, pn5Var2.X, pn5Var2.Y, pn5Var2.Z, pn5Var2.a0, bundle, pn5Var2.c0, pn5Var2.d0, pn5Var2.e0, pn5Var2.f0, pn5Var2.g0, pn5Var2.h0, pn5Var2.i0, pn5Var2.j0, pn5Var2.k0, pn5Var2.l0, pn5Var2.m0);
        li4 a = ki4Var.a();
        Bundle bundle5 = new Bundle();
        ci4 ci4Var = (ci4) hi4Var.b.Q;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(ci4Var.a));
        bundle6.putInt("refresh_interval", ci4Var.c);
        bundle6.putString("gws_query_id", ci4Var.b);
        bundle5.putBundle("parent_common_config", bundle6);
        String str = ((li4) hi4Var.a.P).f;
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", yh4Var.w);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(yh4Var.c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(yh4Var.d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(yh4Var.p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(yh4Var.m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(yh4Var.g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(yh4Var.h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(yh4Var.i));
        bundle7.putString("transaction_id", yh4Var.j);
        bundle7.putString("valid_from_timestamp", yh4Var.k);
        bundle7.putBoolean("is_closable_area_disabled", yh4Var.P);
        bundle7.putString("recursive_server_response_data", yh4Var.o0);
        if (yh4Var.l != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", yh4Var.l.Q);
            bundle8.putString("rb_type", yh4Var.l.P);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(a, bundle5, yh4Var, hi4Var);
    }

    public abstract el4 c(li4 li4Var, Bundle bundle, yh4 yh4Var, hi4 hi4Var);
}