package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@SuppressLint({"ViewConstructor"})
/* renamed from: o13 */
public final class o13 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, y03 {
    public static final /* synthetic */ int N0 = 0;
    public ja2 A0;
    public final ka2 B0;
    public int C0;
    public qn5 D0;
    public boolean E0;
    public final o33 F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public HashMap K0;
    public final WindowManager L0;
    public final j52 M0;
    public final j23 P;
    public final rz1 Q;
    public final va2 R;
    public final xv2 S;
    public yn5 T;
    public final uj1 U;
    public final DisplayMetrics V;
    public final float W;
    public yh4 a0;
    public ci4 b0;
    public boolean c0;
    public boolean d0;
    public g13 e0;
    public qn5 f0;
    public hw g0;
    public k23 h0;
    public final String i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public Boolean n0;
    public boolean o0;
    public final String p0;
    public q13 q0;
    public boolean r0;
    public boolean s0;
    public mc2 t0;
    public kc2 u0;
    public z32 v0;
    public int w0;
    public int x0;
    public ja2 y0;
    public final ja2 z0;

    public o13(j23 j23Var, k23 k23Var, String str, boolean z, rz1 rz1Var, va2 va2Var, xv2 xv2Var, yn5 yn5Var, uj1 uj1Var, j52 j52Var, yh4 yh4Var, ci4 ci4Var) {
        super(j23Var);
        ci4 ci4Var2;
        String str2;
        ca2 ca2Var;
        this.c0 = false;
        this.d0 = false;
        this.o0 = true;
        this.p0 = "";
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.P = j23Var;
        this.h0 = k23Var;
        this.i0 = str;
        this.l0 = z;
        this.Q = rz1Var;
        this.R = va2Var;
        this.S = xv2Var;
        this.T = yn5Var;
        this.U = uj1Var;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.L0 = windowManager;
        cu5 cu5Var = jv5.A.c;
        DisplayMetrics B = cu5.B(windowManager);
        this.V = B;
        this.W = B.density;
        this.M0 = j52Var;
        this.a0 = yh4Var;
        this.b0 = ci4Var;
        this.F0 = new o33(j23Var.a, this, this);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            sv2.e("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            if (((Boolean) w82.d.c.a(x92.Y8)).booleanValue()) {
                settings.setMixedContentMode(1);
            } else {
                settings.setMixedContentMode(2);
            }
        }
        jv5 jv5Var = jv5.A;
        settings.setUserAgentString(jv5Var.c.r(j23Var, xv2Var.P));
        final Context context = getContext();
        lx2.a(context, new Callable() { // from class: no5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                wi4 wi4Var = cu5.i;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) w82.d.c.a(x92.x0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        T0();
        addJavascriptInterface(new t13(this, new wk1(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        ka2 ka2Var = this.B0;
        if (ka2Var != null) {
            la2 la2Var = (la2) ka2Var.Q;
            yu2 yu2Var = jv5Var.g;
            synchronized (yu2Var.a) {
                ca2Var = yu2Var.h;
            }
            if (ca2Var != null) {
                ca2Var.a.offer(la2Var);
            }
        }
        la2 la2Var2 = new la2(this.i0);
        ka2 ka2Var2 = new ka2(la2Var2);
        this.B0 = ka2Var2;
        synchronized (la2Var2.c) {
        }
        if (((Boolean) w82.d.c.a(x92.x1)).booleanValue() && (ci4Var2 = this.b0) != null && (str2 = ci4Var2.b) != null) {
            la2Var2.b("gqi", str2);
        }
        ja2 d = la2.d();
        this.z0 = d;
        ((Map) ka2Var2.P).put("native:view_create", d);
        Context context2 = null;
        this.A0 = null;
        this.y0 = null;
        if (d03.b == null) {
            d03.b = new d03();
        }
        d03 d03Var = d03.b;
        d03Var.getClass();
        vz3.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(j23Var);
        if (!defaultUserAgent.equals(d03Var.a)) {
            AtomicBoolean atomicBoolean = ot.a;
            try {
                context2 = j23Var.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (context2 == null) {
                j23Var.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(j23Var)).apply();
            }
            d03Var.a = defaultUserAgent;
        }
        vz3.k("User agent is updated.");
        jv5Var.g.j.incrementAndGet();
    }

    @Override // defpackage.gy2
    public final synchronized oz2 A(String str) {
        HashMap hashMap = this.K0;
        if (hashMap == null) {
            return null;
        }
        return (oz2) hashMap.get(str);
    }

    @Override // defpackage.y03
    public final synchronized void A0(k23 k23Var) {
        this.h0 = k23Var;
        requestLayout();
    }

    @Override // defpackage.aj2
    public final void B(String str, String str2) {
        R0(str + "(" + str2 + ");");
    }

    @Override // defpackage.y03
    public final void B0() {
        throw null;
    }

    @Override // defpackage.y03, defpackage.r13
    public final ci4 C() {
        return this.b0;
    }

    @Override // defpackage.y03
    public final void C0(String str, mg2 mg2Var) {
        g13 g13Var = this.e0;
        if (g13Var != null) {
            synchronized (g13Var.S) {
                List list = (List) g13Var.R.get(str);
                if (list != null) {
                    list.remove(mg2Var);
                }
            }
        }
    }

    @Override // defpackage.y03
    public final synchronized boolean D() {
        return this.j0;
    }

    @Override // defpackage.y03
    public final void D0(String str, mg2 mg2Var) {
        g13 g13Var = this.e0;
        if (g13Var != null) {
            g13Var.u(str, mg2Var);
        }
    }

    @Override // defpackage.gy2
    public final synchronized void E() {
        kc2 kc2Var = this.u0;
        if (kc2Var != null) {
            cu5.i.post(new k52(2, (so3) kc2Var));
        }
    }

    @Override // defpackage.c23
    public final void E0(int i, boolean z, boolean z2) {
        boolean z3;
        vj1 vj1Var;
        oi3 oi3Var;
        g13 g13Var = this.e0;
        boolean f = g13.f(g13Var.P.V(), g13Var.P);
        if (!f && z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (f) {
            vj1Var = null;
        } else {
            vj1Var = g13Var.T;
        }
        zp5 zp5Var = g13Var.U;
        b16 b16Var = g13Var.f0;
        y03 y03Var = g13Var.P;
        xv2 k = y03Var.k();
        if (z3) {
            oi3Var = null;
        } else {
            oi3Var = g13Var.Z;
        }
        g13Var.t(new AdOverlayInfoParcel(vj1Var, zp5Var, b16Var, y03Var, z, i, k, oi3Var));
    }

    @Override // defpackage.y03
    public final synchronized void F(mc2 mc2Var) {
        this.t0 = mc2Var;
    }

    @Override // defpackage.y03
    public final synchronized void F0() {
        vz3.k("Destroying WebView!");
        synchronized (this) {
            if (!this.E0) {
                this.E0 = true;
                jv5.A.g.j.decrementAndGet();
            }
        }
        cu5.i.post(new gh4(2, this));
    }

    @Override // defpackage.y03
    public final void G(Context context) {
        this.P.setBaseContext(context);
        this.F0.b = this.P.a;
    }

    @Override // defpackage.y03
    public final synchronized void G0(qf4 qf4Var) {
        this.v0 = qf4Var;
    }

    @Override // defpackage.gy2
    public final void H(int i) {
    }

    @Override // defpackage.gy2
    public final synchronized void H0(int i) {
        this.C0 = i;
    }

    @Override // defpackage.y03
    public final void I(yh4 yh4Var, ci4 ci4Var) {
        this.a0 = yh4Var;
        this.b0 = ci4Var;
    }

    @Override // defpackage.y03
    public final synchronized void I0(qn5 qn5Var) {
        this.f0 = qn5Var;
    }

    @Override // defpackage.vj1
    public final void J() {
        g13 g13Var = this.e0;
        if (g13Var != null) {
            g13Var.J();
        }
    }

    @Override // defpackage.y03
    public final void J0(boolean z) {
        this.e0.o0 = z;
    }

    @Override // defpackage.gy2
    public final void K() {
        this.e0.a0 = false;
    }

    @Override // defpackage.y03
    public final boolean K0(final int i, final boolean z) {
        destroy();
        this.M0.a(new i52() { // from class: m13
            @Override // defpackage.i52
            public final void j(t62 t62Var) {
                boolean z2 = z;
                int i2 = i;
                int i3 = o13.N0;
                h92 w = i92.w();
                if (((i92) w.Q).A() != z2) {
                    w.j();
                    i92.y((i92) w.Q, z2);
                }
                w.j();
                i92.z((i92) w.Q, i2);
                t62Var.j();
                u62.I((u62) t62Var.Q, (i92) w.h());
            }
        });
        this.M0.b(10003);
        return true;
    }

    @Override // defpackage.y03, defpackage.gy2
    public final synchronized k23 L() {
        return this.h0;
    }

    @Override // defpackage.y03
    public final void L0() {
        ea2.B((la2) this.B0.Q, this.z0, "aeh2");
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.S.P);
        a("onhide", hashMap);
    }

    @Override // defpackage.y03
    public final synchronized z32 M() {
        return this.v0;
    }

    @Override // defpackage.aj2
    public final void M0(String str, JSONObject jSONObject) {
        B(str, jSONObject.toString());
    }

    @Override // defpackage.y03
    public final synchronized qn5 N() {
        return this.f0;
    }

    @Override // defpackage.y03
    public final synchronized void N0(qn5 qn5Var) {
        this.D0 = qn5Var;
    }

    @Override // defpackage.y03
    public final synchronized qn5 O() {
        return this.D0;
    }

    @Override // defpackage.y03
    public final void O0(int i) {
        if (i == 0) {
            ea2.B((la2) this.B0.Q, this.z0, "aebb2");
        }
        ea2.B((la2) this.B0.Q, this.z0, "aeh2");
        this.B0.getClass();
        ((la2) this.B0.Q).b("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.S.P);
        a("onhide", hashMap);
    }

    @Override // defpackage.gy2
    public final void P() {
    }

    @Override // defpackage.y03
    public final synchronized void P0(boolean z) {
        int i;
        qn5 qn5Var;
        int i2 = this.w0;
        if (true != z) {
            i = -1;
        } else {
            i = 1;
        }
        int i3 = i2 + i;
        this.w0 = i3;
        if (i3 <= 0 && (qn5Var = this.f0) != null) {
            synchronized (qn5Var.c0) {
                qn5Var.e0 = true;
                uz3 uz3Var = qn5Var.d0;
                if (uz3Var != null) {
                    wi4 wi4Var = cu5.i;
                    wi4Var.removeCallbacks(uz3Var);
                    wi4Var.post(qn5Var.d0);
                }
            }
        }
    }

    @Override // defpackage.y03
    public final synchronized void Q(kc2 kc2Var) {
        this.u0 = kc2Var;
    }

    @Override // defpackage.y03
    public final /* synthetic */ g13 R() {
        return this.e0;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(String str) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        synchronized (this) {
            bool = this.n0;
        }
        if (bool == null) {
            synchronized (this) {
                jv5 jv5Var = jv5.A;
                yu2 yu2Var = jv5Var.g;
                synchronized (yu2Var.a) {
                    bool3 = yu2Var.i;
                }
                this.n0 = bool3;
                if (bool3 == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        Boolean bool4 = Boolean.TRUE;
                        synchronized (this) {
                            this.n0 = bool4;
                            yu2 yu2Var2 = jv5Var.g;
                            synchronized (yu2Var2.a) {
                                yu2Var2.i = bool4;
                            }
                        }
                    } catch (IllegalStateException unused) {
                        Boolean bool5 = Boolean.FALSE;
                        synchronized (this) {
                            this.n0 = bool5;
                            yu2 yu2Var3 = jv5.A.g;
                            synchronized (yu2Var3.a) {
                                yu2Var3.i = bool5;
                            }
                        }
                    }
                    if (!bool2.booleanValue()) {
                        synchronized (this) {
                            if (!c0()) {
                                evaluateJavascript(str, null);
                            } else {
                                sv2.g("#004 The webview is destroyed. Ignoring action.");
                            }
                        }
                        return;
                    }
                    String concat = "javascript:".concat(str);
                    synchronized (this) {
                        if (!c0()) {
                            loadUrl(concat);
                        } else {
                            sv2.g("#004 The webview is destroyed. Ignoring action.");
                        }
                    }
                    return;
                }
            }
        }
        synchronized (this) {
            bool2 = this.n0;
            if (!bool2.booleanValue()) {
            }
        }
    }

    @Override // defpackage.y03
    public final synchronized void S(int i) {
        qn5 qn5Var = this.f0;
        if (qn5Var != null) {
            qn5Var.x4(i);
        }
    }

    public final boolean S0() {
        boolean z;
        int i;
        int i2;
        boolean z2;
        g13 g13Var = this.e0;
        synchronized (g13Var.S) {
            z = g13Var.c0;
        }
        boolean z3 = false;
        if (!z) {
            g13 g13Var2 = this.e0;
            synchronized (g13Var2.S) {
                z2 = g13Var2.d0;
            }
            if (!z2) {
                return false;
            }
        }
        mv2 mv2Var = n62.f.a;
        DisplayMetrics displayMetrics = this.V;
        int round = Math.round(displayMetrics.widthPixels / displayMetrics.density);
        DisplayMetrics displayMetrics2 = this.V;
        int round2 = Math.round(displayMetrics2.heightPixels / displayMetrics2.density);
        Activity activity = this.P.a;
        if (activity != null && activity.getWindow() != null) {
            cu5 cu5Var = jv5.A.c;
            int[] i3 = cu5.i(activity);
            i = Math.round(i3[0] / this.V.density);
            i2 = Math.round(i3[1] / this.V.density);
        } else {
            i = round;
            i2 = round2;
        }
        int i4 = this.H0;
        if (i4 == round && this.G0 == round2 && this.I0 == i && this.J0 == i2) {
            return false;
        }
        z3 = (i4 == round && this.G0 == round2) ? true : true;
        this.H0 = round;
        this.G0 = round2;
        this.I0 = i;
        this.J0 = i2;
        try {
            p("onScreenInfoChanged", new JSONObject().put("width", round).put("height", round2).put("maxSizeWidth", i).put("maxSizeHeight", i2).put("density", this.V.density).put("rotation", this.L0.getDefaultDisplay().getRotation()));
        } catch (JSONException e) {
            sv2.e("Error occurred while obtaining screen information.", e);
        }
        return z3;
    }

    @Override // defpackage.y03
    public final synchronized void T(boolean z) {
        boolean z2;
        qn5 qn5Var = this.f0;
        if (qn5Var != null) {
            g13 g13Var = this.e0;
            synchronized (g13Var.S) {
                z2 = g13Var.c0;
            }
            qn5Var.w4(z2, z);
            return;
        }
        this.j0 = z;
    }

    public final synchronized void T0() {
        yh4 yh4Var = this.a0;
        if (yh4Var != null && yh4Var.m0) {
            sv2.b("Disabling hardware acceleration on an overlay.");
            synchronized (this) {
                if (!this.m0) {
                    setLayerType(1, null);
                }
                this.m0 = true;
            }
            return;
        }
        if (!this.l0 && !this.h0.b()) {
            sv2.b("Enabling hardware acceleration on an AdView.");
            synchronized (this) {
                if (this.m0) {
                    setLayerType(0, null);
                }
                this.m0 = false;
            }
            return;
        }
        sv2.b("Enabling hardware acceleration on an overlay.");
        synchronized (this) {
            if (this.m0) {
                setLayerType(0, null);
            }
            this.m0 = false;
        }
    }

    @Override // defpackage.gy2
    public final synchronized String U() {
        ci4 ci4Var = this.b0;
        if (ci4Var != null) {
            return ci4Var.b;
        }
        return null;
    }

    public final void U0(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        a("onAdVisibilityChanged", hashMap);
    }

    @Override // defpackage.y03
    public final synchronized boolean V() {
        return this.l0;
    }

    public final synchronized void V0() {
        HashMap hashMap = this.K0;
        if (hashMap != null) {
            for (oz2 oz2Var : hashMap.values()) {
                oz2Var.b();
            }
        }
        this.K0 = null;
    }

    @Override // defpackage.y03
    public final void W() {
        if (this.A0 == null) {
            this.B0.getClass();
            ja2 d = la2.d();
            this.A0 = d;
            ((Map) this.B0.P).put("native:view_load", d);
        }
    }

    @Override // defpackage.y03
    public final synchronized void X(String str, String str2) {
        String str3;
        if (!c0()) {
            String[] strArr = new String[1];
            String str4 = (String) w82.d.c.a(x92.J);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str4);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                sv2.h("Unable to build MRAID_ENV", e);
                str3 = null;
            }
            strArr[0] = str3;
            super.loadDataWithBaseURL(str, d23.a(str2, strArr), "text/html", "UTF-8", null);
            return;
        }
        sv2.g("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // defpackage.y03
    public final synchronized boolean Y() {
        return this.w0 > 0;
    }

    @Override // defpackage.gy2
    public final void Z(long j, boolean z) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        a("onCacheAccessComplete", hashMap);
    }

    @Override // defpackage.pi2
    public final void a(String str, Map map) {
        try {
            p(str, n62.f.a.g(map));
        } catch (JSONException unused) {
            sv2.g("Could not convert parameters to JSON.");
        }
    }

    @Override // defpackage.y03
    public final synchronized String a0() {
        return this.i0;
    }

    @Override // defpackage.yn5
    public final synchronized void b() {
        yn5 yn5Var = this.T;
        if (yn5Var != null) {
            yn5Var.b();
        }
    }

    @Override // defpackage.y03
    public final synchronized void b0(boolean z) {
        e25 e25Var;
        int i = 0;
        if (z) {
            setBackgroundColor(0);
        }
        qn5 qn5Var = this.f0;
        if (qn5Var != null) {
            if (z) {
                e25Var = qn5Var.a0;
            } else {
                e25Var = qn5Var.a0;
                i = -16777216;
            }
            e25Var.setBackgroundColor(i);
        }
    }

    @Override // defpackage.c23
    public final void c(co2 co2Var, r04 r04Var, zr3 zr3Var, wl4 wl4Var, String str, String str2) {
        g13 g13Var = this.e0;
        y03 y03Var = g13Var.P;
        g13Var.t(new AdOverlayInfoParcel(y03Var, y03Var.k(), co2Var, r04Var, zr3Var, wl4Var, str, str2));
    }

    @Override // defpackage.y03
    public final synchronized boolean c0() {
        return this.k0;
    }

    @Override // defpackage.y03
    public final synchronized mc2 d0() {
        return this.t0;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0041 A[Catch: all -> 0x00ba, TryCatch #4 {, blocks: (B:65:0x0001, B:74:0x001b, B:89:0x0046, B:91:0x004a, B:92:0x0054, B:96:0x006b, B:98:0x008a, B:99:0x0094, B:105:0x00aa, B:111:0x00b0, B:77:0x0026, B:79:0x002a, B:87:0x0041, B:88:0x0044, B:82:0x0033, B:85:0x003b, B:68:0x0006, B:69:0x0010, B:73:0x0016, B:70:0x0011, B:71:0x0013, B:104:0x009c), top: B:121:0x0001 }] */
    @Override // android.webkit.WebView, defpackage.y03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void destroy() {
        ca2 ca2Var;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        ka2 ka2Var = this.B0;
        if (ka2Var != null) {
            la2 la2Var = (la2) ka2Var.Q;
            yu2 yu2Var = jv5.A.g;
            synchronized (yu2Var.a) {
                ca2Var = yu2Var.h;
            }
            if (ca2Var != null) {
                ca2Var.a.offer(la2Var);
            }
        }
        o33 o33Var = this.F0;
        o33Var.e = false;
        Activity activity = o33Var.b;
        if (activity != null && o33Var.c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = o33Var.f;
            Window window = activity.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                viewTreeObserver = decorView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                o33Var.c = false;
            }
            viewTreeObserver = null;
            if (viewTreeObserver != null) {
            }
            o33Var.c = false;
        }
        qn5 qn5Var = this.f0;
        if (qn5Var != null) {
            qn5Var.c();
            this.f0.n();
            this.f0 = null;
        }
        this.g0 = null;
        this.e0.l();
        this.v0 = null;
        this.T = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.k0) {
            return;
        }
        jv5.A.y.g(this);
        V0();
        this.k0 = true;
        if (((Boolean) w82.d.c.a(x92.u8)).booleanValue()) {
            vz3.k("Initiating WebView self destruct sequence in 3...");
            vz3.k("Loading blank page in WebView, 2...");
            synchronized (this) {
                try {
                    super.loadUrl("about:blank");
                } catch (Throwable th) {
                    jv5.A.g.f("AdWebViewImpl.loadUrlUnsafe", th);
                    sv2.h("Could not call loadUrl in destroy(). ", th);
                }
            }
            return;
        }
        vz3.k("Destroying the WebView immediately...");
        F0();
    }

    @Override // defpackage.gy2
    public final synchronized int e() {
        return this.C0;
    }

    @Override // defpackage.y03
    public final void e0(String str, vi2 vi2Var) {
        boolean z;
        g13 g13Var = this.e0;
        if (g13Var != null) {
            synchronized (g13Var.S) {
                List<mg2> list = (List) g13Var.R.get(str);
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (mg2 mg2Var : list) {
                        mg2 mg2Var2 = (mg2) vi2Var.Q;
                        if ((mg2Var instanceof yi2) && ((yi2) mg2Var).P.equals(mg2Var2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(mg2Var);
                        }
                    }
                    list.removeAll(arrayList);
                }
            }
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!c0()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        sv2.i("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // defpackage.gy2
    public final int f() {
        return getMeasuredWidth();
    }

    @Override // defpackage.y03
    public final void f0() {
        if (this.y0 == null) {
            ea2.B((la2) this.B0.Q, this.z0, "aes2");
            this.B0.getClass();
            ja2 d = la2.d();
            this.y0 = d;
            ((Map) this.B0.P).put("native:view_show", d);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.S.P);
        a("onshow", hashMap);
    }

    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.k0) {
                    this.e0.l();
                    jv5 jv5Var = jv5.A;
                    jv5Var.y.g(this);
                    V0();
                    synchronized (this) {
                        if (!this.E0) {
                            this.E0 = true;
                            jv5Var.g.j.decrementAndGet();
                        }
                    }
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // defpackage.y03, defpackage.u13, defpackage.gy2
    public final Activity g() {
        return this.P.a;
    }

    @Override // defpackage.gy2
    public final int h() {
        return getMeasuredHeight();
    }

    @Override // defpackage.s22
    public final void h0(r22 r22Var) {
        boolean z;
        synchronized (this) {
            z = r22Var.j;
            this.r0 = z;
        }
        U0(z);
    }

    @Override // defpackage.yn5
    public final synchronized void i() {
        yn5 yn5Var = this.T;
        if (yn5Var != null) {
            yn5Var.i();
        }
    }

    @Override // defpackage.y03
    public final synchronized void i0(boolean z) {
        this.o0 = z;
    }

    @Override // defpackage.y03, defpackage.gy2
    public final uj1 j() {
        return this.U;
    }

    @Override // defpackage.y03
    public final synchronized void j0(hw hwVar) {
        this.g0 = hwVar;
    }

    @Override // defpackage.y03, defpackage.f23, defpackage.gy2
    public final xv2 k() {
        return this.S;
    }

    @Override // defpackage.y03
    public final boolean k0() {
        return false;
    }

    @Override // defpackage.gy2
    public final ja2 l() {
        return this.z0;
    }

    @Override // defpackage.y03
    public final void l0() {
        throw null;
    }

    @Override // android.webkit.WebView, defpackage.y03
    public final synchronized void loadData(String str, String str2, String str3) {
        if (c0()) {
            sv2.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, defpackage.y03
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (c0()) {
            sv2.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, defpackage.y03
    public final synchronized void loadUrl(String str) {
        if (!c0()) {
            super.loadUrl(str);
        } else {
            sv2.g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // defpackage.aj2
    public final void m(String str) {
        throw null;
    }

    @Override // defpackage.y03
    public final WebView m0() {
        return this;
    }

    @Override // defpackage.c23
    public final void n0(String str, int i, boolean z, boolean z2) {
        boolean z3;
        vj1 vj1Var;
        f13 f13Var;
        oi3 oi3Var;
        g13 g13Var = this.e0;
        boolean V = g13Var.P.V();
        boolean f = g13.f(V, g13Var.P);
        if (!f && z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (f) {
            vj1Var = null;
        } else {
            vj1Var = g13Var.T;
        }
        if (V) {
            f13Var = null;
        } else {
            f13Var = new f13(g13Var.P, g13Var.U);
        }
        cf2 cf2Var = g13Var.X;
        ef2 ef2Var = g13Var.Y;
        b16 b16Var = g13Var.f0;
        y03 y03Var = g13Var.P;
        xv2 k = y03Var.k();
        if (z3) {
            oi3Var = null;
        } else {
            oi3Var = g13Var.Z;
        }
        g13Var.t(new AdOverlayInfoParcel(vj1Var, f13Var, cf2Var, ef2Var, b16Var, y03Var, z, i, str, k, oi3Var));
    }

    @Override // defpackage.y03, defpackage.gy2
    public final ka2 o() {
        return this.B0;
    }

    @Override // defpackage.y03
    public final synchronized hw o0() {
        return this.g0;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        boolean z2 = true;
        if (!c0()) {
            o33 o33Var = this.F0;
            o33Var.d = true;
            if (o33Var.e) {
                o33Var.a();
            }
        }
        boolean z3 = this.r0;
        g13 g13Var = this.e0;
        if (g13Var != null) {
            synchronized (g13Var.S) {
                z = g13Var.d0;
            }
            if (z) {
                if (!this.s0) {
                    synchronized (this.e0.S) {
                    }
                    synchronized (this.e0.S) {
                    }
                    this.s0 = true;
                }
                S0();
                U0(z2);
            }
        }
        z2 = z3;
        U0(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        g13 g13Var;
        boolean z;
        View decorView;
        synchronized (this) {
            try {
                if (!c0()) {
                    o33 o33Var = this.F0;
                    o33Var.d = false;
                    Activity activity = o33Var.b;
                    if (activity != null && o33Var.c) {
                        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = o33Var.f;
                        Window window = activity.getWindow();
                        ViewTreeObserver viewTreeObserver = null;
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            viewTreeObserver = decorView.getViewTreeObserver();
                        }
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                        }
                        o33Var.c = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.s0 && (g13Var = this.e0) != null) {
                    synchronized (g13Var.S) {
                        z = g13Var.d0;
                    }
                    if (z && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                        synchronized (this.e0.S) {
                        }
                        synchronized (this.e0.S) {
                        }
                        this.s0 = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        U0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            cu5 cu5Var = jv5.A.c;
            cu5.l(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            sv2.b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (c0()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean S0 = S0();
        qn5 N = N();
        if (N != null && S0 && N.b0) {
            N.b0 = false;
            N.S.f0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:233:0x013d A[Catch: all -> 0x01e5, TryCatch #0 {, blocks: (B:137:0x0001, B:139:0x0008, B:142:0x000d, B:144:0x0013, B:146:0x0017, B:157:0x002d, B:165:0x003a, B:167:0x004c, B:170:0x0051, B:172:0x0058, B:176:0x0062, B:179:0x0067, B:182:0x0079, B:190:0x0090, B:184:0x0080, B:187:0x0085, B:198:0x00a5, B:200:0x00b7, B:203:0x00bc, B:205:0x00d8, B:207:0x00e1, B:206:0x00dd, B:210:0x00e6, B:212:0x00ec, B:215:0x00f7, B:224:0x011d, B:226:0x0123, B:231:0x012b, B:233:0x013d, B:235:0x014b, B:239:0x0158, B:242:0x015d, B:244:0x01a8, B:245:0x01ab, B:247:0x01b2, B:252:0x01bf, B:254:0x01c5, B:255:0x01c8, B:257:0x01cc, B:258:0x01d5, B:261:0x01e0), top: B:267:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x015d A[Catch: all -> 0x01e5, TryCatch #0 {, blocks: (B:137:0x0001, B:139:0x0008, B:142:0x000d, B:144:0x0013, B:146:0x0017, B:157:0x002d, B:165:0x003a, B:167:0x004c, B:170:0x0051, B:172:0x0058, B:176:0x0062, B:179:0x0067, B:182:0x0079, B:190:0x0090, B:184:0x0080, B:187:0x0085, B:198:0x00a5, B:200:0x00b7, B:203:0x00bc, B:205:0x00d8, B:207:0x00e1, B:206:0x00dd, B:210:0x00e6, B:212:0x00ec, B:215:0x00f7, B:224:0x011d, B:226:0x0123, B:231:0x012b, B:233:0x013d, B:235:0x014b, B:239:0x0158, B:242:0x015d, B:244:0x01a8, B:245:0x01ab, B:247:0x01b2, B:252:0x01bf, B:254:0x01c5, B:255:0x01c8, B:257:0x01cc, B:258:0x01d5, B:261:0x01e0), top: B:267:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01bf A[Catch: all -> 0x01e5, TRY_ENTER, TryCatch #0 {, blocks: (B:137:0x0001, B:139:0x0008, B:142:0x000d, B:144:0x0013, B:146:0x0017, B:157:0x002d, B:165:0x003a, B:167:0x004c, B:170:0x0051, B:172:0x0058, B:176:0x0062, B:179:0x0067, B:182:0x0079, B:190:0x0090, B:184:0x0080, B:187:0x0085, B:198:0x00a5, B:200:0x00b7, B:203:0x00bc, B:205:0x00d8, B:207:0x00e1, B:206:0x00dd, B:210:0x00e6, B:212:0x00ec, B:215:0x00f7, B:224:0x011d, B:226:0x0123, B:231:0x012b, B:233:0x013d, B:235:0x014b, B:239:0x0158, B:242:0x015d, B:244:0x01a8, B:245:0x01ab, B:247:0x01b2, B:252:0x01bf, B:254:0x01c5, B:255:0x01c8, B:257:0x01cc, B:258:0x01d5, B:261:0x01e0), top: B:267:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        k23 k23Var;
        boolean z5;
        boolean z6;
        int size;
        float f;
        int i4;
        int i5;
        int i6 = 0;
        if (c0()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.l0) {
            k23 k23Var2 = this.h0;
            int i7 = k23Var2.a;
            if (i7 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (i7 == 5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    super.onMeasure(i, i2);
                    return;
                }
                if (i7 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (((Boolean) w82.d.c.a(x92.f3)).booleanValue()) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    q13 q = q();
                    if (q != null) {
                        f = q.b();
                    } else {
                        f = 0.0f;
                    }
                    if (f == 0.0f) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    int size2 = View.MeasureSpec.getSize(i);
                    int size3 = View.MeasureSpec.getSize(i2);
                    float f2 = size3 * f;
                    int i8 = (int) (size2 / f);
                    if (size3 == 0) {
                        if (i8 != 0) {
                            i5 = (int) (i8 * f);
                            i4 = i8;
                            setMeasuredDimension(Math.min(i5, size2), Math.min(i8, i4));
                            return;
                        }
                        size3 = 0;
                    }
                    int i9 = (int) f2;
                    if (size2 == 0) {
                        if (i9 != 0) {
                            i8 = (int) (i9 / f);
                            i4 = size3;
                            size2 = i9;
                            i5 = size2;
                            setMeasuredDimension(Math.min(i5, size2), Math.min(i8, i4));
                            return;
                        }
                    } else {
                        i6 = size2;
                    }
                    i4 = size3;
                    size2 = i6;
                    i5 = i9;
                    setMeasuredDimension(Math.min(i5, size2), Math.min(i8, i4));
                    return;
                }
                if (i7 == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    if (((Boolean) w82.d.c.a(x92.l3)).booleanValue()) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    D0("/contentHeight", new n13(this));
                    R0("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    float f3 = this.V.density;
                    int size4 = View.MeasureSpec.getSize(i);
                    int i10 = this.x0;
                    if (i10 != -1) {
                        size = (int) (i10 * f3);
                    } else {
                        size = View.MeasureSpec.getSize(i2);
                    }
                    setMeasuredDimension(size4, size);
                    return;
                } else if (k23Var2.b()) {
                    DisplayMetrics displayMetrics = this.V;
                    setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                    return;
                } else {
                    int mode = View.MeasureSpec.getMode(i);
                    int size5 = View.MeasureSpec.getSize(i);
                    int mode2 = View.MeasureSpec.getMode(i2);
                    int size6 = View.MeasureSpec.getSize(i2);
                    int i11 = Integer.MAX_VALUE;
                    if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                        i3 = Integer.MAX_VALUE;
                        if (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) {
                            i11 = size6;
                        }
                        k23Var = this.h0;
                        if (k23Var.c <= i3 && k23Var.b <= i11) {
                            z5 = false;
                            if (((Boolean) w82.d.c.a(x92.s4)).booleanValue()) {
                                k23 k23Var3 = this.h0;
                                float f4 = this.W;
                                if (k23Var3.c / f4 <= i3 / f4 && k23Var3.b / f4 <= i11 / f4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                z5 &= z6;
                            }
                            if (!z5) {
                                k23 k23Var4 = this.h0;
                                float f5 = this.W;
                                float f6 = k23Var4.c / f5;
                                float f7 = k23Var4.b / f5;
                                float f8 = size5 / f5;
                                float f9 = size6 / f5;
                                sv2.g("Not enough space to show ad. Needs " + ((int) f6) + "x" + ((int) f7) + " dp, but only has " + ((int) f8) + "x" + ((int) f9) + " dp.");
                                if (getVisibility() != 8) {
                                    setVisibility(4);
                                }
                                setMeasuredDimension(0, 0);
                                if (!this.c0) {
                                    this.M0.b(10001);
                                    this.c0 = true;
                                    return;
                                }
                                return;
                            }
                            if (getVisibility() != 8) {
                                setVisibility(0);
                            }
                            if (!this.d0) {
                                this.M0.b(10002);
                                this.d0 = true;
                            }
                            k23 k23Var5 = this.h0;
                            setMeasuredDimension(k23Var5.c, k23Var5.b);
                            return;
                        }
                        z5 = true;
                        if (((Boolean) w82.d.c.a(x92.s4)).booleanValue()) {
                        }
                        if (!z5) {
                        }
                    }
                    i3 = size5;
                    if (mode2 != Integer.MIN_VALUE) {
                    }
                    i11 = size6;
                    k23Var = this.h0;
                    if (k23Var.c <= i3) {
                        z5 = false;
                        if (((Boolean) w82.d.c.a(x92.s4)).booleanValue()) {
                        }
                        if (!z5) {
                        }
                    }
                    z5 = true;
                    if (((Boolean) w82.d.c.a(x92.s4)).booleanValue()) {
                    }
                    if (!z5) {
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, defpackage.y03
    public final void onPause() {
        if (c0()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            sv2.e("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, defpackage.y03
    public final void onResume() {
        if (c0()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            sv2.e("Could not resume webview.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0070  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        g13 g13Var = this.e0;
        synchronized (g13Var.S) {
            z = g13Var.d0;
        }
        if (z) {
            g13 g13Var2 = this.e0;
            synchronized (g13Var2.S) {
                z2 = g13Var2.e0;
            }
            if (!z2) {
                synchronized (this) {
                    mc2 mc2Var = this.t0;
                    if (mc2Var != null) {
                        mc2Var.g(motionEvent);
                    }
                }
                if (!c0()) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
        }
        rz1 rz1Var = this.Q;
        if (rz1Var != null) {
            rz1Var.b.b(motionEvent);
        }
        va2 va2Var = this.R;
        if (va2Var != null) {
            if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > va2Var.a.getEventTime()) {
                va2Var.a = MotionEvent.obtain(motionEvent);
            } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > va2Var.b.getEventTime()) {
                va2Var.b = MotionEvent.obtain(motionEvent);
            }
        }
        if (!c0()) {
        }
    }

    @Override // defpackage.pi2
    public final void p(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder b = sd1.b("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        sv2.b("Dispatching AFMA event: ".concat(b.toString()));
        R0(b.toString());
    }

    @Override // defpackage.y03
    public final void p0() {
        setBackgroundColor(0);
    }

    @Override // defpackage.y03, defpackage.gy2
    public final synchronized q13 q() {
        return this.q0;
    }

    @Override // defpackage.gy2
    public final synchronized String q0() {
        return this.p0;
    }

    @Override // defpackage.y03, defpackage.e23
    public final rz1 r() {
        return this.Q;
    }

    @Override // defpackage.c23
    public final void r0(tw2 tw2Var, boolean z) {
        this.e0.p(tw2Var, z);
    }

    @Override // defpackage.oi3
    public final void s() {
        g13 g13Var = this.e0;
        if (g13Var != null) {
            g13Var.s();
        }
    }

    @Override // defpackage.y03
    public final Context s0() {
        return this.P.c;
    }

    @Override // android.webkit.WebView, defpackage.y03
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof g13) {
            this.e0 = (g13) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (c0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            sv2.e("Could not stop loading webview.", e);
        }
    }

    @Override // defpackage.gy2
    public final wx2 t() {
        return null;
    }

    @Override // defpackage.y03
    public final dz4 t0() {
        va2 va2Var = this.R;
        return va2Var == null ? zw4.C(null) : va2Var.a();
    }

    @Override // defpackage.gy2
    public final void u() {
        qn5 N = N();
        if (N != null) {
            N.a0.Q = true;
        }
    }

    @Override // defpackage.y03
    public final void u0() {
        o33 o33Var = this.F0;
        o33Var.e = true;
        if (o33Var.d) {
            o33Var.a();
        }
    }

    @Override // defpackage.y03, defpackage.gy2
    public final synchronized void v(String str, oz2 oz2Var) {
        if (this.K0 == null) {
            this.K0 = new HashMap();
        }
        this.K0.put(str, oz2Var);
    }

    @Override // defpackage.c23
    public final void v0(int i, String str, String str2, boolean z, boolean z2) {
        boolean z3;
        vj1 vj1Var;
        f13 f13Var;
        oi3 oi3Var;
        g13 g13Var = this.e0;
        boolean V = g13Var.P.V();
        boolean f = g13.f(V, g13Var.P);
        if (!f && z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (f) {
            vj1Var = null;
        } else {
            vj1Var = g13Var.T;
        }
        if (V) {
            f13Var = null;
        } else {
            f13Var = new f13(g13Var.P, g13Var.U);
        }
        cf2 cf2Var = g13Var.X;
        ef2 ef2Var = g13Var.Y;
        b16 b16Var = g13Var.f0;
        y03 y03Var = g13Var.P;
        xv2 k = y03Var.k();
        if (z3) {
            oi3Var = null;
        } else {
            oi3Var = g13Var.Z;
        }
        g13Var.t(new AdOverlayInfoParcel(vj1Var, f13Var, cf2Var, ef2Var, b16Var, y03Var, z, i, str, str2, k, oi3Var));
    }

    @Override // defpackage.oi3
    public final void w() {
        g13 g13Var = this.e0;
        if (g13Var != null) {
            g13Var.w();
        }
    }

    @Override // defpackage.y03
    public final synchronized void w0(boolean z) {
        String str;
        boolean z2 = this.l0;
        this.l0 = z;
        T0();
        if (z != z2) {
            if (!((Boolean) w82.d.c.a(x92.K)).booleanValue() || !this.h0.b()) {
                if (true != z) {
                    str = "default";
                } else {
                    str = "expanded";
                }
                try {
                    p("onStateChanged", new JSONObject().put("state", str));
                } catch (JSONException e) {
                    sv2.e("Error occurred while dispatching state change.", e);
                }
            }
        }
    }

    @Override // defpackage.y03, defpackage.g23
    public final View x() {
        return this;
    }

    @Override // defpackage.gy2
    public final void x0() {
    }

    @Override // defpackage.y03, defpackage.gy2
    public final synchronized void y(q13 q13Var) {
        if (this.q0 != null) {
            sv2.d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.q0 = q13Var;
        }
    }

    @Override // defpackage.y03
    public final synchronized boolean y0() {
        return this.o0;
    }

    @Override // defpackage.y03, defpackage.p03
    public final yh4 z() {
        return this.a0;
    }

    @Override // defpackage.y03
    public final WebViewClient z0() {
        return this.e0;
    }
}