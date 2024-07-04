package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: sg0  reason: default package */
public final class sg0 {
    public final String a;
    public final String b;
    public final JSONObject c;

    public sg0(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
    }

    @Deprecated
    public final ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.c.has("productIds")) {
            JSONArray optJSONArray = this.c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (this.c.has("productId")) {
            arrayList.add(this.c.optString("productId"));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg0)) {
            return false;
        }
        sg0 sg0Var = (sg0) obj;
        if (TextUtils.equals(this.a, sg0Var.a) && TextUtils.equals(this.b, sg0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.a));
    }
}