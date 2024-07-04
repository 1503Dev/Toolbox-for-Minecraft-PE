package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: go2  reason: default package */
public final class go2 extends i22 implements io2 {
    public go2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // defpackage.io2
    public final void e() {
        c0(A(), 3);
    }

    @Override // defpackage.io2
    public final void q4(hw hwVar, String str, String str2) {
        Parcel A = A();
        k22.e(A, hwVar);
        A.writeString(str);
        A.writeString(str2);
        c0(A, 2);
    }

    @Override // defpackage.io2
    public final void v0(Intent intent) {
        Parcel A = A();
        k22.c(A, intent);
        c0(A, 1);
    }
}