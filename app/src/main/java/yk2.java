package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.hw;
import java.util.ArrayList;

/* renamed from: yk2  reason: default package */
public abstract class yk2 extends j22 implements zk2 {
    public yk2() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        IInterface k;
        Bundle bundle;
        pr2 pr2Var;
        sd2 sd2Var = null;
        cl2 cl2Var = null;
        cl2 al2Var = null;
        cl2 cl2Var2 = null;
        ai2 ai2Var = null;
        cl2 cl2Var3 = null;
        sd2Var = null;
        sd2Var = null;
        cl2 al2Var2 = null;
        pr2 pr2Var2 = null;
        cl2 al2Var3 = null;
        cl2 al2Var4 = null;
        cl2 al2Var5 = null;
        cl2 al2Var6 = null;
        boolean z = false;
        switch (i) {
            case 1:
                hw Z = hw.a.Z(parcel.readStrongBinder());
                zr5 zr5Var = (zr5) k22.a(parcel, zr5.CREATOR);
                pn5 pn5Var = (pn5) k22.a(parcel, pn5.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof cl2) {
                        al2Var6 = (cl2) queryLocalInterface;
                    } else {
                        al2Var6 = new al2(readStrongBinder);
                    }
                }
                cl2 cl2Var4 = al2Var6;
                k22.b(parcel);
                ((zl2) this).W0(Z, zr5Var, pn5Var, readString, null, cl2Var4);
                parcel2.writeNoException();
                break;
            case 2:
                k = ((zl2) this).k();
                parcel2.writeNoException();
                k22.e(parcel2, k);
                break;
            case 3:
                hw Z2 = hw.a.Z(parcel.readStrongBinder());
                pn5 pn5Var2 = (pn5) k22.a(parcel, pn5.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof cl2) {
                        al2Var5 = (cl2) queryLocalInterface2;
                    } else {
                        al2Var5 = new al2(readStrongBinder2);
                    }
                }
                cl2 cl2Var5 = al2Var5;
                k22.b(parcel);
                ((zl2) this).F3(Z2, pn5Var2, readString2, null, cl2Var5);
                parcel2.writeNoException();
                break;
            case 4:
                ((zl2) this).s1();
                parcel2.writeNoException();
                break;
            case 5:
                ((zl2) this).K();
                parcel2.writeNoException();
                break;
            case 6:
                hw Z3 = hw.a.Z(parcel.readStrongBinder());
                zr5 zr5Var2 = (zr5) k22.a(parcel, zr5.CREATOR);
                pn5 pn5Var3 = (pn5) k22.a(parcel, pn5.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof cl2) {
                        al2Var4 = (cl2) queryLocalInterface3;
                    } else {
                        al2Var4 = new al2(readStrongBinder3);
                    }
                }
                cl2 cl2Var6 = al2Var4;
                k22.b(parcel);
                ((zl2) this).W0(Z3, zr5Var2, pn5Var3, readString3, readString4, cl2Var6);
                parcel2.writeNoException();
                break;
            case 7:
                hw Z4 = hw.a.Z(parcel.readStrongBinder());
                pn5 pn5Var4 = (pn5) k22.a(parcel, pn5.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof cl2) {
                        al2Var3 = (cl2) queryLocalInterface4;
                    } else {
                        al2Var3 = new al2(readStrongBinder4);
                    }
                }
                cl2 cl2Var7 = al2Var3;
                k22.b(parcel);
                ((zl2) this).F3(Z4, pn5Var4, readString5, readString6, cl2Var7);
                parcel2.writeNoException();
                break;
            case 8:
                ((zl2) this).O1();
                parcel2.writeNoException();
                break;
            case 9:
                ((zl2) this).x();
                parcel2.writeNoException();
                break;
            case 10:
                hw Z5 = hw.a.Z(parcel.readStrongBinder());
                pn5 pn5Var5 = (pn5) k22.a(parcel, pn5.CREATOR);
                parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    if (queryLocalInterface5 instanceof pr2) {
                        pr2Var2 = (pr2) queryLocalInterface5;
                    } else {
                        pr2Var2 = new nr2(readStrongBinder5);
                    }
                }
                String readString7 = parcel.readString();
                k22.b(parcel);
                ((zl2) this).U3(Z5, pn5Var5, pr2Var2, readString7);
                parcel2.writeNoException();
                break;
            case 11:
                String readString8 = parcel.readString();
                k22.b(parcel);
                ((zl2) this).t4((pn5) k22.a(parcel, pn5.CREATOR), readString8);
                parcel2.writeNoException();
                break;
            case 12:
                ((zl2) this).N();
                throw null;
            case 13:
                boolean R = ((zl2) this).R();
                parcel2.writeNoException();
                ClassLoader classLoader = k22.a;
                parcel2.writeInt(R ? 1 : 0);
                break;
            case 14:
                hw Z6 = hw.a.Z(parcel.readStrongBinder());
                pn5 pn5Var6 = (pn5) k22.a(parcel, pn5.CREATOR);
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof cl2) {
                        al2Var2 = (cl2) queryLocalInterface6;
                    } else {
                        al2Var2 = new al2(readStrongBinder6);
                    }
                }
                cl2 cl2Var8 = al2Var2;
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                k22.b(parcel);
                ((zl2) this).u2(Z6, pn5Var6, readString9, readString10, cl2Var8, (nc2) k22.a(parcel, nc2.CREATOR), createStringArrayList);
                parcel2.writeNoException();
                break;
            case 15:
            case 16:
            case 36:
                parcel2.writeNoException();
                k22.e(parcel2, sd2Var);
                break;
            case 17:
                bundle = new Bundle();
                parcel2.writeNoException();
                k22.d(parcel2, bundle);
                break;
            case 18:
                bundle = new Bundle();
                parcel2.writeNoException();
                k22.d(parcel2, bundle);
                break;
            case 19:
                bundle = new Bundle();
                parcel2.writeNoException();
                k22.d(parcel2, bundle);
                break;
            case 20:
                String readString11 = parcel.readString();
                parcel.readString();
                k22.b(parcel);
                ((zl2) this).t4((pn5) k22.a(parcel, pn5.CREATOR), readString11);
                parcel2.writeNoException();
                break;
            case 21:
                ((zl2) this).T2(uv0.b(parcel, parcel));
                parcel2.writeNoException();
                break;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader2 = k22.a;
                parcel2.writeInt(0);
                break;
            case 23:
                hw Z7 = hw.a.Z(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    if (queryLocalInterface7 instanceof pr2) {
                        pr2Var = (pr2) queryLocalInterface7;
                    } else {
                        pr2Var = new nr2(readStrongBinder7);
                    }
                } else {
                    pr2Var = null;
                }
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                k22.b(parcel);
                ((zl2) this).E2(Z7, pr2Var, createStringArrayList2);
                throw null;
            case 24:
                am2 am2Var = ((zl2) this).Q;
                if (am2Var != null) {
                    g70 g70Var = am2Var.c;
                    if (g70Var instanceof td2) {
                        sd2Var = ((td2) g70Var).a;
                    }
                }
                parcel2.writeNoException();
                k22.e(parcel2, sd2Var);
                break;
            case 25:
                ClassLoader classLoader3 = k22.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                k22.b(parcel);
                ((zl2) this).T1(z);
                parcel2.writeNoException();
                break;
            case 26:
                k = ((zl2) this).f();
                parcel2.writeNoException();
                k22.e(parcel2, k);
                break;
            case 27:
                k = ((zl2) this).l();
                parcel2.writeNoException();
                k22.e(parcel2, k);
                break;
            case 28:
                hw Z8 = hw.a.Z(parcel.readStrongBinder());
                pn5 pn5Var7 = (pn5) k22.a(parcel, pn5.CREATOR);
                String readString12 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof cl2) {
                        cl2Var3 = (cl2) queryLocalInterface8;
                    } else {
                        cl2Var3 = new al2(readStrongBinder8);
                    }
                }
                k22.b(parcel);
                ((zl2) this).V0(Z8, pn5Var7, readString12, cl2Var3);
                parcel2.writeNoException();
                break;
            case 29:
            default:
                return false;
            case 30:
                ((zl2) this).y0(uv0.b(parcel, parcel));
                throw null;
            case 31:
                hw Z9 = hw.a.Z(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    if (queryLocalInterface9 instanceof ai2) {
                        ai2Var = (ai2) queryLocalInterface9;
                    } else {
                        ai2Var = new zh2(readStrongBinder9);
                    }
                }
                ArrayList createTypedArrayList = parcel.createTypedArrayList(ei2.CREATOR);
                k22.b(parcel);
                ((zl2) this).p3(Z9, ai2Var, createTypedArrayList);
                parcel2.writeNoException();
                break;
            case 32:
                hw Z10 = hw.a.Z(parcel.readStrongBinder());
                pn5 pn5Var8 = (pn5) k22.a(parcel, pn5.CREATOR);
                String readString13 = parcel.readString();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface10 instanceof cl2) {
                        cl2Var2 = (cl2) queryLocalInterface10;
                    } else {
                        cl2Var2 = new al2(readStrongBinder10);
                    }
                }
                k22.b(parcel);
                ((zl2) this).H2(Z10, pn5Var8, readString13, cl2Var2);
                parcel2.writeNoException();
                break;
            case 33:
                ((zl2) this).n();
                parcel2.writeNoException();
                k22.d(parcel2, null);
                break;
            case 34:
                ((zl2) this).o();
                parcel2.writeNoException();
                k22.d(parcel2, null);
                break;
            case 35:
                hw Z11 = hw.a.Z(parcel.readStrongBinder());
                zr5 zr5Var3 = (zr5) k22.a(parcel, zr5.CREATOR);
                pn5 pn5Var9 = (pn5) k22.a(parcel, pn5.CREATOR);
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface11 instanceof cl2) {
                        al2Var = (cl2) queryLocalInterface11;
                    } else {
                        al2Var = new al2(readStrongBinder11);
                    }
                }
                cl2 cl2Var9 = al2Var;
                k22.b(parcel);
                ((zl2) this).Y0(Z11, zr5Var3, pn5Var9, readString14, readString15, cl2Var9);
                parcel2.writeNoException();
                break;
            case 37:
                ((zl2) this).C3(uv0.b(parcel, parcel));
                parcel2.writeNoException();
                break;
            case 38:
                hw Z12 = hw.a.Z(parcel.readStrongBinder());
                pn5 pn5Var10 = (pn5) k22.a(parcel, pn5.CREATOR);
                String readString16 = parcel.readString();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface12 instanceof cl2) {
                        cl2Var = (cl2) queryLocalInterface12;
                    } else {
                        cl2Var = new al2(readStrongBinder12);
                    }
                }
                k22.b(parcel);
                ((zl2) this).E0(Z12, pn5Var10, readString16, cl2Var);
                parcel2.writeNoException();
                break;
            case 39:
                ((zl2) this).i3(uv0.b(parcel, parcel));
                throw null;
        }
        return true;
    }
}