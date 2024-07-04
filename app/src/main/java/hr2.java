package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hr2  reason: default package */
public final class hr2 extends f0 {
    public static final Parcelable.Creator<hr2> CREATOR = new ir2();
    public final pn5 P;
    public final String Q;

    public hr2(pn5 pn5Var, String str) {
        this.P = pn5Var;
        this.Q = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.i(parcel, 2, this.P, i);
        tv2.k(parcel, 3, this.Q);
        tv2.A(parcel, s);
    }
}