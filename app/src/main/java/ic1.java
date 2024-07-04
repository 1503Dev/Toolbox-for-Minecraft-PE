package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ic1  reason: default package */
public final class ic1 {
    public final JSONObject a;

    public ic1() {
        this.a = new JSONObject();
    }

    public ic1(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final int a(int i, String str) {
        int optInt;
        synchronized (this.a) {
            optInt = this.a.optInt(str, i);
        }
        return optInt;
    }

    public final void b(String str, String str2) {
        synchronized (this.a) {
            this.a.put(str, str2);
        }
    }

    public final boolean c(String str) {
        boolean z;
        synchronized (this.a) {
            Iterator<String> keys = this.a.keys();
            while (true) {
                if (keys.hasNext()) {
                    if (str.equals(keys.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    public final int d(String str) {
        int i;
        synchronized (this.a) {
            i = this.a.getInt(str);
        }
        return i;
    }

    public final void e(int i, String str) {
        synchronized (this.a) {
            this.a.put(str, i);
        }
    }

    public final boolean f() {
        return this.a.length() == 0;
    }

    public final nr g(String str) {
        nr nrVar;
        synchronized (this.a) {
            nrVar = new nr(this.a.getJSONArray(str));
        }
        return nrVar;
    }

    public final String h(String str) {
        String string;
        synchronized (this.a) {
            string = this.a.getString(str);
        }
        return string;
    }

    public final HashMap i() {
        HashMap hashMap = new HashMap();
        synchronized (this.a) {
            Iterator<String> keys = this.a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, q(next));
            }
        }
        return hashMap;
    }

    public final boolean j(String str) {
        boolean optBoolean;
        synchronized (this.a) {
            optBoolean = this.a.optBoolean(str);
        }
        return optBoolean;
    }

    public final Integer k(String str) {
        Integer valueOf;
        try {
            synchronized (this.a) {
                valueOf = Integer.valueOf(this.a.getInt(str));
            }
            return valueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final int l(String str) {
        int optInt;
        synchronized (this.a) {
            optInt = this.a.optInt(str);
        }
        return optInt;
    }

    public final nr m(String str) {
        nr nrVar;
        synchronized (this.a) {
            JSONArray optJSONArray = this.a.optJSONArray(str);
            nrVar = optJSONArray != null ? new nr(optJSONArray) : null;
        }
        return nrVar;
    }

    public final ic1 n(String str) {
        ic1 ic1Var;
        synchronized (this.a) {
            JSONObject optJSONObject = this.a.optJSONObject(str);
            ic1Var = optJSONObject != null ? new ic1(optJSONObject) : new ic1();
        }
        return ic1Var;
    }

    public final ic1 o(String str) {
        ic1 ic1Var;
        synchronized (this.a) {
            JSONObject optJSONObject = this.a.optJSONObject(str);
            ic1Var = optJSONObject != null ? new ic1(optJSONObject) : null;
        }
        return ic1Var;
    }

    public final Object p(String str) {
        Object opt;
        synchronized (this.a) {
            opt = this.a.isNull(str) ? null : this.a.opt(str);
        }
        return opt;
    }

    public final String q(String str) {
        String optString;
        synchronized (this.a) {
            optString = this.a.optString(str);
        }
        return optString;
    }

    public final void r(String str) {
        synchronized (this.a) {
            this.a.remove(str);
        }
    }

    public final String toString() {
        String jSONObject;
        synchronized (this.a) {
            jSONObject = this.a.toString();
        }
        return jSONObject;
    }

    public ic1(String str) {
        this.a = new JSONObject(str);
    }
}