package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: ha1  reason: default package */
public final class ha1 extends g3 {
    public WebView f;
    public Long g = null;
    public final Map<String, i31> h;
    public final String i;

    /* renamed from: ha1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final WebView P;

        public a(ha1 ha1Var) {
            this.P = ha1Var.f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.P.destroy();
        }
    }

    public ha1(String str, Map map) {
        this.h = map;
        this.i = str;
    }

    @Override // defpackage.g3
    public final void a() {
        WebView webView = new WebView(zb1.b.a);
        this.f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.a = new bp4(this.f);
        WebView webView2 = this.f;
        String str = this.i;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        for (String str2 : this.h.keySet()) {
            String externalForm = this.h.get(str2).b.toExternalForm();
            WebView webView3 = this.f;
            if (externalForm != null && !TextUtils.isEmpty(str2)) {
                String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                if (webView3 != null && !TextUtils.isEmpty(replace)) {
                    webView3.loadUrl("javascript: " + replace);
                }
            }
        }
        this.g = Long.valueOf(System.nanoTime());
    }

    @Override // defpackage.g3
    public final void b(z91 z91Var, nb nbVar) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((Map) nbVar.d);
        for (String str : unmodifiableMap.keySet()) {
            sa1.c(jSONObject, str, (i31) unmodifiableMap.get(str));
        }
        c(z91Var, nbVar, jSONObject);
    }

    @Override // defpackage.g3
    public final void e() {
        long convert;
        super.e();
        if (this.g == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new a(this), Math.max(4000 - convert, 2000L));
        this.f = null;
    }
}