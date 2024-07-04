package defpackage;

import android.database.sqlite.SQLiteDatabase;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yn2  reason: default package */
public class yn2 implements iu4, bl4, o74, v64 {
    public final Object P;
    public final Object Q;

    public /* synthetic */ yn2(Object obj, Object obj2) {
        this.P = obj;
        this.Q = obj2;
    }

    @Override // defpackage.iu4
    /* renamed from: a */
    public final fv4 mo4a() {
        l03 l03Var = (l03) this.P;
        return new b03(l03Var.R, ((iu4) this.Q).mo4a(), l03Var.e0, l03Var.f0, l03Var, new ee4(4, l03Var));
    }

    public final void c(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", (String) this.Q);
            y03 y03Var = (y03) this.P;
            if (y03Var != null) {
                y03Var.p("onError", put);
            }
        } catch (JSONException e) {
            sv2.e("Error occurred while dispatching error event.", e);
        }
    }

    public final void d(int i, int i2, int i3, int i4) {
        try {
            ((y03) this.P).p("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            sv2.e("Error occurred while dispatching size change.", e);
        }
    }

    @Override // defpackage.bl4
    public final Object e(Object obj) {
        int i = r04.R;
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{(String) this.Q, Integer.toString(0)});
        return null;
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        jo5 jo5Var = (jo5) obj;
    }

    @Override // defpackage.o74
    public final void f(Object obj, hp1 hp1Var) {
        ((jo5) obj).n((o73) this.Q, new f2(hp1Var, ((pp5) this.P).T));
    }
}