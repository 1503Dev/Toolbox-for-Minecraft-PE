package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cw2  reason: default package */
public final class cw2 {
    public final int a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final Map e;
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();
    public final fs3 h;
    public ConcurrentHashMap i;

    public cw2(fs3 fs3Var) {
        this.h = fs3Var;
        m92 m92Var = x92.U5;
        w82 w82Var = w82.d;
        this.a = ((Integer) w82Var.c.a(m92Var)).intValue();
        this.b = ((Long) w82Var.c.a(x92.V5)).longValue();
        this.c = ((Boolean) w82Var.c.a(x92.a6)).booleanValue();
        this.d = ((Boolean) w82Var.c.a(x92.Y5)).booleanValue();
        this.e = Collections.synchronizedMap(new t82(this));
    }

    public final synchronized void a(String str, String str2, xr3 xr3Var) {
        Map map = this.e;
        jv5.A.j.getClass();
        map.put(str, new Pair(Long.valueOf(System.currentTimeMillis()), str2));
        d();
        b(xr3Var);
    }

    public final synchronized void b(xr3 xr3Var) {
        if (this.c) {
            ArrayDeque clone = this.g.clone();
            this.g.clear();
            ArrayDeque clone2 = this.f.clone();
            this.f.clear();
            zw2.a.execute(new hj1(this, xr3Var, clone, clone2, 0));
        }
    }

    public final void c(xr3 xr3Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(xr3Var.a);
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(xi4.a(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.h.a(this.i, false);
        }
    }

    public final synchronized void d() {
        jv5.A.j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.b) {
                    break;
                }
                this.g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            jv5.A.g.f("QueryJsonMap.removeExpiredEntries", e);
        }
    }
}