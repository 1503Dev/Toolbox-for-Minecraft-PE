package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ur2  reason: default package */
public final class ur2 extends i22 implements wr2 {
    public ur2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // defpackage.wr2
    public final void S(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 5);
    }

    @Override // defpackage.wr2
    public final void U0(pn5 pn5Var, ds2 ds2Var) {
        Parcel A = A();
        k22.c(A, pn5Var);
        k22.e(A, ds2Var);
        c0(A, 14);
    }

    @Override // defpackage.wr2
    public final mq3 d() {
        Parcel Z = Z(A(), 12);
        mq3 t4 = sp3.t4(Z.readStrongBinder());
        Z.recycle();
        return t4;
    }

    @Override // defpackage.wr2
    public final void h1(pn5 pn5Var, ds2 ds2Var) {
        Parcel A = A();
        k22.c(A, pn5Var);
        k22.e(A, ds2Var);
        c0(A, 1);
    }

    @Override // defpackage.wr2
    public final void t2(zr2 zr2Var) {
        Parcel A = A();
        k22.e(A, zr2Var);
        c0(A, 2);
    }
}