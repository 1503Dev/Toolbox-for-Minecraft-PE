package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: im2  reason: default package */
public abstract class im2 extends j22 implements jn2 {
    public im2() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        de2 be2Var;
        gf2 gf2Var = null;
        ni2 ni2Var = null;
        je2 je2Var = null;
        ge2 ge2Var = null;
        c13 c13Var = null;
        ae2 ae2Var = null;
        xd2 xd2Var = null;
        vd2 vd2Var = null;
        switch (i) {
            case 1:
                ik2 b = b();
                parcel2.writeNoException();
                k22.e(parcel2, b);
                return true;
            case 2:
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
                q2(gf2Var);
                break;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    if (queryLocalInterface2 instanceof vd2) {
                        vd2Var = (vd2) queryLocalInterface2;
                    } else {
                        vd2Var = new ud2(readStrongBinder2);
                    }
                }
                k22.b(parcel);
                x0(vd2Var);
                break;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    if (queryLocalInterface3 instanceof xd2) {
                        xd2Var = (xd2) queryLocalInterface3;
                    } else {
                        xd2Var = new wd2(readStrongBinder3);
                    }
                }
                k22.b(parcel);
                R0(xd2Var);
                break;
            case 5:
                String readString = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    be2Var = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    if (queryLocalInterface4 instanceof de2) {
                        be2Var = (de2) queryLocalInterface4;
                    } else {
                        be2Var = new be2(readStrongBinder4);
                    }
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    if (queryLocalInterface5 instanceof ae2) {
                        ae2Var = (ae2) queryLocalInterface5;
                    } else {
                        ae2Var = new yd2(readStrongBinder5);
                    }
                }
                k22.b(parcel);
                e1(readString, be2Var, ae2Var);
                break;
            case 6:
                k22.b(parcel);
                j3((nc2) k22.a(parcel, nc2.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface6 instanceof c13) {
                        c13Var = (c13) queryLocalInterface6;
                    } else {
                        c13Var = new c13(readStrongBinder6);
                    }
                }
                k22.b(parcel);
                Q3(c13Var);
                break;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    if (queryLocalInterface7 instanceof ge2) {
                        ge2Var = (ge2) queryLocalInterface7;
                    } else {
                        ge2Var = new fe2(readStrongBinder7);
                    }
                }
                k22.b(parcel);
                H3(ge2Var, (zr5) k22.a(parcel, zr5.CREATOR));
                break;
            case 9:
                k22.b(parcel);
                w0((rg0) k22.a(parcel, rg0.CREATOR));
                break;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    if (queryLocalInterface8 instanceof je2) {
                        je2Var = (je2) queryLocalInterface8;
                    } else {
                        je2Var = new he2(readStrongBinder8);
                    }
                }
                k22.b(parcel);
                M0(je2Var);
                break;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                k22.b(parcel);
                R1((gi2) k22.a(parcel, gi2.CREATOR));
                break;
            case 14:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    if (queryLocalInterface9 instanceof ni2) {
                        ni2Var = (ni2) queryLocalInterface9;
                    } else {
                        ni2Var = new mi2(readStrongBinder9);
                    }
                }
                k22.b(parcel);
                e2(ni2Var);
                break;
            case 15:
                k22.b(parcel);
                C1((u2) k22.a(parcel, u2.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}