package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pj1  reason: default package */
public class pj1 implements IInterface {
    public final IBinder P;
    public final String Q;

    public pj1(IBinder iBinder, String str) {
        this.P = iBinder;
        this.Q = str;
    }

    public final Parcel A(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.P.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel Z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.Q);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.P;
    }
}