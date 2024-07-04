package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bo4  reason: default package */
public final class bo4 extends f0 {
    public static final Parcelable.Creator<bo4> CREATOR = new wo4();
    public final String P;

    public bo4() {
        throw null;
    }

    public bo4(String str) {
        this.P = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 15, this.P);
        tv2.A(parcel, s);
    }
}