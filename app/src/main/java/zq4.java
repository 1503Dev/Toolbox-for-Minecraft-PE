package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zq4  reason: default package */
public final class zq4 extends f0 {
    public static final Parcelable.Creator<zq4> CREATOR = new or4();
    public final boolean P;
    public final boolean Q;
    public final boolean R;

    public zq4(q31 q31Var) {
        this(q31Var.a, q31Var.b, q31Var.c);
    }

    public zq4(boolean z, boolean z2, boolean z3) {
        this.P = z;
        this.Q = z2;
        this.R = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.a(parcel, 2, this.P);
        tv2.a(parcel, 3, this.Q);
        tv2.a(parcel, 4, this.R);
        tv2.A(parcel, s);
    }
}