package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.hw;

/* renamed from: e42  reason: default package */
public abstract class e42 extends j22 implements f42 {
    public e42() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        IInterface iInterface;
        m42 k42Var;
        boolean z = false;
        switch (i) {
            case 2:
                iInterface = ((d83) this).Q;
                parcel2.writeNoException();
                k22.e(parcel2, iInterface);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof j42) {
                        j42 j42Var = (j42) queryLocalInterface;
                    }
                }
                k22.b(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                hw Z = hw.a.Z(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    k42Var = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    if (queryLocalInterface2 instanceof m42) {
                        k42Var = (m42) queryLocalInterface2;
                    } else {
                        k42Var = new k42(readStrongBinder2);
                    }
                }
                k22.b(parcel);
                ((d83) this).N0(Z, k42Var);
                parcel2.writeNoException();
                return true;
            case 5:
                iInterface = ((d83) this).e();
                parcel2.writeNoException();
                k22.e(parcel2, iInterface);
                return true;
            case 6:
                ClassLoader classLoader = k22.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                k22.b(parcel);
                ((d83) this).S = z;
                parcel2.writeNoException();
                return true;
            case 7:
                yk3 t4 = gk3.t4(parcel.readStrongBinder());
                k22.b(parcel);
                uf0.b("setOnPaidEventListener must be called on the main UI thread.");
                if4 if4Var = ((d83) this).R;
                if (if4Var != null) {
                    if4Var.V.set(t4);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}