package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: kq4  reason: default package */
public final class kq4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
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
                            str2 = in0.d(parcel, readInt);
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
        return new jq4(i, i2, i3, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new jq4[i];
    }
}