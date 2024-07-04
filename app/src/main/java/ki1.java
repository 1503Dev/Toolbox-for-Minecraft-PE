package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ki1  reason: default package */
public final class ki1 extends f0 {
    public static final Parcelable.Creator<ki1> CREATOR = new mi1();
    public final int P;
    public final dj1 Q;

    public ki1(int i, dj1 dj1Var) {
        this.P = i;
        this.Q = dj1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.i(parcel, 2, this.Q, i);
        tv2.A(parcel, s);
    }
}