package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mi1  reason: default package */
public final class mi1 implements Parcelable.Creator<ki1> {
    @Override // android.os.Parcelable.Creator
    public final ki1 createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        int i = 0;
        dj1 dj1Var = null;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    in0.n(parcel, readInt);
                } else {
                    dj1Var = (dj1) in0.c(parcel, readInt, dj1.CREATOR);
                }
            } else {
                i = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new ki1(i, dj1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ki1[] newArray(int i) {
        return new ki1[i];
    }
}