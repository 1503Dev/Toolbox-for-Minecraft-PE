package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: sr2  reason: default package */
public final class sr2 extends i22 implements tr2 {
    public sr2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // defpackage.tr2
    public final int b() {
        Parcel Z = Z(A(), 2);
        int readInt = Z.readInt();
        Z.recycle();
        return readInt;
    }

    @Override // defpackage.tr2
    public final String e() {
        Parcel Z = Z(A(), 1);
        String readString = Z.readString();
        Z.recycle();
        return readString;
    }
}