package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fw2  reason: default package */
public final class fw2 implements Parcelable.Creator<wp> {
    @Override // android.os.Parcelable.Creator
    public final wp createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        in0.n(parcel, readInt);
                    } else {
                        j = in0.l(parcel, readInt);
                    }
                } else {
                    i = in0.k(parcel, readInt);
                }
            } else {
                str = in0.d(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new wp(j, i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wp[] newArray(int i) {
        return new wp[i];
    }
}