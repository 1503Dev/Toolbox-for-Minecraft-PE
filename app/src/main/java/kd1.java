package defpackage;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.yc1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: kd1  reason: default package */
public final class kd1 extends yc1 {
    public static boolean x0;

    /* renamed from: kd1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class a extends yc1.a {
        public a() {
            super();
        }

        @Override // defpackage.yc1.a, defpackage.fb1.c, defpackage.ka1.b, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: kd1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class b extends yc1.b {
        public b() {
            super();
        }

        @Override // defpackage.yc1.b, defpackage.fb1.d, defpackage.ka1.b, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: kd1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class c extends yc1.c {
        public c() {
            super();
        }

        @Override // defpackage.yc1.c, defpackage.fb1.e, defpackage.ka1.b, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: kd1$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class d extends yc1.d {
        public d() {
            super();
        }

        @Override // defpackage.yc1.d, defpackage.fb1.f, defpackage.ka1.b, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: kd1$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class e extends yc1.e {
        public e() {
            super();
        }

        @Override // defpackage.yc1.e, defpackage.fb1.g, defpackage.ka1.b, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: kd1$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class f {
        public f() {
        }

        public final void a() {
            boolean z;
            if (!kd1.this.getModuleInitialized()) {
                nr nrVar = new nr();
                pb1 k = ga1.h().k();
                k.getClass();
                ArrayList arrayList = new ArrayList();
                for (i2 i2Var : k.c.values()) {
                    int i = i2Var.k;
                    if (i != 4 && i != 5 && i != 6) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        arrayList.add(i2Var);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i2 i2Var2 = (i2) it.next();
                    ic1 ic1Var = new ic1();
                    eb1.j(ic1Var, "ad_session_id", i2Var2.f);
                    String str = i2Var2.g;
                    if (str == null) {
                        str = "";
                    }
                    eb1.j(ic1Var, "ad_id", str);
                    eb1.j(ic1Var, "zone_id", i2Var2.h);
                    eb1.j(ic1Var, "ad_request_id", i2Var2.j);
                    nrVar.a(ic1Var);
                }
                eb1.h(kd1.this.getInfo(), "ads_to_restore", nrVar);
            }
        }
    }

    public kd1(Context context, rc1 rc1Var) {
        super(context, 1, rc1Var);
    }

    @Override // defpackage.yc1, defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new b();
    }

    @Override // defpackage.yc1, defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new c();
    }

    @Override // defpackage.yc1, defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new d();
    }

    @Override // defpackage.yc1, defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new e();
    }

    @Override // defpackage.yc1, defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new a();
    }

    @Override // defpackage.ka1
    public final boolean l(ic1 ic1Var, String str) {
        if (!super.l(ic1Var, str)) {
            ga1.h().n().d(0, 0, "Unable to communicate with controller, disabling AdColony.", false);
            w1.d();
            return true;
        }
        return true;
    }

    @Override // defpackage.fb1
    public final String v(ic1 ic1Var) {
        return x0 ? "android_asset/ADCController.js" : ic1Var.q("filepath");
    }
}