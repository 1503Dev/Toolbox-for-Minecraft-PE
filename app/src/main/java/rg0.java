package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: rg0  reason: default package */
public final class rg0 extends f0 {
    public static final Parcelable.Creator<rg0> CREATOR = new si4();
    public final boolean P;
    public final px2 Q;
    public final IBinder R;

    public rg0(boolean z, IBinder iBinder, IBinder iBinder2) {
        px2 px2Var;
        this.P = z;
        if (iBinder != null) {
            int i = xw2.P;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof px2) {
                px2Var = (px2) queryLocalInterface;
            } else {
                px2Var = new fv2(iBinder);
            }
        } else {
            px2Var = null;
        }
        this.Q = px2Var;
        this.R = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int s = tv2.s(parcel, 20293);
        tv2.a(parcel, 1, this.P);
        px2 px2Var = this.Q;
        if (px2Var == null) {
            asBinder = null;
        } else {
            asBinder = px2Var.asBinder();
        }
        tv2.f(parcel, 2, asBinder);
        tv2.f(parcel, 3, this.R);
        tv2.A(parcel, s);
    }
}