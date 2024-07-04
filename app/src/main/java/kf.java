package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: kf  reason: default package */
public final class kf extends f0 {
    public static final Parcelable.Creator<kf> CREATOR = new un5();
    public final gm0 P;
    public final boolean Q;
    public final boolean R;
    public final int[] S;
    public final int T;
    public final int[] U;

    public kf(gm0 gm0Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.P = gm0Var;
        this.Q = z;
        this.R = z2;
        this.S = iArr;
        this.T = i;
        this.U = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.i(parcel, 1, this.P, i);
        tv2.a(parcel, 2, this.Q);
        tv2.a(parcel, 3, this.R);
        int[] iArr = this.S;
        if (iArr != null) {
            int s2 = tv2.s(parcel, 4);
            parcel.writeIntArray(iArr);
            tv2.A(parcel, s2);
        }
        tv2.g(parcel, 5, this.T);
        int[] iArr2 = this.U;
        if (iArr2 != null) {
            int s3 = tv2.s(parcel, 6);
            parcel.writeIntArray(iArr2);
            tv2.A(parcel, s3);
        }
        tv2.A(parcel, s);
    }
}