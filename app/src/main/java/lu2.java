package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lu2  reason: default package */
public final class lu2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        String str2 = null;
        zr5 zr5Var = null;
        pn5 pn5Var = null;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            in0.n(parcel, readInt);
                        } else {
                            pn5Var = (pn5) in0.c(parcel, readInt, pn5.CREATOR);
                        }
                    } else {
                        zr5Var = (zr5) in0.c(parcel, readInt, zr5.CREATOR);
                    }
                } else {
                    str2 = in0.d(parcel, readInt);
                }
            } else {
                str = in0.d(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new ku2(str, str2, zr5Var, pn5Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ku2[i];
    }
}