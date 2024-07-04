package defpackage;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ut3  reason: default package */
public final class ut3 implements qd3, ff3, oe3 {
    public final cu3 P;
    public final String Q;
    public final String R;
    public int S = 0;
    public tt3 T = tt3.AD_REQUESTED;
    public gd3 U;
    public tz3 V;
    public String W;
    public String X;
    public boolean Y;
    public boolean Z;

    public ut3(cu3 cu3Var, li4 li4Var, String str) {
        this.P = cu3Var;
        this.R = str;
        this.Q = li4Var.f;
    }

    public static JSONObject b(tz3 tz3Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", tz3Var.R);
        jSONObject.put("errorCode", tz3Var.P);
        jSONObject.put("errorDescription", tz3Var.Q);
        tz3 tz3Var2 = tz3Var.S;
        jSONObject.put("underlyingError", tz3Var2 == null ? null : b(tz3Var2));
        return jSONObject;
    }

    public final JSONObject a() {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.T);
        jSONObject.put("format", yh4.a(this.S));
        if (((Boolean) w82.d.c.a(x92.T7)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.Y);
            if (this.Y) {
                jSONObject.put("shown", this.Z);
            }
        }
        gd3 gd3Var = this.U;
        JSONObject jSONObject2 = null;
        if (gd3Var != null) {
            jSONObject2 = c(gd3Var);
        } else {
            tz3 tz3Var = this.V;
            if (tz3Var != null && (iBinder = tz3Var.T) != null) {
                gd3 gd3Var2 = (gd3) iBinder;
                jSONObject2 = c(gd3Var2);
                if (gd3Var2.T.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(b(this.V));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    public final JSONObject c(gd3 gd3Var) {
        JSONObject b;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", gd3Var.P);
        jSONObject.put("responseSecsSinceEpoch", gd3Var.U);
        jSONObject.put("responseId", gd3Var.Q);
        if (((Boolean) w82.d.c.a(x92.O7)).booleanValue()) {
            String str = gd3Var.V;
            if (!TextUtils.isEmpty(str)) {
                sv2.b("Bidding data: ".concat(String.valueOf(str)));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.W)) {
            jSONObject.put("adRequestUrl", this.W);
        }
        if (!TextUtils.isEmpty(this.X)) {
            jSONObject.put("postBody", this.X);
        }
        JSONArray jSONArray = new JSONArray();
        for (fw5 fw5Var : gd3Var.T) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", fw5Var.P);
            jSONObject2.put("latencyMillis", fw5Var.Q);
            if (((Boolean) w82.d.c.a(x92.P7)).booleanValue()) {
                jSONObject2.put("credentials", n62.f.a.f(fw5Var.S));
            }
            tz3 tz3Var = fw5Var.R;
            if (tz3Var == null) {
                b = null;
            } else {
                b = b(tz3Var);
            }
            jSONObject2.put("error", b);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // defpackage.ff3
    public final void f(hi4 hi4Var) {
        if (!((List) hi4Var.b.P).isEmpty()) {
            this.S = ((yh4) ((List) hi4Var.b.P).get(0)).b;
        }
        if (!TextUtils.isEmpty(((ci4) hi4Var.b.Q).k)) {
            this.W = ((ci4) hi4Var.b.Q).k;
        }
        if (TextUtils.isEmpty(((ci4) hi4Var.b.Q).l)) {
            return;
        }
        this.X = ((ci4) hi4Var.b.Q).l;
    }

    @Override // defpackage.qd3
    public final void p(tz3 tz3Var) {
        this.T = tt3.AD_LOAD_FAILED;
        this.V = tz3Var;
        if (((Boolean) w82.d.c.a(x92.T7)).booleanValue()) {
            this.P.b(this.Q, this);
        }
    }

    @Override // defpackage.ff3
    public final void q0(rq2 rq2Var) {
        if (!((Boolean) w82.d.c.a(x92.T7)).booleanValue()) {
            this.P.b(this.Q, this);
        }
    }

    @Override // defpackage.oe3
    public final void u(ea3 ea3Var) {
        this.U = ea3Var.f;
        this.T = tt3.AD_LOADED;
        if (((Boolean) w82.d.c.a(x92.T7)).booleanValue()) {
            this.P.b(this.Q, this);
        }
    }
}