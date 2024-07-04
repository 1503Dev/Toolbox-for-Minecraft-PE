package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ni1  reason: default package */
public final class ni1 extends f0 {
    public static final Parcelable.Creator<ni1> CREATOR = new qi1();
    public final int P;
    public final gf Q;
    public final fj1 R;

    public ni1(int i, gf gfVar, fj1 fj1Var) {
        this.P = i;
        this.Q = gfVar;
        this.R = fj1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.i(parcel, 2, this.Q, i);
        tv2.i(parcel, 3, this.R, i);
        tv2.A(parcel, s);
    }
}