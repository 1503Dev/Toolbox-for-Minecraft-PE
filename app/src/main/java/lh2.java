package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lh2  reason: default package */
public final class lh2 extends f0 {
    public static final Parcelable.Creator<lh2> CREATOR = new mh2();
    public final boolean P;
    public final String Q;
    public final int R;
    public final byte[] S;
    public final String[] T;
    public final String[] U;
    public final boolean V;
    public final long W;

    public lh2(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.P = z;
        this.Q = str;
        this.R = i;
        this.S = bArr;
        this.T = strArr;
        this.U = strArr2;
        this.V = z2;
        this.W = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.a(parcel, 1, this.P);
        tv2.k(parcel, 2, this.Q);
        tv2.g(parcel, 3, this.R);
        tv2.c(parcel, 4, this.S);
        tv2.l(parcel, 5, this.T);
        tv2.l(parcel, 6, this.U);
        tv2.a(parcel, 7, this.V);
        tv2.h(parcel, 8, this.W);
        tv2.A(parcel, s);
    }
}