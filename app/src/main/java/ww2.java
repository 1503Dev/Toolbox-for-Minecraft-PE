package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ww2  reason: default package */
public final class ww2 implements ky2, IInterface {
    public final IBinder P;

    public ww2(IBinder iBinder) {
        this.P = iBinder;
    }

    public final Parcel A() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return obtain;
    }

    @Override // defpackage.ky2
    public final void A0(va0 va0Var, long j) {
        Parcel A = A();
        fl2.b(A, va0Var);
        A.writeLong(j);
        Z(A, 25);
    }

    @Override // defpackage.ky2
    public final void B3(dv2 dv2Var) {
        Parcel A = A();
        fl2.b(A, dv2Var);
        Z(A, 17);
    }

    @Override // defpackage.ky2
    public final void D0(Bundle bundle, long j) {
        Parcel A = A();
        fl2.a(A, bundle);
        A.writeLong(j);
        Z(A, 8);
    }

    @Override // defpackage.ky2
    public final void F0(va0 va0Var, long j) {
        Parcel A = A();
        fl2.b(A, va0Var);
        A.writeLong(j);
        Z(A, 28);
    }

    @Override // defpackage.ky2
    public final void K2(Bundle bundle, long j) {
        Parcel A = A();
        fl2.a(A, bundle);
        A.writeLong(j);
        Z(A, 44);
    }

    @Override // defpackage.ky2
    public final void L3(va0 va0Var, long j) {
        Parcel A = A();
        fl2.b(A, va0Var);
        A.writeLong(j);
        Z(A, 26);
    }

    @Override // defpackage.ky2
    public final void P0(String str, long j) {
        Parcel A = A();
        A.writeString(str);
        A.writeLong(j);
        Z(A, 23);
    }

    @Override // defpackage.ky2
    public final void Q2(va0 va0Var, String str, String str2, long j) {
        Parcel A = A();
        fl2.b(A, va0Var);
        A.writeString(str);
        A.writeString(str2);
        A.writeLong(j);
        Z(A, 15);
    }

    @Override // defpackage.ky2
    public final void R3(Bundle bundle, dv2 dv2Var, long j) {
        Parcel A = A();
        fl2.a(A, bundle);
        fl2.b(A, dv2Var);
        A.writeLong(j);
        Z(A, 32);
    }

    @Override // defpackage.ky2
    public final void V1(dv2 dv2Var) {
        Parcel A = A();
        fl2.b(A, dv2Var);
        Z(A, 19);
    }

    public final void Z(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.P.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.ky2
    public final void Z2(String str, String str2, va0 va0Var, boolean z, long j) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        fl2.b(A, va0Var);
        A.writeInt(z ? 1 : 0);
        A.writeLong(j);
        Z(A, 4);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.P;
    }

    @Override // defpackage.ky2
    public final void b3(String str, dv2 dv2Var) {
        Parcel A = A();
        A.writeString(str);
        fl2.b(A, dv2Var);
        Z(A, 6);
    }

    @Override // defpackage.ky2
    public final void c2(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        fl2.a(A, bundle);
        A.writeInt(z ? 1 : 0);
        A.writeInt(z2 ? 1 : 0);
        A.writeLong(j);
        Z(A, 2);
    }

    @Override // defpackage.ky2
    public final void e3(String str, va0 va0Var, va0 va0Var2, va0 va0Var3) {
        Parcel A = A();
        A.writeInt(5);
        A.writeString(str);
        fl2.b(A, va0Var);
        fl2.b(A, va0Var2);
        fl2.b(A, va0Var3);
        Z(A, 33);
    }

    @Override // defpackage.ky2
    public final void f1(va0 va0Var, c53 c53Var, long j) {
        Parcel A = A();
        fl2.b(A, va0Var);
        fl2.a(A, c53Var);
        A.writeLong(j);
        Z(A, 1);
    }

    @Override // defpackage.ky2
    public final void g1(String str, String str2, boolean z, dv2 dv2Var) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        int i = fl2.a;
        A.writeInt(z ? 1 : 0);
        fl2.b(A, dv2Var);
        Z(A, 5);
    }

    @Override // defpackage.ky2
    public final void g3(va0 va0Var, Bundle bundle, long j) {
        Parcel A = A();
        fl2.b(A, va0Var);
        fl2.a(A, bundle);
        A.writeLong(j);
        Z(A, 27);
    }

    @Override // defpackage.ky2
    public final void g4(dv2 dv2Var) {
        Parcel A = A();
        fl2.b(A, dv2Var);
        Z(A, 21);
    }

    @Override // defpackage.ky2
    public final void i4(va0 va0Var, long j) {
        Parcel A = A();
        fl2.b(A, va0Var);
        A.writeLong(j);
        Z(A, 30);
    }

    @Override // defpackage.ky2
    public final void j1(String str, String str2, dv2 dv2Var) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        fl2.b(A, dv2Var);
        Z(A, 10);
    }

    @Override // defpackage.ky2
    public final void k2(dv2 dv2Var) {
        Parcel A = A();
        fl2.b(A, dv2Var);
        Z(A, 22);
    }

    @Override // defpackage.ky2
    public final void l1(va0 va0Var, dv2 dv2Var, long j) {
        Parcel A = A();
        fl2.b(A, va0Var);
        fl2.b(A, dv2Var);
        A.writeLong(j);
        Z(A, 31);
    }

    @Override // defpackage.ky2
    public final void n4(Bundle bundle, String str, String str2) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        fl2.a(A, bundle);
        Z(A, 9);
    }

    @Override // defpackage.ky2
    public final void s2(va0 va0Var, long j) {
        Parcel A = A();
        fl2.b(A, va0Var);
        A.writeLong(j);
        Z(A, 29);
    }

    @Override // defpackage.ky2
    public final void s3(String str, long j) {
        Parcel A = A();
        A.writeString(str);
        A.writeLong(j);
        Z(A, 24);
    }

    @Override // defpackage.ky2
    public final void w2(dv2 dv2Var) {
        Parcel A = A();
        fl2.b(A, dv2Var);
        Z(A, 16);
    }
}