package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jq4  reason: default package */
public final class jq4 extends f0 {
    public static final Parcelable.Creator<jq4> CREATOR = new kq4();
    public final int P;
    public final int Q;
    public final String R;
    public final String S;
    public final int T;

    public jq4(int i, int i2, int i3, String str, String str2) {
        this.P = i;
        this.Q = i2;
        this.R = str;
        this.S = str2;
        this.T = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.g(parcel, 2, this.Q);
        tv2.k(parcel, 3, this.R);
        tv2.k(parcel, 4, this.S);
        tv2.g(parcel, 5, this.T);
        tv2.A(parcel, s);
    }
}