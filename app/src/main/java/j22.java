package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: j22  reason: default package */
public class j22 extends Binder implements IInterface {
    public j22(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return s4(i, parcel, parcel2);
    }

    public boolean s4(int i, Parcel parcel, Parcel parcel2) {
        throw null;
    }
}