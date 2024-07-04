package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: fr2  reason: default package */
public final class fr2 extends i22 implements gr2 {
    public fr2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // defpackage.gr2
    public final void E1(cr2 cr2Var) {
        Parcel A = A();
        k22.e(A, cr2Var);
        c0(A, 5);
    }

    @Override // defpackage.gr2
    public final void e() {
        c0(A(), 4);
    }

    @Override // defpackage.gr2
    public final void f() {
        c0(A(), 6);
    }

    @Override // defpackage.gr2
    public final void g() {
        c0(A(), 1);
    }

    @Override // defpackage.gr2
    public final void j() {
        c0(A(), 2);
    }

    @Override // defpackage.gr2
    public final void l() {
        c0(A(), 8);
    }

    @Override // defpackage.gr2
    public final void n() {
        c0(A(), 3);
    }

    @Override // defpackage.gr2
    public final void v(int i) {
        Parcel A = A();
        A.writeInt(i);
        c0(A, 7);
    }
}