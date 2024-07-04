package defpackage;

import androidx.fragment.app.FragmentActivity;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: nr  reason: default package */
public final class nr {
    public final /* synthetic */ int a = 2;
    public final Object b;

    public nr() {
        this(new JSONArray());
    }

    public final void a(ic1 ic1Var) {
        synchronized (((JSONArray) this.b)) {
            ((JSONArray) this.b).put(ic1Var.a);
        }
    }

    public final boolean b(String str) {
        boolean z;
        synchronized (((JSONArray) this.b)) {
            z = false;
            int i = 0;
            while (true) {
                if (i >= ((JSONArray) this.b).length()) {
                    break;
                } else if (g(i).equals(str)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        return z;
    }

    public final int c() {
        return ((JSONArray) this.b).length();
    }

    public final void d(String str) {
        synchronized (((JSONArray) this.b)) {
            ((JSONArray) this.b).put(str);
        }
    }

    public final ic1 e(int i) {
        ic1 ic1Var;
        synchronized (((JSONArray) this.b)) {
            JSONObject optJSONObject = ((JSONArray) this.b).optJSONObject(i);
            ic1Var = optJSONObject != null ? new ic1(optJSONObject) : new ic1();
        }
        return ic1Var;
    }

    public final ic1[] f() {
        ic1[] ic1VarArr;
        synchronized (((JSONArray) this.b)) {
            ic1VarArr = new ic1[((JSONArray) this.b).length()];
            for (int i = 0; i < ((JSONArray) this.b).length(); i++) {
                ic1VarArr[i] = e(i);
            }
        }
        return ic1VarArr;
    }

    public final String g(int i) {
        String optString;
        synchronized (((JSONArray) this.b)) {
            optString = ((JSONArray) this.b).optString(i);
        }
        return optString;
    }

    public final void h(int i) {
        synchronized (((JSONArray) this.b)) {
            ((JSONArray) this.b).put(i);
        }
    }

    public final void i() {
        ((or) this.b).S.W();
    }

    public final String toString() {
        String jSONArray;
        switch (this.a) {
            case 2:
                synchronized (((JSONArray) this.b)) {
                    jSONArray = ((JSONArray) this.b).toString();
                }
                return jSONArray;
            default:
                return super.toString();
        }
    }

    public nr(FragmentActivity.a aVar) {
        this.b = aVar;
    }

    public nr(String str) {
        this(new JSONArray(str));
    }

    public nr(JSONArray jSONArray) {
        jSONArray.getClass();
        this.b = jSONArray;
    }
}