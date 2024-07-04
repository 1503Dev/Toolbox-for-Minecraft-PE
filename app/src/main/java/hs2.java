package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: hs2  reason: default package */
public final class hs2 extends f0 {
    public static final Parcelable.Creator<hs2> CREATOR = new is2();
    public final String P;
    public final String Q;

    public hs2(String str, String str2) {
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