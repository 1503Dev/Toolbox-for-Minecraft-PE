package defpackage;

import android.os.Build;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: go4  reason: default package */
public class go4 {
    public long b = System.nanoTime();
    public int c = 1;
    public bp4 a = new bp4(null);

    public final WebView a() {
        return (WebView) this.a.get();
    }

    public void b() {
        this.a.clear();
    }

    public void c(nn4 nn4Var, ln4 ln4Var) {
        d(nn4Var, ln4Var, null);
    }

    public final void d(nn4 nn4Var, ln4 ln4Var, JSONObject jSONObject) {
        String str = nn4Var.g;
        JSONObject jSONObject2 = new JSONObject();
        jo4.b(jSONObject2, "environment", "app");
        jo4.b(jSONObject2, "adSessionType", ln4Var.g);
        JSONObject jSONObject3 = new JSONObject();
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        jo4.b(jSONObject3, "deviceType", str2 + "; " + str3);
        jo4.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        jo4.b(jSONObject3, "os", "Android");
        jo4.b(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        jo4.b(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        jo4.b(jSONObject4, "partnerName", ln4Var.a.P);
        jo4.b(jSONObject4, "partnerVersion", ln4Var.a.Q);
        jo4.b(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        jo4.b(jSONObject5, "libraryVersion", "1.3.37-google_20220829");
        jo4.b(jSONObject5, "appId", xn4.b.a.getApplicationContext().getPackageName());
        jo4.b(jSONObject2, "app", jSONObject5);
        String str4 = ln4Var.f;
        if (str4 != null) {
            jo4.b(jSONObject2, "contentUrl", str4);
        }
        jo4.b(jSONObject2, "customReferenceData", ln4Var.e);
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = Collections.unmodifiableList(ln4Var.c).iterator();
        if (!it.hasNext()) {
            yn4.a(a(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
        } else {
            sn4 sn4Var = (sn4) it.next();
            throw null;
        }
    }

    public void e() {
    }
}