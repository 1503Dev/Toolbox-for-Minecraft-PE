package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: nc3  reason: default package */
public final class nc3 extends i22 implements de3 {
    public nc3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // defpackage.de3
    public final String b() {
        Parcel Z = Z(A(), 1);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.de3
    public final String e() {
        Parcel Z = Z(A(), 2);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }
}