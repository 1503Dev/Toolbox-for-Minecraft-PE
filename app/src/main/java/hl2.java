package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: hl2  reason: default package */
public final class hl2 extends i22 implements jn2 {
    public hl2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // defpackage.jn2
    public final void M0(je2 je2Var) {
        Parcel A = A();
        k22.e(A, je2Var);
        c0(A, 10);
    }

    @Override // defpackage.jn2
    public final ik2 b() {
        ik2 ti2Var;
        Parcel Z = Z(A(), 1);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            ti2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            ti2Var = queryLocalInterface instanceof ik2 ? (ik2) queryLocalInterface : new ti2(readStrongBinder);
        }
        Z.recycle();
        return ti2Var;
    }

    @Override // defpackage.jn2
    public final void e1(String str, de2 de2Var, ae2 ae2Var) {
        Parcel A = A();
        A.writeString(str);
        k22.e(A, de2Var);
        k22.e(A, ae2Var);
        c0(A, 5);
    }

    @Override // defpackage.jn2
    public final void j3(nc2 nc2Var) {
        Parcel A = A();
        k22.c(A, nc2Var);
        c0(A, 6);
    }

    @Override // defpackage.jn2
    public final void q2(gf2 gf2Var) {
        Parcel A = A();
        k22.e(A, gf2Var);
        c0(A, 2);
    }
}