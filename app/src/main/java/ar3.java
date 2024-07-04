package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ar3  reason: default package */
public final class ar3 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public JSONObject b;
    public final Executor c;
    public boolean d;
    public JSONObject e;

    public ar3(yw2 yw2Var) {
        this.c = yw2Var;
    }

    public final synchronized void a() {
        JSONObject jSONObject;
        Map map;
        this.d = true;
        su2 f = jv5.A.g.b().f();
        if (f == null) {
            return;
        }
        JSONObject jSONObject2 = f.g;
        if (jSONObject2 == null) {
            return;
        }
        if (((Boolean) w82.d.c.a(x92.o3)).booleanValue()) {
            jSONObject = jSONObject2.optJSONObject("common_settings");
        } else {
            jSONObject = null;
        }
        this.b = jSONObject;
        this.e = jSONObject2.optJSONObject("ad_unit_patterns");
        JSONArray optJSONArray = jSONObject2.optJSONArray("ad_unit_id_settings");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("ad_unit_id");
                    String optString2 = optJSONObject.optString("format");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                    if (optString != null && optJSONObject2 != null && optString2 != null) {
                        if (this.a.containsKey(optString2)) {
                            map = (Map) this.a.get(optString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.a.put(optString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(optString, optJSONObject2);
                    }
                }
            }
        }
    }
}