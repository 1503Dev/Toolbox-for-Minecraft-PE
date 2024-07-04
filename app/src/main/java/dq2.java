package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dq2  reason: default package */
public abstract class dq2 extends j22 implements eq2 {
    public dq2() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        hq2 hq2Var = null;
        if (i == 1) {
            sp2 sp2Var = (sp2) k22.a(parcel, sp2.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                hq2Var = queryLocalInterface instanceof hq2 ? (hq2) queryLocalInterface : new fq2(readStrongBinder);
            }
            k22.b(parcel);
            ((iy3) this).b4(sp2Var, hq2Var);
        } else if (i == 2) {
            sp2 sp2Var2 = (sp2) k22.a(parcel, sp2.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface2 instanceof hq2) {
                    hq2 hq2Var2 = (hq2) queryLocalInterface2;
                }
            }
            k22.b(parcel);
        } else if (i != 3) {
            return false;
        } else {
            wp2 wp2Var = (wp2) k22.a(parcel, wp2.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                hq2Var = queryLocalInterface3 instanceof hq2 ? (hq2) queryLocalInterface3 : new fq2(readStrongBinder3);
            }
            k22.b(parcel);
            ((iy3) this).G3(wp2Var, hq2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}