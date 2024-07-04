package defpackage;

import android.os.Parcel;

/* renamed from: lp2  reason: default package */
public final class lp2 extends j22 {
    public lp2() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            jv5.A.g.f("FlagsAccessedBeforeInitialized", new kp2());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}