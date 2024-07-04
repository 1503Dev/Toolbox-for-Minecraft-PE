package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hw;

/* renamed from: ym2  reason: default package */
public abstract class ym2 extends j22 implements zm2 {
    public static final /* synthetic */ int P = 0;

    public ym2() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        cn2 cn2Var = null;
        km2 em2Var = null;
        tm2 rm2Var = null;
        nm2 lm2Var = null;
        wm2 um2Var = null;
        tm2 rm2Var2 = null;
        wm2 um2Var2 = null;
        qm2 om2Var = null;
        nm2 lm2Var2 = null;
        if (i != 1) {
            if (i == 2) {
                ((ln2) this).e();
                throw null;
            } else if (i == 3) {
                ((ln2) this).h();
                throw null;
            } else {
                if (i != 5) {
                    if (i == 10) {
                        hw.a.Z(parcel.readStrongBinder());
                    } else if (i != 11) {
                        switch (i) {
                            case 13:
                                String readString = parcel.readString();
                                String readString2 = parcel.readString();
                                pn5 pn5Var = (pn5) k22.a(parcel, pn5.CREATOR);
                                hw Z = hw.a.Z(parcel.readStrongBinder());
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    lm2Var2 = queryLocalInterface instanceof nm2 ? (nm2) queryLocalInterface : new lm2(readStrongBinder);
                                }
                                nm2 nm2Var = lm2Var2;
                                k22.b(parcel);
                                ((ln2) this).X3(readString, readString2, pn5Var, Z, nm2Var, bl2.t4(parcel.readStrongBinder()), (zr5) k22.a(parcel, zr5.CREATOR));
                                break;
                            case 14:
                                String readString3 = parcel.readString();
                                String readString4 = parcel.readString();
                                pn5 pn5Var2 = (pn5) k22.a(parcel, pn5.CREATOR);
                                hw Z2 = hw.a.Z(parcel.readStrongBinder());
                                IBinder readStrongBinder2 = parcel.readStrongBinder();
                                if (readStrongBinder2 != null) {
                                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                    om2Var = queryLocalInterface2 instanceof qm2 ? (qm2) queryLocalInterface2 : new om2(readStrongBinder2);
                                }
                                qm2 qm2Var = om2Var;
                                cl2 t4 = bl2.t4(parcel.readStrongBinder());
                                k22.b(parcel);
                                ((ln2) this).u1(readString3, readString4, pn5Var2, Z2, qm2Var, t4);
                                break;
                            case 15:
                            case 17:
                            case 24:
                                hw.a.Z(parcel.readStrongBinder());
                                k22.b(parcel);
                                parcel2.writeNoException();
                                parcel2.writeInt(0);
                                break;
                            case 16:
                                String readString5 = parcel.readString();
                                String readString6 = parcel.readString();
                                pn5 pn5Var3 = (pn5) k22.a(parcel, pn5.CREATOR);
                                hw Z3 = hw.a.Z(parcel.readStrongBinder());
                                IBinder readStrongBinder3 = parcel.readStrongBinder();
                                if (readStrongBinder3 != null) {
                                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    um2Var2 = queryLocalInterface3 instanceof wm2 ? (wm2) queryLocalInterface3 : new um2(readStrongBinder3);
                                }
                                wm2 wm2Var = um2Var2;
                                cl2 t42 = bl2.t4(parcel.readStrongBinder());
                                k22.b(parcel);
                                ((ln2) this).W2(readString5, readString6, pn5Var3, Z3, wm2Var, t42);
                                break;
                            case 18:
                                String readString7 = parcel.readString();
                                String readString8 = parcel.readString();
                                pn5 pn5Var4 = (pn5) k22.a(parcel, pn5.CREATOR);
                                hw Z4 = hw.a.Z(parcel.readStrongBinder());
                                IBinder readStrongBinder4 = parcel.readStrongBinder();
                                if (readStrongBinder4 != null) {
                                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    rm2Var2 = queryLocalInterface4 instanceof tm2 ? (tm2) queryLocalInterface4 : new rm2(readStrongBinder4);
                                }
                                tm2 tm2Var = rm2Var2;
                                cl2 t43 = bl2.t4(parcel.readStrongBinder());
                                k22.b(parcel);
                                ((ln2) this).c1(readString7, readString8, pn5Var4, Z4, tm2Var, t43);
                                break;
                            case 19:
                                parcel.readString();
                                k22.b(parcel);
                                break;
                            case 20:
                                String readString9 = parcel.readString();
                                String readString10 = parcel.readString();
                                pn5 pn5Var5 = (pn5) k22.a(parcel, pn5.CREATOR);
                                hw Z5 = hw.a.Z(parcel.readStrongBinder());
                                IBinder readStrongBinder5 = parcel.readStrongBinder();
                                if (readStrongBinder5 != null) {
                                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    um2Var = queryLocalInterface5 instanceof wm2 ? (wm2) queryLocalInterface5 : new um2(readStrongBinder5);
                                }
                                wm2 wm2Var2 = um2Var;
                                cl2 t44 = bl2.t4(parcel.readStrongBinder());
                                k22.b(parcel);
                                ((ln2) this).f4(readString9, readString10, pn5Var5, Z5, wm2Var2, t44);
                                break;
                            case 21:
                                String readString11 = parcel.readString();
                                String readString12 = parcel.readString();
                                pn5 pn5Var6 = (pn5) k22.a(parcel, pn5.CREATOR);
                                hw Z6 = hw.a.Z(parcel.readStrongBinder());
                                IBinder readStrongBinder6 = parcel.readStrongBinder();
                                if (readStrongBinder6 != null) {
                                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    lm2Var = queryLocalInterface6 instanceof nm2 ? (nm2) queryLocalInterface6 : new lm2(readStrongBinder6);
                                }
                                nm2 nm2Var2 = lm2Var;
                                k22.b(parcel);
                                ((ln2) this).N2(readString11, readString12, pn5Var6, Z6, nm2Var2, bl2.t4(parcel.readStrongBinder()), (zr5) k22.a(parcel, zr5.CREATOR));
                                break;
                            case 22:
                                String readString13 = parcel.readString();
                                String readString14 = parcel.readString();
                                pn5 pn5Var7 = (pn5) k22.a(parcel, pn5.CREATOR);
                                hw Z7 = hw.a.Z(parcel.readStrongBinder());
                                IBinder readStrongBinder7 = parcel.readStrongBinder();
                                if (readStrongBinder7 != null) {
                                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    rm2Var = queryLocalInterface7 instanceof tm2 ? (tm2) queryLocalInterface7 : new rm2(readStrongBinder7);
                                }
                                tm2 tm2Var2 = rm2Var;
                                k22.b(parcel);
                                ((ln2) this).M2(readString13, readString14, pn5Var7, Z7, tm2Var2, bl2.t4(parcel.readStrongBinder()), (nc2) k22.a(parcel, nc2.CREATOR));
                                break;
                            case 23:
                                String readString15 = parcel.readString();
                                String readString16 = parcel.readString();
                                pn5 pn5Var8 = (pn5) k22.a(parcel, pn5.CREATOR);
                                hw Z8 = hw.a.Z(parcel.readStrongBinder());
                                IBinder readStrongBinder8 = parcel.readStrongBinder();
                                if (readStrongBinder8 != null) {
                                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                    em2Var = queryLocalInterface8 instanceof km2 ? (km2) queryLocalInterface8 : new em2(readStrongBinder8);
                                }
                                km2 km2Var = em2Var;
                                cl2 t45 = bl2.t4(parcel.readStrongBinder());
                                k22.b(parcel);
                                ((ln2) this).W1(readString15, readString16, pn5Var8, Z8, km2Var, t45);
                                break;
                            default:
                                return false;
                        }
                    } else {
                        parcel.createStringArray();
                        Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
                    }
                    k22.b(parcel);
                } else {
                    cs3 b = ((ln2) this).b();
                    parcel2.writeNoException();
                    k22.e(parcel2, b);
                }
                return true;
            }
        }
        hw Z9 = hw.a.Z(parcel.readStrongBinder());
        String readString17 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) k22.a(parcel, creator);
        Bundle bundle2 = (Bundle) k22.a(parcel, creator);
        zr5 zr5Var = (zr5) k22.a(parcel, zr5.CREATOR);
        IBinder readStrongBinder9 = parcel.readStrongBinder();
        if (readStrongBinder9 != null) {
            IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            cn2Var = queryLocalInterface9 instanceof cn2 ? (cn2) queryLocalInterface9 : new an2(readStrongBinder9);
        }
        cn2 cn2Var2 = cn2Var;
        k22.b(parcel);
        ((ln2) this).J1(Z9, readString17, bundle, bundle2, zr5Var, cn2Var2);
        parcel2.writeNoException();
        return true;
    }
}