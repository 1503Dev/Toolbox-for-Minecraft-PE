package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fn4  reason: default package */
public final class fn4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    in0.n(parcel, readInt);
                } else {
                    i2 = in0.k(parcel, readInt);
                }
            } else {
                i = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new mm4(i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new mm4[i];
    }
}