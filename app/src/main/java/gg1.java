package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: gg1  reason: default package */
public final class gg1 extends f0 implements tl0 {
    public static final Parcelable.Creator<gg1> CREATOR = new rg1();
    public final int P;
    public int Q;
    public Intent R;

    public gg1() {
        this(2, 0, null);
    }

    public gg1(int i, int i2, Intent intent) {
        this.P = i;
        this.Q = i2;
        this.R = intent;
    }

    @Override // defpackage.tl0
    public final Status a() {
        return this.Q == 0 ? Status.U : Status.V;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.g(parcel, 2, this.Q);
        tv2.i(parcel, 3, this.R, i);
        tv2.A(parcel, s);
    }
}