package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: rl3  reason: default package */
public final class rl3 extends i22 implements gn3 {
    public rl3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // defpackage.gn3
    public final void h3(String str, hw hwVar, hw hwVar2) {
        Parcel A = A();
        A.writeString(str);
        k22.e(A, hwVar);
        k22.e(A, hwVar2);
        c0(A, 1);
    }
}