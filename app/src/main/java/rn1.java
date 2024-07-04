package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rn1  reason: default package */
public final class rn1 implements et2 {
    public static final Parcelable.Creator<rn1> CREATOR = new qn1();
    public final int P;
    public final String Q;
    public final String R;
    public final String S;
    public final boolean T;
    public final int U;

    public rn1(int i, int i2, String str, String str2, String str3, boolean z) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        tv2.G(z2);
        this.P = i;
        this.Q = str;
        this.R = str2;
        this.S = str3;
        this.T = z;
        this.U = i2;
    }

    public rn1(Parcel parcel) {
        this.P = parcel.readInt();
        this.Q = parcel.readString();
        this.R = parcel.readString();
        this.S = parcel.readString();
        int i = zn4.a;
        this.T = parcel.readInt() != 0;
        this.U = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rn1.class == obj.getClass()) {
            rn1 rn1Var = (rn1) obj;
            if (this.P == rn1Var.P && zn4.b(this.Q, rn1Var.Q) && zn4.b(this.R, rn1Var.R) && zn4.b(this.S, rn1Var.S) && this.T == rn1Var.T && this.U == rn1Var.U) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.P + 527;
        String str = this.Q;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = i * 31;
        String str2 = this.R;
        int hashCode2 = (((i2 + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.S;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.T ? 1 : 0)) * 31) + this.U;
    }

    public final String toString() {
        String str = this.R;
        String str2 = this.Q;
        int i = this.P;
        int i2 = this.U;
        StringBuilder b = sd1.b("IcyHeaders: name=\"", str, "\", genre=\"", str2, "\", bitrate=");
        b.append(i);
        b.append(", metadataInterval=");
        b.append(i2);
        return b.toString();
    }

    @Override // defpackage.et2
    public final void w(vo2 vo2Var) {
        String str = this.R;
        if (str != null) {
            vo2Var.v = str;
        }
        String str2 = this.Q;
        if (str2 != null) {
            vo2Var.u = str2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.P);
        parcel.writeString(this.Q);
        parcel.writeString(this.R);
        parcel.writeString(this.S);
        boolean z = this.T;
        int i2 = zn4.a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.U);
    }
}