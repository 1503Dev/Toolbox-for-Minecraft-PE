package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: qd2  reason: default package */
public final class qd2 extends i22 implements sd2 {
    public qd2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // defpackage.sd2
    public final hw f() {
        return uv0.a(Z(A(), 9));
    }

    @Override // defpackage.sd2
    public final String g() {
        Parcel Z = Z(A(), 4);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }

    @Override // defpackage.sd2
    public final boolean m0(hw hwVar) {
        boolean z;
        Parcel A = A();
        k22.e(A, hwVar);
        Parcel Z = Z(A, 10);
        if (Z.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Z.recycle();
        return z;
    }
}