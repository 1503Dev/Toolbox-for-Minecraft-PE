package defpackage;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: tj2  reason: default package */
public final class tj2 implements qi2, sj2 {
    public final sj2 P;
    public final HashSet Q = new HashSet();

    public tj2(ui2 ui2Var) {
        this.P = ui2Var;
    }

    @Override // defpackage.aj2
    public final /* synthetic */ void B(String str, String str2) {
        v32.r(this, str, str2);
    }

    @Override // defpackage.aj2
    public final void M0(String str, JSONObject jSONObject) {
        v32.r(this, str, jSONObject.toString());
    }

    @Override // defpackage.pi2
    public final void a(String str, Map map) {
        try {
            p(str, n62.f.a.g(map));
        } catch (JSONException unused) {
            sv2.g("Could not convert parameters to JSON.");
        }
    }

    @Override // defpackage.sj2
    public final void g0(String str, mg2 mg2Var) {
        this.P.g0(str, mg2Var);
        this.Q.add(new AbstractMap.SimpleEntry(str, mg2Var));
    }

    @Override // defpackage.qi2, defpackage.aj2
    public final void m(String str) {
        this.P.m(str);
    }

    @Override // defpackage.sj2
    public final void n(String str, mg2 mg2Var) {
        this.P.n(str, mg2Var);
        this.Q.remove(new AbstractMap.SimpleEntry(str, mg2Var));
    }

    @Override // defpackage.pi2
    public final /* synthetic */ void p(String str, JSONObject jSONObject) {
        v32.p(this, str, jSONObject);
    }
}