package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bl2  reason: default package */
public abstract class bl2 extends j22 implements cl2 {
    public bl2() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static cl2 t4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof cl2 ? (cl2) queryLocalInterface : new al2(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        tr2 sr2Var;
        switch (i) {
            case 1:
                b();
                break;
            case 2:
                e();
                break;
            case 3:
                int readInt = parcel.readInt();
                k22.b(parcel);
                v(readInt);
                break;
            case 4:
                k();
                break;
            case 5:
                m();
                break;
            case 6:
                K();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof kl2) {
                        kl2 kl2Var = (kl2) queryLocalInterface;
                    }
                }
                k22.b(parcel);
                break;
            case 8:
                o();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                k22.b(parcel);
                m2(readString, readString2);
                break;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (queryLocalInterface2 instanceof sd2) {
                        sd2 sd2Var = (sd2) queryLocalInterface2;
                    }
                }
                parcel.readString();
                k22.b(parcel);
                break;
            case 11:
                r();
                break;
            case 12:
                parcel.readString();
                k22.b(parcel);
                break;
            case 13:
                Y();
                break;
            case 14:
                k22.b(parcel);
                H0((qr2) k22.a(parcel, qr2.CREATOR));
                break;
            case 15:
                E();
                break;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    sr2Var = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (queryLocalInterface3 instanceof tr2) {
                        sr2Var = (tr2) queryLocalInterface3;
                    } else {
                        sr2Var = new sr2(readStrongBinder3);
                    }
                }
                k22.b(parcel);
                K3(sr2Var);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                k22.b(parcel);
                e0(readInt2);
                break;
            case 18:
                u();
                break;
            case 19:
                Bundle bundle = (Bundle) k22.a(parcel, Bundle.CREATOR);
                k22.b(parcel);
                break;
            case 20:
                F();
                break;
            case 21:
                String readString3 = parcel.readString();
                k22.b(parcel);
                I(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                k22.b(parcel);
                x1(readInt3, readString4);
                break;
            case 23:
                k22.b(parcel);
                P2((tz3) k22.a(parcel, tz3.CREATOR));
                break;
            case 24:
                k22.b(parcel);
                g0((tz3) k22.a(parcel, tz3.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}