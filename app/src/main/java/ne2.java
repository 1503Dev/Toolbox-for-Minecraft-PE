package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ne2  reason: default package */
public final class ne2 extends i22 implements pe2 {
    public ne2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // defpackage.pe2
    public final boolean n2(va0 va0Var) {
        boolean z;
        Parcel A = A();
        k22.e(A, va0Var);
        Parcel Z = Z(A, 2);
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }
}