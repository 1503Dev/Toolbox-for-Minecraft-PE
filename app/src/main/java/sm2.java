package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: sm2  reason: default package */
public abstract class sm2 extends j22 implements tm2 {
    public sm2() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        pl2 nl2Var;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                k22.b(parcel);
                ((s34) this).p((tz3) k22.a(parcel, tz3.CREATOR));
            } else {
                String readString = parcel.readString();
                k22.b(parcel);
                ((w24) ((s34) this).P.c).x1(0, readString);
            }
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                nl2Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                if (queryLocalInterface instanceof pl2) {
                    nl2Var = (pl2) queryLocalInterface;
                } else {
                    nl2Var = new nl2(readStrongBinder);
                }
            }
            k22.b(parcel);
            s34 s34Var = (s34) this;
            s34Var.Q.c = nl2Var;
            ((w24) s34Var.P.c).K();
        }
        parcel2.writeNoException();
        return true;
    }
}