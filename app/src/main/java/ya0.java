package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.b;
import java.io.Serializable;

/* renamed from: ya0  reason: default package */
public class ya0 extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ya0> CREATOR = new a();
    public boolean Q;

    /* renamed from: ya0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Parcelable.Creator<ya0> {
        @Override // android.os.Parcelable.Creator
        public final ya0 createFromParcel(Parcel parcel) {
            return new ya0(parcel.readInt() == 1);
        }

        @Override // android.os.Parcelable.Creator
        public final ya0[] newArray(int i) {
            return new ya0[i];
        }
    }

    public ya0() {
    }

    public ya0(boolean z) {
        this.Q = z;
    }

    public void H(boolean z) {
        if (z != this.Q) {
            this.Q = z;
            F();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.Q ? 1 : 0);
    }
}