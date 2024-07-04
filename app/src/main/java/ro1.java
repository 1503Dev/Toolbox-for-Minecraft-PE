package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ro1  reason: default package */
public final class ro1 extends lo1 {
    public static final Parcelable.Creator<ro1> CREATOR = new qo1();
    public final String Q;
    public final byte[] R;

    public ro1(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = zn4.a;
        this.Q = readString;
        this.R = parcel.createByteArray();
    }

    public ro1(String str, byte[] bArr) {
        super("PRIV");
        this.Q = str;
        this.R = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ro1.class == obj.getClass()) {
            ro1 ro1Var = (ro1) obj;
            if (zn4.b(this.Q, ro1Var.Q) && Arrays.equals(this.R, ro1Var.R)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.Q;
        return Arrays.hashCode(this.R) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // defpackage.lo1
    public final String toString() {
        return ij.c(this.P, ": owner=", this.Q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Q);
        parcel.writeByteArray(this.R);
    }
}