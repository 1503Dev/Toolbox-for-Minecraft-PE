package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ts3  reason: default package */
public final class ts3 extends i22 implements iu3 {
    public ts3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // defpackage.iu3
    public final void b() {
        c0(A(), 4);
    }

    @Override // defpackage.iu3
    public final void f() {
        c0(A(), 2);
    }

    @Override // defpackage.iu3
    public final void g() {
        c0(A(), 1);
    }

    @Override // defpackage.iu3
    public final void h() {
        c0(A(), 3);
    }

    @Override // defpackage.iu3
    public final void k0(boolean z) {
        Parcel A = A();
        ClassLoader classLoader = k22.a;
        A.writeInt(z ? 1 : 0);
        c0(A, 5);
    }
}