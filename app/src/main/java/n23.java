package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: n23  reason: default package */
public final class n23 extends i22 implements p23 {
    public n23(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // defpackage.p23
    public final void x3(va0 va0Var, ok2 ok2Var) {
        Parcel A = A();
        k22.e(A, va0Var);
        k22.e(A, ok2Var);
        c0(A, 2);
    }
}