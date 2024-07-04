package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u2  reason: default package */
public final class u2 extends f0 {
    public static final Parcelable.Creator<u2> CREATOR = new qw2();
    public final boolean P;
    public final IBinder Q;

    public u2(boolean z, IBinder iBinder) {
        this.P = z;
        this.Q = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.a(parcel, 1, this.P);
        tv2.f(parcel, 2, this.Q);
        tv2.A(parcel, s);
    }
}