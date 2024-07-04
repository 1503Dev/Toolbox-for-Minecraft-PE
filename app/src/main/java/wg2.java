package defpackage;

import org.json.JSONObject;

/* renamed from: wg2  reason: default package */
public final class wg2 implements xg2 {
    public final /* synthetic */ bx2 a;

    public wg2(bx2 bx2Var) {
        this.a = bx2Var;
    }

    @Override // defpackage.xg2
    public final void m(String str) {
        this.a.c(new uj2(str));
    }

    @Override // defpackage.xg2
    public final void n(JSONObject jSONObject) {
        this.a.a(jSONObject);
    }
}