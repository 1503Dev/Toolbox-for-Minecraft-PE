package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ir2  reason: default package */
public final class ir2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        pn5 pn5Var = null;
        String str = null;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    in0.n(parcel, readInt);
                } else {
                    str = in0.d(parcel, readInt);
                }
            } else {
                pn5Var = (pn5) in0.c(parcel, readInt, pn5.CREATOR);
            }
        }
        in0.h(parcel, o);
        return new hr2(pn5Var, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new hr2[i];
    }
}