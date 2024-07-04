package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fw5  reason: default package */
public final class fw5 extends f0 {
    public static final Parcelable.Creator<fw5> CREATOR = new ex5();
    public final String P;
    public long Q;
    public tz3 R;
    public final Bundle S;
    public final String T;
    public final String U;
    public final String V;
    public final String W;

    public fw5(String str, long j, tz3 tz3Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.P = str;
        this.Q = j;
        this.R = tz3Var;
        this.S = bundle;
        this.T = str2;
        this.U = str3;
        this.V = str4;
        this.W = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 1, this.P);
        tv2.h(parcel, 2, this.Q);
        tv2.i(parcel, 3, this.R, i);
        tv2.b(parcel, 4, this.S);
        tv2.k(parcel, 5, this.T);
        tv2.k(parcel, 6, this.U);
        tv2.k(parcel, 7, this.V);
        tv2.k(parcel, 8, this.W);
        tv2.A(parcel, s);
    }
}