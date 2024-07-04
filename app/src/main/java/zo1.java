package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zo1  reason: default package */
public final class zo1 implements et2 {
    public static final Parcelable.Creator<zo1> CREATOR = new yo1();
    public final long P;
    public final long Q;
    public final long R;
    public final long S;
    public final long T;

    public zo1(long j, long j2, long j3, long j4, long j5) {
        this.P = j;
        this.Q = j2;
        this.R = j3;
        this.S = j4;
        this.T = j5;
    }

    public /* synthetic */ zo1(Parcel parcel) {
        this.P = parcel.readLong();
        this.Q = parcel.readLong();
        this.R = parcel.readLong();
        this.S = parcel.readLong();
        this.T = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zo1.class == obj.getClass()) {
            zo1 zo1Var = (zo1) obj;
            if (this.P == zo1Var.P && this.Q == zo1Var.Q && this.R == zo1Var.R && this.S == zo1Var.S && this.T == zo1Var.T) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.P;
        long j2 = j ^ (j >>> 32);
        long j3 = this.Q;
        long j4 = j3 ^ (j3 >>> 32);
        long j5 = this.R;
        long j6 = j5 ^ (j5 >>> 32);
        long j7 = this.S;
        long j8 = j7 ^ (j7 >>> 32);
        long j9 = this.T;
        return ((((((((((int) j2) + 527) * 31) + ((int) j4)) * 31) + ((int) j6)) * 31) + ((int) j8)) * 31) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        long j = this.P;
        long j2 = this.Q;
        long j3 = this.R;
        long j4 = this.S;
        long j5 = this.T;
        return "Motion photo metadata: photoStartPosition=" + j + ", photoSize=" + j2 + ", photoPresentationTimestampUs=" + j3 + ", videoStartPosition=" + j4 + ", videoSize=" + j5;
    }

    @Override // defpackage.et2
    public final /* synthetic */ void w(vo2 vo2Var) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.P);
        parcel.writeLong(this.Q);
        parcel.writeLong(this.R);
        parcel.writeLong(this.S);
        parcel.writeLong(this.T);
    }
}