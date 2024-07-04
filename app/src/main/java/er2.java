package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: er2  reason: default package */
public abstract class er2 extends j22 {
    public er2() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0205, code lost:
        if (java.util.regex.Pattern.matches(r4, r3) != false) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [gr2] */
    @Override // defpackage.j22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        gd3 gd3Var;
        wt2 ms2Var;
        AtomicReference atomicReference;
        Bundle bundle;
        boolean z;
        boolean z2 = false;
        r0 = 0;
        r0 = 0;
        r0 = 0;
        int i2 = 0;
        boolean z3 = false;
        z2 = false;
        fr2 fr2Var = null;
        dr2 dr2Var = null;
        vh4 vh4Var = null;
        r2 = null;
        String str = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 34) {
                        switch (i) {
                            case 5:
                                wh4 wh4Var = (wh4) this;
                                uf0.b("isLoaded must be called on the main UI thread.");
                                synchronized (wh4Var) {
                                    yp3 yp3Var = wh4Var.S;
                                    if (yp3Var != null) {
                                        if (!yp3Var.o.Q.get()) {
                                            i2 = 1;
                                        }
                                    }
                                }
                                parcel2.writeNoException();
                                ClassLoader classLoader = k22.a;
                                parcel2.writeInt(i2);
                                break;
                            case 6:
                                ((wh4) this).J0(null);
                                break;
                            case 7:
                                ((wh4) this).t4(null);
                                break;
                            case 8:
                                ((wh4) this).o3(null);
                                break;
                            case 9:
                                ((wh4) this).J0(uv0.b(parcel, parcel));
                                break;
                            case 10:
                                ((wh4) this).t4(uv0.b(parcel, parcel));
                                break;
                            case 11:
                                ((wh4) this).o3(uv0.b(parcel, parcel));
                                break;
                            case 12:
                                wh4 wh4Var2 = (wh4) this;
                                synchronized (wh4Var2) {
                                    yp3 yp3Var2 = wh4Var2.S;
                                    if (yp3Var2 != null && (gd3Var = yp3Var2.f) != null) {
                                        str = gd3Var.P;
                                    }
                                }
                                parcel2.writeNoException();
                                parcel2.writeString(str);
                                break;
                            case 13:
                                String readString = parcel.readString();
                                k22.b(parcel);
                                wh4 wh4Var3 = (wh4) this;
                                synchronized (wh4Var3) {
                                    uf0.b("setUserId must be called on the main UI thread.");
                                    wh4Var3.R.a = readString;
                                    break;
                                }
                            case 14:
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                if (readStrongBinder == null) {
                                    ms2Var = null;
                                } else {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                                    if (queryLocalInterface instanceof wt2) {
                                        ms2Var = (wt2) queryLocalInterface;
                                    } else {
                                        ms2Var = new ms2(readStrongBinder);
                                    }
                                }
                                k22.b(parcel);
                                wh4 wh4Var4 = (wh4) this;
                                uf0.b("setAdMetadataListener can only be called from the UI thread.");
                                if (ms2Var == null) {
                                    atomicReference = wh4Var4.Q.Q;
                                } else {
                                    mh4 mh4Var = wh4Var4.Q;
                                    vh4Var = new vh4(wh4Var4, ms2Var);
                                    atomicReference = mh4Var.Q;
                                }
                                atomicReference.set(vh4Var);
                                break;
                            case 15:
                                uf0.b("getAdMetadata can only be called from the UI thread.");
                                yp3 yp3Var3 = ((wh4) this).S;
                                if (yp3Var3 != null) {
                                    pe3 pe3Var = yp3Var3.n;
                                    synchronized (pe3Var) {
                                        bundle = new Bundle(pe3Var.Q);
                                    }
                                } else {
                                    bundle = new Bundle();
                                }
                                parcel2.writeNoException();
                                k22.d(parcel2, bundle);
                                break;
                            case 16:
                                IBinder readStrongBinder2 = parcel.readStrongBinder();
                                if (readStrongBinder2 != null) {
                                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                    if (queryLocalInterface2 instanceof dr2) {
                                        dr2Var = (dr2) queryLocalInterface2;
                                    } else {
                                        dr2Var = new dr2(readStrongBinder2);
                                    }
                                }
                                k22.b(parcel);
                                uf0.b("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                                ((wh4) this).Q.V.set(dr2Var);
                                break;
                            case 17:
                                parcel.readString();
                                k22.b(parcel);
                                break;
                            case 18:
                                ((wh4) this).w4(uv0.b(parcel, parcel));
                                break;
                            case 19:
                                String readString2 = parcel.readString();
                                k22.b(parcel);
                                ((wh4) this).u4(readString2);
                                break;
                            case 20:
                                yp3 yp3Var4 = ((wh4) this).S;
                                if (yp3Var4 != null) {
                                    y03 y03Var = (y03) yp3Var4.j.get();
                                    if (y03Var != null && !y03Var.k0()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        i2 = 1;
                                    }
                                }
                                parcel2.writeNoException();
                                ClassLoader classLoader2 = k22.a;
                                parcel2.writeInt(i2);
                                break;
                            case 21:
                                mq3 d = ((wh4) this).d();
                                parcel2.writeNoException();
                                k22.e(parcel2, d);
                                break;
                            default:
                                return false;
                        }
                        return true;
                    }
                    ClassLoader classLoader3 = k22.a;
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    }
                    k22.b(parcel);
                    ((wh4) this).v4(z3);
                } else {
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                        if (queryLocalInterface3 instanceof gr2) {
                            fr2Var = (gr2) queryLocalInterface3;
                        } else {
                            fr2Var = new fr2(readStrongBinder3);
                        }
                    }
                    k22.b(parcel);
                    uf0.b("setRewardedVideoAdListener can only be called from the UI thread.");
                    ((wh4) this).Q.T.set(fr2Var);
                }
            } else {
                wh4 wh4Var5 = (wh4) this;
                synchronized (wh4Var5) {
                    wh4Var5.w4(null);
                }
            }
        } else {
            hr2 hr2Var = (hr2) k22.a(parcel, hr2.CREATOR);
            k22.b(parcel);
            wh4 wh4Var6 = (wh4) this;
            synchronized (wh4Var6) {
                uf0.b("loadAd must be called on the main UI thread.");
                String str2 = hr2Var.Q;
                String str3 = (String) w82.d.c.a(x92.r4);
                if (str3 != null && str2 != null) {
                    try {
                    } catch (RuntimeException e) {
                        jv5.A.g.f("NonagonUtil.isPatternMatched", e);
                    }
                }
                synchronized (wh4Var6) {
                    yp3 yp3Var5 = wh4Var6.S;
                    if (yp3Var5 != null && !yp3Var5.o.Q.get()) {
                        z2 = true;
                    }
                    if (z2) {
                        if (!((Boolean) w82.d.c.a(x92.t4)).booleanValue()) {
                        }
                    }
                    nh4 nh4Var = new nh4();
                    wh4Var6.S = null;
                    qh4 qh4Var = wh4Var6.P;
                    qh4Var.h.o.a = 1;
                    qh4Var.b(hr2Var.P, hr2Var.Q, nh4Var, new bo5(6, wh4Var6));
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}