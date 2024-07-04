package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: cd2  reason: default package */
public final class cd2 extends i22 implements ed2 {
    public cd2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // defpackage.ed2
    public final void B0(va0 va0Var, int i) {
        Parcel A = A();
        k22.e(A, va0Var);
        A.writeInt(i);
        c0(A, 5);
    }

    @Override // defpackage.ed2
    public final void K0(hw hwVar, String str) {
        Parcel A = A();
        A.writeString(str);
        k22.e(A, hwVar);
        c0(A, 1);
    }

    @Override // defpackage.ed2
    public final void N3(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 9);
    }

    @Override // defpackage.ed2
    public final void X1(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 6);
    }

    @Override // defpackage.ed2
    public final void b1(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 7);
    }

    @Override // defpackage.ed2
    public final void p2(yc2 yc2Var) {
        Parcel A = A();
        k22.e(A, yc2Var);
        c0(A, 8);
    }

    @Override // defpackage.ed2
    public final hw z(String str) {
        Parcel A = A();
        A.writeString(str);
        return uv0.a(Z(A, 2));
    }

    @Override // defpackage.ed2
    public final void z2(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 3);
    }
}