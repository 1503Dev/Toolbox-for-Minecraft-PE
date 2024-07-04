package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: vn1  reason: default package */
public final class vn1 extends lo1 {
    public static final Parcelable.Creator<vn1> CREATOR = new un1();
    public final byte[] Q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vn1(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = zn4.a;
        this.Q = parcel.createByteArray();
    }

    public vn1(String str, byte[] bArr) {
        super(str);
        this.Q = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vn1.class == obj.getClass()) {
            vn1 vn1Var = (vn1) obj;
            if (this.P.equals(vn1Var.P) && Arrays.equals(this.Q, vn1Var.Q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.P.hashCode() + 527) * 31) + Arrays.hashCode(this.Q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.P);
        parcel.writeByteArray(this.Q);
    }
}