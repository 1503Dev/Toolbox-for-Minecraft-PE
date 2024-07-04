package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: xm2  reason: default package */
public final class xm2 extends i22 implements zm2 {
    public xm2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // defpackage.zm2
    public final void E3(String str) {
        Parcel A = A();
        A.writeString(str);
        c0(A, 19);
    }

    @Override // defpackage.zm2
    public final void J1(hw hwVar, String str, Bundle bundle, Bundle bundle2, zr5 zr5Var, cn2 cn2Var) {
        Parcel A = A();
        k22.e(A, hwVar);
        A.writeString(str);
        k22.c(A, bundle);
        k22.c(A, bundle2);
        k22.c(A, zr5Var);
        k22.e(A, cn2Var);
        c0(A, 1);
    }

    @Override // defpackage.zm2
    public final void M2(String str, String str2, pn5 pn5Var, hw hwVar, tm2 tm2Var, cl2 cl2Var, nc2 nc2Var) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        k22.c(A, pn5Var);
        k22.e(A, hwVar);
        k22.e(A, tm2Var);
        k22.e(A, cl2Var);
        k22.c(A, nc2Var);
        c0(A, 22);
    }

    @Override // defpackage.zm2
    public final void N2(String str, String str2, pn5 pn5Var, hw hwVar, nm2 nm2Var, cl2 cl2Var, zr5 zr5Var) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        k22.c(A, pn5Var);
        k22.e(A, hwVar);
        k22.e(A, nm2Var);
        k22.e(A, cl2Var);
        k22.c(A, zr5Var);
        c0(A, 21);
    }

    @Override // defpackage.zm2
    public final void W1(String str, String str2, pn5 pn5Var, hw hwVar, km2 km2Var, cl2 cl2Var) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        k22.c(A, pn5Var);
        k22.e(A, hwVar);
        k22.e(A, km2Var);
        k22.e(A, cl2Var);
        c0(A, 23);
    }

    @Override // defpackage.zm2
    public final void W2(String str, String str2, pn5 pn5Var, hw hwVar, wm2 wm2Var, cl2 cl2Var) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        k22.c(A, pn5Var);
        k22.e(A, hwVar);
        k22.e(A, wm2Var);
        k22.e(A, cl2Var);
        c0(A, 16);
    }

    @Override // defpackage.zm2
    public final void X3(String str, String str2, pn5 pn5Var, hw hwVar, nm2 nm2Var, cl2 cl2Var, zr5 zr5Var) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        k22.c(A, pn5Var);
        k22.e(A, hwVar);
        k22.e(A, nm2Var);
        k22.e(A, cl2Var);
        k22.c(A, zr5Var);
        c0(A, 13);
    }

    @Override // defpackage.zm2
    public final cs3 b() {
        Parcel Z = Z(A(), 5);
        cs3 t4 = mr3.t4(Z.readStrongBinder());
        Z.recycle();
        return t4;
    }

    @Override // defpackage.zm2
    public final void c1(String str, String str2, pn5 pn5Var, hw hwVar, tm2 tm2Var, cl2 cl2Var) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        k22.c(A, pn5Var);
        k22.e(A, hwVar);
        k22.e(A, tm2Var);
        k22.e(A, cl2Var);
        c0(A, 18);
    }

    @Override // defpackage.zm2
    public final mn2 e() {
        Parcel Z = Z(A(), 2);
        mn2 mn2Var = (mn2) k22.a(Z, mn2.CREATOR);
        Z.recycle();
        return mn2Var;
    }

    @Override // defpackage.zm2
    public final void f4(String str, String str2, pn5 pn5Var, hw hwVar, wm2 wm2Var, cl2 cl2Var) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        k22.c(A, pn5Var);
        k22.e(A, hwVar);
        k22.e(A, wm2Var);
        k22.e(A, cl2Var);
        c0(A, 20);
    }

    @Override // defpackage.zm2
    public final mn2 h() {
        Parcel Z = Z(A(), 3);
        mn2 mn2Var = (mn2) k22.a(Z, mn2.CREATOR);
        Z.recycle();
        return mn2Var;
    }

    @Override // defpackage.zm2
    public final boolean h2(hw hwVar) {
        boolean z;
        Parcel A = A();
        k22.e(A, hwVar);
        Parcel Z = Z(A, 24);
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }

    @Override // defpackage.zm2
    public final boolean m0(hw hwVar) {
        boolean z;
        Parcel A = A();
        k22.e(A, hwVar);
        Parcel Z = Z(A, 15);
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }

    @Override // defpackage.zm2
    public final boolean t3(va0 va0Var) {
        boolean z;
        Parcel A = A();
        k22.e(A, va0Var);
        Parcel Z = Z(A, 17);
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }

    @Override // defpackage.zm2
    public final void u1(String str, String str2, pn5 pn5Var, hw hwVar, qm2 qm2Var, cl2 cl2Var) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        k22.c(A, pn5Var);
        k22.e(A, hwVar);
        k22.e(A, qm2Var);
        k22.e(A, cl2Var);
        c0(A, 14);
    }
}