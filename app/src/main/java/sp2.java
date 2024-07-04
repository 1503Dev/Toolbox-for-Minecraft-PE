package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: sp2  reason: default package */
public final class sp2 extends f0 {
    public static final Parcelable.Creator<sp2> CREATOR = new tp2();
    public final ApplicationInfo P;
    public final String Q;
    public final PackageInfo R;
    public final String S;
    public final int T;
    public final String U;
    public final List V;
    public final boolean W;
    public final boolean X;

    public sp2(ApplicationInfo applicationInfo, String str, PackageInfo packageInfo, String str2, int i, String str3, List list, boolean z, boolean z2) {
        this.Q = str;
        this.P = applicationInfo;
        this.R = packageInfo;
        this.S = str2;
        this.T = i;
        this.U = str3;
        this.V = list;
        this.W = z;
        this.X = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.i(parcel, 1, this.P, i);
        tv2.k(parcel, 2, this.Q);
        tv2.i(parcel, 3, this.R, i);
        tv2.k(parcel, 4, this.S);
        tv2.g(parcel, 5, this.T);
        tv2.k(parcel, 6, this.U);
        tv2.m(parcel, 7, this.V);
        tv2.a(parcel, 8, this.W);
        tv2.a(parcel, 9, this.X);
        tv2.A(parcel, s);
    }
}