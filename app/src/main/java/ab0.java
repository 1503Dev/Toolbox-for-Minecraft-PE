package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.b;
import java.io.Serializable;

/* renamed from: ab0  reason: default package */
public final class ab0 extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ab0> CREATOR = new a();
    public float Q;

    /* renamed from: ab0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Parcelable.Creator<ab0> {
        @Override // android.os.Parcelable.Creator
        public final ab0 createFromParcel(Parcel parcel) {
            return new ab0(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ab0[] newArray(int i) {
            return new ab0[i];
        }
    }

    public ab0() {
    }

    public ab0(float f) {
        this.Q = f;
    }

    public final void H(float f) {
        if (f != this.Q) {
            this.Q = f;
            F();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.Q);
    }
}