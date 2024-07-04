package defpackage;

import android.os.Parcel;

/* renamed from: ro3  reason: default package */
public final class ro3 extends j22 implements li2 {
    public ro3() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // defpackage.li2
    public final void e() {
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            k22.b(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.li2
    public final void y(int i) {
    }
}