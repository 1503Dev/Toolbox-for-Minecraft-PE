package defpackage;

import android.text.TextUtils;
import org.json.JSONObject;

@Deprecated
/* renamed from: gt0  reason: default package */
public final class gt0 {
    public final String a;
    public final JSONObject b;

    public gt0(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public final String a() {
        return this.b.optString("type");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gt0) {
            return TextUtils.equals(this.a, ((gt0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.a));
    }
}