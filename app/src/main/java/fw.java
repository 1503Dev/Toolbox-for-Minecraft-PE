package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: fw  reason: default package */
public abstract class fw extends Binder implements IInterface {
    public fw() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ew ewVar = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                MultiInstanceInvalidationService.b bVar = (MultiInstanceInvalidationService.b) this;
                bVar.A(parcel.createStringArray(), parcel.readInt());
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof ew)) {
                    ewVar = (ew) queryLocalInterface;
                } else {
                    ewVar = new dw(readStrongBinder);
                }
            }
            int readInt = parcel.readInt();
            MultiInstanceInvalidationService.b bVar2 = (MultiInstanceInvalidationService.b) this;
            synchronized (MultiInstanceInvalidationService.this.R) {
                MultiInstanceInvalidationService.this.R.unregister(ewVar);
                MultiInstanceInvalidationService.this.Q.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof ew)) {
                ewVar = (ew) queryLocalInterface2;
            } else {
                ewVar = new dw(readStrongBinder2);
            }
        }
        int Z = ((MultiInstanceInvalidationService.b) this).Z(ewVar, parcel.readString());
        parcel2.writeNoException();
        parcel2.writeInt(Z);
        return true;
    }
}