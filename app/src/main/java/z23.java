package defpackage;

import android.os.Parcel;

/* renamed from: z23  reason: default package */
public abstract class z23 extends j22 implements q33 {
    public z23() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            k22.b(parcel);
            ((t92) this).j0((tz3) k22.a(parcel, tz3.CREATOR));
        } else if (i == 2) {
            ((t92) this).e();
        } else if (i == 3) {
            ((t92) this).d();
        } else if (i != 4 && i != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }
}