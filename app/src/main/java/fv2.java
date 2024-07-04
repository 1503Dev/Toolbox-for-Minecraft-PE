package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: fv2  reason: default package */
public final class fv2 extends i22 implements px2 {
    public fv2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // defpackage.px2
    public final void A2(String str, String str2) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        c0(A, 1);
    }
}