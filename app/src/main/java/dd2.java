package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.hw;

/* renamed from: dd2  reason: default package */
public abstract class dd2 extends j22 implements ed2 {
    public static final /* synthetic */ int P = 0;

    public dd2() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        yc2 wc2Var;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                hw Z = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                K0(Z, readString);
                break;
            case 2:
                String readString2 = parcel.readString();
                k22.b(parcel);
                hw z = z(readString2);
                parcel2.writeNoException();
                k22.e(parcel2, z);
                return true;
            case 3:
                hw Z2 = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                z2(Z2);
                break;
            case 4:
                d();
                break;
            case 5:
                hw.a.Z(parcel.readStrongBinder());
                parcel.readInt();
                k22.b(parcel);
                break;
            case 6:
                hw Z3 = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                X1(Z3);
                break;
            case 7:
                hw Z4 = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                b1(Z4);
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    wc2Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    wc2Var = queryLocalInterface instanceof yc2 ? (yc2) queryLocalInterface : new wc2(readStrongBinder);
                }
                k22.b(parcel);
                p2(wc2Var);
                break;
            case 9:
                hw Z5 = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                N3(Z5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}