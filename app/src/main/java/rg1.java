package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rg1  reason: default package */
public final class rg1 implements Parcelable.Creator<gg1> {
    @Override // android.os.Parcelable.Creator
    public final gg1 createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        in0.n(parcel, readInt);
                    } else {
                        intent = (Intent) in0.c(parcel, readInt, Intent.CREATOR);
                    }
                } else {
                    i2 = in0.k(parcel, readInt);
                }
            } else {
                i = in0.k(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new gg1(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ gg1[] newArray(int i) {
        return new gg1[i];
    }
}