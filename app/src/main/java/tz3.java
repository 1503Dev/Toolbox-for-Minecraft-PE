package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: tz3  reason: default package */
public final class tz3 extends f0 {
    public static final Parcelable.Creator<tz3> CREATOR = new ui4();
    public final int P;
    public final String Q;
    public final String R;
    public tz3 S;
    public IBinder T;

    public tz3(int i, String str, String str2, tz3 tz3Var, IBinder iBinder) {
        this.P = i;
        this.Q = str;
        this.R = str2;
        this.S = tz3Var;
        this.T = iBinder;
    }

    public final n2 c() {
        tz3 tz3Var = this.S;
        n2 n2Var = null;
        if (tz3Var != null) {
            n2Var = new n2(tz3Var.P, tz3Var.Q, tz3Var.R, null);
        }
        return new n2(this.P, this.Q, this.R, n2Var);
    }

    public final l20 d() {
        n2 n2Var;
        mq3 yo3Var;
        tz3 tz3Var = this.S;
        rl0 rl0Var = null;
        if (tz3Var == null) {
            n2Var = null;
        } else {
            n2Var = new n2(tz3Var.P, tz3Var.Q, tz3Var.R, null);
        }
        int i = this.P;
        String str = this.Q;
        String str2 = this.R;
        IBinder iBinder = this.T;
        if (iBinder == null) {
            yo3Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof mq3) {
                yo3Var = (mq3) queryLocalInterface;
            } else {
                yo3Var = new yo3(iBinder);
            }
        }
        if (yo3Var != null) {
            rl0Var = new rl0(yo3Var);
        }
        return new l20(i, str, str2, n2Var, rl0Var);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.k(parcel, 2, this.Q);
        tv2.k(parcel, 3, this.R);
        tv2.i(parcel, 4, this.S, i);
        tv2.f(parcel, 5, this.T);
        tv2.A(parcel, s);
    }
}