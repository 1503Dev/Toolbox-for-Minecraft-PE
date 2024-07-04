package defpackage;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.fb1;

/* renamed from: yc1  reason: default package */
public class yc1 extends fb1 {
    public static final /* synthetic */ int w0 = 0;

    /* renamed from: yc1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends fb1.c {
        public a() {
            super();
        }

        @Override // defpackage.fb1.c, defpackage.ka1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            yc1 yc1Var = yc1.this;
            if (!(yc1Var instanceof kd1)) {
                ic1 ic1Var = new ic1();
                eb1.m(ic1Var, "success", true);
                eb1.l(yc1Var.getAdc3ModuleId(), ic1Var, "id");
                rc1 message = yc1Var.getMessage();
                if (message != null) {
                    message.a(ic1Var).b();
                }
            }
        }
    }

    /* renamed from: yc1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends fb1.d {
        public b() {
            super();
        }

        @Override // defpackage.fb1.d, defpackage.ka1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            yc1 yc1Var = yc1.this;
            if (!(yc1Var instanceof kd1)) {
                ic1 ic1Var = new ic1();
                eb1.m(ic1Var, "success", true);
                eb1.l(yc1Var.getAdc3ModuleId(), ic1Var, "id");
                rc1 message = yc1Var.getMessage();
                if (message != null) {
                    message.a(ic1Var).b();
                }
            }
        }
    }

    /* renamed from: yc1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends fb1.e {
        public c() {
            super();
        }

        @Override // defpackage.fb1.e, defpackage.ka1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            yc1 yc1Var = yc1.this;
            if (!(yc1Var instanceof kd1)) {
                ic1 ic1Var = new ic1();
                eb1.m(ic1Var, "success", true);
                eb1.l(yc1Var.getAdc3ModuleId(), ic1Var, "id");
                rc1 message = yc1Var.getMessage();
                if (message != null) {
                    message.a(ic1Var).b();
                }
            }
        }
    }

    /* renamed from: yc1$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d extends fb1.f {
        public d() {
            super();
        }

        @Override // defpackage.fb1.f, defpackage.ka1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            yc1 yc1Var = yc1.this;
            if (!(yc1Var instanceof kd1)) {
                ic1 ic1Var = new ic1();
                eb1.m(ic1Var, "success", true);
                eb1.l(yc1Var.getAdc3ModuleId(), ic1Var, "id");
                rc1 message = yc1Var.getMessage();
                if (message != null) {
                    message.a(ic1Var).b();
                }
            }
        }
    }

    /* renamed from: yc1$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e extends fb1.g {
        public e() {
            super();
        }

        @Override // defpackage.fb1.g, defpackage.ka1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            yc1 yc1Var = yc1.this;
            if (!(yc1Var instanceof kd1)) {
                ic1 ic1Var = new ic1();
                eb1.m(ic1Var, "success", true);
                eb1.l(yc1Var.getAdc3ModuleId(), ic1Var, "id");
                rc1 message = yc1Var.getMessage();
                if (message != null) {
                    message.a(ic1Var).b();
                }
            }
        }
    }

    public yc1(Context context, int i, rc1 rc1Var) {
        super(context, i, rc1Var);
    }

    @Override // defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new b();
    }

    @Override // defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new c();
    }

    @Override // defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new d();
    }

    @Override // defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new e();
    }

    @Override // defpackage.fb1, defpackage.ka1
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new a();
    }

    @Override // defpackage.fb1, defpackage.ka1
    public void o() {
        ic1 ic1Var;
        rc1 message = getMessage();
        if (message == null) {
            ic1Var = null;
        } else {
            ic1Var = message.b;
        }
        if (ic1Var == null) {
            ic1Var = new ic1();
        }
        setMraidFilepath(ic1Var.q("mraid_filepath"));
        setBaseUrl(ic1Var.q("base_url"));
        setIab(ic1Var.n("iab"));
        setInfo(ic1Var.n("info"));
        setAdSessionId(ic1Var.q("ad_session_id"));
        setMUrl(x(ic1Var));
        super.o();
    }

    @Override // defpackage.ka1
    public void setBounds(rc1 rc1Var) {
        super.setBounds(rc1Var);
        ic1 ic1Var = new ic1();
        eb1.m(ic1Var, "success", true);
        eb1.l(getAdc3ModuleId(), ic1Var, "id");
        rc1Var.a(ic1Var).b();
    }

    @Override // defpackage.ka1
    public void setVisible(rc1 rc1Var) {
        super.setVisible(rc1Var);
        ic1 ic1Var = new ic1();
        eb1.m(ic1Var, "success", true);
        eb1.l(getAdc3ModuleId(), ic1Var, "id");
        rc1Var.a(ic1Var).b();
    }
}