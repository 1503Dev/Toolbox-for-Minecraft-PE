package defpackage;

import org.json.JSONObject;

/* renamed from: j34  reason: default package */
public final class j34 implements g14 {
    public final zq3 a;

    public j34(zq3 zq3Var) {
        this.a = zq3Var;
    }

    @Override // defpackage.g14
    public final h14 a(String str, JSONObject jSONObject) {
        return new h14(this.a.b(str, jSONObject), new w24(), str);
    }
}