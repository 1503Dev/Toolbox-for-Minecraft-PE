package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: z63  reason: default package */
public final class z63 implements wy4, kg4, ug4, v64 {
    public final /* synthetic */ int P;
    public final Object Q;

    public /* synthetic */ z63(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    public static void a(Map map, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("pii");
        if (optJSONObject == null) {
            vz3.k("DSID signal does not exist.");
            return;
        }
        if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
            map.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
        }
        if (TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
            return;
        }
        map.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
    }

    @Override // defpackage.ug4
    public final vc3 b(tg4 tg4Var) {
        return ((qh4) this.Q).c(tg4Var);
    }

    @Override // defpackage.kg4, defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        switch (this.P) {
            case 3:
                ((q33) obj).j0((tz3) this.Q);
                return;
            default:
                int i = bm5.X;
                ((b53) obj).v(((jn5) this.Q).i.d);
                return;
        }
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        String str = (String) obj;
        a73 a73Var = (a73) this.Q;
        fj4 fj4Var = a73Var.W;
        bn4 bn4Var = a73Var.V;
        hi4 hi4Var = a73Var.T;
        yh4 yh4Var = a73Var.U;
        ArrayList b = bn4Var.b(hi4Var, yh4Var, false, "", str, yh4Var.c);
        int i = 1;
        if (true == jv5.A.g.g(((a73) this.Q).P)) {
            i = 2;
        }
        fj4Var.getClass();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            fj4Var.b(i, (String) it.next());
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
    }
}