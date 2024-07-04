package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: zc2  reason: default package */
public final class zc2 extends i22 implements ad2 {
    public zc2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // defpackage.ad2
    public final Uri b() {
        Parcel Z = Z(A(), 2);
        Uri uri = (Uri) k22.a(Z, Uri.CREATOR);
        Z.recycle();
        return uri;
    }

    @Override // defpackage.ad2
    public final double c() {
        Parcel Z = Z(A(), 3);
        double readDouble = Z.readDouble();
        Z.recycle();
        return readDouble;
    }

    @Override // defpackage.ad2
    public final int d() {
        Parcel Z = Z(A(), 5);
        int readInt = Z.readInt();
        Z.recycle();
        return readInt;
    }

    @Override // defpackage.ad2
    public final hw e() {
        return uv0.a(Z(A(), 1));
    }

    @Override // defpackage.ad2
    public final int i() {
        Parcel Z = Z(A(), 4);
        int readInt = Z.readInt();
        Z.recycle();
        return readInt;
    }
}