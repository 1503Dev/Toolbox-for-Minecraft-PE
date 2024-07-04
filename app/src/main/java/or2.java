package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.hw;

/* renamed from: or2  reason: default package */
public abstract class or2 extends j22 implements pr2 {
    public or2() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                hw Z = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                y3(Z);
                break;
            case 2:
                hw.a.Z(parcel.readStrongBinder());
                parcel.readInt();
                k22.b(parcel);
                O2();
                break;
            case 3:
                hw Z2 = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                J0(Z2);
                break;
            case 4:
                hw Z3 = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                a0(Z3);
                break;
            case 5:
                hw Z4 = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                L2(Z4);
                break;
            case 6:
                hw Z5 = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                o3(Z5);
                break;
            case 7:
                k22.b(parcel);
                H1(hw.a.Z(parcel.readStrongBinder()), (qr2) k22.a(parcel, qr2.CREATOR));
                break;
            case 8:
                hw Z6 = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                zze(Z6);
                break;
            case 9:
                hw Z7 = hw.a.Z(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                k22.b(parcel);
                b0(Z7, readInt);
                break;
            case 10:
                hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                D2();
                break;
            case 11:
                hw Z8 = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                Y1(Z8);
                break;
            case 12:
                Bundle bundle = (Bundle) k22.a(parcel, Bundle.CREATOR);
                k22.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}