package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: tl5  reason: default package */
public final class tl5 extends f0 {
    public static final Parcelable.Creator<tl5> CREATOR = new rm5();
    public final boolean P;
    public final boolean Q;
    public final String R;
    public final boolean S;
    public final float T;
    public final int U;
    public final boolean V;
    public final boolean W;
    public final boolean X;

    public tl5(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.P = z;
        this.Q = z2;
        this.R = str;
        this.S = z3;
        this.T = f;
        this.U = i;
        this.V = z4;
        this.W = z5;
        this.X = z6;
    }

    public tl5(boolean z, boolean z2, boolean z3, float f, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, -1, z4, z5, z6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.a(parcel, 2, this.P);
        tv2.a(parcel, 3, this.Q);
        tv2.k(parcel, 4, this.R);
        tv2.a(parcel, 5, this.S);
        float f = this.T;
        parcel.writeInt(262150);
        parcel.writeFloat(f);
        tv2.g(parcel, 7, this.U);
        tv2.a(parcel, 8, this.V);
        tv2.a(parcel, 9, this.W);
        tv2.a(parcel, 10, this.X);
        tv2.A(parcel, s);
    }
}