package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: io4  reason: default package */
public final class io4 extends go4 {
    public WebView d;
    public Long e = null;
    public final Map f;

    public io4(Map map) {
        this.f = map;
    }

    @Override // defpackage.go4
    public final void b() {
        super.b();
        new Handler().postDelayed(new cj2(this), Math.max(4000 - (this.e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.e.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.d = null;
    }

    @Override // defpackage.go4
    public final void c(nn4 nn4Var, ln4 ln4Var) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(ln4Var.d);
        for (String str : unmodifiableMap.keySet()) {
            jo4.b(jSONObject, str, (sn4) unmodifiableMap.get(str));
        }
        d(nn4Var, ln4Var, jSONObject);
    }

    @Override // defpackage.go4
    public final void e() {
        WebView webView = new WebView(xn4.b.a);
        this.d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.a = new bp4(this.d);
        WebView webView2 = this.d;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.f.keySet().iterator();
        if (!it.hasNext()) {
            this.e = Long.valueOf(System.nanoTime());
            return;
        }
        sn4 sn4Var = (sn4) this.f.get((String) it.next());
        throw null;
    }
}