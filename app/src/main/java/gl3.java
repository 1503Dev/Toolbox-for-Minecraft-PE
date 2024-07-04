package defpackage;

import android.os.Build;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gl3  reason: default package */
public final /* synthetic */ class gl3 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ gl3(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        switch (this.P) {
            case 0:
                ((jl3) this.Q).p((ym3) this.R);
                return;
            case 1:
                ju3 ju3Var = (ju3) this.Q;
                String str = (String) this.R;
                cu3 cu3Var = ju3Var.R;
                synchronized (cu3Var) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("platform", "ANDROID");
                        jSONObject.put("sdkVersion", cu3Var.h);
                        jSONObject.put("internalSdkVersion", cu3Var.g);
                        jSONObject.put("osVersion", Build.VERSION.RELEASE);
                        jSONObject.put("adapters", cu3Var.d.a());
                        l92 l92Var = x92.V7;
                        w82 w82Var = w82.d;
                        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                            String str2 = jv5.A.g.g;
                            if (!TextUtils.isEmpty(str2)) {
                                jSONObject.put("plugin", str2);
                            }
                        }
                        long j = cu3Var.n;
                        jv5 jv5Var = jv5.A;
                        jv5Var.j.getClass();
                        if (j < System.currentTimeMillis() / 1000) {
                            cu3Var.l = "{}";
                        }
                        jSONObject.put("networkExtras", cu3Var.l);
                        jSONObject.put("adSlots", cu3Var.g());
                        jSONObject.put("appInfo", cu3Var.e.a());
                        String str3 = jv5Var.g.b().f().e;
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.put("cld", new JSONObject(str3));
                        }
                        if (((Boolean) w82Var.c.a(x92.N7)).booleanValue() && (jSONObject2 = cu3Var.m) != null) {
                            String obj = jSONObject2.toString();
                            sv2.b("Server data: " + obj);
                            jSONObject.put("serverData", cu3Var.m);
                        }
                        if (((Boolean) w82Var.c.a(x92.M7)).booleanValue()) {
                            jSONObject.put("openAction", cu3Var.s);
                            jSONObject.put("gesture", cu3Var.o);
                        }
                    } catch (JSONException e) {
                        jv5.A.g.e("Inspector.toJson", e);
                        sv2.h("Ad inspector encountered an error", e);
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    try {
                        jSONObject.put("redirectUrl", str);
                    } catch (JSONException unused) {
                    }
                }
                ju3Var.S.B("window.inspectorInfo", jSONObject.toString());
                return;
            default:
                ((ul4) this.Q).b.m((String) this.R);
                return;
        }
    }
}