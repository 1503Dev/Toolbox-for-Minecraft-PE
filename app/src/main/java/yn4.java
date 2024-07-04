package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;

/* renamed from: yn4  reason: default package */
public final class yn4 {
    public static void a(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView == null) {
            hn4.a.booleanValue();
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        if (objArr.length > 0) {
            for (Object obj2 : objArr) {
                if (obj2 == null) {
                    obj = "\"\"";
                } else {
                    if (obj2 instanceof String) {
                        obj = obj2.toString();
                        if (!obj.startsWith("{")) {
                            sb.append('\"');
                            sb.append(obj);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj2);
                    }
                    sb.append(",");
                }
                sb.append(obj);
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")}");
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new qh1(webView, sb2));
        }
    }
}