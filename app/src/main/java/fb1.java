package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.ka1;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;

/* renamed from: fb1  reason: default package */
public class fb1 extends ka1 implements jd1 {
    public boolean m0;
    public boolean n0;
    public final Object o0;
    public nr p0;
    public String q0;
    public h r0;
    public boolean s0;
    public ic1 t0;
    public boolean u0;
    public boolean v0;

    /* renamed from: fb1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a {
        public a() {
        }

        @JavascriptInterface
        public final void dispatch_messages(String str, String str2) {
            if (hy.a(str2, fb1.this.q0)) {
                fb1.t(fb1.this, str);
            }
        }

        @JavascriptInterface
        public final void enable_reverse_messaging(String str) {
            if (hy.a(str, fb1.this.q0)) {
                fb1.this.m0 = true;
            }
        }

        @JavascriptInterface
        public final String pull_messages(String str) {
            if (hy.a(str, fb1.this.q0)) {
                String str2 = "[]";
                fb1 fb1Var = fb1.this;
                synchronized (fb1Var.o0) {
                    if (fb1Var.p0.c() > 0) {
                        if (fb1Var.getEnableMessages()) {
                            str2 = fb1Var.p0.toString();
                        }
                        fb1Var.p0 = new nr();
                    }
                    j21 j21Var = j21.a;
                }
                return str2;
            }
            return "[]";
        }

        @JavascriptInterface
        public final void push_messages(String str, String str2) {
            if (hy.a(str2, fb1.this.q0)) {
                fb1.t(fb1.this, str);
            }
        }
    }

    /* renamed from: fb1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class b extends a {
        public b() {
            super();
        }

        @JavascriptInterface
        public final void enable_event_messaging(String str) {
            if (hy.a(str, fb1.this.q0)) {
                fb1.this.n0 = true;
            }
        }
    }

    /* renamed from: fb1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends ka1.b {
        public c() {
            super();
        }

        @Override // defpackage.ka1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new j().a();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            fb1.this.u0 = false;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new j().b(str);
        }
    }

    /* renamed from: fb1$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d extends ka1.c {
        public d() {
            super();
        }

        @Override // defpackage.ka1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new j().a();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            fb1.this.u0 = false;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new j().b(str);
        }
    }

    /* renamed from: fb1$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e extends ka1.d {
        public e() {
            super();
        }

        @Override // defpackage.ka1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            fb1 fb1Var = fb1.this;
            new j().a();
            if (str != null) {
                fb1.w(fb1Var, str);
                return;
            }
            t1.b(0, 1, "ADCWebViewModule: initializeEventMessaging failed due to url = null", true);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            fb1.this.u0 = false;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new j().b(str);
        }
    }

    /* renamed from: fb1$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f extends ka1.e {
        public f() {
            super(fb1.this);
        }

        @Override // defpackage.ka1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            fb1 fb1Var = fb1.this;
            new j().a();
            if (str != null) {
                fb1.w(fb1Var, str);
                return;
            }
            t1.b(0, 1, "ADCWebViewModule: initializeEventMessaging failed due to url = null", true);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            fb1.this.u0 = false;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return new i().a(webResourceRequest);
        }
    }

    /* renamed from: fb1$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class g extends ka1.f {
        public g() {
            super();
        }

        @Override // defpackage.ka1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            fb1 fb1Var = fb1.this;
            new j().a();
            if (str != null) {
                fb1.w(fb1Var, str);
                return;
            }
            t1.b(0, 1, "ADCWebViewModule: initializeEventMessaging failed due to url = null", true);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            fb1.this.u0 = false;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return new i().a(webResourceRequest);
        }
    }

    /* renamed from: fb1$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class h {
        public final WebMessagePort[] a;

        public h(WebMessagePort[] webMessagePortArr) {
            this.a = webMessagePortArr;
        }

        public final WebMessagePort a() {
            WebMessagePort[] webMessagePortArr = this.a;
            hy.e("$this$getOrNull", webMessagePortArr);
            if (1 <= webMessagePortArr.length - 1) {
                return webMessagePortArr[1];
            }
            return null;
        }

        public final WebMessagePort b() {
            WebMessagePort[] webMessagePortArr = this.a;
            hy.e("$this$getOrNull", webMessagePortArr);
            if (webMessagePortArr.length - 1 >= 0) {
                return webMessagePortArr[0];
            }
            return null;
        }
    }

    /* renamed from: fb1$i */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class i {
        public i() {
        }

        public final boolean a(WebResourceRequest webResourceRequest) {
            boolean z;
            Uri parse;
            int i = 0;
            if (fb1.this.getModuleInitialized()) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String clickOverride = fb1.this.getClickOverride();
                    if (clickOverride == null) {
                        parse = null;
                    } else {
                        parse = Uri.parse(clickOverride);
                    }
                    if (parse == null) {
                        parse = webResourceRequest.getUrl();
                    }
                    if (parse != null) {
                        eg1.i(new Intent("android.intent.action.VIEW", parse), false);
                        ic1 ic1Var = new ic1();
                        fb1 fb1Var = fb1.this;
                        eb1.j(ic1Var, "url", parse.toString());
                        eb1.j(ic1Var, "ad_session_id", fb1Var.getAdSessionId());
                        ob1 parentContainer = fb1.this.getParentContainer();
                        if (parentContainer != null) {
                            i = parentContainer.c0;
                        }
                        new rc1(i, ic1Var, "WebView.redirect_detected").b();
                        mf1 a = ga1.h().a();
                        fb1 fb1Var2 = fb1.this;
                        String adSessionId = fb1Var2.getAdSessionId();
                        a.getClass();
                        mf1.b(adSessionId);
                        mf1.d(fb1Var2.getAdSessionId());
                    } else {
                        StringBuilder sb = new StringBuilder();
                        String n = fb1.this.n();
                        sb.append("shouldOverrideUrlLoading called with null request url, with ad id: " + ((Object) n));
                        t1.b(0, 0, sb.toString(), true);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: fb1$j */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class j {
        public j() {
        }

        public final void a() {
            if (fb1.this.getEnableMessages() && !fb1.this.getModuleInitialized()) {
                fb1 fb1Var = fb1.this;
                ThreadPoolExecutor threadPoolExecutor = eg1.a;
                fb1Var.q0 = UUID.randomUUID().toString();
                ic1 f = eb1.f(new ic1(), fb1.this.getInfo());
                eb1.j(f, "message_key", fb1.this.q0);
                fb1 fb1Var2 = fb1.this;
                StringBuilder b = e5.b("ADC3_init(");
                b.append(fb1.this.getAdcModuleId());
                b.append(',');
                b.append(f);
                b.append(");");
                fb1Var2.k(b.toString());
                fb1.this.u0 = true;
            }
        }

        public final boolean b(String str) {
            int i = 0;
            if (!fb1.this.getModuleInitialized()) {
                return false;
            }
            String clickOverride = fb1.this.getClickOverride();
            if (clickOverride != null) {
                str = clickOverride;
            }
            if (str != null) {
                eg1.i(new Intent("android.intent.action.VIEW", Uri.parse(str)), false);
                ic1 ic1Var = new ic1();
                fb1 fb1Var = fb1.this;
                eb1.j(ic1Var, "url", str);
                eb1.j(ic1Var, "ad_session_id", fb1Var.getAdSessionId());
                ob1 parentContainer = fb1.this.getParentContainer();
                if (parentContainer != null) {
                    i = parentContainer.c0;
                }
                new rc1(i, ic1Var, "WebView.redirect_detected").b();
                mf1 a = ga1.h().a();
                fb1 fb1Var2 = fb1.this;
                String adSessionId = fb1Var2.getAdSessionId();
                a.getClass();
                mf1.b(adSessionId);
                mf1.d(fb1Var2.getAdSessionId());
            } else {
                StringBuilder sb = new StringBuilder();
                String n = fb1.this.n();
                sb.append("shouldOverrideUrlLoading called with null request url, with ad id: " + ((Object) n));
                t1.b(0, 0, sb.toString(), true);
            }
            return true;
        }
    }

    public fb1(Context context, int i2, rc1 rc1Var) {
        super(context, i2, rc1Var);
        this.o0 = new Object();
        this.p0 = new nr();
        this.q0 = "";
        this.s0 = true;
        this.t0 = new ic1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getClickOverride() {
        String str;
        i2 interstitial = getInterstitial();
        if (interstitial == null) {
            str = null;
        } else {
            str = interstitial.i;
        }
        if (str == null) {
            z1 adView = getAdView();
            if (adView == null) {
                return null;
            }
            return adView.getClickOverride();
        }
        return str;
    }

    public static final void t(fb1 fb1Var, String str) {
        nr nrVar;
        fb1Var.getClass();
        try {
            nrVar = new nr(str);
        } catch (JSONException e2) {
            ga1.h().n().d(0, 0, e2.toString(), true);
            nrVar = new nr();
        }
        for (ic1 ic1Var : nrVar.f()) {
            ga1.h().o().e(ic1Var);
        }
    }

    public static final void w(fb1 fb1Var, String str) {
        if (fb1Var.r0 == null) {
            h hVar = new h(fb1Var.createWebMessageChannel());
            WebMessagePort b2 = hVar.b();
            if (b2 != null) {
                b2.setWebMessageCallback(new gb1(fb1Var));
            }
            fb1Var.postWebMessage(new WebMessage("", new WebMessagePort[]{hVar.a()}), Uri.parse(str));
            j21 j21Var = j21.a;
            fb1Var.r0 = hVar;
        }
    }

    @Override // defpackage.jd1
    public final boolean a() {
        return (this.m0 || this.n0) ? false : true;
    }

    @Override // defpackage.jd1
    public void b() {
        if (!getDestroyed()) {
            if (!this.c0) {
                this.c0 = true;
                eg1.n(new pa1(this));
            }
            eg1.n(new hb1(this));
        }
    }

    @Override // defpackage.jd1
    public final void c() {
        if (ga1.i() && this.u0 && !this.m0 && !this.n0) {
            String str = "";
            synchronized (this.o0) {
                if (this.p0.c() > 0) {
                    if (getEnableMessages()) {
                        str = this.p0.toString();
                    }
                    this.p0 = new nr();
                }
                j21 j21Var = j21.a;
            }
            eg1.n(new ib1(this, str));
        }
    }

    @Override // defpackage.jd1
    public final void d(ic1 ic1Var) {
        synchronized (this.o0) {
            if (this.n0) {
                y(ic1Var);
                j21 j21Var = j21.a;
            } else {
                this.p0.a(ic1Var);
            }
        }
    }

    @Override // defpackage.jd1
    public int getAdcModuleId() {
        return getAdc3ModuleId();
    }

    public final /* synthetic */ boolean getEnableMessages() {
        return this.s0;
    }

    public final /* synthetic */ ic1 getIab() {
        return this.t0;
    }

    @Override // 
    /* renamed from: getModuleId */
    public int getAdc3ModuleId() {
        return getWebViewModuleId();
    }

    public final /* synthetic */ boolean getModuleInitialized() {
        return this.u0;
    }

    @Override // defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new d();
    }

    @Override // defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new e();
    }

    @Override // defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new f();
    }

    @Override // defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new g();
    }

    @Override // defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new c();
    }

    @Override // defpackage.ka1
    public void i(rc1 rc1Var, int i2, ob1 ob1Var) {
        ic1 ic1Var = rc1Var.b;
        this.s0 = ic1Var.j("enable_messages");
        if (this.t0.f()) {
            this.t0 = ic1Var.n("iab");
        }
        super.i(rc1Var, i2, ob1Var);
    }

    @Override // defpackage.ka1
    @SuppressLint({"AddJavascriptInterface"})
    public void o() {
        Object aVar;
        if (Build.VERSION.SDK_INT >= 23) {
            aVar = new b();
        } else {
            aVar = new a();
        }
        addJavascriptInterface(aVar, "NativeLayer");
        tc1 o = ga1.h().o();
        synchronized (o.a) {
            o.a.put(Integer.valueOf(getAdcModuleId()), this);
            o.g();
        }
        super.o();
    }

    public final String s(String str, String str2) {
        zd1 zd1Var;
        if (!this.t0.f()) {
            i2 interstitial = getInterstitial();
            zd1 zd1Var2 = null;
            if (interstitial != null && !hy.a(getIab().q("ad_type"), "video")) {
                ic1 iab = getIab();
                if (!iab.f()) {
                    interstitial.d = new zd1(iab, interstitial.f);
                }
                zd1Var = interstitial.d;
            } else {
                zd1Var = null;
            }
            if (zd1Var == null) {
                a2 a2Var = ga1.h().k().d.get(getAdSessionId());
                if (a2Var != null) {
                    zd1Var2 = new zd1(getIab(), getAdSessionId());
                    a2Var.b = zd1Var2;
                }
            } else {
                zd1Var2 = zd1Var;
            }
            if (zd1Var2 != null && zd1Var2.e == 2) {
                boolean z = true;
                this.v0 = true;
                if (str2.length() <= 0) {
                    z = false;
                }
                if (z) {
                    try {
                        ga1.h().m().getClass();
                        return ja.k(kf1.a(str2, false).toString(), str);
                    } catch (IOException e2) {
                        u(e2);
                    }
                }
            }
        }
        return str;
    }

    public final /* synthetic */ void setEnableMessages(boolean z) {
        this.s0 = z;
    }

    public final /* synthetic */ void setIab(ic1 ic1Var) {
        this.t0 = ic1Var;
    }

    public void u(IOException iOException) {
        t1.b(0, 0, iOException.getClass().toString() + " during metadata injection w/ metadata = " + getInfo().q("metadata"), true);
    }

    public String v(ic1 ic1Var) {
        return ic1Var.q("filepath");
    }

    public String x(ic1 ic1Var) {
        String v = v(ic1Var);
        return "file:///" + ((Object) v);
    }

    public final void y(ic1 ic1Var) {
        WebMessagePort webMessagePort;
        if (this.s0) {
            h hVar = this.r0;
            if (hVar == null || (webMessagePort = hVar.b()) == null) {
                webMessagePort = null;
            } else {
                nr nrVar = new nr();
                nrVar.a(ic1Var);
                webMessagePort.postMessage(new WebMessage(nrVar.toString()));
            }
            if (webMessagePort == null) {
                t1.b(0, 1, "Sending message before event messaging is initialized", true);
            }
        }
    }
}