package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: jr2  reason: default package */
public final class jr2 extends i22 {
    public jr2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder d3(va0 va0Var, zr5 zr5Var, String str, wk2 wk2Var, int i) {
        Parcel A = A();
        k22.e(A, va0Var);
        k22.c(A, zr5Var);
        A.writeString(str);
        k22.e(A, wk2Var);
        A.writeInt(231004000);
        A.writeInt(i);
        Parcel Z = Z(A, 2);
        IBinder readStrongBinder = Z.readStrongBinder();
        Z.recycle();
        return readStrongBinder;
    }
}