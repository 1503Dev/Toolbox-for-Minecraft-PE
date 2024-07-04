package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wo4  reason: default package */
public final class wo4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 15) {
                in0.n(parcel, readInt);
            } else {
                str = in0.d(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new bo4(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bo4[i];
    }
}