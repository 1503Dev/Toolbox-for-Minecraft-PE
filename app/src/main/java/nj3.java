package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: nj3  reason: default package */
public final class nj3 extends i22 implements yk3 {
    public nj3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // defpackage.yk3
    public final void v1(au5 au5Var) {
        Parcel A = A();
        k22.c(A, au5Var);
        c0(A, 1);
    }
}