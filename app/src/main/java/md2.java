package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: md2  reason: default package */
public final class md2 extends i22 implements gf2 {
    public md2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // defpackage.gf2
    public final void d() {
        c0(A(), 6);
    }

    @Override // defpackage.gf2
    public final void f() {
        c0(A(), 3);
    }

    @Override // defpackage.gf2
    public final void g() {
        c0(A(), 4);
    }

    @Override // defpackage.gf2
    public final void h() {
        c0(A(), 7);
    }

    @Override // defpackage.gf2
    public final void i() {
        c0(A(), 1);
    }

    @Override // defpackage.gf2
    public final void j() {
        c0(A(), 5);
    }

    @Override // defpackage.gf2
    public final void l() {
        c0(A(), 9);
    }

    @Override // defpackage.gf2
    public final void p(tz3 tz3Var) {
        Parcel A = A();
        k22.c(A, tz3Var);
        c0(A, 8);
    }

    @Override // defpackage.gf2
    public final void y(int i) {
        Parcel A = A();
        A.writeInt(i);
        c0(A, 2);
    }
}