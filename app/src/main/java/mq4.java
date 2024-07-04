package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mq4  reason: default package */
public final class mq4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        in0.n(parcel, readInt);
                    } else {
                        i2 = in0.k(parcel, readInt);
                    }
                } else {
                    bArr = in0.b(parcel, readInt);
                }
            } else {
                i = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new lq4(bArr, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new lq4[i];
    }
}