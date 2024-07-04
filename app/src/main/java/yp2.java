package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: yp2  reason: default package */
public final class yp2 extends i22 implements aq2 {
    public yp2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // defpackage.aq2
    public final void C2(rq2 rq2Var, kq2 kq2Var) {
        Parcel A = A();
        k22.c(A, rq2Var);
        k22.e(A, kq2Var);
        c0(A, 5);
    }

    @Override // defpackage.aq2
    public final void f3(rq2 rq2Var, kq2 kq2Var) {
        Parcel A = A();
        k22.c(A, rq2Var);
        k22.e(A, kq2Var);
        c0(A, 4);
    }

    @Override // defpackage.aq2
    public final void l4(String str, kq2 kq2Var) {
        Parcel A = A();
        A.writeString(str);
        k22.e(A, kq2Var);
        c0(A, 7);
    }

    @Override // defpackage.aq2
    public final void z3(rq2 rq2Var, kq2 kq2Var) {
        Parcel A = A();
        k22.c(A, rq2Var);
        k22.e(A, kq2Var);
        c0(A, 6);
    }
}