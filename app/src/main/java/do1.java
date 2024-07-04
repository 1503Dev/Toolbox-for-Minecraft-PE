package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: do1  reason: default package */
public final class do1 extends lo1 {
    public static final Parcelable.Creator<do1> CREATOR = new co1();
    public final String Q;
    public final String R;
    public final String S;
    public final byte[] T;

    public do1(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = zn4.a;
        this.Q = readString;
        this.R = parcel.readString();
        this.S = parcel.readString();
        this.T = parcel.createByteArray();
    }

    public do1(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.Q = str;
        this.R = str2;
        this.S = str3;
        this.T = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && do1.class == obj.getClass()) {
            do1 do1Var = (do1) obj;
            if (zn4.b(this.Q, do1Var.Q) && zn4.b(this.R, do1Var.R) && zn4.b(this.S, do1Var.S) && Arrays.equals(this.T, do1Var.T)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.Q;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.R;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = hashCode + 527;
        String str3 = this.S;
        return Arrays.hashCode(this.T) + (((((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // defpackage.lo1
    public final String toString() {
        String str = this.P;
        String str2 = this.Q;
        String str3 = this.R;
        return qq.d(sd1.b(str, ": mimeType=", str2, ", filename=", str3), ", description=", this.S);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Q);
        parcel.writeString(this.R);
        parcel.writeString(this.S);
        parcel.writeByteArray(this.T);
    }
}