package defpackage;

import android.content.Intent;
import android.os.Parcel;
import defpackage.hw;

/* renamed from: ho2  reason: default package */
public abstract class ho2 extends j22 implements io2 {
    public static final /* synthetic */ int P = 0;

    public ho2() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            k22.b(parcel);
            ((a14) this).v0((Intent) k22.a(parcel, Intent.CREATOR));
        } else if (i == 2) {
            hw Z = hw.a.Z(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            k22.b(parcel);
            ((a14) this).q4(Z, readString, readString2);
        } else if (i != 3) {
            return false;
        } else {
            ((a14) this).e();
        }
        parcel2.writeNoException();
        return true;
    }
}