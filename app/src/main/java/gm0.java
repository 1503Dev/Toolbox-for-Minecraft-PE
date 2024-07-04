package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gm0  reason: default package */
public final class gm0 extends f0 {
    public static final Parcelable.Creator<gm0> CREATOR = new as1();
    public final int P;
    public final boolean Q;
    public final boolean R;
    public final int S;
    public final int T;

    public gm0(int i, boolean z, boolean z2, int i2, int i3) {
        this.P = i;
        this.Q = z;
        this.R = z2;
        this.S = i2;
        this.T = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.a(parcel, 2, this.Q);
        tv2.a(parcel, 3, this.R);
        tv2.g(parcel, 4, this.S);
        tv2.g(parcel, 5, this.T);
        tv2.A(parcel, s);
    }
}