package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: il2  reason: default package */
public final class il2 extends i22 implements jl2 {
    public il2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // defpackage.jl2
    public final hw b() {
        return uv0.a(Z(A(), 1));
    }

    @Override // defpackage.jl2
    public final boolean e() {
        boolean z;
        Parcel Z = Z(A(), 2);
        ClassLoader classLoader = k22.a;
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }
}