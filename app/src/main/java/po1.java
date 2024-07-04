package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: po1  reason: default package */
public final class po1 extends lo1 {
    public static final Parcelable.Creator<po1> CREATOR = new oo1();
    public final int Q;
    public final int R;
    public final int S;
    public final int[] T;
    public final int[] U;

    public po1(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super("MLLT");
        this.Q = i;
        this.R = i2;
        this.S = i3;
        this.T = iArr;
        this.U = iArr2;
    }

    public po1(Parcel parcel) {
        super("MLLT");
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.S = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = zn4.a;
        this.T = createIntArray;
        this.U = parcel.createIntArray();
    }

    @Override // defpackage.lo1, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && po1.class == obj.getClass()) {
            po1 po1Var = (po1) obj;
            if (this.Q == po1Var.Q && this.R == po1Var.R && this.S == po1Var.S && Arrays.equals(this.T, po1Var.T) && Arrays.equals(this.U, po1Var.U)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.Q + 527) * 31) + this.R) * 31) + this.S) * 31) + Arrays.hashCode(this.T)) * 31) + Arrays.hashCode(this.U);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        parcel.writeIntArray(this.T);
        parcel.writeIntArray(this.U);
    }
}