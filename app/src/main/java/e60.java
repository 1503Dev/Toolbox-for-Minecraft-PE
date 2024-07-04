package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e60  reason: default package */
public final class e60 extends f0 {
    public static final Parcelable.Creator<e60> CREATOR = new ti1();
    public final int P;
    public final int Q;
    public final int R;
    public final long S;
    public final long T;
    public final String U;
    public final String V;
    public final int W;
    public final int X;

    public e60(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.P = i;
        this.Q = i2;
        this.R = i3;
        this.S = j;
        this.T = j2;
        this.U = str;
        this.V = str2;
        this.W = i4;
        this.X = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.g(parcel, 2, this.Q);
        tv2.g(parcel, 3, this.R);
        tv2.h(parcel, 4, this.S);
        tv2.h(parcel, 5, this.T);
        tv2.k(parcel, 6, this.U);
        tv2.k(parcel, 7, this.V);
        tv2.g(parcel, 8, this.W);
        tv2.g(parcel, 9, this.X);
        tv2.A(parcel, s);
    }
}