package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xv2  reason: default package */
public final class xv2 extends f0 {
    public static final Parcelable.Creator<xv2> CREATOR = new yv2();
    public String P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xv2(int i, int i2, boolean z, boolean z2) {
        this("afma-sdk-a-v" + i + "." + i2 + "." + r0, i, i2, z, z2);
        String str = z ? "0" : "1";
    }

    public xv2(int i, boolean z) {
        this(231004000, i, true, z);
    }

    public xv2(String str, int i, int i2, boolean z, boolean z2) {
        this.P = str;
        this.Q = i;
        this.R = i2;
        this.S = z;
        this.T = z2;
    }

    public static xv2 c() {
        return new xv2(12451000, 12451000, true, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 2, this.P);
        tv2.g(parcel, 3, this.Q);
        tv2.g(parcel, 4, this.R);
        tv2.a(parcel, 5, this.S);
        tv2.a(parcel, 6, this.T);
        tv2.A(parcel, s);
    }
}