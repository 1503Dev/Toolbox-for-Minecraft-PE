package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aq4  reason: default package */
public final class aq4 extends f0 {
    public static final Parcelable.Creator<aq4> CREATOR = new bq4();
    public final int P;
    public final String Q;
    public final String R;

    public aq4(String str, String str2, int i) {
        this.P = i;
        this.Q = str;
        this.R = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.k(parcel, 2, this.Q);
        tv2.k(parcel, 3, this.R);
        tv2.A(parcel, s);
    }
}