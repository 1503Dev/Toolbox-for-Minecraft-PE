package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: r43  reason: default package */
public abstract class r43 extends j22 implements e53 {
    public r43() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static e53 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof e53 ? (e53) queryLocalInterface : new e43(iBinder);
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            da4 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            k22.d(parcel2, liteSdkVersion);
        } else if (i != 2) {
            return false;
        } else {
            wk2 adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            k22.e(parcel2, adapterCreator);
        }
        return true;
    }
}