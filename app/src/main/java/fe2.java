package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: fe2  reason: default package */
public final class fe2 extends i22 implements ge2 {
    public fe2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // defpackage.ge2
    public final void G2(pq2 pq2Var, va0 va0Var) {
        Parcel A = A();
        k22.e(A, pq2Var);
        k22.e(A, va0Var);
        c0(A, 1);
    }
}