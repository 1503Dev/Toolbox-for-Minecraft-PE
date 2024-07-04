package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ra2  reason: default package */
public final class ra2 extends i22 implements sa2 {
    public ra2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // defpackage.sa2
    public final void M3(ma2 ma2Var) {
        Parcel A = A();
        k22.e(A, ma2Var);
        c0(A, 1);
    }
}