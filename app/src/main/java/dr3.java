package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dr3  reason: default package */
public final class dr3 extends i22 implements cs3 {
    public dr3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // defpackage.cs3
    public final float b() {
        throw null;
    }

    @Override // defpackage.cs3
    public final float e() {
        throw null;
    }

    @Override // defpackage.cs3
    public final iu3 g() {
        iu3 ts3Var;
        Parcel Z = Z(A(), 11);
        IBinder readStrongBinder = Z.readStrongBinder();
        if (readStrongBinder == null) {
            ts3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            ts3Var = queryLocalInterface instanceof iu3 ? (iu3) queryLocalInterface : new ts3(readStrongBinder);
        }
        Z.recycle();
        return ts3Var;
    }

    @Override // defpackage.cs3
    public final float h() {
        throw null;
    }

    @Override // defpackage.cs3
    public final void m3(iu3 iu3Var) {
        Parcel A = A();
        k22.e(A, iu3Var);
        c0(A, 8);
    }
}