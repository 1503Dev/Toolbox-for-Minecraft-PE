package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: kg3  reason: default package */
public final class kg3 extends oj1 implements qi4 {
    public kg3(IBinder iBinder) {
        super(iBinder);
    }

    @Override // defpackage.qi4
    public final boolean b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i = jw2.a;
        boolean z = true;
        obtain.writeInt(1);
        Parcel A = A(obtain, 2);
        if (A.readInt() == 0) {
            z = false;
        }
        A.recycle();
        return z;
    }

    @Override // defpackage.qi4
    public final String d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel A = A(obtain, 1);
        String readString = A.readString();
        A.recycle();
        return readString;
    }

    @Override // defpackage.qi4
    public final boolean i() {
        boolean z;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel A = A(obtain, 6);
        int i = jw2.a;
        if (A.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        A.recycle();
        return z;
    }
}