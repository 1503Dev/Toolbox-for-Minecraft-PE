package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vo1  reason: default package */
public final class vo1 extends lo1 {
    public static final Parcelable.Creator<vo1> CREATOR = new uo1();
    public final String Q;
    public final String R;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vo1(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = zn4.a;
        this.Q = parcel.readString();
        this.R = parcel.readString();
    }

    public vo1(String str, String str2, String str3) {
        super(str);
        this.Q = str2;
        this.R = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vo1.class == obj.getClass()) {
            vo1 vo1Var = (vo1) obj;
            if (this.P.equals(vo1Var.P) && zn4.b(this.Q, vo1Var.Q) && zn4.b(this.R, vo1Var.R)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.P.hashCode() + 527;
        String str = this.Q;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int i = hashCode * 31;
        String str2 = this.R;
        return ((i + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.lo1
    public final String toString() {
        return ij.c(this.P, ": url=", this.R);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeString(this.R);
    }
}