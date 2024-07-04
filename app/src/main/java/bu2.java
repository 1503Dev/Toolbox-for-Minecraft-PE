package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bu2  reason: default package */
public final class bu2 extends i22 implements du2 {
    public bu2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // defpackage.du2
    public final void i1(Bundle bundle, String str, String str2) {
        Parcel A = A();
        A.writeString(str);
        A.writeString(str2);
        k22.c(A, bundle);
        c0(A, 3);
    }

    @Override // defpackage.du2
    public final void z(String str) {
        Parcel A = A();
        A.writeString(str);
        c0(A, 2);
    }
}