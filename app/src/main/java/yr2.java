package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: yr2  reason: default package */
public abstract class yr2 extends j22 implements zr2 {
    public yr2() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        tr2 sr2Var;
        switch (i) {
            case 1:
                j();
                break;
            case 2:
                h();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    sr2Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    sr2Var = queryLocalInterface instanceof tr2 ? (tr2) queryLocalInterface : new sr2(readStrongBinder);
                }
                k22.b(parcel);
                r4(sr2Var);
                break;
            case 4:
                int readInt = parcel.readInt();
                k22.b(parcel);
                u0(readInt);
                break;
            case 5:
                k22.b(parcel);
                a4((tz3) k22.a(parcel, tz3.CREATOR));
                break;
            case 6:
                e();
                break;
            case 7:
                b();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}