package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: xn1  reason: default package */
public final class xn1 extends lo1 {
    public static final Parcelable.Creator<xn1> CREATOR = new wn1();
    public final String Q;
    public final int R;
    public final int S;
    public final long T;
    public final long U;
    public final lo1[] V;

    public xn1(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = zn4.a;
        this.Q = readString;
        this.R = parcel.readInt();
        this.S = parcel.readInt();
        this.T = parcel.readLong();
        this.U = parcel.readLong();
        int readInt = parcel.readInt();
        this.V = new lo1[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.V[i2] = (lo1) parcel.readParcelable(lo1.class.getClassLoader());
        }
    }

    public xn1(String str, int i, int i2, long j, long j2, lo1[] lo1VarArr) {
        super("CHAP");
        this.Q = str;
        this.R = i;
        this.S = i2;
        this.T = j;
        this.U = j2;
        this.V = lo1VarArr;
    }

    @Override // defpackage.lo1, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xn1.class == obj.getClass()) {
            xn1 xn1Var = (xn1) obj;
            if (this.R == xn1Var.R && this.S == xn1Var.S && this.T == xn1Var.T && this.U == xn1Var.U && zn4.b(this.Q, xn1Var.Q) && Arrays.equals(this.V, xn1Var.V)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.R + 527) * 31) + this.S;
        int i2 = (int) this.T;
        int i3 = (int) this.U;
        String str = this.Q;
        return (((((i * 31) + i2) * 31) + i3) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        parcel.writeLong(this.T);
        parcel.writeLong(this.U);
        parcel.writeInt(this.V.length);
        for (lo1 lo1Var : this.V) {
            parcel.writeParcelable(lo1Var, 0);
        }
    }
}