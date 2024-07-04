package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: kn1  reason: default package */
public final class kn1 implements et2 {
    public static final Parcelable.Creator<kn1> CREATOR;
    public final String P;
    public final String Q;
    public final long R;
    public final long S;
    public final byte[] T;
    public int U;

    static {
        bs1 bs1Var = new bs1();
        bs1Var.j = "application/id3";
        new cu1(bs1Var);
        bs1 bs1Var2 = new bs1();
        bs1Var2.j = "application/x-scte35";
        new cu1(bs1Var2);
        CREATOR = new jn1();
    }

    public kn1() {
        throw null;
    }

    public kn1(Parcel parcel) {
        String readString = parcel.readString();
        int i = zn4.a;
        this.P = readString;
        this.Q = parcel.readString();
        this.R = parcel.readLong();
        this.S = parcel.readLong();
        this.T = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kn1.class == obj.getClass()) {
            kn1 kn1Var = (kn1) obj;
            if (this.R == kn1Var.R && this.S == kn1Var.S && zn4.b(this.P, kn1Var.P) && zn4.b(this.Q, kn1Var.Q) && Arrays.equals(this.T, kn1Var.T)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.U;
        if (i == 0) {
            String str = this.P;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.Q;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.R;
            long j2 = this.S;
            int hashCode3 = ((((((((hashCode + 527) * 31) + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.T);
            this.U = hashCode3;
            return hashCode3;
        }
        return i;
    }

    public final String toString() {
        String str = this.P;
        long j = this.S;
        long j2 = this.R;
        String str2 = this.Q;
        return "EMSG: scheme=" + str + ", id=" + j + ", durationMs=" + j2 + ", value=" + str2;
    }

    @Override // defpackage.et2
    public final /* synthetic */ void w(vo2 vo2Var) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeLong(this.R);
        parcel.writeLong(this.S);
        parcel.writeByteArray(this.T);
    }
}