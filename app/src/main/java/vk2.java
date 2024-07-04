package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: vk2  reason: default package */
public abstract class vk2 extends j22 implements wk2 {
    public vk2() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static wk2 t4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof wk2 ? (wk2) queryLocalInterface : new uk2(iBinder);
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        IInterface z;
        int i2;
        if (i != 1) {
            if (i == 2) {
                String readString = parcel.readString();
                k22.b(parcel);
                i2 = ((tk2) this).D(readString);
            } else if (i == 3) {
                String readString2 = parcel.readString();
                k22.b(parcel);
                z = ((tk2) this).H(readString2);
            } else if (i != 4) {
                return false;
            } else {
                String readString3 = parcel.readString();
                k22.b(parcel);
                i2 = ((tk2) this).P(readString3);
            }
            parcel2.writeNoException();
            parcel2.writeInt(i2);
            return true;
        }
        String readString4 = parcel.readString();
        k22.b(parcel);
        z = ((tk2) this).z(readString4);
        parcel2.writeNoException();
        k22.e(parcel2, z);
        return true;
    }
}