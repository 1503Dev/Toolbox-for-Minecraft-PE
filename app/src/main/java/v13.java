package defpackage;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: v13  reason: default package */
public final class v13 extends w13 {
    public v13(l13 l13Var, j52 j52Var, boolean z) {
        super(l13Var, j52Var, z);
    }

    @Override // defpackage.g13, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return A(webView, str, null);
    }
}