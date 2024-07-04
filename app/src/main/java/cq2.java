package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: cq2  reason: default package */
public final class cq2 extends i22 implements eq2 {
    public cq2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // defpackage.eq2
    public final void G3(wp2 wp2Var, hq2 hq2Var) {
        Parcel A = A();
        k22.c(A, wp2Var);
        k22.e(A, hq2Var);
        c0(A, 3);
    }

    @Override // defpackage.eq2
    public final void b4(sp2 sp2Var, hq2 hq2Var) {
        Parcel A = A();
        k22.c(A, sp2Var);
        k22.e(A, hq2Var);
        c0(A, 1);
    }
}