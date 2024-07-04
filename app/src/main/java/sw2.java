package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sw2  reason: default package */
public final class sw2 extends f0 {
    public static final Parcelable.Creator<sw2> CREATOR = new dg3();
    public final String P;
    public final String Q;

    public sw2(String str, String str2) {
        this.P = str;
        this.Q = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 1, this.P);
        tv2.k(parcel, 2, this.Q);
        tv2.A(parcel, s);
    }
}