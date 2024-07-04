package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ov3  reason: default package */
public final class ov3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        int i = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                in0.n(parcel, readInt);
            } else {
                i = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new bv3(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bv3[i];
    }
}