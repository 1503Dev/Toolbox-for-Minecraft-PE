package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: by5  reason: default package */
public final class by5 extends f0 {
    public static final Parcelable.Creator<by5> CREATOR = new ez5();
    public final int P;

    public by5(int i) {
        this.P = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 2, this.P);
        tv2.A(parcel, s);
    }
}