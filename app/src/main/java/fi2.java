package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fi2  reason: default package */
public final class fi2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    in0.n(parcel, readInt);
                } else {
                    bundle = in0.a(parcel, readInt);
                }
            } else {
                str = in0.d(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new ei2(bundle, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ei2[i];
    }
}