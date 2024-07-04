package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: h42  reason: default package */
public abstract class h42 extends j22 implements i42 {
    public h42() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        f42 d42Var;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                d42Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                d42Var = queryLocalInterface instanceof f42 ? (f42) queryLocalInterface : new d42(readStrongBinder);
            }
            k22.b(parcel);
            ((a42) this).d4(d42Var);
        } else if (i == 2) {
            parcel.readInt();
            k22.b(parcel);
        } else if (i != 3) {
            return false;
        } else {
            k22.b(parcel);
            ((a42) this).L1((tz3) k22.a(parcel, tz3.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}