package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: fd2  reason: default package */
public final class fd2 extends i22 implements hd2 {
    public fd2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // defpackage.hd2
    public final IBinder k3(va0 va0Var, va0 va0Var2, va0 va0Var3) {
        Parcel A = A();
        k22.e(A, va0Var);
        k22.e(A, va0Var2);
        k22.e(A, va0Var3);
        A.writeInt(231004000);
        Parcel Z = Z(A, 1);
        IBinder readStrongBinder = Z.readStrongBinder();
        Z.recycle();
        return readStrongBinder;
    }
}