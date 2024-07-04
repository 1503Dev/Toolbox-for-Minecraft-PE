package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: al2  reason: default package */
public final class al2 extends i22 implements cl2 {
    public al2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // defpackage.cl2
    public final void E() {
        c0(A(), 15);
    }

    @Override // defpackage.cl2
    public final void F() {
        c0(A(), 20);
    }

    @Override // defpackage.cl2
    public final void H0(qr2 qr2Var) {
        throw null;
    }

    @Override // defpackage.cl2
    public final void I(String str) {
        Parcel A = A();
        A.writeString(str);
        c0(A, 21);
    }

    @Override // defpackage.cl2
    public final void K() {
        c0(A(), 6);
    }

    @Override // defpackage.cl2
    public final void K3(tr2 tr2Var) {
        Parcel A = A();
        k22.e(A, tr2Var);
        c0(A, 16);
    }

    @Override // defpackage.cl2
    public final void P2(tz3 tz3Var) {
        Parcel A = A();
        k22.c(A, tz3Var);
        c0(A, 23);
    }

    @Override // defpackage.cl2
    public final void Y() {
        c0(A(), 13);
    }

    @Override // defpackage.cl2
    public final void b() {
        c0(A(), 1);
    }

    @Override // defpackage.cl2
    public final void e() {
        c0(A(), 2);
    }

    @Override // defpackage.cl2
    public final void e0(int i) {
        throw null;
    }

    @Override // defpackage.cl2
    public final void g0(tz3 tz3Var) {
        Parcel A = A();
        k22.c(A, tz3Var);
        c0(A, 24);
    }

    @Override // defpackage.cl2
    public final void k() {
        c0(A(), 4);
    }

    @Override // defpackage.cl2
    public final void m() {
        c0(A(), 5);
    }

    @Override // defpackage.cl2
    public final void m1(sd2 sd2Var, String str) {
        Parcel A = A();
        k22.e(A, sd2Var);
        A.writeString(str);
        c0(A, 10);
    }

    @Override // defpackage.cl2
    public final void m2(String str, String str2) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        c0(A, 9);
    }

    @Override // defpackage.cl2
    public final void o() {
        c0(A(), 8);
    }

    @Override // defpackage.cl2
    public final void r() {
        c0(A(), 11);
    }

    @Override // defpackage.cl2
    public final void u() {
        c0(A(), 18);
    }

    @Override // defpackage.cl2
    public final void v(int i) {
        Parcel A = A();
        A.writeInt(i);
        c0(A, 3);
    }

    @Override // defpackage.cl2
    public final void x1(int i, String str) {
        Parcel A = A();
        A.writeInt(i);
        A.writeString(str);
        c0(A, 22);
    }
}