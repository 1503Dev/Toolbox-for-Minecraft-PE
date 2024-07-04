package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bv5  reason: default package */
public final class bv5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        long j = 0;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            in0.n(parcel, readInt);
                        } else {
                            j = in0.l(parcel, readInt);
                        }
                    } else {
                        str = in0.d(parcel, readInt);
                    }
                } else {
                    i2 = in0.k(parcel, readInt);
                }
            } else {
                i = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new au5(i, i2, j, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new au5[i];
    }
}