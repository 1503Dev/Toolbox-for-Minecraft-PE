package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ql5  reason: default package */
public final class ql5 extends f0 {
    public static final Parcelable.Creator<ql5> CREATOR = new om5();
    public Bundle P;
    public wp[] Q;
    public int R;
    public kf S;

    public ql5() {
    }

    public ql5(Bundle bundle, wp[] wpVarArr, int i, kf kfVar) {
        this.P = bundle;
        this.Q = wpVarArr;
        this.R = i;
        this.S = kfVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.b(parcel, 1, this.P);
        tv2.o(parcel, 2, this.Q, i);
        tv2.g(parcel, 3, this.R);
        tv2.i(parcel, 4, this.S, i);
        tv2.A(parcel, s);
    }
}