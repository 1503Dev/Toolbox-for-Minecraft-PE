package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vh2  reason: default package */
public final class vh2 extends f0 {
    public static final Parcelable.Creator<vh2> CREATOR = new yh2();
    public final String P;
    public final boolean Q;
    public final int R;
    public final String S;

    public vh2(String str, int i, String str2, boolean z) {
        this.P = str;
        this.Q = z;
        this.R = i;
        this.S = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 1, this.P);
        tv2.a(parcel, 2, this.Q);
        tv2.g(parcel, 3, this.R);
        tv2.k(parcel, 4, this.S);
        tv2.A(parcel, s);
    }
}