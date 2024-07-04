package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: he2  reason: default package */
public final class he2 extends i22 implements je2 {
    public he2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // defpackage.je2
    public final void p1(ue2 ue2Var) {
        Parcel A = A();
        k22.e(A, ue2Var);
        c0(A, 1);
    }
}