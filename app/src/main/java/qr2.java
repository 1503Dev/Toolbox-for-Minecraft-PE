package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* renamed from: qr2  reason: default package */
public final class qr2 extends f0 {
    public static final Parcelable.Creator<qr2> CREATOR = new rr2();
    public final String P;
    public final int Q;

    public qr2(String str, int i) {
        this.P = str;
        this.Q = i;
    }

    public static qr2 c(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new qr2(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof qr2)) {
            qr2 qr2Var = (qr2) obj;
            if (wa0.a(this.P, qr2Var.P) && wa0.a(Integer.valueOf(this.Q), Integer.valueOf(qr2Var.Q))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.P, Integer.valueOf(this.Q)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 2, this.P);
        tv2.g(parcel, 3, this.Q);
        tv2.A(parcel, s);
    }
}