package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: ka1  reason: default package */
public class ka1 extends WebView {
    public final int P;
    public final rc1 Q;
    public int R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public String a0;
    public ic1 b0;
    public boolean c0;
    public ob1 d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;

    /* renamed from: ka1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class a extends WebChromeClient {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x0063, code lost:
            if (r6 != false) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x007e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
        @Override // android.webkit.WebChromeClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            ConsoleMessage.MessageLevel messageLevel;
            String message;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            rc1 message2;
            i2 interstitial;
            String str;
            ec1 ec1Var;
            boolean z6;
            boolean z7;
            ic1 ic1Var = null;
            if (consoleMessage == null) {
                messageLevel = null;
            } else {
                messageLevel = consoleMessage.messageLevel();
            }
            if (consoleMessage == null) {
                message = null;
            } else {
                message = consoleMessage.message();
            }
            if (message != null && lu0.D(message, "Viewport target-densitydpi is not supported.")) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (message != null && lu0.D(message, "Viewport argument key \"shrink-to-fit\" not recognized and ignored")) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    z2 = false;
                    if (messageLevel != ConsoleMessage.MessageLevel.ERROR) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (messageLevel != ConsoleMessage.MessageLevel.WARNING) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (message != null && lu0.D(message, "ADC3_update is not defined")) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        if (message != null && lu0.D(message, "NativeLayer.dispatch_messages is not a function")) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    ka1 ka1Var = ka1.this;
                    message2 = ka1Var.getMessage();
                    if (message2 != null) {
                        ic1Var = message2.b;
                    }
                    if (ic1Var == null) {
                        ic1Var = new ic1();
                    }
                    ka1Var.l(ic1Var, "Unable to communicate with AdColony. Please ensure that you have added an exception for our Javascript interface in your ProGuard configuration and that you do not have a faulty proxy enabled on your device.");
                    if (!z2 && (z4 || z3)) {
                        interstitial = ka1.this.getInterstitial();
                        if (interstitial != null) {
                            str = "unknown";
                        } else {
                            str = interstitial.g;
                            if (str == null) {
                                str = "";
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("onConsoleMessage: " + ((Object) message) + " with ad id: " + str);
                        if (!z3) {
                            ec1Var = ec1.d;
                        } else {
                            ec1Var = ec1.c;
                        }
                        ga1.h().n().d(0, ec1Var.a, sb.toString(), ec1Var.b);
                    }
                    return true;
                }
            }
            z2 = true;
            if (messageLevel != ConsoleMessage.MessageLevel.ERROR) {
            }
            if (messageLevel != ConsoleMessage.MessageLevel.WARNING) {
            }
            if (message != null) {
                z5 = true;
                if (!z5) {
                }
                ka1 ka1Var2 = ka1.this;
                message2 = ka1Var2.getMessage();
                if (message2 != null) {
                }
                if (ic1Var == null) {
                }
                ka1Var2.l(ic1Var, "Unable to communicate with AdColony. Please ensure that you have added an exception for our Javascript interface in your ProGuard configuration and that you do not have a faulty proxy enabled on your device.");
                if (!z2) {
                    interstitial = ka1.this.getInterstitial();
                    if (interstitial != null) {
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onConsoleMessage: " + ((Object) message) + " with ad id: " + str);
                    if (!z3) {
                    }
                    ga1.h().n().d(0, ec1Var.a, sb2.toString(), ec1Var.b);
                }
                return true;
            }
            z5 = false;
            if (!z5) {
            }
            ka1 ka1Var22 = ka1.this;
            message2 = ka1Var22.getMessage();
            if (message2 != null) {
            }
            if (ic1Var == null) {
            }
            ka1Var22.l(ic1Var, "Unable to communicate with AdColony. Please ensure that you have added an exception for our Javascript interface in your ProGuard configuration and that you do not have a faulty proxy enabled on your device.");
            if (!z2) {
            }
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (jsResult == null) {
                return true;
            }
            jsResult.confirm();
            return true;
        }
    }

    /* renamed from: ka1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            j21 j21Var;
            ic1 ic1Var = new ic1();
            eb1.l(ka1.this.R, ic1Var, "id");
            eb1.j(ic1Var, "url", str);
            ob1 parentContainer = ka1.this.getParentContainer();
            if (parentContainer == null) {
                j21Var = null;
            } else {
                eb1.j(ic1Var, "ad_session_id", ka1.this.getAdSessionId());
                eb1.l(parentContainer.b0, ic1Var, "container_id");
                new rc1(parentContainer.c0, ic1Var, "WebView.on_load").b();
                j21Var = j21.a;
            }
            if (j21Var == null) {
                new rc1(ka1.this.getWebViewModuleId(), ic1Var, "WebView.on_load").b();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            ka1.f(ka1.this, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z = true;
            if ((str == null || !lu0.E(str)) ? false : false) {
                String str2 = ka1.this.T;
                Charset charset = sc1.a;
                if (str2 != null) {
                    return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(str2.getBytes(charset)));
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            return null;
        }
    }

    /* renamed from: ka1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends b {
        public c() {
            super();
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            String uri;
            boolean z = true;
            if ((webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (uri = url.toString()) == null || !lu0.E(uri)) ? false : false) {
                String str = ka1.this.T;
                Charset charset = sc1.a;
                if (str != null) {
                    return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(str.getBytes(charset)));
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            return null;
        }

        @Override // defpackage.ka1.b, android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return null;
        }
    }

    /* renamed from: ka1$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d extends c {
        public d() {
            super();
        }

        @Override // defpackage.ka1.b, android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Uri url;
            if (webResourceError == null) {
                return;
            }
            ka1.f(ka1.this, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString());
        }
    }

    /* renamed from: ka1$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e extends d {
        public e(ka1 ka1Var) {
            super();
        }
    }

    /* renamed from: ka1$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f extends e {
        public f() {
            super(ka1.this);
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean z;
            if (renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ka1.this.l(new ic1(), "An error occurred while rendering the ad. Ad closing.");
            }
            return true;
        }
    }

    /* renamed from: ka1$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class g implements Runnable {
        public final /* synthetic */ os P;

        public g(os osVar) {
            this.P = osVar;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.P.a();
        }
    }

    public ka1(Context context, int i, rc1 rc1Var) {
        super(context);
        this.P = i;
        this.Q = rc1Var;
        this.S = "";
        this.T = "";
        this.U = "";
        this.V = "";
        this.W = "";
        this.a0 = "";
        this.b0 = new ic1();
    }

    public static final ka1 e(Context context, rc1 rc1Var, int i, ob1 ob1Var) {
        ka1 ka1Var;
        tc1 o = ga1.h().o();
        int i2 = o.b;
        o.b = i2 + 1;
        ic1 ic1Var = rc1Var.b;
        if (ic1Var.j("use_mraid_module")) {
            tc1 o2 = ga1.h().o();
            int i3 = o2.b;
            o2.b = i3 + 1;
            ka1Var = new ld1(context, i2, rc1Var, i3);
        } else if (ic1Var.j("enable_messages")) {
            ka1Var = new fb1(context, i2, rc1Var);
        } else {
            ka1Var = new ka1(context, i2, rc1Var);
        }
        ka1Var.i(rc1Var, i, ob1Var);
        ka1Var.o();
        return ka1Var;
    }

    public static final void f(ka1 ka1Var, int i, String str, String str2) {
        ob1 ob1Var = ka1Var.d0;
        if (ob1Var != null) {
            ic1 ic1Var = new ic1();
            eb1.l(ka1Var.R, ic1Var, "id");
            eb1.j(ic1Var, "ad_session_id", ka1Var.getAdSessionId());
            eb1.l(ob1Var.b0, ic1Var, "container_id");
            eb1.l(i, ic1Var, "code");
            eb1.j(ic1Var, "error", str);
            eb1.j(ic1Var, "url", str2);
            new rc1(ob1Var.c0, ic1Var, "WebView.on_error").b();
        }
        StringBuilder b2 = e5.b("onReceivedError: ");
        if (str == null) {
            str = "WebViewErrorMessage: null description";
        }
        b2.append(str);
        t1.b(0, 0, b2.toString(), true);
    }

    public static final void g(ka1 ka1Var, rc1 rc1Var, os osVar) {
        boolean z;
        String str;
        ka1Var.getClass();
        ic1 ic1Var = rc1Var.b;
        if (ic1Var.l("id") == ka1Var.R) {
            int l = ic1Var.l("container_id");
            ob1 ob1Var = ka1Var.d0;
            if (ob1Var != null && l == ob1Var.b0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String q = ic1Var.q("ad_session_id");
                ob1 ob1Var2 = ka1Var.d0;
                if (ob1Var2 == null) {
                    str = null;
                } else {
                    str = ob1Var2.d0;
                }
                if (hy.a(q, str)) {
                    eg1.n(new g(osVar));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTransparent(boolean z) {
        setBackgroundColor(z ? 0 : -1);
    }

    public final /* synthetic */ String getAdSessionId() {
        return this.W;
    }

    public final z1 getAdView() {
        return ga1.h().k().f.get(this.W);
    }

    public final /* synthetic */ String getBaseUrl() {
        return this.V;
    }

    public final int getCurrentHeight() {
        return this.h0;
    }

    public final int getCurrentWidth() {
        return this.g0;
    }

    public final int getCurrentX() {
        return this.e0;
    }

    public final int getCurrentY() {
        return this.f0;
    }

    public final /* synthetic */ boolean getDestroyed() {
        return this.c0;
    }

    public final /* synthetic */ ic1 getInfo() {
        return this.b0;
    }

    public final int getInitialHeight() {
        return this.l0;
    }

    public final int getInitialWidth() {
        return this.k0;
    }

    public final int getInitialX() {
        return this.i0;
    }

    public final int getInitialY() {
        return this.j0;
    }

    public final i2 getInterstitial() {
        return ga1.h().k().c.get(this.W);
    }

    public final /* synthetic */ String getMUrl() {
        return this.U;
    }

    public final /* synthetic */ rc1 getMessage() {
        return this.Q;
    }

    public final /* synthetic */ String getMraidFilepath() {
        return this.a0;
    }

    public final /* synthetic */ ob1 getParentContainer() {
        return this.d0;
    }

    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new c();
    }

    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new d();
    }

    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new e(this);
    }

    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new f();
    }

    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new b();
    }

    public final int getWebViewModuleId() {
        return this.P;
    }

    public void i(rc1 rc1Var, int i, ob1 ob1Var) {
        this.R = i;
        this.d0 = ob1Var;
        ic1 ic1Var = rc1Var.b;
        String o = eb1.o(ic1Var, "url");
        if (o == null) {
            o = ic1Var.q("data");
        }
        this.U = o;
        this.V = ic1Var.q("base_url");
        this.S = ic1Var.q("custom_js");
        this.W = ic1Var.q("ad_session_id");
        this.b0 = ic1Var.n("info");
        this.a0 = ic1Var.q("mraid_filepath");
        this.g0 = ic1Var.l("width");
        this.h0 = ic1Var.l("height");
        this.e0 = ic1Var.l("x");
        int l = ic1Var.l("y");
        this.f0 = l;
        this.k0 = this.g0;
        this.l0 = this.h0;
        this.i0 = this.e0;
        this.j0 = l;
        q();
        pb1 k = ga1.h().k();
        String str = this.W;
        ob1 ob1Var2 = this.d0;
        k.getClass();
        eg1.n(new wb1(k, str, this, ob1Var2));
    }

    public final void j(Exception exc) {
        t1.b(0, 0, exc.getClass().toString() + " during metadata injection w/ metadata = " + this.b0.q("metadata"), true);
        ob1 ob1Var = this.d0;
        if (ob1Var != null) {
            ic1 ic1Var = new ic1();
            eb1.j(ic1Var, "id", getAdSessionId());
            new rc1(ob1Var.c0, ic1Var, "AdSession.on_error").b();
        }
    }

    public final void k(String str) {
        if (this.c0) {
            t1.b(0, 3, "Ignoring call to execute_js as WebView has been destroyed.", true);
            return;
        }
        try {
            evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            ga1.h().n().d(0, 0, "Device reporting incorrect OS version, evaluateJavascript is not available. Disabling AdColony.", false);
            w1.d();
        }
    }

    public boolean l(ic1 ic1Var, String str) {
        ia1 ia1Var;
        Context context = ga1.P;
        if (context instanceof ia1) {
            ia1Var = (ia1) context;
        } else {
            ia1Var = null;
        }
        if (ia1Var == null) {
            return false;
        }
        ga1.h().k().getClass();
        pb1.b(ia1Var, ic1Var, str);
        return true;
    }

    public void m() {
        ArrayList<String> arrayList;
        ArrayList<zc1> arrayList2;
        ob1 ob1Var = this.d0;
        if (ob1Var != null && (arrayList2 = ob1Var.k0) != null) {
            la1 la1Var = new la1(this);
            ga1.g("WebView.execute_js", la1Var);
            arrayList2.add(la1Var);
            ma1 ma1Var = new ma1(this);
            ga1.g("WebView.set_visible", ma1Var);
            arrayList2.add(ma1Var);
            na1 na1Var = new na1(this);
            ga1.g("WebView.set_bounds", na1Var);
            arrayList2.add(na1Var);
            oa1 oa1Var = new oa1(this);
            ga1.g("WebView.set_transparent", oa1Var);
            arrayList2.add(oa1Var);
        }
        ob1 ob1Var2 = this.d0;
        if (ob1Var2 != null && (arrayList = ob1Var2.l0) != null) {
            arrayList.add("WebView.execute_js");
            arrayList.add("WebView.set_visible");
            arrayList.add("WebView.set_bounds");
            arrayList.add("WebView.set_transparent");
        }
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.g0, this.h0);
        layoutParams.setMargins(getCurrentX(), getCurrentY(), 0, 0);
        layoutParams.gravity = 0;
        ob1 ob1Var3 = this.d0;
        if (ob1Var3 != null) {
            ob1Var3.addView(this, layoutParams);
        }
    }

    public final String n() {
        i2 interstitial = getInterstitial();
        if (interstitial != null) {
            StringBuilder sb = new StringBuilder();
            String str = interstitial.g;
            if (str == null) {
                str = "";
            }
            sb.append((Object) str);
            sb.append(" : ");
            sb.append(interstitial.h);
            String sb2 = sb.toString();
            if (sb2 != null) {
                return sb2;
            }
        }
        return "unknown";
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void o() {
        WebViewClient webViewClientDefault;
        boolean z = true;
        setFocusable(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        int i = Build.VERSION.SDK_INT;
        WebView.setWebContentsDebuggingEnabled(false);
        setWebChromeClient(new a());
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setGeolocationEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        if (i >= 26) {
            webViewClientDefault = getWebViewClientApi26();
        } else if (i >= 24) {
            webViewClientDefault = getWebViewClientApi24();
        } else if (i >= 23) {
            webViewClientDefault = getWebViewClientApi23();
        } else if (i >= 21) {
            webViewClientDefault = getWebViewClientApi21();
        } else {
            webViewClientDefault = getWebViewClientDefault();
        }
        setWebViewClient(webViewClientDefault);
        p();
        if (!(this instanceof yc1)) {
            m();
        }
        if (this.S.length() <= 0) {
            z = false;
        }
        if (z) {
            k(this.S);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent != null && motionEvent.getAction() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            z1 adView = getAdView();
            if (adView != null && !adView.d0) {
                ic1 ic1Var = new ic1();
                eb1.j(ic1Var, "ad_session_id", getAdSessionId());
                new rc1(1, ic1Var, "WebView.on_first_click").b();
                adView.setUserInteraction(true);
            }
            i2 interstitial = getInterstitial();
            if (interstitial != null) {
                interstitial.l = true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public /* synthetic */ void p() {
        if (!lu0.G(this.U, "http") && !lu0.G(this.U, "file")) {
            loadDataWithBaseURL(this.V, this.U, "text/html", null, null);
        } else if (!lu0.D(this.U, ".html") && lu0.G(this.U, "file")) {
            loadDataWithBaseURL(this.U, qq.d(e5.b("<html><script src=\""), this.U, "\"></script></html>"), "text/html", null, null);
        } else {
            loadUrl(this.U);
        }
    }

    public void q() {
        boolean z;
        if (this.a0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                kf1 m = ga1.h().m();
                String str = this.a0;
                m.getClass();
                this.T = kf1.a(str, false).toString();
                Pattern compile = Pattern.compile("bridge.os_name\\s*=\\s*\"\"\\s*;");
                hy.d("Pattern.compile(pattern)", compile);
                String str2 = "bridge.os_name = \"\";\nvar ADC_DEVICE_INFO = " + this.b0 + ";\n";
                String str3 = this.T;
                hy.e("input", str3);
                hy.e("replacement", str2);
                String replaceFirst = compile.matcher(str3).replaceFirst(str2);
                hy.d("nativePattern.matcher(in…replaceFirst(replacement)", replaceFirst);
                this.T = replaceFirst;
            } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException e2) {
                j(e2);
            }
        }
    }

    public final /* synthetic */ void setAdSessionId(String str) {
        this.W = str;
    }

    public final /* synthetic */ void setBaseUrl(String str) {
        this.V = str;
    }

    public void setBounds(rc1 rc1Var) {
        ic1 ic1Var = rc1Var.b;
        this.e0 = ic1Var.l("x");
        this.f0 = ic1Var.l("y");
        this.g0 = ic1Var.l("width");
        this.h0 = ic1Var.l("height");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(getCurrentX(), getCurrentY(), 0, 0);
            layoutParams2.width = getCurrentWidth();
            layoutParams2.height = getCurrentHeight();
            j21 j21Var = j21.a;
            setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final /* synthetic */ void setInfo(ic1 ic1Var) {
        this.b0 = ic1Var;
    }

    public final /* synthetic */ void setMUrl(String str) {
        this.U = str;
    }

    public final /* synthetic */ void setMraidFilepath(String str) {
        this.a0 = str;
    }

    public void setVisible(rc1 rc1Var) {
        int i;
        if (rc1Var.b.j("visible")) {
            i = 0;
        } else {
            i = 4;
        }
        setVisibility(i);
    }
}