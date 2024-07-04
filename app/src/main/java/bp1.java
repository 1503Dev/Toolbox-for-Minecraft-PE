package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bp1  reason: default package */
public final class bp1 implements et2 {
    public static final Parcelable.Creator<bp1> CREATOR = new ap1();
    public final float P;
    public final int Q;

    public bp1(int i, float f) {
        this.P = f;
        this.Q = i;
    }

    public /* synthetic */ bp1(Parcel parcel) {
        this.P = parcel.readFloat();
        this.Q = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bp1.class == obj.getClass()) {
            bp1 bp1Var = (bp1) obj;
            if (this.P == bp1Var.P && this.Q == bp1Var.Q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.P).hashCode() + 527) * 31) + this.Q;
    }

    public final String toString() {
        float f = this.P;
        int i = this.Q;
        return "smta: captureFrameRate=" + f + ", svcTemporalLayerCount=" + i;
    }

    @Override // defpackage.et2
    public final /* synthetic */ void w(vo2 vo2Var) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.P);
        parcel.writeInt(this.Q);
    }
}