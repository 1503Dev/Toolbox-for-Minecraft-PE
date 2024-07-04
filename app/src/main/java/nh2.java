package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: nh2  reason: default package */
public abstract class nh2 extends j22 {
    public nh2() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            k22.b(parcel);
            ((ph2) this).P.a((ParcelFileDescriptor) k22.a(parcel, ParcelFileDescriptor.CREATOR));
            return true;
        }
        return false;
    }
}