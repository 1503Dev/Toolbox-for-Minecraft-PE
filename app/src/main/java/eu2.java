package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: eu2  reason: default package */
public final class eu2 extends i22 implements gu2 {
    public eu2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // defpackage.gu2
    public final void u3(hw hwVar, ku2 ku2Var, du2 du2Var) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.c(A, ku2Var);
        k22.e(A, du2Var);
        c0(A, 1);
    }
}