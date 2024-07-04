package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: yd2  reason: default package */
public final class yd2 extends i22 implements ae2 {
    public yd2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // defpackage.ae2
    public final void d1(sd2 sd2Var, String str) {
        Parcel A = A();
        k22.e(A, sd2Var);
        A.writeString(str);
        c0(A, 1);
    }
}