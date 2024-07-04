package defpackage;

import android.os.Parcel;
import defpackage.hw;

/* renamed from: im3  reason: default package */
public abstract class im3 extends j22 implements gn3 {
    public im3() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ((qu3) this).h3(parcel.readString(), hw.a.Z(parcel.readStrongBinder()), uv0.b(parcel, parcel));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}