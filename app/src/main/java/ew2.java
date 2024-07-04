package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ew2  reason: default package */
public final class ew2 extends f0 {
    public static final Parcelable.Creator<ew2> CREATOR = new gg3();
    public final String P;
    public final int Q;

    public ew2(String str, int i) {
        this.P = str;
        this.Q = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 1, this.P);
        tv2.g(parcel, 2, this.Q);
        tv2.A(parcel, s);
    }
}