package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: l82  reason: default package */
public class l82 extends Binder implements IInterface {
    public l82(String str) {
        attachInterface(this, str);
    }

    public boolean A(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return A(i, parcel, parcel2);
    }
}