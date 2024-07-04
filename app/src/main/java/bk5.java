package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bk5  reason: default package */
public class bk5 implements IInterface {
    public final IBinder P;

    public bk5(IBinder iBinder) {
        this.P = iBinder;
    }

    public static Parcel A() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
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
}