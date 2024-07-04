package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: lq4  reason: default package */
public final class lq4 extends f0 {
    public static final Parcelable.Creator<lq4> CREATOR = new mq4();
    public final int P;
    public final byte[] Q;
    public final int R;

    public lq4(byte[] bArr, int i, int i2) {
        this.P = i;
        this.Q = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.R = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.c(parcel, 2, this.Q);
        tv2.g(parcel, 3, this.R);
        tv2.A(parcel, s);
    }
}