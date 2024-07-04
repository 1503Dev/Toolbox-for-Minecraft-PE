package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: jo2  reason: default package */
public final class jo2 extends i22 implements lo2 {
    public jo2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // defpackage.lo2
    public final io2 V(va0 va0Var, wk2 wk2Var) {
        io2 go2Var;
        Parcel A = A();
        k22.e(A, va0Var);
        k22.e(A, wk2Var);
        A.writeInt(231004000);
        Parcel Z = Z(A, 1);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            go2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            go2Var = queryLocalInterface instanceof io2 ? (io2) queryLocalInterface : new go2(readStrongBinder);
        }
        Z.recycle();
        return go2Var;
    }
}