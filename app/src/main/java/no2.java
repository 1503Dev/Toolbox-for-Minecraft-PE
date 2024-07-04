package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: no2  reason: default package */
public final class no2 extends i22 implements po2 {
    public no2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // defpackage.po2
    public final void D3(int i, int i2, Intent intent) {
        Parcel A = A();
        A.writeInt(i);
        A.writeInt(i2);
        k22.c(A, intent);
        c0(A, 12);
    }

    @Override // defpackage.po2
    public final void E() {
        c0(A(), 9);
    }

    @Override // defpackage.po2
    public final void G() {
        c0(A(), 7);
    }

    @Override // defpackage.po2
    public final void a0(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 13);
    }

    @Override // defpackage.po2
    public final void a2(Bundle bundle) {
        Parcel A = A();
        k22.c(A, bundle);
        c0(A, 1);
    }

    @Override // defpackage.po2
    public final void f() {
        c0(A(), 10);
    }

    @Override // defpackage.po2
    public final void i0(Bundle bundle) {
        Parcel A = A();
        k22.c(A, bundle);
        Parcel Z = Z(A, 6);
        if (Z.readInt() != 0) {
            bundle.readFromParcel(Z);
        }
        Z.recycle();
    }

    @Override // defpackage.po2
    public final void k() {
        c0(A(), 5);
    }

    @Override // defpackage.po2
    public final void m() {
        c0(A(), 2);
    }

    @Override // defpackage.po2
    public final void n() {
        c0(A(), 8);
    }

    @Override // defpackage.po2
    public final void q() {
        c0(A(), 4);
    }

    @Override // defpackage.po2
    public final void s() {
        c0(A(), 3);
    }

    @Override // defpackage.po2
    public final void u() {
        c0(A(), 14);
    }

    @Override // defpackage.po2
    public final boolean x() {
        boolean z;
        Parcel Z = Z(A(), 11);
        ClassLoader classLoader = k22.a;
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }

    @Override // defpackage.po2
    public final void z0(int i, String[] strArr, int[] iArr) {
        Parcel A = A();
        A.writeInt(i);
        A.writeStringArray(strArr);
        A.writeIntArray(iArr);
        c0(A, 15);
    }
}