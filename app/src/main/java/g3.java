package defpackage;

import android.os.Build;
import android.webkit.WebView;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: g3  reason: default package */
public abstract class g3 {
    public zw5 b;
    public fk c;
    public long e = System.nanoTime();
    public int d = 1;
    public bp4 a = new bp4(null);

    public void a() {
    }

    public void b(z91 z91Var, nb nbVar) {
        c(z91Var, nbVar, null);
    }

    public final void c(z91 z91Var, nb nbVar, JSONObject jSONObject) {
        String str = z91Var.m;
        JSONObject jSONObject2 = new JSONObject();
        sa1.c(jSONObject2, "environment", "app");
        sa1.c(jSONObject2, "adSessionType", (f3) nbVar.h);
        JSONObject jSONObject3 = new JSONObject();
        sa1.c(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        sa1.c(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        sa1.c(jSONObject3, "os", "Android");
        sa1.c(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        sa1.c(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        sa1.c(jSONObject4, "partnerName", ((wd0) nbVar.a).a);
        sa1.c(jSONObject4, "partnerVersion", ((wd0) nbVar.a).b);
        sa1.c(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        sa1.c(jSONObject5, "libraryVersion", "1.3.30-Adcolony");
        sa1.c(jSONObject5, "appId", zb1.b.a.getApplicationContext().getPackageName());
        sa1.c(jSONObject2, "app", jSONObject5);
        String str2 = (String) nbVar.g;
        if (str2 != null) {
            sa1.c(jSONObject2, "contentUrl", str2);
        }
        String str3 = (String) nbVar.f;
        if (str3 != null) {
            sa1.c(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (i31 i31Var : Collections.unmodifiableList((List) nbVar.c)) {
            sa1.c(jSONObject6, i31Var.a, i31Var.c);
        }
        gw.d(f(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    public final void d(String str) {
        gw.d(f(), "publishMediaEvent", str);
    }

    public void e() {
        this.a.clear();
    }

    public final WebView f() {
        return (WebView) this.a.get();
    }
}