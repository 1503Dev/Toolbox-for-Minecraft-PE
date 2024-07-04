package defpackage;

import android.os.Parcel;

/* renamed from: l42  reason: default package */
public abstract class l42 extends j22 implements m42 {
    public l42() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1 && i != 2) {
            if (i == 3) {
                tz3 tz3Var = (tz3) k22.a(parcel, tz3.CREATOR);
                k22.b(parcel);
            } else if (i != 4 && i != 5) {
                return false;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}