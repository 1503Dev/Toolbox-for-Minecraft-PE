package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: jq2  reason: default package */
public abstract class jq2 extends j22 implements kq2 {
    public jq2() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            k22.b(parcel);
            ((vv3) this).T((ParcelFileDescriptor) k22.a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            k22.b(parcel);
            ((vv3) this).n0((h72) k22.a(parcel, h72.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}