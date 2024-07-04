package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: pp2  reason: default package */
public final class pp2 extends f0 {
    public static final Parcelable.Creator<pp2> CREATOR = new qp2();
    public final Bundle A0;
    public final String B0;
    public final bv3 C0;
    public final boolean D0;
    public final Bundle E0;
    public final String F0;
    public final String G0;
    public final String H0;
    public final boolean I0;
    public final List J0;
    public final String K0;
    public final List L0;
    public final int M0;
    public final boolean N0;
    public final boolean O0;
    public final int P;
    public final boolean P0;
    public final Bundle Q;
    public final ArrayList Q0;
    public final pn5 R;
    public final String R0;
    public final zr5 S;
    public final gi2 S0;
    public final String T;
    public final String T0;
    public final ApplicationInfo U;
    public final Bundle U0;
    public final PackageInfo V;
    public final String W;
    public final String X;
    public final String Y;
    public final xv2 Z;
    public final Bundle a0;
    public final int b0;
    public final List c0;
    public final Bundle d0;
    public final boolean e0;
    public final int f0;
    public final int g0;
    public final float h0;
    public final String i0;
    public final long j0;
    public final String k0;
    public final List l0;
    public final String m0;
    public final nc2 n0;
    public final List o0;
    public final long p0;
    public final String q0;
    public final float r0;
    public final int s0;
    public final int t0;
    public final boolean u0;
    public final String v0;
    public final boolean w0;
    public final String x0;
    public final boolean y0;
    public final int z0;

    public pp2(int i, Bundle bundle, pn5 pn5Var, zr5 zr5Var, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, xv2 xv2Var, Bundle bundle2, int i2, ArrayList arrayList, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, ArrayList arrayList2, String str7, nc2 nc2Var, ArrayList arrayList3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, String str9, String str10, boolean z4, int i7, Bundle bundle4, String str11, bv3 bv3Var, boolean z5, Bundle bundle5, String str12, String str13, String str14, boolean z6, ArrayList arrayList4, String str15, ArrayList arrayList5, int i8, boolean z7, boolean z8, boolean z9, ArrayList arrayList6, String str16, gi2 gi2Var, String str17, Bundle bundle6) {
        this.P = i;
        this.Q = bundle;
        this.R = pn5Var;
        this.S = zr5Var;
        this.T = str;
        this.U = applicationInfo;
        this.V = packageInfo;
        this.W = str2;
        this.X = str3;
        this.Y = str4;
        this.Z = xv2Var;
        this.a0 = bundle2;
        this.b0 = i2;
        this.c0 = arrayList;
        this.o0 = arrayList3 == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList3);
        this.d0 = bundle3;
        this.e0 = z;
        this.f0 = i3;
        this.g0 = i4;
        this.h0 = f;
        this.i0 = str5;
        this.j0 = j;
        this.k0 = str6;
        this.l0 = arrayList2 == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList2);
        this.m0 = str7;
        this.n0 = nc2Var;
        this.p0 = j2;
        this.q0 = str8;
        this.r0 = f2;
        this.w0 = z2;
        this.s0 = i5;
        this.t0 = i6;
        this.u0 = z3;
        this.v0 = str9;
        this.x0 = str10;
        this.y0 = z4;
        this.z0 = i7;
        this.A0 = bundle4;
        this.B0 = str11;
        this.C0 = bv3Var;
        this.D0 = z5;
        this.E0 = bundle5;
        this.F0 = str12;
        this.G0 = str13;
        this.H0 = str14;
        this.I0 = z6;
        this.J0 = arrayList4;
        this.K0 = str15;
        this.L0 = arrayList5;
        this.M0 = i8;
        this.N0 = z7;
        this.O0 = z8;
        this.P0 = z9;
        this.Q0 = arrayList6;
        this.R0 = str16;
        this.S0 = gi2Var;
        this.T0 = str17;
        this.U0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.b(parcel, 2, this.Q);
        tv2.i(parcel, 3, this.R, i);
        tv2.i(parcel, 4, this.S, i);
        tv2.k(parcel, 5, this.T);
        tv2.i(parcel, 6, this.U, i);
        tv2.i(parcel, 7, this.V, i);
        tv2.k(parcel, 8, this.W);
        tv2.k(parcel, 9, this.X);
        tv2.k(parcel, 10, this.Y);
        tv2.i(parcel, 11, this.Z, i);
        tv2.b(parcel, 12, this.a0);
        tv2.g(parcel, 13, this.b0);
        tv2.m(parcel, 14, this.c0);
        tv2.b(parcel, 15, this.d0);
        tv2.a(parcel, 16, this.e0);
        tv2.g(parcel, 18, this.f0);
        tv2.g(parcel, 19, this.g0);
        float f = this.h0;
        parcel.writeInt(262164);
        parcel.writeFloat(f);
        tv2.k(parcel, 21, this.i0);
        tv2.h(parcel, 25, this.j0);
        tv2.k(parcel, 26, this.k0);
        tv2.m(parcel, 27, this.l0);
        tv2.k(parcel, 28, this.m0);
        tv2.i(parcel, 29, this.n0, i);
        tv2.m(parcel, 30, this.o0);
        tv2.h(parcel, 31, this.p0);
        tv2.k(parcel, 33, this.q0);
        float f2 = this.r0;
        parcel.writeInt(262178);
        parcel.writeFloat(f2);
        tv2.g(parcel, 35, this.s0);
        tv2.g(parcel, 36, this.t0);
        tv2.a(parcel, 37, this.u0);
        tv2.k(parcel, 39, this.v0);
        tv2.a(parcel, 40, this.w0);
        tv2.k(parcel, 41, this.x0);
        tv2.a(parcel, 42, this.y0);
        tv2.g(parcel, 43, this.z0);
        tv2.b(parcel, 44, this.A0);
        tv2.k(parcel, 45, this.B0);
        tv2.i(parcel, 46, this.C0, i);
        tv2.a(parcel, 47, this.D0);
        tv2.b(parcel, 48, this.E0);
        tv2.k(parcel, 49, this.F0);
        tv2.k(parcel, 50, this.G0);
        tv2.k(parcel, 51, this.H0);
        tv2.a(parcel, 52, this.I0);
        List list = this.J0;
        if (list != null) {
            int s2 = tv2.s(parcel, 53);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            tv2.A(parcel, s2);
        }
        tv2.k(parcel, 54, this.K0);
        tv2.m(parcel, 55, this.L0);
        tv2.g(parcel, 56, this.M0);
        tv2.a(parcel, 57, this.N0);
        tv2.a(parcel, 58, this.O0);
        tv2.a(parcel, 59, this.P0);
        tv2.m(parcel, 60, this.Q0);
        tv2.k(parcel, 61, this.R0);
        tv2.i(parcel, 63, this.S0, i);
        tv2.k(parcel, 64, this.T0);
        tv2.b(parcel, 65, this.U0);
        tv2.A(parcel, s);
    }
}