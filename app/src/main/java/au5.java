package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: au5  reason: default package */
public final class au5 extends f0 {
    public static final Parcelable.Creator<au5> CREATOR = new bv5();
    public final int P;
    public final int Q;
    public final String R;
    public final long S;

    public au5(int i, int i2, long j, String str) {
        this.P = i;
        this.Q = i2;
        this.R = str;
        this.S = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.g(parcel, 2, this.Q);
        tv2.k(parcel, 3, this.R);
        tv2.h(parcel, 4, this.S);
        tv2.A(parcel, s);
    }
}