package defpackage;

import android.os.Parcel;

/* renamed from: pm2  reason: default package */
public abstract class pm2 extends j22 implements qm2 {
    public pm2() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return false;
                }
                k22.b(parcel);
                ((f34) this).p((tz3) k22.a(parcel, tz3.CREATOR));
            } else {
                String readString = parcel.readString();
                k22.b(parcel);
                ((w24) ((f34) this).P.c).x1(0, readString);
            }
        } else {
            ((w24) ((f34) this).P.c).K();
        }
        parcel2.writeNoException();
        return true;
    }
}