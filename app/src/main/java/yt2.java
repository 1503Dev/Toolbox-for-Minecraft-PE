package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: yt2  reason: default package */
public final class yt2 implements Parcelable {
    public static final Parcelable.Creator<yt2> CREATOR = new ks2();
    public final et2[] P;
    public final long Q;

    public yt2(long j, et2... et2VarArr) {
        this.Q = j;
        this.P = et2VarArr;
    }

    public yt2(Parcel parcel) {
        this.P = new et2[parcel.readInt()];
        int i = 0;
        while (true) {
            et2[] et2VarArr = this.P;
            if (i >= et2VarArr.length) {
                this.Q = parcel.readLong();
                return;
            } else {
                et2VarArr[i] = (et2) parcel.readParcelable(et2.class.getClassLoader());
                i++;
            }
        }
    }

    public yt2(List list) {
        this(-9223372036854775807L, (et2[]) list.toArray(new et2[0]));
    }

    public final yt2 a(et2... et2VarArr) {
        int length = et2VarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.Q;
        et2[] et2VarArr2 = this.P;
        int i = zn4.a;
        int length2 = et2VarArr2.length;
        Object[] copyOf = Arrays.copyOf(et2VarArr2, length2 + length);
        System.arraycopy(et2VarArr, 0, copyOf, length2, length);
        return new yt2(j, (et2[]) copyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yt2.class == obj.getClass()) {
            yt2 yt2Var = (yt2) obj;
            if (Arrays.equals(this.P, yt2Var.P) && this.Q == yt2Var.Q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.Q;
        return (Arrays.hashCode(this.P) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        String arrays = Arrays.toString(this.P);
        long j = this.Q;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return ij.c("entries=", arrays, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.P.length);
        for (et2 et2Var : this.P) {
            parcel.writeParcelable(et2Var, 0);
        }
        parcel.writeLong(this.Q);
    }
}