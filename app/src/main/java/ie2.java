package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ie2  reason: default package */
public abstract class ie2 extends j22 implements je2 {
    public ie2() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        ue2 se2Var;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                se2Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
                se2Var = queryLocalInterface instanceof ue2 ? (ue2) queryLocalInterface : new se2(readStrongBinder);
            }
            k22.b(parcel);
            p1(se2Var);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}