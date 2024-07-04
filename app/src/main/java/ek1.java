package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: ek1  reason: default package */
public final class ek1 implements Parcelable {
    public static final Parcelable.Creator<ek1> CREATOR = new a16();
    public int P;
    public final UUID Q;
    public final String R;
    public final String S;
    public final byte[] T;

    public ek1(Parcel parcel) {
        this.Q = new UUID(parcel.readLong(), parcel.readLong());
        this.R = parcel.readString();
        String readString = parcel.readString();
        int i = zn4.a;
        this.S = readString;
        this.T = parcel.createByteArray();
    }

    public ek1(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.Q = uuid;
        this.R = null;
        this.S = str;
        this.T = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ek1) {
            if (obj == this) {
                return true;
            }
            ek1 ek1Var = (ek1) obj;
            return zn4.b(this.R, ek1Var.R) && zn4.b(this.S, ek1Var.S) && zn4.b(this.Q, ek1Var.Q) && Arrays.equals(this.T, ek1Var.T);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.P;
        if (i == 0) {
            int hashCode = this.Q.hashCode() * 31;
            String str = this.R;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = Arrays.hashCode(this.T) + ((this.S.hashCode() + ((hashCode + hashCode2) * 31)) * 31);
            this.P = hashCode3;
            return hashCode3;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.Q.getMostSignificantBits());
        parcel.writeLong(this.Q.getLeastSignificantBits());
        parcel.writeString(this.R);
        parcel.writeString(this.S);
        parcel.writeByteArray(this.T);
    }
}