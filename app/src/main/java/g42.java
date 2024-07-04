package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: g42  reason: default package */
public final class g42 extends i22 implements i42 {
    public g42(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // defpackage.i42
    public final void B(int i) {
        Parcel A = A();
        A.writeInt(i);
        c0(A, 2);
    }

    @Override // defpackage.i42
    public final void L1(tz3 tz3Var) {
        Parcel A = A();
        k22.c(A, tz3Var);
        c0(A, 3);
    }

    @Override // defpackage.i42
    public final void d4(f42 f42Var) {
        Parcel A = A();
        k22.e(A, f42Var);
        c0(A, 1);
    }
}