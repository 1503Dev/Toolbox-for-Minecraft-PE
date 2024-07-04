package defpackage;

import android.webkit.WebView;

/* renamed from: cc1  reason: default package */
public final class cc1 implements Runnable {
    public final /* synthetic */ WebView P;
    public final /* synthetic */ String Q;

    public cc1(WebView webView, String str) {
        this.P = webView;
        this.Q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.P.loadUrl(this.Q);
    }
}