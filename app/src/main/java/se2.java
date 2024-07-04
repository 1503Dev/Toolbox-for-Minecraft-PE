package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: se2  reason: default package */
public final class se2 extends i22 implements ue2 {
    public se2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // defpackage.ue2
    public final String G() {
        Parcel Z = Z(A(), 9);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.ue2
    public final double b() {
        Parcel Z = Z(A(), 8);
        double readDouble = Z.readDouble();
        Z.recycle();
        return readDouble;
    }

    @Override // defpackage.ue2
    public final cs3 f() {
        Parcel Z = Z(A(), 11);
        cs3 t4 = mr3.t4(Z.readStrongBinder());
        Z.recycle();
        return t4;
    }

    @Override // defpackage.ue2
    public final uc2 g() {
        uc2 sc2Var;
        Parcel Z = Z(A(), 14);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            sc2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            sc2Var = queryLocalInterface instanceof uc2 ? (uc2) queryLocalInterface : new sc2(readStrongBinder);
        }
        Z.recycle();
        return sc2Var;
    }

    @Override // defpackage.ue2
    public final mq3 h() {
        Parcel Z = Z(A(), 31);
        mq3 t4 = sp3.t4(Z.readStrongBinder());
        Z.recycle();
        return t4;
    }

    @Override // defpackage.ue2
    public final String k() {
        Parcel Z = Z(A(), 7);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.ue2
    public final ad2 l() {
        ad2 zc2Var;
        Parcel Z = Z(A(), 5);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            zc2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zc2Var = queryLocalInterface instanceof ad2 ? (ad2) queryLocalInterface : new zc2(readStrongBinder);
        }
        Z.recycle();
        return zc2Var;
    }

    @Override // defpackage.ue2
    public final String m() {
        Parcel Z = Z(A(), 6);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.ue2
    public final hw n() {
        return uv0.a(Z(A(), 19));
    }

    @Override // defpackage.ue2
    public final hw o() {
        return uv0.a(Z(A(), 18));
    }

    @Override // defpackage.ue2
    public final String q() {
        Parcel Z = Z(A(), 2);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.ue2
    public final List r() {
        Parcel Z = Z(A(), 23);
        ArrayList readArrayList = Z.readArrayList(k22.a);
        Z.recycle();
        return readArrayList;
    }

    @Override // defpackage.ue2
    public final String s() {
        Parcel Z = Z(A(), 10);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.ue2
    public final String t() {
        Parcel Z = Z(A(), 4);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.ue2
    public final List u() {
        Parcel Z = Z(A(), 3);
        ArrayList readArrayList = Z.readArrayList(k22.a);
        Z.recycle();
        return readArrayList;
    }
}