package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bo1  reason: default package */
public final class bo1 extends lo1 {
    public static final Parcelable.Creator<bo1> CREATOR = new ao1();
    public final String Q;
    public final String R;
    public final String S;

    public bo1(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = zn4.a;
        this.Q = readString;
        this.R = parcel.readString();
        this.S = parcel.readString();
    }

    public bo1(String str, String str2, String str3) {
        super("COMM");
        this.Q = str;
        this.R = str2;
        this.S = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bo1.class == obj.getClass()) {
            bo1 bo1Var = (bo1) obj;
            if (zn4.b(this.R, bo1Var.R) && zn4.b(this.Q, bo1Var.Q) && zn4.b(this.S, bo1Var.S)) {
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
        return (((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // defpackage.lo1
    public final String toString() {
        String str = this.P;
        String str2 = this.Q;
        String str3 = this.R;
        return str + ": language=" + str2 + ", description=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeString(this.S);
    }
}