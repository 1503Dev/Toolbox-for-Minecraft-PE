package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import defpackage.hw;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: ep2  reason: default package */
public final class ep2 extends f0 {
    public static final Parcelable.Creator<ep2> CREATOR = new fp2();
    public final View P;
    public final Map Q;

    public ep2(IBinder iBinder, IBinder iBinder2) {
        this.P = (View) va0.c0(hw.a.Z(iBinder));
        this.Q = (Map) va0.c0(hw.a.Z(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.f(parcel, 1, new va0(this.P));
        tv2.f(parcel, 2, new va0(this.Q));
        tv2.A(parcel, s);
    }
}