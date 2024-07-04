package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import defpackage.hw;

/* renamed from: oo2  reason: default package */
public abstract class oo2 extends j22 implements po2 {
    public static final /* synthetic */ int P = 0;

    public oo2() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                k22.b(parcel);
                a2((Bundle) k22.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                break;
            case 3:
                s();
                break;
            case 4:
                q();
                break;
            case 5:
                k();
                break;
            case 6:
                Bundle bundle = (Bundle) k22.a(parcel, Bundle.CREATOR);
                k22.b(parcel);
                i0(bundle);
                parcel2.writeNoException();
                k22.d(parcel2, bundle);
                return true;
            case 7:
                G();
                break;
            case 8:
                n();
                break;
            case 9:
                E();
                break;
            case 10:
                f();
                break;
            case 11:
                boolean x = x();
                parcel2.writeNoException();
                ClassLoader classLoader = k22.a;
                parcel2.writeInt(x ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                Intent intent = (Intent) k22.a(parcel, Intent.CREATOR);
                k22.b(parcel);
                break;
            case 13:
                hw Z = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                a0(Z);
                break;
            case 14:
                u();
                break;
            case 15:
                int readInt = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                k22.b(parcel);
                z0(readInt, createStringArray, createIntArray);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}