package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gk2  reason: default package */
public class gk2 extends Binder implements IInterface {
    public gk2() {
        attachInterface(this, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable parcelable;
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        f03 f03Var = (f03) this;
        if (i == 1) {
            Parcelable.Creator creator = Bundle.CREATOR;
            int i3 = fl2.a;
            if (parcel.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(parcel);
            }
            Bundle bundle = (Bundle) parcelable;
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                ((dv2) f03Var).c0(bundle);
                parcel2.writeNoException();
                return true;
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Parcel data not fully consumed, unread size: ");
            sb.append(dataAvail);
            throw new BadParcelableException(sb.toString());
        }
        return false;
    }
}