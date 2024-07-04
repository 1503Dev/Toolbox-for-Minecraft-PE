package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ez5  reason: default package */
public final class ez5 implements Parcelable.Creator {
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
        return new by5(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new by5[i];
    }
}