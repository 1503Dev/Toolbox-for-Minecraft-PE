package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: zn1  reason: default package */
public final class zn1 extends lo1 {
    public static final Parcelable.Creator<zn1> CREATOR = new yn1();
    public final String Q;
    public final boolean R;
    public final boolean S;
    public final String[] T;
    public final lo1[] U;

    public zn1(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zn4.a;
        this.Q = readString;
        this.R = parcel.readByte() != 0;
        this.S = parcel.readByte() != 0;
        this.T = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.U = new lo1[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.U[i2] = (lo1) parcel.readParcelable(lo1.class.getClassLoader());
        }
    }

    public zn1(String str, boolean z, boolean z2, String[] strArr, lo1[] lo1VarArr) {
        super("CTOC");
        this.Q = str;
        this.R = z;
        this.S = z2;
        this.T = strArr;
        this.U = lo1VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zn1.class == obj.getClass()) {
            zn1 zn1Var = (zn1) obj;
            if (this.R == zn1Var.R && this.S == zn1Var.S && zn4.b(this.Q, zn1Var.Q) && Arrays.equals(this.T, zn1Var.T) && Arrays.equals(this.U, zn1Var.U)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((this.R ? 1 : 0) + 527) * 31) + (this.S ? 1 : 0);
        String str = this.Q;
        return (i * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Q);
        parcel.writeByte(this.R ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.S ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.T);
        parcel.writeInt(this.U.length);
        for (lo1 lo1Var : this.U) {
            parcel.writeParcelable(lo1Var, 0);
        }
    }
}