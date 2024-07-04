package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: hu2  reason: default package */
public final class hu2 extends i22 implements ju2 {
    public hu2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // defpackage.ju2
    public final gu2 V(va0 va0Var, wk2 wk2Var) {
        gu2 eu2Var;
        Parcel A = A();
        k22.e(A, va0Var);
        k22.e(A, wk2Var);
        A.writeInt(231004000);
        Parcel Z = Z(A, 2);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            eu2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            eu2Var = queryLocalInterface instanceof gu2 ? (gu2) queryLocalInterface : new eu2(readStrongBinder);
        }
        Z.recycle();
        return eu2Var;
    }
}