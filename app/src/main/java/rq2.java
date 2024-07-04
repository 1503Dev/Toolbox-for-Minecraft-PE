package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: rq2  reason: default package */
public final class rq2 extends f0 {
    public static final Parcelable.Creator<rq2> CREATOR = new sq2();
    public final Bundle P;
    public final xv2 Q;
    public final ApplicationInfo R;
    public final String S;
    public final List T;
    public final PackageInfo U;
    public final String V;
    public final String W;
    public bk4 X;
    public String Y;
    public final boolean Z;
    public final boolean a0;

    public rq2(Bundle bundle, xv2 xv2Var, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, bk4 bk4Var, String str4, boolean z, boolean z2) {
        this.P = bundle;
        this.Q = xv2Var;
        this.S = str;
        this.R = applicationInfo;
        this.T = list;
        this.U = packageInfo;
        this.V = str2;
        this.W = str3;
        this.X = bk4Var;
        this.Y = str4;
        this.Z = z;
        this.a0 = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.b(parcel, 1, this.P);
        tv2.i(parcel, 2, this.Q, i);
        tv2.i(parcel, 3, this.R, i);
        tv2.k(parcel, 4, this.S);
        tv2.m(parcel, 5, this.T);
        tv2.i(parcel, 6, this.U, i);
        tv2.k(parcel, 7, this.V);
        tv2.k(parcel, 9, this.W);
        tv2.i(parcel, 10, this.X, i);
        tv2.k(parcel, 11, this.Y);
        tv2.a(parcel, 12, this.Z);
        tv2.a(parcel, 13, this.a0);
        tv2.A(parcel, s);
    }
}