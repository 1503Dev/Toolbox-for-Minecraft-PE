package defpackage;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: w13  reason: default package */
public class w13 extends g13 {
    public w13(l13 l13Var, j52 j52Var, boolean z) {
        super(l13Var, j52Var, z);
    }

    public final WebResourceResponse A(WebView webView, String str, Map map) {
        p92 p92Var;
        if (!(webView instanceof y03)) {
            sv2.g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        y03 y03Var = (y03) webView;
        ys2 ys2Var = this.j0;
        if (ys2Var != null) {
            ys2Var.X(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return h(str, map);
        }
        if (y03Var.R() != null) {
            g13 R = y03Var.R();
            synchronized (R.S) {
                R.a0 = false;
                R.c0 = true;
                zw2.e.execute(new bj4(2, R));
            }
        }
        if (y03Var.L().b()) {
            p92Var = x92.I;
        } else if (y03Var.V()) {
            p92Var = x92.H;
        } else {
            p92Var = x92.G;
        }
        String str2 = (String) w82.d.c.a(p92Var);
        jv5 jv5Var = jv5.A;
        cu5 cu5Var = jv5Var.c;
        Context context = y03Var.getContext();
        String str3 = y03Var.k().P;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", jv5Var.c.r(context, str3));
            hashMap.put("Cache-Control", "max-stale=3600");
            new dl2(context);
            String str4 = (String) dl2.a(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str4 == null) {
                return null;
            }
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str4.getBytes("UTF-8")));
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            sv2.h("Could not fetch MRAID JS.", e);
            return null;
        }
    }
}