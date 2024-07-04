package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: om2  reason: default package */
public final class om2 extends i22 implements qm2 {
    public om2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // defpackage.qm2
    public final void p(tz3 tz3Var) {
        Parcel A = A();
        k22.c(A, tz3Var);
        c0(A, 4);
    }
}