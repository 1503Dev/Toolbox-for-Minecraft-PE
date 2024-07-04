package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: zh2  reason: default package */
public final class zh2 extends i22 implements ai2 {
    public zh2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // defpackage.ai2
    public final void D(String str) {
        Parcel A = A();
        A.writeString(str);
        c0(A, 3);
    }
}