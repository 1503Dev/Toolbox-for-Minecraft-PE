package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: qe2  reason: default package */
public final class qe2 extends i22 implements re2 {
    public qe2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // defpackage.re2
    public final void S1(String str) {
        Parcel A = A();
        A.writeString(str);
        c0(A, 1);
    }

    @Override // defpackage.re2
    public final void b() {
        c0(A(), 2);
    }
}