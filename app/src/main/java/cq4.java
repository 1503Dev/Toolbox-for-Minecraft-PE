package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cq4  reason: default package */
public final class cq4 extends f0 {
    public static final Parcelable.Creator<cq4> CREATOR = new dq4();
    public final int P;
    public ey1 Q = null;
    public byte[] R;

    public cq4(byte[] bArr, int i) {
        this.P = i;
        this.R = bArr;
        c();
    }

    public final void c() {
        ey1 ey1Var = this.Q;
        if (ey1Var != null || this.R == null) {
            if (ey1Var == null || this.R != null) {
                if (ey1Var != null && this.R != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (ey1Var != null || this.R != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        byte[] bArr = this.R;
        if (bArr == null) {
            bArr = this.Q.D();
        }
        tv2.c(parcel, 2, bArr);
        tv2.A(parcel, s);
    }
}