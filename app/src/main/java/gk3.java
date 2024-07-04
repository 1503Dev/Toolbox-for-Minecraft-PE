package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: gk3  reason: default package */
public abstract class gk3 extends j22 implements yk3 {
    public gk3() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static yk3 t4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof yk3 ? (yk3) queryLocalInterface : new nj3(iBinder);
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            k22.b(parcel);
            ((tl4) this).v1((au5) k22.a(parcel, au5.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}