package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gg3  reason: default package */
public final class gg3 implements Parcelable.Creator<ew2> {
    @Override // android.os.Parcelable.Creator
    public final ew2 createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    in0.n(parcel, readInt);
                } else {
                    i = in0.k(parcel, readInt);
                }
            } else {
                str = in0.d(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new ew2(str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ew2[] newArray(int i) {
        return new ew2[i];
    }
}