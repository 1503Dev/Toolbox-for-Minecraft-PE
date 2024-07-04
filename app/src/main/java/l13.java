package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: l13  reason: default package */
public final class l13 extends FrameLayout implements y03 {
    public final y03 P;
    public final wx2 Q;
    public final AtomicBoolean R;

    public l13(o13 o13Var) {
        super(o13Var.getContext());
        this.R = new AtomicBoolean();
        this.P = o13Var;
        this.Q = new wx2(o13Var.P.c, this, this);
        addView(o13Var);
    }

    @Override // defpackage.gy2
    public final oz2 A(String str) {
        return this.P.A(str);
    }

    @Override // defpackage.y03
    public final void A0(k23 k23Var) {
        this.P.A0(k23Var);
    }

    @Override // defpackage.aj2
    public final void B(String str, String str2) {
        this.P.B("window.inspectorInfo", str2);
    }

    @Override // defpackage.y03
    public final void B0() {
        String str;
        TextView textView = new TextView(getContext());
        jv5 jv5Var = jv5.A;
        cu5 cu5Var = jv5Var.c;
        Resources a = jv5Var.g.a();
        if (a != null) {
            str = a.getString(ri0.s7);
        } else {
            str = "Test Ad";
        }
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // defpackage.y03, defpackage.r13
    public final ci4 C() {
        return this.P.C();
    }

    @Override // defpackage.y03
    public final void C0(String str, mg2 mg2Var) {
        this.P.C0(str, mg2Var);
    }

    @Override // defpackage.y03
    public final boolean D() {
        return this.P.D();
    }

    @Override // defpackage.y03
    public final void D0(String str, mg2 mg2Var) {
        this.P.D0(str, mg2Var);
    }

    @Override // defpackage.gy2
    public final void E() {
        this.P.E();
    }

    @Override // defpackage.c23
    public final void E0(int i, boolean z, boolean z2) {
        this.P.E0(i, z, z2);
    }

    @Override // defpackage.y03
    public final void F(mc2 mc2Var) {
        this.P.F(mc2Var);
    }

    @Override // defpackage.y03
    public final void F0() {
        wx2 wx2Var = this.Q;
        wx2Var.getClass();
        uf0.b("onDestroy must be called from the UI thread.");
        vx2 vx2Var = wx2Var.d;
        if (vx2Var != null) {
            vx2Var.T.b();
            sx2 sx2Var = vx2Var.V;
            if (sx2Var != null) {
                sx2Var.y();
            }
            vx2Var.b();
            wx2Var.c.removeView(wx2Var.d);
            wx2Var.d = null;
        }
        this.P.F0();
    }

    @Override // defpackage.y03
    public final void G(Context context) {
        this.P.G(context);
    }

    @Override // defpackage.y03
    public final void G0(qf4 qf4Var) {
        this.P.G0(qf4Var);
    }

    @Override // defpackage.gy2
    public final void H(int i) {
        vx2 vx2Var = this.Q.d;
        if (vx2Var != null) {
            if (((Boolean) w82.d.c.a(x92.z)).booleanValue()) {
                vx2Var.Q.setBackgroundColor(i);
                vx2Var.R.setBackgroundColor(i);
            }
        }
    }

    @Override // defpackage.gy2
    public final void H0(int i) {
        this.P.H0(i);
    }

    @Override // defpackage.y03
    public final void I(yh4 yh4Var, ci4 ci4Var) {
        this.P.I(yh4Var, ci4Var);
    }

    @Override // defpackage.y03
    public final void I0(qn5 qn5Var) {
        this.P.I0(qn5Var);
    }

    @Override // defpackage.vj1
    public final void J() {
        y03 y03Var = this.P;
        if (y03Var != null) {
            y03Var.J();
        }
    }

    @Override // defpackage.y03
    public final void J0(boolean z) {
        this.P.J0(z);
    }

    @Override // defpackage.gy2
    public final void K() {
        this.P.K();
    }

    @Override // defpackage.y03
    public final boolean K0(int i, boolean z) {
        if (!this.R.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) w82.d.c.a(x92.y0)).booleanValue()) {
            return false;
        }
        if (this.P.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.P.getParent()).removeView((View) this.P);
        }
        this.P.K0(i, z);
        return true;
    }

    @Override // defpackage.y03, defpackage.gy2
    public final k23 L() {
        return this.P.L();
    }

    @Override // defpackage.y03
    public final void L0() {
        this.P.L0();
    }

    @Override // defpackage.y03
    public final z32 M() {
        return this.P.M();
    }

    @Override // defpackage.aj2
    public final void M0(String str, JSONObject jSONObject) {
        ((o13) this.P).B(str, jSONObject.toString());
    }

    @Override // defpackage.y03
    public final qn5 N() {
        return this.P.N();
    }

    @Override // defpackage.y03
    public final void N0(qn5 qn5Var) {
        this.P.N0(qn5Var);
    }

    @Override // defpackage.y03
    public final qn5 O() {
        return this.P.O();
    }

    @Override // defpackage.y03
    public final void O0(int i) {
        this.P.O0(i);
    }

    @Override // defpackage.gy2
    public final void P() {
    }

    @Override // defpackage.y03
    public final void P0(boolean z) {
        this.P.P0(z);
    }

    @Override // defpackage.y03
    public final void Q(kc2 kc2Var) {
        this.P.Q(kc2Var);
    }

    @Override // defpackage.y03
    public final g13 R() {
        return ((o13) this.P).e0;
    }

    @Override // defpackage.y03
    public final void S(int i) {
        this.P.S(i);
    }

    @Override // defpackage.y03
    public final void T(boolean z) {
        this.P.T(z);
    }

    @Override // defpackage.gy2
    public final String U() {
        return this.P.U();
    }

    @Override // defpackage.y03
    public final boolean V() {
        return this.P.V();
    }

    @Override // defpackage.y03
    public final void W() {
        this.P.W();
    }

    @Override // defpackage.y03
    public final void X(String str, String str2) {
        this.P.X(str, str2);
    }

    @Override // defpackage.y03
    public final boolean Y() {
        return this.P.Y();
    }

    @Override // defpackage.gy2
    public final void Z(long j, boolean z) {
        this.P.Z(j, z);
    }

    @Override // defpackage.pi2
    public final void a(String str, Map map) {
        this.P.a(str, map);
    }

    @Override // defpackage.y03
    public final String a0() {
        return this.P.a0();
    }

    @Override // defpackage.yn5
    public final void b() {
        this.P.b();
    }

    @Override // defpackage.y03
    public final void b0(boolean z) {
        this.P.b0(z);
    }

    @Override // defpackage.c23
    public final void c(co2 co2Var, r04 r04Var, zr3 zr3Var, wl4 wl4Var, String str, String str2) {
        this.P.c(co2Var, r04Var, zr3Var, wl4Var, str, str2);
    }

    @Override // defpackage.y03
    public final boolean c0() {
        return this.P.c0();
    }

    @Override // defpackage.y03
    public final boolean canGoBack() {
        return this.P.canGoBack();
    }

    @Override // defpackage.y03
    public final mc2 d0() {
        return this.P.d0();
    }

    @Override // defpackage.y03
    public final void destroy() {
        hw o0 = o0();
        if (o0 != null) {
            wi4 wi4Var = cu5.i;
            wi4Var.post(new lz1(2, o0));
            y03 y03Var = this.P;
            y03Var.getClass();
            wi4Var.postDelayed(new fp1(2, y03Var), ((Integer) w82.d.c.a(x92.j4)).intValue());
            return;
        }
        this.P.destroy();
    }

    @Override // defpackage.gy2
    public final int e() {
        return this.P.e();
    }

    @Override // defpackage.y03
    public final void e0(String str, vi2 vi2Var) {
        this.P.e0(str, vi2Var);
    }

    @Override // defpackage.gy2
    public final int f() {
        if (((Boolean) w82.d.c.a(x92.g3)).booleanValue()) {
            return this.P.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    @Override // defpackage.y03
    public final void f0() {
        this.P.f0();
    }

    @Override // defpackage.y03, defpackage.u13, defpackage.gy2
    public final Activity g() {
        return this.P.g();
    }

    @Override // defpackage.y03
    public final void goBack() {
        this.P.goBack();
    }

    @Override // defpackage.gy2
    public final int h() {
        if (((Boolean) w82.d.c.a(x92.g3)).booleanValue()) {
            return this.P.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    @Override // defpackage.s22
    public final void h0(r22 r22Var) {
        this.P.h0(r22Var);
    }

    @Override // defpackage.yn5
    public final void i() {
        this.P.i();
    }

    @Override // defpackage.y03
    public final void i0(boolean z) {
        this.P.i0(z);
    }

    @Override // defpackage.y03, defpackage.gy2
    public final uj1 j() {
        return this.P.j();
    }

    @Override // defpackage.y03
    public final void j0(hw hwVar) {
        this.P.j0(hwVar);
    }

    @Override // defpackage.y03, defpackage.f23, defpackage.gy2
    public final xv2 k() {
        return this.P.k();
    }

    @Override // defpackage.y03
    public final boolean k0() {
        return this.R.get();
    }

    @Override // defpackage.gy2
    public final ja2 l() {
        return this.P.l();
    }

    @Override // defpackage.y03
    public final void l0() {
        boolean z;
        y03 y03Var = this.P;
        HashMap hashMap = new HashMap(3);
        jv5 jv5Var = jv5.A;
        xk1 xk1Var = jv5Var.h;
        synchronized (xk1Var) {
            z = xk1Var.a;
        }
        hashMap.put("app_muted", String.valueOf(z));
        hashMap.put("app_volume", String.valueOf(jv5Var.h.a()));
        o13 o13Var = (o13) y03Var;
        AudioManager audioManager = (AudioManager) o13Var.getContext().getSystemService("audio");
        float f = 0.0f;
        if (audioManager != null) {
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            if (streamMaxVolume != 0) {
                f = streamVolume / streamMaxVolume;
            }
        }
        hashMap.put("device_volume", String.valueOf(f));
        o13Var.a("volume", hashMap);
    }

    @Override // defpackage.y03
    public final void loadData(String str, String str2, String str3) {
        this.P.loadData(str, "text/html", str3);
    }

    @Override // defpackage.y03
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.P.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // defpackage.y03
    public final void loadUrl(String str) {
        this.P.loadUrl(str);
    }

    @Override // defpackage.aj2
    public final void m(String str) {
        ((o13) this.P).R0(str);
    }

    @Override // defpackage.y03
    public final WebView m0() {
        return (WebView) this.P;
    }

    @Override // defpackage.c23
    public final void n0(String str, int i, boolean z, boolean z2) {
        this.P.n0(str, i, z, z2);
    }

    @Override // defpackage.y03, defpackage.gy2
    public final ka2 o() {
        return this.P.o();
    }

    @Override // defpackage.y03
    public final hw o0() {
        return this.P.o0();
    }

    @Override // defpackage.y03
    public final void onPause() {
        sx2 sx2Var;
        wx2 wx2Var = this.Q;
        wx2Var.getClass();
        uf0.b("onPause must be called from the UI thread.");
        vx2 vx2Var = wx2Var.d;
        if (vx2Var != null && (sx2Var = vx2Var.V) != null) {
            sx2Var.t();
        }
        this.P.onPause();
    }

    @Override // defpackage.y03
    public final void onResume() {
        this.P.onResume();
    }

    @Override // defpackage.pi2
    public final void p(String str, JSONObject jSONObject) {
        this.P.p(str, jSONObject);
    }

    @Override // defpackage.y03
    public final void p0() {
        setBackgroundColor(0);
        this.P.setBackgroundColor(0);
    }

    @Override // defpackage.y03, defpackage.gy2
    public final q13 q() {
        return this.P.q();
    }

    @Override // defpackage.gy2
    public final String q0() {
        return this.P.q0();
    }

    @Override // defpackage.y03, defpackage.e23
    public final rz1 r() {
        return this.P.r();
    }

    @Override // defpackage.c23
    public final void r0(tw2 tw2Var, boolean z) {
        this.P.r0(tw2Var, z);
    }

    @Override // defpackage.oi3
    public final void s() {
        y03 y03Var = this.P;
        if (y03Var != null) {
            y03Var.s();
        }
    }

    @Override // defpackage.y03
    public final Context s0() {
        return this.P.s0();
    }

    @Override // android.view.View, defpackage.y03
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.P.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, defpackage.y03
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.P.setOnTouchListener(onTouchListener);
    }

    @Override // defpackage.y03
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.P.setWebChromeClient(webChromeClient);
    }

    @Override // defpackage.y03
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.P.setWebViewClient(webViewClient);
    }

    @Override // defpackage.gy2
    public final wx2 t() {
        return this.Q;
    }

    @Override // defpackage.y03
    public final dz4 t0() {
        return this.P.t0();
    }

    @Override // defpackage.gy2
    public final void u() {
        this.P.u();
    }

    @Override // defpackage.y03
    public final void u0() {
        this.P.u0();
    }

    @Override // defpackage.y03, defpackage.gy2
    public final void v(String str, oz2 oz2Var) {
        this.P.v(str, oz2Var);
    }

    @Override // defpackage.c23
    public final void v0(int i, String str, String str2, boolean z, boolean z2) {
        this.P.v0(i, str, str2, z, z2);
    }

    @Override // defpackage.oi3
    public final void w() {
        y03 y03Var = this.P;
        if (y03Var != null) {
            y03Var.w();
        }
    }

    @Override // defpackage.y03
    public final void w0(boolean z) {
        this.P.w0(z);
    }

    @Override // defpackage.y03, defpackage.g23
    public final View x() {
        return this;
    }

    @Override // defpackage.gy2
    public final void x0() {
    }

    @Override // defpackage.y03, defpackage.gy2
    public final void y(q13 q13Var) {
        this.P.y(q13Var);
    }

    @Override // defpackage.y03
    public final boolean y0() {
        return this.P.y0();
    }

    @Override // defpackage.y03, defpackage.p03
    public final yh4 z() {
        return this.P.z();
    }

    @Override // defpackage.y03
    public final WebViewClient z0() {
        return this.P.z0();
    }
}