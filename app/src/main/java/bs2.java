package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bs2  reason: default package */
public final class bs2 extends i22 implements ds2 {
    public bs2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // defpackage.ds2
    public final void h() {
        c0(A(), 1);
    }

    @Override // defpackage.ds2
    public final void p(tz3 tz3Var) {
        Parcel A = A();
        k22.c(A, tz3Var);
        c0(A, 3);
    }

    @Override // defpackage.ds2
    public final void y(int i) {
        Parcel A = A();
        A.writeInt(i);
        c0(A, 2);
    }
}