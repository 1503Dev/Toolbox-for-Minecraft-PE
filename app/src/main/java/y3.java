package defpackage;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: y3  reason: default package */
public final class y3 {
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ y3(JSONObject jSONObject) {
        this.a = jSONObject.optString("productId");
        this.b = jSONObject.optString("productType");
        String optString = jSONObject.optString("offerToken");
        this.c = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        if (this.a.equals(y3Var.a) && this.b.equals(y3Var.b) && ((str = this.c) == (str2 = y3Var.c) || (str != null && str.equals(str2)))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", this.a, this.b, this.c);
    }
}