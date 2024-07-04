package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: cm1  reason: default package */
public final class cm1 implements aw {
    public final IBinder P;

    public cm1(IBinder iBinder) {
        this.P = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.P;
    }

    @Override // defpackage.aw
    public final void k4(hg3 hg3Var, dt dtVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(hg3Var);
            obtain.writeInt(1);
            qo5.a(dtVar, obtain, 0);
            this.P.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}