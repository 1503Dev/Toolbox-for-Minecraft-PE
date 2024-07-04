package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: nn1  reason: default package */
public final class nn1 implements et2 {
    public static final Parcelable.Creator<nn1> CREATOR = new mn1();
    public final int P;
    public final String Q;
    public final String R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final byte[] W;

    public nn1(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.P = i;
        this.Q = str;
        this.R = str2;
        this.S = i2;
        this.T = i3;
        this.U = i4;
        this.V = i5;
        this.W = bArr;
    }

    public nn1(Parcel parcel) {
        this.P = parcel.readInt();
        String readString = parcel.readString();
        int i = zn4.a;
        this.Q = readString;
        this.R = parcel.readString();
        this.S = parcel.readInt();
        this.T = parcel.readInt();
        this.U = parcel.readInt();
        this.V = parcel.readInt();
        this.W = parcel.createByteArray();
    }

    public static nn1 a(kh4 kh4Var) {
        int i = kh4Var.i();
        String z = kh4Var.z(kh4Var.i(), zs4.a);
        String z2 = kh4Var.z(kh4Var.i(), zs4.c);
        int i2 = kh4Var.i();
        int i3 = kh4Var.i();
        int i4 = kh4Var.i();
        int i5 = kh4Var.i();
        int i6 = kh4Var.i();
        byte[] bArr = new byte[i6];
        kh4Var.a(bArr, 0, i6);
        return new nn1(i, z, z2, i2, i3, i4, i5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nn1.class == obj.getClass()) {
            nn1 nn1Var = (nn1) obj;
            if (this.P == nn1Var.P && this.Q.equals(nn1Var.Q) && this.R.equals(nn1Var.R) && this.S == nn1Var.S && this.T == nn1Var.T && this.U == nn1Var.U && this.V == nn1Var.V && Arrays.equals(this.W, nn1Var.W)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.P + 527) * 31) + this.Q.hashCode()) * 31) + this.R.hashCode()) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + Arrays.hashCode(this.W);
    }

    public final String toString() {
        return ho.b("Picture: mimeType=", this.Q, ", description=", this.R);
    }

    @Override // defpackage.et2
    public final void w(vo2 vo2Var) {
        vo2Var.a(this.W, this.P);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.P);
        parcel.writeString(this.Q);
        parcel.writeString(this.R);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T);
        parcel.writeInt(this.U);
        parcel.writeInt(this.V);
        parcel.writeByteArray(this.W);
    }
}