package defpackage;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: h32  reason: default package */
public final /* synthetic */ class h32 implements ValueCallback {
    public final /* synthetic */ i32 a;
    public final /* synthetic */ a32 b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ h32(i32 i32Var, a32 a32Var, WebView webView, boolean z) {
        this.a = i32Var;
        this.b = a32Var;
        this.c = webView;
        this.d = z;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        boolean z;
        float x;
        float y;
        int width;
        i32 i32Var = this.a;
        a32 a32Var = this.b;
        WebView webView = this.c;
        boolean z2 = this.d;
        String str = (String) obj;
        j32 j32Var = i32Var.R;
        j32Var.getClass();
        synchronized (a32Var.g) {
            a32Var.m--;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!j32Var.c0 && !TextUtils.isEmpty(webView.getTitle())) {
                    optString = webView.getTitle() + "\n" + optString;
                    x = webView.getX();
                    y = webView.getY();
                    width = webView.getWidth();
                } else {
                    x = webView.getX();
                    y = webView.getY();
                    width = webView.getWidth();
                }
                float f = width;
                a32Var.a(optString, z2, x, y, f, webView.getHeight());
            }
            synchronized (a32Var.g) {
                if (a32Var.m == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                j32Var.S.b(a32Var);
            }
        } catch (JSONException unused) {
            sv2.b("Json string may be malformed.");
        } catch (Throwable th) {
            sv2.c("Failed to get webview content.", th);
            jv5.A.g.f("ContentFetchTask.processWebViewContent", th);
        }
    }
}