package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f64  reason: default package */
public final class f64 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Executor d;
    public JSONObject e;

    public f64(yw2 yw2Var) {
        this.d = yw2Var;
    }

    public static final Bundle f(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.a.containsKey(str)) {
            return;
        }
        this.a.put(str, new g64(new Bundle(), str));
    }

    public final synchronized ArrayList b(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle f = f(jSONObject.optJSONObject("data"));
        JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (optJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i, "");
            if (!TextUtils.isEmpty(optString)) {
                arrayList2.add(optString);
            }
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) arrayList2.get(i2);
            a(str);
            if (((g64) this.a.get(str)) != null) {
                arrayList.add(new g64(f, str));
            }
        }
        return arrayList;
    }

    public final synchronized void c(String str, String str2, ArrayList arrayList) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.c.get(str);
        if (map == null) {
            map = new HashMap();
        }
        this.c.put(str, map);
        List list = (List) map.get(str2);
        if (list == null) {
            list = new ArrayList();
        }
        list.addAll(arrayList);
        map.put(str2, list);
    }

    public final synchronized void d() {
        String optString;
        JSONArray optJSONArray;
        JSONObject jSONObject = jv5.A.g.b().f().g;
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                this.e = jSONObject.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                        if (((Boolean) w82.d.c.a(x92.w8)).booleanValue()) {
                            optString = jSONObject2.optString("ad_unit_id", "").toLowerCase(Locale.ROOT);
                        } else {
                            optString = jSONObject2.optString("ad_unit_id", "");
                        }
                        String optString2 = jSONObject2.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject2.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                arrayList.addAll(b(optJSONArray.getJSONObject(i2)));
                            }
                        }
                        c(optString2, optString, arrayList);
                    }
                }
            } catch (JSONException e) {
                vz3.l("Malformed config loading JSON.", e);
            }
        }
    }

    public final synchronized void e() {
        if (!((Boolean) tb2.d.d()).booleanValue()) {
            if (((Boolean) w82.d.c.a(x92.t1)).booleanValue()) {
                JSONObject jSONObject = jv5.A.g.b().f().g;
                if (jSONObject == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        Bundle f = f(jSONObject2.optJSONObject("data"));
                        String optString = jSONObject2.optString("adapter_class_name");
                        boolean optBoolean = jSONObject2.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.b.put(optString, new i64(f, optString, optBoolean2, optBoolean));
                        }
                    }
                } catch (JSONException e) {
                    vz3.l("Malformed config loading JSON.", e);
                }
            }
        }
    }
}