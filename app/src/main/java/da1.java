package defpackage;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: da1  reason: default package */
public final class da1 extends g3 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public da1(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.a = new bp4(webView);
    }
}