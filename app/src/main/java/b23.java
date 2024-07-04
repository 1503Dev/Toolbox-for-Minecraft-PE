package defpackage;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
/* renamed from: b23  reason: default package */
public final class b23 extends w13 {
    public b23(l13 l13Var, j52 j52Var, boolean z) {
        super(l13Var, j52Var, z);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return A(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}