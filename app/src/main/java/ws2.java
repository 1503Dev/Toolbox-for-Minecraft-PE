package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ws2  reason: default package */
public final class ws2 extends f0 {
    public static final Parcelable.Creator<ws2> CREATOR = new xs2();
    public final String P;
    public final String Q;
    public final boolean R;
    public final boolean S;
    public final List T;
    public final boolean U;
    public final boolean V;
    public final List W;

    public ws2(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.P = str;
        this.Q = str2;
        this.R = z;
        this.S = z2;
        this.T = list;
        this.U = z3;
        this.V = z4;
        this.W = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 2, this.P);
        tv2.k(parcel, 3, this.Q);
        tv2.a(parcel, 4, this.R);
        tv2.a(parcel, 5, this.S);
        tv2.m(parcel, 6, this.T);
        tv2.a(parcel, 7, this.U);
        tv2.a(parcel, 8, this.V);
        tv2.m(parcel, 9, this.W);
        tv2.A(parcel, s);
    }
}