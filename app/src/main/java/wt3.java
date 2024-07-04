package defpackage;

import org.json.JSONObject;

/* renamed from: wt3  reason: default package */
public final class wt3 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final boolean g;

    public wt3(String str, String str2, String str3, int i, String str4, int i2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = i2;
        this.g = z;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.a);
        jSONObject.put("version", this.c);
        l92 l92Var = x92.R7;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            jSONObject.put("sdkVersion", this.b);
        }
        jSONObject.put("status", this.d);
        jSONObject.put("description", this.e);
        jSONObject.put("initializationLatencyMillis", this.f);
        if (((Boolean) w82Var.c.a(x92.S7)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.g);
        }
        return jSONObject;
    }
}