package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: tn1  reason: default package */
public final class tn1 extends lo1 {
    public static final Parcelable.Creator<tn1> CREATOR = new sn1();
    public final String Q;
    public final String R;
    public final int S;
    public final byte[] T;

    public tn1(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = zn4.a;
        this.Q = readString;
        this.R = parcel.readString();
        this.S = parcel.readInt();
        this.T = parcel.createByteArray();
    }

    public tn1(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.Q = str;
        this.R = str2;
        this.S = i;
        this.T = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tn1.class == obj.getClass()) {
            tn1 tn1Var = (tn1) obj;
            if (this.S == tn1Var.S && zn4.b(this.Q, tn1Var.Q) && zn4.b(this.R, tn1Var.R) && Arrays.equals(this.T, tn1Var.T)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.S + 527;
        String str = this.Q;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = i * 31;
        String str2 = this.R;
        return Arrays.hashCode(this.T) + ((((i2 + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.lo1
    public final String toString() {
        String str = this.P;
        String str2 = this.Q;
        String str3 = this.R;
        return str + ": mimeType=" + str2 + ", description=" + str3;
    }

    @Override // defpackage.lo1, defpackage.et2
    public final void w(vo2 vo2Var) {
        vo2Var.a(this.T, this.S);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Q);
        parcel.writeString(this.R);
        parcel.writeInt(this.S);
        parcel.writeByteArray(this.T);
    }
}