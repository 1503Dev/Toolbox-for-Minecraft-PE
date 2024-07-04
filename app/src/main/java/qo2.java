package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: qo2  reason: default package */
public final class qo2 extends i22 implements so2 {
    public qo2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // defpackage.so2
    public final IBinder D1(va0 va0Var) {
        Parcel A = A();
        k22.e(A, va0Var);
        Parcel Z = Z(A, 1);
        IBinder readStrongBinder = Z.readStrongBinder();
        Z.recycle();
        return readStrongBinder;
    }
}