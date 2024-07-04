package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: gi2  reason: default package */
public final class gi2 extends f0 {
    public static final Parcelable.Creator<gi2> CREATOR = new hi2();
    public final int P;
    public final int Q;
    public final String R;
    public final int S;

    public gi2(int i, int i2, int i3, String str) {
        this.P = i;
        this.Q = i2;
        this.R = str;
        this.S = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.Q);
        tv2.k(parcel, 2, this.R);
        tv2.g(parcel, 3, this.S);
        tv2.g(parcel, 1000, this.P);
        tv2.A(parcel, s);
    }
}