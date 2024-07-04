package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ki2  reason: default package */
public final class ki2 extends i22 implements li2 {
    public ki2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // defpackage.li2
    public final void e() {
        c0(A(), 1);
    }

    @Override // defpackage.li2
    public final void y(int i) {
        Parcel A = A();
        A.writeInt(i);
        c0(A, 2);
    }
}