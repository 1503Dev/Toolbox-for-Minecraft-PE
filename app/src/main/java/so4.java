package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: so4  reason: default package */
public final class so4 implements do4 {
    public static final so4 g = new so4();
    public static final Handler h = new Handler(Looper.getMainLooper());
    public static Handler i = null;
    public static final oo4 j = new oo4();
    public static final po4 k = new po4();
    public long f;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final mo4 d = new mo4();
    public final ka2 c = new ka2();
    public final no4 e = new no4(new h43());

    public static void b() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(j);
            i.postDelayed(k, 200L);
        }
    }

    public final void a(View view, eo4 eo4Var, JSONObject jSONObject, boolean z) {
        char c;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        if (ko4.a(view) == null) {
            mo4 mo4Var = this.d;
            if (mo4Var.d.contains(view)) {
                c = 1;
            } else if (mo4Var.i) {
                c = 2;
            } else {
                c = 3;
            }
            if (c == 3) {
                return;
            }
            JSONObject g2 = eo4Var.g(view);
            WindowManager windowManager = jo4.a;
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    jSONObject.put("childViews", optJSONArray);
                }
                optJSONArray.put(g2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            mo4 mo4Var2 = this.d;
            if (mo4Var2.a.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) mo4Var2.a.get(view);
                if (obj2 != null) {
                    mo4Var2.a.remove(view);
                }
                obj = obj2;
            }
            boolean z5 = false;
            if (obj != null) {
                try {
                    g2.put("adSessionId", obj);
                } catch (JSONException e2) {
                    ar.o("Error with setting ad session id", e2);
                }
                mo4 mo4Var3 = this.d;
                if (mo4Var3.h.containsKey(view)) {
                    mo4Var3.h.put(view, Boolean.TRUE);
                } else {
                    z5 = true;
                }
                try {
                    g2.put("hasWindowFocus", Boolean.valueOf(z5));
                } catch (JSONException e3) {
                    ar.o("Error with setting not visible reason", e3);
                }
                this.d.i = true;
                return;
            }
            mo4 mo4Var4 = this.d;
            lo4 lo4Var = (lo4) mo4Var4.b.get(view);
            if (lo4Var != null) {
                mo4Var4.b.remove(view);
            }
            if (lo4Var != null) {
                wn4 wn4Var = lo4Var.a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = lo4Var.b;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    jSONArray.put((String) arrayList.get(i2));
                }
                try {
                    g2.put("isFriendlyObstructionFor", jSONArray);
                    g2.put("friendlyObstructionClass", wn4Var.b);
                    g2.put("friendlyObstructionPurpose", wn4Var.c);
                    g2.put("friendlyObstructionReason", wn4Var.d);
                } catch (JSONException e4) {
                    ar.o("Error with setting friendly obstruction", e4);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z && !z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (c == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            eo4Var.a(view, g2, this, z4, z3);
        }
    }
}