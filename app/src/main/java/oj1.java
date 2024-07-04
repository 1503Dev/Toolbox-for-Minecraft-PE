package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: oj1  reason: default package */
public class oj1 implements IInterface {
    public final IBinder P;

    public oj1(IBinder iBinder) {
        this.P = iBinder;
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.P;
    }
}