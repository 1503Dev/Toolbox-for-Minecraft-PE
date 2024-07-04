package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: zp2  reason: default package */
public abstract class zp2 extends j22 implements aq2 {
    public zp2() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        kq2 kq2Var = null;
        if (i != 1) {
            if (i == 2) {
                pp2 pp2Var = (pp2) k22.a(parcel, pp2.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof bq2) {
                        bq2 bq2Var = (bq2) queryLocalInterface;
                    }
                }
                k22.b(parcel);
            } else if (i == 4) {
                rq2 rq2Var = (rq2) k22.a(parcel, rq2.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    kq2Var = queryLocalInterface2 instanceof kq2 ? (kq2) queryLocalInterface2 : new iq2(readStrongBinder2);
                }
                k22.b(parcel);
                ((cy3) this).f3(rq2Var, kq2Var);
            } else if (i == 5) {
                rq2 rq2Var2 = (rq2) k22.a(parcel, rq2.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    kq2Var = queryLocalInterface3 instanceof kq2 ? (kq2) queryLocalInterface3 : new iq2(readStrongBinder3);
                }
                k22.b(parcel);
                ((cy3) this).C2(rq2Var2, kq2Var);
            } else if (i == 6) {
                rq2 rq2Var3 = (rq2) k22.a(parcel, rq2.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    kq2Var = queryLocalInterface4 instanceof kq2 ? (kq2) queryLocalInterface4 : new iq2(readStrongBinder4);
                }
                k22.b(parcel);
                ((cy3) this).z3(rq2Var3, kq2Var);
            } else if (i != 7) {
                return false;
            } else {
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    kq2Var = queryLocalInterface5 instanceof kq2 ? (kq2) queryLocalInterface5 : new iq2(readStrongBinder5);
                }
                k22.b(parcel);
                ((cy3) this).l4(readString, kq2Var);
            }
            parcel2.writeNoException();
        } else {
            pp2 pp2Var2 = (pp2) k22.a(parcel, pp2.CREATOR);
            k22.b(parcel);
            parcel2.writeNoException();
            k22.d(parcel2, null);
        }
        return true;
    }
}