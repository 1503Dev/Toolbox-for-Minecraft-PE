package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: pa1  reason: default package */
public final class pa1 implements Runnable {
    public final /* synthetic */ ka1 P;

    /* renamed from: pa1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a extends WebViewClient {
        public final /* synthetic */ ka1 a;

        public a(ka1 ka1Var) {
            this.a = ka1Var;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            this.a.destroy();
        }
    }

    public pa1(ka1 ka1Var) {
        this.P = ka1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.P.setWebChromeClient(null);
        this.P.setWebViewClient(new a(this.P));
        this.P.clearCache(true);
        this.P.removeAllViews();
        this.P.loadUrl("about:blank");
    }
}