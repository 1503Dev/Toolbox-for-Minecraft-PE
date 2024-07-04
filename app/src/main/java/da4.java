package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: da4  reason: default package */
public final class da4 extends f0 {
    public static final Parcelable.Creator<da4> CREATOR = new va4();
    public final int P;
    public final int Q;
    public final String R;

    public da4() {
        this(ModuleDescriptor.MODULE_VERSION, 231004000, "22.1.0");
    }

    public da4(int i, int i2, String str) {
        this.P = i;
        this.Q = i2;
        this.R = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.g(parcel, 2, this.Q);
        tv2.k(parcel, 3, this.R);
        tv2.A(parcel, s);
    }
}