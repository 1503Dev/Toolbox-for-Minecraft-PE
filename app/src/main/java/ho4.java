package defpackage;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: ho4  reason: default package */
public final class ho4 extends go4 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public ho4(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.a = new bp4(webView);
    }
}