package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: k42  reason: default package */
public final class k42 extends i22 implements m42 {
    public k42(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // defpackage.m42
    public final void b() {
        c0(A(), 4);
    }

    @Override // defpackage.m42
    public final void c() {
        c0(A(), 5);
    }

    @Override // defpackage.m42
    public final void d() {
        c0(A(), 2);
    }

    @Override // defpackage.m42
    public final void e() {
        c0(A(), 1);
    }

    @Override // defpackage.m42
    public final void j0(tz3 tz3Var) {
        Parcel A = A();
        k22.c(A, tz3Var);
        c0(A, 3);
    }
}