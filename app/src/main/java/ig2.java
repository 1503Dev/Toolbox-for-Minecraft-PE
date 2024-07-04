package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ig2  reason: default package */
public final class ig2 extends i22 implements xh2 {
    public ig2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // defpackage.xh2
    public final void C0(tz3 tz3Var) {
        Parcel A = A();
        k22.c(A, tz3Var);
        c0(A, 2);
    }

    @Override // defpackage.xh2
    public final void d() {
        c0(A(), 1);
    }
}