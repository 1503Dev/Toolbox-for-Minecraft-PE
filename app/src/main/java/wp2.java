package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: wp2  reason: default package */
public final class wp2 extends f0 {
    public static final Parcelable.Creator<wp2> CREATOR = new xp2();
    public final String P;
    public final int Q;
    public final Bundle R;
    public final byte[] S;
    public final boolean T;
    public final String U;
    public final String V;

    public wp2(String str, int i, Bundle bundle, byte[] bArr, boolean z, String str2, String str3) {
        this.P = str;
        this.Q = i;
        this.R = bundle;
        this.S = bArr;
        this.T = z;
        this.U = str2;
        this.V = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 1, this.P);
        tv2.g(parcel, 2, this.Q);
        tv2.b(parcel, 3, this.R);
        tv2.c(parcel, 4, this.S);
        tv2.a(parcel, 5, this.T);
        tv2.k(parcel, 6, this.U);
        tv2.k(parcel, 7, this.V);
        tv2.A(parcel, s);
    }
}