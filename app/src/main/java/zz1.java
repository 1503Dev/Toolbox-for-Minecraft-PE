package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zz1  reason: default package */
public final class zz1 extends z61 {
    public final /* synthetic */ String f;
    public final /* synthetic */ xv0 g;

    public zz1(xv0 xv0Var, String str) {
        this.g = xv0Var;
        this.f = str;
    }

    @Override // defpackage.z61
    public final void R0(String str) {
        sv2.g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        this.g.b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.f, str), null);
    }

    @Override // defpackage.z61
    public final void W0(xg0 xg0Var) {
        String format;
        String str = xg0Var.a.P;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f);
            jSONObject.put("signal", str);
            format = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            format = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.f, xg0Var.a.P);
        }
        this.g.b.evaluateJavascript(format, null);
    }
}