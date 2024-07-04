package defpackage;

import android.os.Parcel;

/* renamed from: cs2  reason: default package */
public abstract class cs2 extends j22 implements ds2 {
    public cs2() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            h();
        } else if (i == 2) {
            int readInt = parcel.readInt();
            k22.b(parcel);
            y(readInt);
        } else if (i != 3) {
            return false;
        } else {
            k22.b(parcel);
            p((tz3) k22.a(parcel, tz3.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}