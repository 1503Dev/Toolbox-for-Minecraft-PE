package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jh2  reason: default package */
public final class jh2 extends f0 {
    public static final Parcelable.Creator<jh2> CREATOR = new kh2();
    public final String P;
    public final String[] Q;
    public final String[] R;

    public jh2(String str, String[] strArr, String[] strArr2) {
        this.P = str;
        this.Q = strArr;
        this.R = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 1, this.P);
        tv2.l(parcel, 2, this.Q);
        tv2.l(parcel, 3, this.R);
        tv2.A(parcel, s);
    }
}