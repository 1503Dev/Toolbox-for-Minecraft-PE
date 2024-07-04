package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u82  reason: default package */
public final class u82 implements Parcelable.Creator<kj1> {
    @Override // android.os.Parcelable.Creator
    public final kj1 createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    in0.n(parcel, readInt);
                } else {
                    str2 = in0.d(parcel, readInt);
                }
            } else {
                str = in0.d(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new kj1(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ kj1[] newArray(int i) {
        return new kj1[i];
    }
}