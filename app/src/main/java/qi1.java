package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qi1  reason: default package */
public final class qi1 implements Parcelable.Creator<ni1> {
    @Override // android.os.Parcelable.Creator
    public final ni1 createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        gf gfVar = null;
        fj1 fj1Var = null;
        int i = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        in0.n(parcel, readInt);
                    } else {
                        fj1Var = (fj1) in0.c(parcel, readInt, fj1.CREATOR);
                    }
                } else {
                    gfVar = (gf) in0.c(parcel, readInt, gf.CREATOR);
                }
            } else {
                i = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new ni1(i, gfVar, fj1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ni1[] newArray(int i) {
        return new ni1[i];
    }
}