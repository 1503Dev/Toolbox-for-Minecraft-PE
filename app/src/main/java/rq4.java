package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: rq4  reason: default package */
public final class rq4 extends i22 implements tq4 {
    public rq4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // defpackage.tq4
    public final void X(int i) {
        Parcel A = A();
        A.writeInt(i);
        c0(A, 6);
    }

    @Override // defpackage.tq4
    public final void e() {
        c0(A(), 3);
    }

    @Override // defpackage.tq4
    public final void p0(byte[] bArr) {
        Parcel A = A();
        A.writeByteArray(bArr);
        c0(A, 5);
    }

    @Override // defpackage.tq4
    public final void r0() {
        Parcel A = A();
        A.writeIntArray(null);
        c0(A, 4);
    }

    @Override // defpackage.tq4
    public final void r1(va0 va0Var, String str) {
        Parcel A = A();
        k22.e(A, va0Var);
        A.writeString(str);
        A.writeString(null);
        c0(A, 8);
    }

    @Override // defpackage.tq4
    public final void v(int i) {
        Parcel A = A();
        A.writeInt(i);
        c0(A, 7);
    }
}