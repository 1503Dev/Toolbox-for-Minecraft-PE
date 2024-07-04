package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: my2  reason: default package */
public final class my2 extends i22 implements h03 {
    public my2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // defpackage.h03
    public final ed2 B1(hw hwVar, hw hwVar2) {
        ed2 cd2Var;
        Parcel A = A();
        k22.e(A, hwVar);
        k22.e(A, hwVar2);
        Parcel Z = Z(A, 5);
        IBinder readStrongBinder = Z.readStrongBinder();
        int i = dd2.P;
        if (readStrongBinder == null) {
            cd2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof ed2) {
                cd2Var = (ed2) queryLocalInterface;
            } else {
                cd2Var = new cd2(readStrongBinder);
            }
        }
        Z.recycle();
        return cd2Var;
    }

    @Override // defpackage.h03
    public final wr2 J3(hw hwVar, String str, wk2 wk2Var, int i) {
        wr2 ur2Var;
        Parcel A = A();
        k22.e(A, hwVar);
        A.writeString(str);
        k22.e(A, wk2Var);
        A.writeInt(231004000);
        Parcel Z = Z(A, 12);
        IBinder readStrongBinder = Z.readStrongBinder();
        int i2 = vr2.P;
        if (readStrongBinder == null) {
            ur2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof wr2) {
                ur2Var = (wr2) queryLocalInterface;
            } else {
                ur2Var = new ur2(readStrongBinder);
            }
        }
        Z.recycle();
        return ur2Var;
    }

    @Override // defpackage.h03
    public final gu2 P1(hw hwVar, wk2 wk2Var, int i) {
        gu2 eu2Var;
        Parcel A = A();
        k22.e(A, hwVar);
        k22.e(A, wk2Var);
        A.writeInt(231004000);
        Parcel Z = Z(A, 14);
        IBinder readStrongBinder = Z.readStrongBinder();
        int i2 = fu2.P;
        if (readStrongBinder == null) {
            eu2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof gu2) {
                eu2Var = (gu2) queryLocalInterface;
            } else {
                eu2Var = new eu2(readStrongBinder);
            }
        }
        Z.recycle();
        return eu2Var;
    }

    @Override // defpackage.h03
    public final po2 S(hw hwVar) {
        po2 no2Var;
        Parcel A = A();
        k22.e(A, hwVar);
        Parcel Z = Z(A, 8);
        IBinder readStrongBinder = Z.readStrongBinder();
        int i = oo2.P;
        if (readStrongBinder == null) {
            no2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof po2) {
                no2Var = (po2) queryLocalInterface;
            } else {
                no2Var = new no2(readStrongBinder);
            }
        }
        Z.recycle();
        return no2Var;
    }

    @Override // defpackage.h03
    public final jn2 T3(hw hwVar, String str, wk2 wk2Var, int i) {
        jn2 hl2Var;
        Parcel A = A();
        k22.e(A, hwVar);
        A.writeString(str);
        k22.e(A, wk2Var);
        A.writeInt(231004000);
        Parcel Z = Z(A, 3);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            hl2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            hl2Var = queryLocalInterface instanceof jn2 ? (jn2) queryLocalInterface : new hl2(readStrongBinder);
        }
        Z.recycle();
        return hl2Var;
    }

    @Override // defpackage.h03
    public final pq2 V2(hw hwVar, zr5 zr5Var, String str, wk2 wk2Var, int i) {
        pq2 xo2Var;
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, zr5Var);
        A.writeString(str);
        k22.e(A, wk2Var);
        A.writeInt(231004000);
        Parcel Z = Z(A, 13);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            xo2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            xo2Var = queryLocalInterface instanceof pq2 ? (pq2) queryLocalInterface : new xo2(readStrongBinder);
        }
        Z.recycle();
        return xo2Var;
    }

    @Override // defpackage.h03
    public final pq2 Z0(hw hwVar, zr5 zr5Var, String str, int i) {
        pq2 xo2Var;
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, zr5Var);
        A.writeString(str);
        A.writeInt(231004000);
        Parcel Z = Z(A, 10);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            xo2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            xo2Var = queryLocalInterface instanceof pq2 ? (pq2) queryLocalInterface : new xo2(readStrongBinder);
        }
        Z.recycle();
        return xo2Var;
    }

    @Override // defpackage.h03
    public final q73 b0(hw hwVar, int i) {
        q73 r53Var;
        Parcel A = A();
        k22.e(A, hwVar);
        A.writeInt(231004000);
        Parcel Z = Z(A, 9);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            r53Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            r53Var = queryLocalInterface instanceof q73 ? (q73) queryLocalInterface : new r53(readStrongBinder);
        }
        Z.recycle();
        return r53Var;
    }

    @Override // defpackage.h03
    public final io2 d2(hw hwVar, wk2 wk2Var, int i) {
        io2 go2Var;
        Parcel A = A();
        k22.e(A, hwVar);
        k22.e(A, wk2Var);
        A.writeInt(231004000);
        Parcel Z = Z(A, 15);
        IBinder readStrongBinder = Z.readStrongBinder();
        int i2 = ho2.P;
        if (readStrongBinder == null) {
            go2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof io2) {
                go2Var = (io2) queryLocalInterface;
            } else {
                go2Var = new go2(readStrongBinder);
            }
        }
        Z.recycle();
        return go2Var;
    }

    @Override // defpackage.h03
    public final pq2 g2(hw hwVar, zr5 zr5Var, String str, wk2 wk2Var, int i) {
        pq2 xo2Var;
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, zr5Var);
        A.writeString(str);
        k22.e(A, wk2Var);
        A.writeInt(231004000);
        Parcel Z = Z(A, 1);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            xo2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            xo2Var = queryLocalInterface instanceof pq2 ? (pq2) queryLocalInterface : new xo2(readStrongBinder);
        }
        Z.recycle();
        return xo2Var;
    }

    @Override // defpackage.h03
    public final pq2 o1(hw hwVar, zr5 zr5Var, String str, wk2 wk2Var, int i) {
        pq2 xo2Var;
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, zr5Var);
        A.writeString(str);
        k22.e(A, wk2Var);
        A.writeInt(231004000);
        Parcel Z = Z(A, 2);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            xo2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            xo2Var = queryLocalInterface instanceof pq2 ? (pq2) queryLocalInterface : new xo2(readStrongBinder);
        }
        Z.recycle();
        return xo2Var;
    }

    @Override // defpackage.h03
    public final gn3 o2(hw hwVar, wk2 wk2Var, int i) {
        gn3 rl3Var;
        Parcel A = A();
        k22.e(A, hwVar);
        k22.e(A, wk2Var);
        A.writeInt(231004000);
        Parcel Z = Z(A, 17);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            rl3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            rl3Var = queryLocalInterface instanceof gn3 ? (gn3) queryLocalInterface : new rl3(readStrongBinder);
        }
        Z.recycle();
        return rl3Var;
    }
}