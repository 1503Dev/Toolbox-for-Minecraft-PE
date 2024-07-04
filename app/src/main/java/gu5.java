package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;

@ParametersAreNonnullByDefault
/* renamed from: gu5  reason: default package */
public final class gu5 extends mp2 {
    public final xv2 P;
    public final zr5 Q;
    public final dz4 R = zw2.a.b(new xp5(this));
    public final Context S;
    public final ht5 T;
    public WebView U;
    public gf2 V;
    public rz1 W;
    public AsyncTask X;

    public gu5(Context context, zr5 zr5Var, String str, xv2 xv2Var) {
        this.S = context;
        this.P = xv2Var;
        this.Q = zr5Var;
        this.U = new WebView(context);
        this.T = new ht5(context, str);
        t4(0);
        this.U.setVerticalScrollBarEnabled(false);
        this.U.getSettings().setJavaScriptEnabled(true);
        this.U.setWebViewClient(new lo5(this));
        this.U.setOnTouchListener(new dp5(this));
    }

    @Override // defpackage.pq2
    public final void A3(i42 i42Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final void B2(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final void F() {
        uf0.b("destroy must be called on the main UI thread.");
        this.X.cancel(true);
        this.R.cancel(true);
        this.U.destroy();
        this.U = null;
    }

    @Override // defpackage.pq2
    public final void F2(yk3 yk3Var) {
    }

    @Override // defpackage.pq2
    public final String G() {
        return null;
    }

    @Override // defpackage.pq2
    public final void G0(pn5 pn5Var, xh2 xh2Var) {
    }

    @Override // defpackage.pq2
    public final void G1(q33 q33Var) {
    }

    @Override // defpackage.pq2
    public final void J() {
        uf0.b("resume must be called on the main UI thread.");
    }

    @Override // defpackage.pq2
    public final void J2(by5 by5Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final void K1(zr5 zr5Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // defpackage.pq2
    public final void M1() {
        uf0.b("pause must be called on the main UI thread.");
    }

    @Override // defpackage.pq2
    public final void O() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final boolean O3() {
        return false;
    }

    @Override // defpackage.pq2
    public final void Q() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final void R2(qc2 qc2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final void S0(gr2 gr2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final void S3(gf2 gf2Var) {
        this.V = gf2Var;
    }

    @Override // defpackage.pq2
    public final void U2(sa2 sa2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final void a1(px2 px2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final void c3(zq4 zq4Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final void d0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final void f0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final gf2 g() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // defpackage.pq2
    public final zr5 h() {
        return this.Q;
    }

    @Override // defpackage.pq2
    public final void h4(c13 c13Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final Bundle i() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final px2 j() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // defpackage.pq2
    public final void j4(boolean z) {
    }

    @Override // defpackage.pq2
    public final hw k() {
        uf0.b("getAdFrame must be called on the main UI thread.");
        return new va0(this.U);
    }

    @Override // defpackage.pq2
    public final mq3 l() {
        return null;
    }

    @Override // defpackage.pq2
    public final boolean l0() {
        return false;
    }

    @Override // defpackage.pq2
    public final cs3 n() {
        return null;
    }

    @Override // defpackage.pq2
    public final void o0() {
        throw new IllegalStateException("Unused method");
    }

    public final String q() {
        String str = this.T.e;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        return ij.c("https://", str, (String) ab2.d.d());
    }

    @Override // defpackage.pq2
    public final void r2() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final String s() {
        return null;
    }

    @Override // defpackage.pq2
    public final void s0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final void t0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.pq2
    public final void t1(hw hwVar) {
    }

    public final void t4(int i) {
        if (this.U == null) {
            return;
        }
        this.U.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // defpackage.pq2
    public final String w() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // defpackage.pq2
    public final boolean z1(pn5 pn5Var) {
        Bundle bundle;
        uf0.g(this.U, "This Search Ad has already been torn down");
        ht5 ht5Var = this.T;
        xv2 xv2Var = this.P;
        ht5Var.getClass();
        ht5Var.d = pn5Var.Y.P;
        Bundle bundle2 = pn5Var.b0;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(AdMobAdapter.class.getName());
        } else {
            bundle = null;
        }
        if (bundle != null) {
            String str = (String) ab2.c.d();
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    ht5Var.e = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    ht5Var.c.put(str2.substring(4), bundle.getString(str2));
                }
            }
            ht5Var.c.put("SDKVersion", xv2Var.P);
            if (((Boolean) ab2.a.d()).booleanValue()) {
                try {
                    Bundle b = lc4.b(ht5Var.a, new JSONArray((String) ab2.b.d()));
                    for (String str3 : b.keySet()) {
                        ht5Var.c.put(str3, b.get(str3).toString());
                    }
                } catch (JSONException e) {
                    sv2.e("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
                }
            }
        }
        this.X = new yr5(this).execute(new Void[0]);
        return true;
    }
}