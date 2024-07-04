package defpackage;

import android.content.Context;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sv3  reason: default package */
public final class sv3 {
    public final q23 a;
    public final Context b;
    public final xv2 c;
    public final li4 d;
    public final Executor e;
    public final String f;
    public final qm4 g;
    public final xr3 h;

    public sv3(q23 q23Var, Context context, xv2 xv2Var, li4 li4Var, yw2 yw2Var, String str, qm4 qm4Var, xr3 xr3Var) {
        this.a = q23Var;
        this.b = context;
        this.c = xv2Var;
        this.d = li4Var;
        this.e = yw2Var;
        this.f = str;
        this.g = qm4Var;
        q23Var.n();
        this.h = xr3Var;
    }

    public final ay4 a(final String str, final String str2) {
        hm4 t = eb1.t(this.b, 11);
        t.f();
        zj2 a = jv5.A.p.a(this.b, this.c, this.a.q());
        gw gwVar = yj2.b;
        ay4 F = zw4.F(zw4.F(zw4.F(zw4.C(""), new ky4() { // from class: pv3
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                String str3 = str;
                String str4 = str2;
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zw4.C(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.e), new qv3(0, a.a("google.afma.response.normalize", gwVar, gwVar)), this.e), new ky4() { // from class: rv3
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                return zw4.C(new hi4(new s41(sv3.this.d), fn2.a(new StringReader(((JSONObject) obj).toString()))));
            }
        }, this.e);
        pm4.c(F, this.g, t, false);
        return F;
    }

    public final String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            sv2.g("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }
}