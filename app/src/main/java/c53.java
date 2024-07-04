package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c53  reason: default package */
public final class c53 extends f0 {
    public static final Parcelable.Creator<c53> CREATOR = new p53();
    public final long P;
    public final long Q;
    public final boolean R;
    public final String S;
    public final String T;
    public final String U;
    public final Bundle V;
    public final String W;

    public c53(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.P = j;
        this.Q = j2;
        this.R = z;
        this.S = str;
        this.T = str2;
        this.U = str3;
        this.V = bundle;
        this.W = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.h(parcel, 1, this.P);
        tv2.h(parcel, 2, this.Q);
        tv2.a(parcel, 3, this.R);
        tv2.k(parcel, 4, this.S);
        tv2.k(parcel, 5, this.T);
        tv2.k(parcel, 6, this.U);
        tv2.b(parcel, 7, this.V);
        tv2.k(parcel, 8, this.W);
        tv2.A(parcel, s);
    }
}