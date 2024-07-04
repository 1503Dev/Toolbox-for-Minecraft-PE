package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: gq2  reason: default package */
public abstract class gq2 extends j22 implements hq2 {
    public gq2() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            k22.b(parcel);
            ((nx3) this).T((ParcelFileDescriptor) k22.a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            k22.b(parcel);
            ((nx3) this).n0((h72) k22.a(parcel, h72.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}