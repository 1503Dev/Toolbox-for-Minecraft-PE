package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ei2  reason: default package */
public final class ei2 extends f0 {
    public static final Parcelable.Creator<ei2> CREATOR = new fi2();
    public final String P;
    public final Bundle Q;

    public ei2(Bundle bundle, String str) {
        this.P = str;
        this.Q = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 1, this.P);
        tv2.b(parcel, 2, this.Q);
        tv2.A(parcel, s);
    }
}