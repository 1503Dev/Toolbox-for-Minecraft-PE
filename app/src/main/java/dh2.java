package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: dh2  reason: default package */
public final class dh2 extends i22 implements gh2 {
    public dh2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // defpackage.gh2
    public final void z(String str) {
        Parcel A = A();
        A.writeString(str);
        c0(A, 1);
    }
}