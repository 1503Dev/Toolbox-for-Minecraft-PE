package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: ku2  reason: default package */
public final class ku2 extends f0 {
    public static final Parcelable.Creator<ku2> CREATOR = new lu2();
    @Deprecated
    public final String P;
    public final String Q;
    @Deprecated
    public final zr5 R;
    public final pn5 S;

    public ku2(String str, String str2, zr5 zr5Var, pn5 pn5Var) {
        this.P = str;
        this.Q = str2;
        this.R = zr5Var;
        this.S = pn5Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 1, this.P);
        tv2.k(parcel, 2, this.Q);
        tv2.i(parcel, 3, this.R, i);
        tv2.i(parcel, 4, this.S, i);
        tv2.A(parcel, s);
    }
}