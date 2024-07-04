package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: xr2  reason: default package */
public final class xr2 extends i22 implements zr2 {
    public xr2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // defpackage.zr2
    public final void a4(tz3 tz3Var) {
        Parcel A = A();
        k22.c(A, tz3Var);
        c0(A, 5);
    }

    @Override // defpackage.zr2
    public final void b() {
        c0(A(), 7);
    }

    @Override // defpackage.zr2
    public final void e() {
        c0(A(), 6);
    }

    @Override // defpackage.zr2
    public final void h() {
        c0(A(), 2);
    }

    @Override // defpackage.zr2
    public final void j() {
        c0(A(), 1);
    }

    @Override // defpackage.zr2
    public final void r4(tr2 tr2Var) {
        Parcel A = A();
        k22.e(A, tr2Var);
        c0(A, 3);
    }

    @Override // defpackage.zr2
    public final void u0(int i) {
        Parcel A = A();
        A.writeInt(i);
        c0(A, 4);
    }
}