package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h72  reason: default package */
public final class h72 extends f0 {
    public static final Parcelable.Creator<h72> CREATOR = new x82();
    public final String P;
    public final int Q;

    public h72(String str, int i) {
        this.P = str == null ? "" : str;
        this.Q = i;
    }

    public static h72 c(Throwable th) {
        String message;
        tz3 a = oj4.a(th);
        if (ft4.a(th.getMessage())) {
            message = a.Q;
        } else {
            message = th.getMessage();
        }
        return new h72(message, a.P);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 1, this.P);
        tv2.g(parcel, 2, this.Q);
        tv2.A(parcel, s);
    }
}