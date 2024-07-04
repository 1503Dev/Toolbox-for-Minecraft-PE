package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xp4  reason: default package */
public final class xp4 extends f0 {
    public static final Parcelable.Creator<xp4> CREATOR = new yp4();
    public final int P;
    public final byte[] Q;

    public xp4(byte[] bArr, int i) {
        this.P = i;
        this.Q = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.c(parcel, 2, this.Q);
        tv2.A(parcel, s);
    }
}