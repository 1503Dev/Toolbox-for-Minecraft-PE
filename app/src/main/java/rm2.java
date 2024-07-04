package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: rm2  reason: default package */
public final class rm2 extends i22 implements tm2 {
    public rm2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // defpackage.tm2
    public final void p(tz3 tz3Var) {
        Parcel A = A();
        k22.c(A, tz3Var);
        c0(A, 3);
    }
}