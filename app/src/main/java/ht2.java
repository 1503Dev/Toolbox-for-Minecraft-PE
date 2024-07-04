package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ht2  reason: default package */
public final class ht2 {
    public static ht2 e;
    public final kd a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public ht2(Context context, kd kdVar, f25 f25Var, qt2 qt2Var) {
        this.a = kdVar;
        mj5 a = mj5.a(context);
        mj5 a2 = mj5.a(f25Var);
        mj5 a3 = mj5.a(qt2Var);
        this.b = kj5.b(new at2(a, a2, a3, 0));
        mj5 a4 = mj5.a(kdVar);
        uj5 b = kj5.b(new ct2(a4, a2, a3, 0));
        this.c = b;
        this.d = kj5.b(new vt2(a, new dt2(a4, b), 0));
    }

    public static synchronized ht2 b(Context context) {
        synchronized (ht2.class) {
            ht2 ht2Var = e;
            if (ht2Var != null) {
                return ht2Var;
            }
            Context applicationContext = context.getApplicationContext();
            x92.a(applicationContext);
            jv5 jv5Var = jv5.A;
            nl5 b = jv5Var.g.b();
            b.G(applicationContext);
            applicationContext.getClass();
            dk dkVar = jv5Var.j;
            dkVar.getClass();
            qt2 qt2Var = jv5Var.w;
            tv2.E(qt2.class, qt2Var);
            ht2 ht2Var2 = new ht2(applicationContext, dkVar, b, qt2Var);
            e = ht2Var2;
            ((zs2) ht2Var2.b.c()).a();
            bt2 bt2Var = (bt2) e.a().R;
            bt2Var.getClass();
            l92 l92Var = x92.k0;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                synchronized (bt2Var.c.l) {
                }
            }
            ut2 ut2Var = (ut2) e.d.c();
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) w82Var.c.a(x92.l0));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString = optJSONArray.optString(i);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String str : hashMap.keySet()) {
                        ut2Var.a(str);
                    }
                    st2 st2Var = new st2(ut2Var, hashMap);
                    synchronized (ut2Var) {
                        ut2Var.b.add(st2Var);
                    }
                } catch (JSONException e2) {
                    sv2.c("Failed to parse listening list", e2);
                }
            }
            return e;
        }
    }

    public final ln1 a() {
        return new ln1(2, this.a, (bt2) this.c.c());
    }
}