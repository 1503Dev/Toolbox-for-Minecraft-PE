package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: as1  reason: default package */
public final class as1 implements Parcelable.Creator<gm0> {
    @Override // android.os.Parcelable.Creator
    public final gm0 createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                in0.n(parcel, readInt);
                            } else {
                                i3 = in0.k(parcel, readInt);
                            }
                        } else {
                            i2 = in0.k(parcel, readInt);
                        }
                    } else {
                        z2 = in0.i(parcel, readInt);
                    }
                } else {
                    z = in0.i(parcel, readInt);
                }
            } else {
                i = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new gm0(i, z, z2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ gm0[] newArray(int i) {
        return new gm0[i];
    }
}