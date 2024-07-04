package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: iq2  reason: default package */
public final class iq2 extends i22 implements kq2 {
    public iq2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // defpackage.kq2
    public final void T(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel A = A();
        k22.c(A, parcelFileDescriptor);
        c0(A, 1);
    }

    @Override // defpackage.kq2
    public final void n0(h72 h72Var) {
        Parcel A = A();
        k22.c(A, h72Var);
        c0(A, 2);
    }
}