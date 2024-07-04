package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: xo1  reason: default package */
public final class xo1 implements et2 {
    public static final Parcelable.Creator<xo1> CREATOR = new wo1();
    public final String P;
    public final byte[] Q;
    public final int R;
    public final int S;

    public /* synthetic */ xo1(Parcel parcel) {
        String readString = parcel.readString();
        int i = zn4.a;
        this.P = readString;
        this.Q = parcel.createByteArray();
        this.R = parcel.readInt();
        this.S = parcel.readInt();
    }

    public xo1(String str, byte[] bArr, int i, int i2) {
        this.P = str;
        this.Q = bArr;
        this.R = i;
        this.S = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xo1.class == obj.getClass()) {
            xo1 xo1Var = (xo1) obj;
            if (this.P.equals(xo1Var.P) && Arrays.equals(this.Q, xo1Var.Q) && this.R == xo1Var.R && this.S == xo1Var.S) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.P.hashCode() + 527) * 31) + Arrays.hashCode(this.Q)) * 31) + this.R) * 31) + this.S;
    }

    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.P));
    }

    @Override // defpackage.et2
    public final /* synthetic */ void w(vo2 vo2Var) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.P);
        parcel.writeByteArray(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
    }
}