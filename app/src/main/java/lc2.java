package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: lc2  reason: default package */
public final class lc2 extends j22 implements ad2 {
    public final Drawable P;
    public final Uri Q;
    public final double R;
    public final int S;
    public final int T;

    public lc2(Drawable drawable, Uri uri, double d, int i, int i2) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.P = drawable;
        this.Q = uri;
        this.R = d;
        this.S = i;
        this.T = i2;
    }

    public static ad2 t4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof ad2 ? (ad2) queryLocalInterface : new zc2(iBinder);
    }

    @Override // defpackage.ad2
    public final Uri b() {
        return this.Q;
    }

    @Override // defpackage.ad2
    public final double c() {
        return this.R;
    }

    @Override // defpackage.ad2
    public final int d() {
        return this.T;
    }

    @Override // defpackage.ad2
    public final hw e() {
        return new va0(this.P);
    }

    @Override // defpackage.ad2
    public final int i() {
        return this.S;
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        i2 = this.T;
                    } else {
                        i2 = this.S;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i2);
                    return true;
                }
                double d = this.R;
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            }
            Uri uri = this.Q;
            parcel2.writeNoException();
            k22.d(parcel2, uri);
            return true;
        }
        hw e = e();
        parcel2.writeNoException();
        k22.e(parcel2, e);
        return true;
    }
}