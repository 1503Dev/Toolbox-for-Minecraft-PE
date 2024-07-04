package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nl2  reason: default package */
public final class nl2 extends i22 implements pl2 {
    public nl2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // defpackage.pl2
    public final void F() {
        c0(A(), 19);
    }

    @Override // defpackage.pl2
    public final String G() {
        Parcel Z = Z(A(), 10);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.pl2
    public final boolean J() {
        boolean z;
        Parcel Z = Z(A(), 17);
        ClassLoader classLoader = k22.a;
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }

    @Override // defpackage.pl2
    public final void L0(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 22);
    }

    @Override // defpackage.pl2
    public final boolean Q() {
        boolean z;
        Parcel Z = Z(A(), 18);
        ClassLoader classLoader = k22.a;
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }

    @Override // defpackage.pl2
    public final void Q0(hw hwVar, hw hwVar2, hw hwVar3) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.e(A, hwVar2);
        k22.e(A, hwVar3);
        c0(A, 21);
    }

    @Override // defpackage.pl2
    public final double b() {
        Parcel Z = Z(A(), 8);
        double readDouble = Z.readDouble();
        Z.recycle();
        return readDouble;
    }

    @Override // defpackage.pl2
    public final float e() {
        Parcel Z = Z(A(), 23);
        float readFloat = Z.readFloat();
        Z.recycle();
        return readFloat;
    }

    @Override // defpackage.pl2
    public final float f() {
        Parcel Z = Z(A(), 24);
        float readFloat = Z.readFloat();
        Z.recycle();
        return readFloat;
    }

    @Override // defpackage.pl2
    public final Bundle g() {
        Parcel Z = Z(A(), 16);
        Bundle bundle = (Bundle) k22.a(Z, Bundle.CREATOR);
        Z.recycle();
        return bundle;
    }

    @Override // defpackage.pl2
    public final float h() {
        Parcel Z = Z(A(), 25);
        float readFloat = Z.readFloat();
        Z.recycle();
        return readFloat;
    }

    @Override // defpackage.pl2
    public final cs3 j() {
        Parcel Z = Z(A(), 11);
        cs3 t4 = mr3.t4(Z.readStrongBinder());
        Z.recycle();
        return t4;
    }

    @Override // defpackage.pl2
    public final hw k() {
        return uv0.a(Z(A(), 14));
    }

    @Override // defpackage.pl2
    public final uc2 l() {
        Parcel Z = Z(A(), 12);
        uc2 t4 = tc2.t4(Z.readStrongBinder());
        Z.recycle();
        return t4;
    }

    @Override // defpackage.pl2
    public final String m() {
        Parcel Z = Z(A(), 7);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.pl2
    public final ad2 n() {
        Parcel Z = Z(A(), 5);
        ad2 t4 = lc2.t4(Z.readStrongBinder());
        Z.recycle();
        return t4;
    }

    @Override // defpackage.pl2
    public final hw o() {
        return uv0.a(Z(A(), 13));
    }

    @Override // defpackage.pl2
    public final String q() {
        Parcel Z = Z(A(), 4);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.pl2
    public final void q3(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 20);
    }

    @Override // defpackage.pl2
    public final List r() {
        Parcel Z = Z(A(), 3);
        ArrayList readArrayList = Z.readArrayList(k22.a);
        Z.recycle();
        return readArrayList;
    }

    @Override // defpackage.pl2
    public final String s() {
        Parcel Z = Z(A(), 2);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.pl2
    public final hw t() {
        return uv0.a(Z(A(), 15));
    }

    @Override // defpackage.pl2
    public final String u() {
        Parcel Z = Z(A(), 9);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.pl2
    public final String w() {
        Parcel Z = Z(A(), 6);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }
}