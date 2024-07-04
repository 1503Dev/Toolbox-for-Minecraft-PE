package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: d42  reason: default package */
public final class d42 extends i22 implements f42 {
    public d42(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // defpackage.f42
    public final void N0(hw hwVar, m42 m42Var) {
        Parcel A = A();
        k22.e(A, hwVar);
        k22.e(A, m42Var);
        c0(A, 4);
    }

    @Override // defpackage.f42
    public final mq3 e() {
        Parcel Z = Z(A(), 5);
        mq3 t4 = sp3.t4(Z.readStrongBinder());
        Z.recycle();
        return t4;
    }
}