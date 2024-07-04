package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.hw;

/* renamed from: vr2  reason: default package */
public abstract class vr2 extends j22 implements wr2 {
    public static final /* synthetic */ int P = 0;

    public vr2() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        IInterface i2;
        boolean z = false;
        ds2 ds2Var = null;
        ds2 ds2Var2 = null;
        vi3 vi3Var = null;
        es2 es2Var = null;
        zr2 zr2Var = null;
        switch (i) {
            case 1:
                pn5 pn5Var = (pn5) k22.a(parcel, pn5.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof ds2) {
                        ds2Var = (ds2) queryLocalInterface;
                    } else {
                        ds2Var = new bs2(readStrongBinder);
                    }
                }
                k22.b(parcel);
                h1(pn5Var, ds2Var);
                parcel2.writeNoException();
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof zr2) {
                        zr2Var = (zr2) queryLocalInterface2;
                    } else {
                        zr2Var = new xr2(readStrongBinder2);
                    }
                }
                k22.b(parcel);
                t2(zr2Var);
                parcel2.writeNoException();
                break;
            case 3:
                boolean t = t();
                parcel2.writeNoException();
                ClassLoader classLoader = k22.a;
                parcel2.writeInt(t ? 1 : 0);
                break;
            case 4:
                String b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                break;
            case 5:
                hw Z = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                S(Z);
                parcel2.writeNoException();
                break;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof es2) {
                        es2Var = (es2) queryLocalInterface3;
                    } else {
                        es2Var = new es2(readStrongBinder3);
                    }
                }
                k22.b(parcel);
                A1(es2Var);
                parcel2.writeNoException();
                break;
            case 7:
                k22.b(parcel);
                l3((hs2) k22.a(parcel, hs2.CREATOR));
                parcel2.writeNoException();
                break;
            case 8:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    if (queryLocalInterface4 instanceof vi3) {
                        vi3Var = (vi3) queryLocalInterface4;
                    } else {
                        vi3Var = new hh3(readStrongBinder4);
                    }
                }
                k22.b(parcel);
                c4(vi3Var);
                parcel2.writeNoException();
                break;
            case 9:
                Bundle c = c();
                parcel2.writeNoException();
                k22.d(parcel2, c);
                break;
            case 10:
                hw Z2 = hw.a.Z(parcel.readStrongBinder());
                ClassLoader classLoader2 = k22.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                k22.b(parcel);
                y2(Z2, z);
                parcel2.writeNoException();
                break;
            case 11:
                i2 = i();
                parcel2.writeNoException();
                k22.e(parcel2, i2);
                break;
            case 12:
                i2 = d();
                parcel2.writeNoException();
                k22.e(parcel2, i2);
                break;
            case 13:
                yk3 t4 = gk3.t4(parcel.readStrongBinder());
                k22.b(parcel);
                p4(t4);
                parcel2.writeNoException();
                break;
            case 14:
                pn5 pn5Var2 = (pn5) k22.a(parcel, pn5.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface5 instanceof ds2) {
                        ds2Var2 = (ds2) queryLocalInterface5;
                    } else {
                        ds2Var2 = new bs2(readStrongBinder5);
                    }
                }
                k22.b(parcel);
                U0(pn5Var2, ds2Var2);
                parcel2.writeNoException();
                break;
            case 15:
                ClassLoader classLoader3 = k22.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                k22.b(parcel);
                U(z);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}