package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: pn5  reason: default package */
public final class pn5 extends f0 {
    public static final Parcelable.Creator<pn5> CREATOR = new ep5();
    public final int P;
    @Deprecated
    public final long Q;
    public final Bundle R;
    @Deprecated
    public final int S;
    public final List T;
    public final boolean U;
    public final int V;
    public final boolean W;
    public final String X;
    public final bo4 Y;
    public final Location Z;
    public final String a0;
    public final Bundle b0;
    public final Bundle c0;
    public final List d0;
    public final String e0;
    public final String f0;
    @Deprecated
    public final boolean g0;
    public final sw2 h0;
    public final int i0;
    public final String j0;
    public final List k0;
    public final int l0;
    public final String m0;

    public pn5(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, bo4 bo4Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, sw2 sw2Var, int i4, String str5, List list3, int i5, String str6) {
        this.P = i;
        this.Q = j;
        this.R = bundle == null ? new Bundle() : bundle;
        this.S = i2;
        this.T = list;
        this.U = z;
        this.V = i3;
        this.W = z2;
        this.X = str;
        this.Y = bo4Var;
        this.Z = location;
        this.a0 = str2;
        this.b0 = bundle2 == null ? new Bundle() : bundle2;
        this.c0 = bundle3;
        this.d0 = list2;
        this.e0 = str3;
        this.f0 = str4;
        this.g0 = z3;
        this.h0 = sw2Var;
        this.i0 = i4;
        this.j0 = str5;
        this.k0 = list3 == null ? new ArrayList() : list3;
        this.l0 = i5;
        this.m0 = str6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pn5) {
            pn5 pn5Var = (pn5) obj;
            return this.P == pn5Var.P && this.Q == pn5Var.Q && tv2.y(this.R, pn5Var.R) && this.S == pn5Var.S && wa0.a(this.T, pn5Var.T) && this.U == pn5Var.U && this.V == pn5Var.V && this.W == pn5Var.W && wa0.a(this.X, pn5Var.X) && wa0.a(this.Y, pn5Var.Y) && wa0.a(this.Z, pn5Var.Z) && wa0.a(this.a0, pn5Var.a0) && tv2.y(this.b0, pn5Var.b0) && tv2.y(this.c0, pn5Var.c0) && wa0.a(this.d0, pn5Var.d0) && wa0.a(this.e0, pn5Var.e0) && wa0.a(this.f0, pn5Var.f0) && this.g0 == pn5Var.g0 && this.i0 == pn5Var.i0 && wa0.a(this.j0, pn5Var.j0) && wa0.a(this.k0, pn5Var.k0) && this.l0 == pn5Var.l0 && wa0.a(this.m0, pn5Var.m0);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.P), Long.valueOf(this.Q), this.R, Integer.valueOf(this.S), this.T, Boolean.valueOf(this.U), Integer.valueOf(this.V), Boolean.valueOf(this.W), this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, this.e0, this.f0, Boolean.valueOf(this.g0), Integer.valueOf(this.i0), this.j0, this.k0, Integer.valueOf(this.l0), this.m0});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.h(parcel, 2, this.Q);
        tv2.b(parcel, 3, this.R);
        tv2.g(parcel, 4, this.S);
        tv2.m(parcel, 5, this.T);
        tv2.a(parcel, 6, this.U);
        tv2.g(parcel, 7, this.V);
        tv2.a(parcel, 8, this.W);
        tv2.k(parcel, 9, this.X);
        tv2.i(parcel, 10, this.Y, i);
        tv2.i(parcel, 11, this.Z, i);
        tv2.k(parcel, 12, this.a0);
        tv2.b(parcel, 13, this.b0);
        tv2.b(parcel, 14, this.c0);
        tv2.m(parcel, 15, this.d0);
        tv2.k(parcel, 16, this.e0);
        tv2.k(parcel, 17, this.f0);
        tv2.a(parcel, 18, this.g0);
        tv2.i(parcel, 19, this.h0, i);
        tv2.g(parcel, 20, this.i0);
        tv2.k(parcel, 21, this.j0);
        tv2.m(parcel, 22, this.k0);
        tv2.g(parcel, 23, this.l0);
        tv2.k(parcel, 24, this.m0);
        tv2.A(parcel, s);
    }
}