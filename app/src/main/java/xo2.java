package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: xo2  reason: default package */
public final class xo2 extends i22 implements pq2 {
    public xo2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // defpackage.pq2
    public final void A3(i42 i42Var) {
        Parcel A = A();
        k22.e(A, i42Var);
        c0(A, 40);
    }

    @Override // defpackage.pq2
    public final void B2(boolean z) {
        Parcel A = A();
        ClassLoader classLoader = k22.a;
        A.writeInt(z ? 1 : 0);
        c0(A, 34);
    }

    @Override // defpackage.pq2
    public final void F() {
        c0(A(), 2);
    }

    @Override // defpackage.pq2
    public final void F2(yk3 yk3Var) {
        Parcel A = A();
        k22.e(A, yk3Var);
        c0(A, 42);
    }

    @Override // defpackage.pq2
    public final void G0(pn5 pn5Var, xh2 xh2Var) {
        Parcel A = A();
        k22.c(A, pn5Var);
        k22.e(A, xh2Var);
        c0(A, 43);
    }

    @Override // defpackage.pq2
    public final void G1(q33 q33Var) {
        Parcel A = A();
        k22.e(A, q33Var);
        c0(A, 45);
    }

    @Override // defpackage.pq2
    public final void J() {
        c0(A(), 6);
    }

    @Override // defpackage.pq2
    public final void J2(by5 by5Var) {
        Parcel A = A();
        k22.c(A, by5Var);
        c0(A, 39);
    }

    @Override // defpackage.pq2
    public final void K1(zr5 zr5Var) {
        Parcel A = A();
        k22.c(A, zr5Var);
        c0(A, 13);
    }

    @Override // defpackage.pq2
    public final void M1() {
        c0(A(), 5);
    }

    @Override // defpackage.pq2
    public final void R2(qc2 qc2Var) {
        Parcel A = A();
        k22.e(A, qc2Var);
        c0(A, 20);
    }

    @Override // defpackage.pq2
    public final void S3(gf2 gf2Var) {
        Parcel A = A();
        k22.e(A, gf2Var);
        c0(A, 7);
    }

    @Override // defpackage.pq2
    public final void a1(px2 px2Var) {
        Parcel A = A();
        k22.e(A, px2Var);
        c0(A, 8);
    }

    @Override // defpackage.pq2
    public final void c3(zq4 zq4Var) {
        Parcel A = A();
        k22.c(A, zq4Var);
        c0(A, 29);
    }

    @Override // defpackage.pq2
    public final zr5 h() {
        Parcel Z = Z(A(), 12);
        zr5 zr5Var = (zr5) k22.a(Z, zr5.CREATOR);
        Z.recycle();
        return zr5Var;
    }

    @Override // defpackage.pq2
    public final void j4(boolean z) {
        Parcel A = A();
        ClassLoader classLoader = k22.a;
        A.writeInt(z ? 1 : 0);
        c0(A, 22);
    }

    @Override // defpackage.pq2
    public final hw k() {
        return uv0.a(Z(A(), 1));
    }

    @Override // defpackage.pq2
    public final mq3 l() {
        mq3 yo3Var;
        Parcel Z = Z(A(), 41);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            yo3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            yo3Var = queryLocalInterface instanceof mq3 ? (mq3) queryLocalInterface : new yo3(readStrongBinder);
        }
        Z.recycle();
        return yo3Var;
    }

    @Override // defpackage.pq2
    public final cs3 n() {
        cs3 dr3Var;
        Parcel Z = Z(A(), 26);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            dr3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            dr3Var = queryLocalInterface instanceof cs3 ? (cs3) queryLocalInterface : new dr3(readStrongBinder);
        }
        Z.recycle();
        return dr3Var;
    }

    @Override // defpackage.pq2
    public final void t1(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 44);
    }

    @Override // defpackage.pq2
    public final String w() {
        Parcel Z = Z(A(), 31);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.pq2
    public final boolean z1(pn5 pn5Var) {
        boolean z;
        Parcel A = A();
        k22.c(A, pn5Var);
        Parcel Z = Z(A, 4);
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }
}