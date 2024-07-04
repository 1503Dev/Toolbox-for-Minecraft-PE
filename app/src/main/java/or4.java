package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: or4  reason: default package */
public final class or4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o = in0.o(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < o) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        in0.n(parcel, readInt);
                    } else {
                        z3 = in0.i(parcel, readInt);
                    }
                } else {
                    z2 = in0.i(parcel, readInt);
                }
            } else {
                z = in0.i(parcel, readInt);
            }
        }
        in0.h(parcel, o);
        return new zq4(z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zq4[i];
    }
}