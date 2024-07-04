package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hw;

/* renamed from: mp2  reason: default package */
public abstract class mp2 extends j22 implements pq2 {
    public mp2() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        IInterface k;
        Parcelable h;
        String s;
        int i2;
        boolean z;
        boolean z2 = false;
        gf2 gf2Var = null;
        q33 q33Var = null;
        xh2 xh2Var = null;
        yk3 yk3Var = null;
        i42 i42Var = null;
        gr2 gr2Var = null;
        c13 c13Var = null;
        qc2 qc2Var = null;
        sa2 sa2Var = null;
        px2 px2Var = null;
        switch (i) {
            case 1:
                k = k();
                parcel2.writeNoException();
                k22.e(parcel2, k);
                break;
            case 2:
                F();
                parcel2.writeNoException();
                break;
            case 3:
                z = O3();
                parcel2.writeNoException();
                ClassLoader classLoader = k22.a;
                i2 = z;
                parcel2.writeInt(i2);
                break;
            case 4:
                k22.b(parcel);
                boolean z1 = z1((pn5) k22.a(parcel, pn5.CREATOR));
                parcel2.writeNoException();
                i2 = z1;
                parcel2.writeInt(i2);
                break;
            case 5:
                M1();
                parcel2.writeNoException();
                break;
            case 6:
                J();
                parcel2.writeNoException();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof gf2) {
                        gf2Var = (gf2) queryLocalInterface;
                    } else {
                        gf2Var = new md2(readStrongBinder);
                    }
                }
                k22.b(parcel);
                S3(gf2Var);
                parcel2.writeNoException();
                break;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof px2) {
                        px2Var = (px2) queryLocalInterface2;
                    } else {
                        px2Var = new fv2(readStrongBinder2);
                    }
                }
                k22.b(parcel);
                a1(px2Var);
                parcel2.writeNoException();
                break;
            case 9:
                f0();
                parcel2.writeNoException();
                break;
            case 10:
                parcel2.writeNoException();
                break;
            case 11:
                Q();
                parcel2.writeNoException();
                break;
            case 12:
                h = h();
                parcel2.writeNoException();
                k22.d(parcel2, h);
                break;
            case 13:
                k22.b(parcel);
                K1((zr5) k22.a(parcel, zr5.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    if (queryLocalInterface3 instanceof uo2) {
                        uo2 uo2Var = (uo2) queryLocalInterface3;
                    }
                }
                k22.b(parcel);
                O();
                parcel2.writeNoException();
                break;
            case 15:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    if (queryLocalInterface4 instanceof yo2) {
                        yo2 yo2Var = (yo2) queryLocalInterface4;
                    }
                }
                parcel.readString();
                k22.b(parcel);
                o0();
                parcel2.writeNoException();
                break;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                s = s();
                parcel2.writeNoException();
                parcel2.writeString(s);
                break;
            case 19:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    if (queryLocalInterface5 instanceof sa2) {
                        sa2Var = (sa2) queryLocalInterface5;
                    } else {
                        sa2Var = new ra2(readStrongBinder5);
                    }
                }
                k22.b(parcel);
                U2(sa2Var);
                parcel2.writeNoException();
                break;
            case 20:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface6 instanceof qc2) {
                        qc2Var = (qc2) queryLocalInterface6;
                    } else {
                        qc2Var = new oa2(readStrongBinder6);
                    }
                }
                k22.b(parcel);
                R2(qc2Var);
                parcel2.writeNoException();
                break;
            case 21:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface7 instanceof c13) {
                        c13Var = (c13) queryLocalInterface7;
                    } else {
                        c13Var = new c13(readStrongBinder7);
                    }
                }
                k22.b(parcel);
                h4(c13Var);
                parcel2.writeNoException();
                break;
            case 22:
                ClassLoader classLoader2 = k22.a;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                k22.b(parcel);
                j4(z2);
                parcel2.writeNoException();
                break;
            case 23:
                z = l0();
                parcel2.writeNoException();
                ClassLoader classLoader3 = k22.a;
                i2 = z;
                parcel2.writeInt(i2);
                break;
            case 24:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    if (queryLocalInterface8 instanceof gr2) {
                        gr2Var = (gr2) queryLocalInterface8;
                    } else {
                        gr2Var = new fr2(readStrongBinder8);
                    }
                }
                k22.b(parcel);
                S0(gr2Var);
                parcel2.writeNoException();
                break;
            case 25:
                parcel.readString();
                k22.b(parcel);
                r2();
                parcel2.writeNoException();
                break;
            case 26:
                k = n();
                parcel2.writeNoException();
                k22.e(parcel2, k);
                break;
            case 29:
                k22.b(parcel);
                c3((zq4) k22.a(parcel, zq4.CREATOR));
                parcel2.writeNoException();
                break;
            case 30:
                bv3 bv3Var = (bv3) k22.a(parcel, bv3.CREATOR);
                k22.b(parcel);
                d0();
                parcel2.writeNoException();
                break;
            case 31:
                s = w();
                parcel2.writeNoException();
                parcel2.writeString(s);
                break;
            case 32:
                k = j();
                parcel2.writeNoException();
                k22.e(parcel2, k);
                break;
            case 33:
                k = g();
                parcel2.writeNoException();
                k22.e(parcel2, k);
                break;
            case 34:
                ClassLoader classLoader4 = k22.a;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                k22.b(parcel);
                B2(z2);
                parcel2.writeNoException();
                break;
            case 35:
                s = G();
                parcel2.writeNoException();
                parcel2.writeString(s);
                break;
            case 36:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface9 instanceof wt2) {
                        wt2 wt2Var = (wt2) queryLocalInterface9;
                    }
                }
                k22.b(parcel);
                s0();
                parcel2.writeNoException();
                break;
            case 37:
                h = i();
                parcel2.writeNoException();
                k22.d(parcel2, h);
                break;
            case 38:
                parcel.readString();
                k22.b(parcel);
                t0();
                parcel2.writeNoException();
                break;
            case 39:
                k22.b(parcel);
                J2((by5) k22.a(parcel, by5.CREATOR));
                parcel2.writeNoException();
                break;
            case 40:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    if (queryLocalInterface10 instanceof i42) {
                        i42Var = (i42) queryLocalInterface10;
                    } else {
                        i42Var = new g42(readStrongBinder10);
                    }
                }
                k22.b(parcel);
                A3(i42Var);
                parcel2.writeNoException();
                break;
            case 41:
                k = l();
                parcel2.writeNoException();
                k22.e(parcel2, k);
                break;
            case 42:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface11 instanceof yk3) {
                        yk3Var = (yk3) queryLocalInterface11;
                    } else {
                        yk3Var = new nj3(readStrongBinder11);
                    }
                }
                k22.b(parcel);
                F2(yk3Var);
                parcel2.writeNoException();
                break;
            case 43:
                pn5 pn5Var = (pn5) k22.a(parcel, pn5.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface12 instanceof xh2) {
                        xh2Var = (xh2) queryLocalInterface12;
                    } else {
                        xh2Var = new ig2(readStrongBinder12);
                    }
                }
                k22.b(parcel);
                G0(pn5Var, xh2Var);
                parcel2.writeNoException();
                break;
            case 44:
                hw Z = hw.a.Z(parcel.readStrongBinder());
                k22.b(parcel);
                t1(Z);
                parcel2.writeNoException();
                break;
            case 45:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface13 instanceof q33) {
                        q33Var = (q33) queryLocalInterface13;
                    } else {
                        q33Var = new a23(readStrongBinder13);
                    }
                }
                k22.b(parcel);
                G1(q33Var);
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}