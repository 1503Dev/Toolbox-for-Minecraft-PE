package defpackage;

import org.json.JSONObject;

/* renamed from: k63  reason: default package */
public final class k63 implements x53 {
    public final ln1 a;

    public k63(ln1 ln1Var) {
        this.a = ln1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [bt2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.x53
    public final void b(JSONObject jSONObject) {
        ?? r4;
        long optLong = jSONObject.optLong("timestamp");
        if (jSONObject.optBoolean("npa_reset")) {
            r4 = -1;
        } else {
            r4 = jSONObject.optBoolean("npa");
        }
        ((bt2) this.a.R).a(optLong, r4);
    }
}