package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mm4  reason: default package */
public final class mm4 extends f0 {
    public static final Parcelable.Creator<mm4> CREATOR = new fn4();
    public final int P;
    public final int Q;

    public mm4() {
        throw null;
    }

    public mm4(int i, int i2) {
        this.P = i;
        this.Q = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.g(parcel, 2, this.Q);
        tv2.A(parcel, s);
    }
}