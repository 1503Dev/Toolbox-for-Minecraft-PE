package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.b;
import java.io.Serializable;

/* renamed from: bb0  reason: default package */
public class bb0 extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<bb0> CREATOR = new a();
    public int Q;

    /* renamed from: bb0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Parcelable.Creator<bb0> {
        @Override // android.os.Parcelable.Creator
        public final bb0 createFromParcel(Parcel parcel) {
            return new bb0(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final bb0[] newArray(int i) {
            return new bb0[i];
        }
    }

    public bb0() {
    }

    public bb0(int i) {
        this.Q = i;
    }

    public int H() {
        return this.Q;
    }

    public void I(int i) {
        if (i != this.Q) {
            this.Q = i;
            F();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.Q);
    }
}