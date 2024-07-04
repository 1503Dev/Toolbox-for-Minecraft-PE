package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: eo2  reason: default package */
public final class eo2 extends i22 {
    public eo2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder d3(va0 va0Var, String str, wk2 wk2Var) {
        Parcel A = A();
        k22.e(A, va0Var);
        A.writeString(str);
        k22.e(A, wk2Var);
        A.writeInt(231004000);
        Parcel Z = Z(A, 1);
        IBinder readStrongBinder = Z.readStrongBinder();
        Z.recycle();
        return readStrongBinder;
    }
}