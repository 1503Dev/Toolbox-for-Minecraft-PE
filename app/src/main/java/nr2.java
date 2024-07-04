package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: nr2  reason: default package */
public final class nr2 extends i22 implements pr2 {
    public nr2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // defpackage.pr2
    public final void H1(hw hwVar, qr2 qr2Var) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, qr2Var);
        c0(A, 7);
    }

    @Override // defpackage.pr2
    public final void J0(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 3);
    }

    @Override // defpackage.pr2
    public final void L2(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 5);
    }

    @Override // defpackage.pr2
    public final void Y1(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 11);
    }

    @Override // defpackage.pr2
    public final void a0(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 4);
    }

    @Override // defpackage.pr2
    public final void b0(hw hwVar, int i) {
        Parcel A = A();
        k22.e(A, hwVar);
        A.writeInt(i);
        c0(A, 9);
    }

    @Override // defpackage.pr2
    public final void o3(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 6);
    }

    @Override // defpackage.pr2
    public final void y3(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 1);
    }

    @Override // defpackage.pr2
    public final void zze(hw hwVar) {
        Parcel A = A();
        k22.e(A, hwVar);
        c0(A, 8);
    }
}