package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: dw  reason: default package */
public final class dw implements ew {
    public IBinder P;

    public dw(IBinder iBinder) {
        this.P = iBinder;
    }

    @Override // defpackage.ew
    public final void N1(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.P.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.P;
    }
}