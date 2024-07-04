package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: e43  reason: default package */
public final class e43 extends i22 implements e53 {
    public e43(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // defpackage.e53
    public final wk2 getAdapterCreator() {
        Parcel Z = Z(A(), 2);
        wk2 t4 = vk2.t4(Z.readStrongBinder());
        Z.recycle();
        return t4;
    }

    @Override // defpackage.e53
    public final da4 getLiteSdkVersion() {
        Parcel Z = Z(A(), 1);
        da4 da4Var = (da4) k22.a(Z, da4.CREATOR);
        Z.recycle();
        return da4Var;
    }
}