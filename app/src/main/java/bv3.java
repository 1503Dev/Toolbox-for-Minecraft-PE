package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bv3  reason: default package */
public final class bv3 extends f0 {
    public static final Parcelable.Creator<bv3> CREATOR = new ov3();
    public final int P;

    public bv3(int i) {
        this.P = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 2, this.P);
        tv2.A(parcel, s);
    }
}