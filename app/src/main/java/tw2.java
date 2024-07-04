package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hw;

/* renamed from: tw2  reason: default package */
public final class tw2 extends f0 {
    public static final Parcelable.Creator<tw2> CREATOR = new q82();
    public final String P;
    public final String Q;
    public final String R;
    public final String S;
    public final String T;
    public final String U;
    public final String V;
    public final Intent W;
    public final zy5 X;
    public final boolean Y;

    public tw2(Intent intent, zy5 zy5Var) {
        this(null, null, null, null, null, null, null, intent, new va0(zy5Var), false);
    }

    public tw2(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z) {
        this.P = str;
        this.Q = str2;
        this.R = str3;
        this.S = str4;
        this.T = str5;
        this.U = str6;
        this.V = str7;
        this.W = intent;
        this.X = (zy5) va0.c0(hw.a.Z(iBinder));
        this.Y = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 2, this.P);
        tv2.k(parcel, 3, this.Q);
        tv2.k(parcel, 4, this.R);
        tv2.k(parcel, 5, this.S);
        tv2.k(parcel, 6, this.T);
        tv2.k(parcel, 7, this.U);
        tv2.k(parcel, 8, this.V);
        tv2.i(parcel, 9, this.W, i);
        tv2.f(parcel, 10, new va0(this.X));
        tv2.a(parcel, 11, this.Y);
        tv2.A(parcel, s);
    }

    public tw2(String str, String str2, String str3, String str4, String str5, String str6, String str7, zy5 zy5Var) {
        this(str, str2, str3, str4, str5, str6, str7, null, new va0(zy5Var), false);
    }
}