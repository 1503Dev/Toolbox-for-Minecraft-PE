package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: i22  reason: default package */
public class i22 implements IInterface {
    public final IBinder P;
    public final String Q;

    public i22(IBinder iBinder, String str) {
        this.P = iBinder;
        this.Q = str;
    }

    public final Parcel A() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.Q);
        return obtain;
    }

    public final Parcel Z(Parcel parcel, int i) {
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

    public final void b2(Parcel parcel, int i) {
        try {
            this.P.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final void c0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.P.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}