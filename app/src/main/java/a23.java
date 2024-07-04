package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: a23  reason: default package */
public final class a23 extends i22 implements q33 {
    public a23(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // defpackage.q33
    public final void b() {
        c0(A(), 4);
    }

    @Override // defpackage.q33
    public final void c() {
        c0(A(), 5);
    }

    @Override // defpackage.q33
    public final void d() {
        c0(A(), 3);
    }

    @Override // defpackage.q33
    public final void e() {
        c0(A(), 2);
    }

    @Override // defpackage.q33
    public final void j0(tz3 tz3Var) {
        Parcel A = A();
        k22.c(A, tz3Var);
        c0(A, 1);
    }
}