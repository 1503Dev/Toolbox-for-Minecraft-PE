package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: l22  reason: default package */
public final class l22 extends i22 implements n22 {
    public l22(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // defpackage.n22
    public final void X(int i) {
        Parcel A = A();
        A.writeInt(0);
        c0(A, 6);
    }

    @Override // defpackage.n22
    public final void e() {
        c0(A(), 3);
    }

    @Override // defpackage.n22
    public final void p0(byte[] bArr) {
        Parcel A = A();
        A.writeByteArray(bArr);
        c0(A, 5);
    }

    @Override // defpackage.n22
    public final void r0() {
        Parcel A = A();
        A.writeIntArray(null);
        c0(A, 4);
    }

    @Override // defpackage.n22
    public final void v(int i) {
        Parcel A = A();
        A.writeInt(i);
        c0(A, 7);
    }

    @Override // defpackage.n22
    public final void w1(va0 va0Var) {
        Parcel A = A();
        k22.e(A, va0Var);
        A.writeString("GMA_SDK");
        c0(A, 2);
    }
}