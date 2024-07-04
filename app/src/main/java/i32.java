package defpackage;

import android.webkit.WebView;

/* renamed from: i32  reason: default package */
public final class i32 implements Runnable {
    public final h32 P;
    public final /* synthetic */ WebView Q;
    public final /* synthetic */ j32 R;

    public i32(j32 j32Var, a32 a32Var, WebView webView, boolean z) {
        this.R = j32Var;
        this.Q = webView;
        this.P = new h32(this, a32Var, webView, z);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.Q.getSettings().getJavaScriptEnabled()) {
            try {
                this.Q.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.P);
            } catch (Throwable unused) {
                this.P.onReceiveValue("");
            }
        }
    }
}