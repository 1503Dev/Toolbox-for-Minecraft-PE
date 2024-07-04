package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xk2  reason: default package */
public final class xk2 extends i22 implements zk2 {
    public xk2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // defpackage.zk2
    public final ml2 C() {
        ml2 ml2Var;
        Parcel Z = Z(A(), 16);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            ml2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            ml2Var = queryLocalInterface instanceof ml2 ? (ml2) queryLocalInterface : new ml2(readStrongBinder);
        }
        Z.recycle();
        return ml2Var;
    }

    @Override // defpackage.zk2
    public final void C3(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 37);
    }

    @Override // defpackage.zk2
    public final void E0(hw hwVar, pn5 pn5Var, String str, cl2 cl2Var) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, pn5Var);
        A.writeString(str);
        k22.e(A, cl2Var);
        c0(A, 38);
    }

    @Override // defpackage.zk2
    public final void E2(hw hwVar, pr2 pr2Var, List list) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.e(A, pr2Var);
        A.writeStringList(list);
        c0(A, 23);
    }

    @Override // defpackage.zk2
    public final void F3(hw hwVar, pn5 pn5Var, String str, String str2, cl2 cl2Var) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, pn5Var);
        A.writeString(str);
        A.writeString(str2);
        k22.e(A, cl2Var);
        c0(A, 7);
    }

    @Override // defpackage.zk2
    public final void H2(hw hwVar, pn5 pn5Var, String str, cl2 cl2Var) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, pn5Var);
        A.writeString(str);
        k22.e(A, cl2Var);
        c0(A, 32);
    }

    @Override // defpackage.zk2
    public final void I3(pn5 pn5Var, String str) {
        Parcel A = A();
        k22.c(A, pn5Var);
        A.writeString(str);
        c0(A, 11);
    }

    @Override // defpackage.zk2
    public final void K() {
        c0(A(), 5);
    }

    @Override // defpackage.zk2
    public final ll2 L() {
        ll2 ll2Var;
        Parcel Z = Z(A(), 15);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            ll2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            ll2Var = queryLocalInterface instanceof ll2 ? (ll2) queryLocalInterface : new ll2(readStrongBinder);
        }
        Z.recycle();
        return ll2Var;
    }

    @Override // defpackage.zk2
    public final void N() {
        c0(A(), 12);
    }

    @Override // defpackage.zk2
    public final boolean O() {
        boolean z;
        Parcel Z = Z(A(), 22);
        ClassLoader classLoader = k22.a;
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }

    @Override // defpackage.zk2
    public final void O1() {
        c0(A(), 8);
    }

    @Override // defpackage.zk2
    public final boolean R() {
        boolean z;
        Parcel Z = Z(A(), 13);
        ClassLoader classLoader = k22.a;
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }

    @Override // defpackage.zk2
    public final void T1(boolean z) {
        Parcel A = A();
        ClassLoader classLoader = k22.a;
        A.writeInt(z ? 1 : 0);
        c0(A, 25);
    }

    @Override // defpackage.zk2
    public final void T2(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 21);
    }

    @Override // defpackage.zk2
    public final void U3(hw hwVar, pn5 pn5Var, pr2 pr2Var, String str) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, pn5Var);
        A.writeString(null);
        k22.e(A, pr2Var);
        A.writeString(str);
        c0(A, 10);
    }

    @Override // defpackage.zk2
    public final void V0(hw hwVar, pn5 pn5Var, String str, cl2 cl2Var) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, pn5Var);
        A.writeString(str);
        k22.e(A, cl2Var);
        c0(A, 28);
    }

    @Override // defpackage.zk2
    public final void W0(hw hwVar, zr5 zr5Var, pn5 pn5Var, String str, String str2, cl2 cl2Var) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, zr5Var);
        k22.c(A, pn5Var);
        A.writeString(str);
        A.writeString(str2);
        k22.e(A, cl2Var);
        c0(A, 6);
    }

    @Override // defpackage.zk2
    public final void Y0(hw hwVar, zr5 zr5Var, pn5 pn5Var, String str, String str2, cl2 cl2Var) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, zr5Var);
        k22.c(A, pn5Var);
        A.writeString(str);
        A.writeString(str2);
        k22.e(A, cl2Var);
        c0(A, 35);
    }

    @Override // defpackage.zk2
    public final cs3 f() {
        Parcel Z = Z(A(), 26);
        cs3 t4 = mr3.t4(Z.readStrongBinder());
        Z.recycle();
        return t4;
    }

    @Override // defpackage.zk2
    public final void i3(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 39);
    }

    @Override // defpackage.zk2
    public final jl2 j() {
        jl2 il2Var;
        Parcel Z = Z(A(), 36);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            il2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            il2Var = queryLocalInterface instanceof jl2 ? (jl2) queryLocalInterface : new il2(readStrongBinder);
        }
        Z.recycle();
        return il2Var;
    }

    @Override // defpackage.zk2
    public final hw k() {
        return uv0.a(Z(A(), 2));
    }

    @Override // defpackage.zk2
    public final pl2 l() {
        pl2 nl2Var;
        Parcel Z = Z(A(), 27);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            nl2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            nl2Var = queryLocalInterface instanceof pl2 ? (pl2) queryLocalInterface : new nl2(readStrongBinder);
        }
        Z.recycle();
        return nl2Var;
    }

    @Override // defpackage.zk2
    public final mn2 n() {
        Parcel Z = Z(A(), 33);
        mn2 mn2Var = (mn2) k22.a(Z, mn2.CREATOR);
        Z.recycle();
        return mn2Var;
    }

    @Override // defpackage.zk2
    public final mn2 o() {
        Parcel Z = Z(A(), 34);
        mn2 mn2Var = (mn2) k22.a(Z, mn2.CREATOR);
        Z.recycle();
        return mn2Var;
    }

    @Override // defpackage.zk2
    public final void p3(hw hwVar, ai2 ai2Var, List list) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.e(A, ai2Var);
        A.writeTypedList(list);
        c0(A, 31);
    }

    @Override // defpackage.zk2
    public final void s1() {
        c0(A(), 4);
    }

    @Override // defpackage.zk2
    public final void u2(hw hwVar, pn5 pn5Var, String str, String str2, cl2 cl2Var, nc2 nc2Var, ArrayList arrayList) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, pn5Var);
        A.writeString(str);
        A.writeString(str2);
        k22.e(A, cl2Var);
        k22.c(A, nc2Var);
        A.writeStringList(arrayList);
        c0(A, 14);
    }

    @Override // defpackage.zk2
    public final void x() {
        c0(A(), 9);
    }

    @Override // defpackage.zk2
    public final void y0(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 30);
    }
}