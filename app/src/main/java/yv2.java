package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yv2  reason: default package */
public final class yv2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            if (c != 6) {
                                in0.n(parcel, readInt);
                            } else {
                                z2 = in0.i(parcel, readInt);
                            }
                        } else {
                            z = in0.i(parcel, readInt);
                        }
                    } else {
                        i2 = in0.k(parcel, readInt);
                    }
                } else {
                    i = in0.k(parcel, readInt);
                }
            } else {
                str = in0.d(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new xv2(str, i, i2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new xv2[i];
    }
}