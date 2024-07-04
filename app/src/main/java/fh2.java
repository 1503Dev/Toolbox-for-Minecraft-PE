package defpackage;

import android.os.Parcel;

/* renamed from: fh2  reason: default package */
public abstract class fh2 extends j22 implements xh2 {
    public fh2() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ((wj5) this).d();
        } else if (i != 2) {
            return false;
        } else {
            k22.b(parcel);
            ((wj5) this).C0((tz3) k22.a(parcel, tz3.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}