package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import defpackage.d3;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xv0  reason: default package */
public final class xv0 {
    public final Context a;
    public final WebView b;
    public final rz1 c;
    public final int d;
    public final fs3 e;
    public final boolean f;
    public final yw2 g = zw2.e;
    public final gn4 h;

    public xv0(WebView webView, rz1 rz1Var, fs3 fs3Var, gn4 gn4Var) {
        this.b = webView;
        Context context = webView.getContext();
        this.a = context;
        this.c = rz1Var;
        this.e = fs3Var;
        x92.a(context);
        m92 m92Var = x92.Y7;
        w82 w82Var = w82.d;
        this.d = ((Integer) w82Var.c.a(m92Var)).intValue();
        this.f = ((Boolean) w82Var.c.a(x92.Z7)).booleanValue();
        this.h = gn4Var;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            jv5 jv5Var = jv5.A;
            jv5Var.j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String h = this.c.b.h(this.a, str, this.b);
            if (this.f) {
                jv5Var.j.getClass();
                xi4.c(this.e, null, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            }
            return h;
        } catch (RuntimeException e) {
            sv2.e("Exception getting click signals. ", e);
            jv5.A.g.f("TaggingLibraryJsInterface.getClickSignals", e);
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            sv2.d("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        int min = Math.min(i, this.d);
        try {
            return (String) zw2.a.b(new hz1(0, this, str)).get(min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            sv2.e("Exception getting click signals with timeout. ", e);
            jv5.A.g.f("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e);
            if (!(e instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        cu5 cu5Var = jv5.A.c;
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zz1 zz1Var = new zz1(this, uuid);
        if (((Boolean) w82.d.c.a(x92.b8)).booleanValue()) {
            this.g.execute(new Runnable() { // from class: ux1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    xv0 xv0Var = xv0.this;
                    Bundle bundle2 = bundle;
                    z61 z61Var = zz1Var;
                    xv0Var.getClass();
                    CookieManager b = jv5.A.e.b(xv0Var.a);
                    if (b != null) {
                        z = b.acceptThirdPartyCookies(xv0Var.b);
                    } else {
                        z = false;
                    }
                    bundle2.putBoolean("accept_3p_cookie", z);
                    Context context = xv0Var.a;
                    d3.a aVar = new d3.a();
                    aVar.a(bundle2);
                    xg0.a(context, new d3(aVar), z61Var);
                }
            });
        } else {
            Context context = this.a;
            d3.a aVar = new d3.a();
            aVar.a(bundle);
            xg0.a(context, new d3(aVar), zz1Var);
        }
        return uuid;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        try {
            jv5 jv5Var = jv5.A;
            jv5Var.j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String e = this.c.b.e(this.a, this.b, null);
            if (this.f) {
                jv5Var.j.getClass();
                xi4.c(this.e, null, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            }
            return e;
        } catch (RuntimeException e2) {
            sv2.e("Exception getting view signals. ", e2);
            jv5.A.g.f("TaggingLibraryJsInterface.getViewSignals", e2);
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            sv2.d("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        int min = Math.min(i, this.d);
        try {
            return (String) zw2.a.b(new Callable() { // from class: yy1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return xv0.this.getViewSignals();
                }
            }).get(min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            sv2.e("Exception getting view signals with timeout. ", e);
            jv5.A.g.f("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e);
            if (!(e instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void recordClick(final String str) {
        if (((Boolean) w82.d.c.a(x92.d8)).booleanValue() && !TextUtils.isEmpty(str)) {
            zw2.a.execute(new Runnable() { // from class: ax1
                @Override // java.lang.Runnable
                public final void run() {
                    xv0 xv0Var = xv0.this;
                    String str2 = str;
                    xv0Var.getClass();
                    Uri parse = Uri.parse(str2);
                    try {
                        parse = xv0Var.c.a(parse, xv0Var.a, xv0Var.b, null);
                    } catch (sz1 e) {
                        sv2.c("Failed to append the click signal to URL: ", e);
                        jv5.A.g.f("TaggingLibraryJsInterface.recordClick", e);
                    }
                    xv0Var.h.a(parse.toString(), null);
                }
            });
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("x");
            i2 = jSONObject.getInt("y");
            i3 = jSONObject.getInt("duration_ms");
            f = (float) jSONObject.getDouble("force");
            int i5 = jSONObject.getInt("type");
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            i4 = -1;
                        } else {
                            i4 = 3;
                        }
                    } else {
                        i4 = 2;
                    }
                } else {
                    i4 = 1;
                }
            } else {
                i4 = 0;
            }
        } catch (RuntimeException | JSONException e) {
            e = e;
        }
        try {
            this.c.b.b(MotionEvent.obtain(0L, i3, i4, i, i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e2) {
            e = e2;
            sv2.e("Failed to parse the touch string. ", e);
            jv5.A.g.f("TaggingLibraryJsInterface.reportTouchEvent", e);
        } catch (JSONException e3) {
            e = e3;
            sv2.e("Failed to parse the touch string. ", e);
            jv5.A.g.f("TaggingLibraryJsInterface.reportTouchEvent", e);
        }
    }
}